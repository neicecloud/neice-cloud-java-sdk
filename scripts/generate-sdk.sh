#!/usr/bin/env bash
#
# Regenerate this SDK from api/api.json using OpenAPI Generator.
# Matches README.md on branch 3.0.0:
#   - Generator: OpenAPI Generator (https://openapi-generator.tech)
#   - Generator version: 7.12.0 (see README header "Generator version")
#   - Java: 1.8+ (README Requirements)
#
# Default inputs: api/api.json + api/java.json
# Override version: OPENAPI_GENERATOR_VERSION=7.12.0 ./scripts/generate-sdk.sh
# Comma-separated paths relative to generator output (see `openapi-generator-cli help generate`):
#   OPENAPI_GENERATOR_IGNORE_LIST=README.md ./scripts/generate-sdk.sh
# Default README.md avoids overwriting the repo hand-written README when syncing.

set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
DEFAULT_SPEC="$ROOT_DIR/api/api.json"
DEFAULT_CONFIG="$ROOT_DIR/api/java.json"

SPEC_PATH="${1:-$DEFAULT_SPEC}"
CONFIG_PATH="${2:-$DEFAULT_CONFIG}"
GENERATOR_NAME="${GENERATOR_NAME:-java}"
OPENAPI_GENERATOR_VERSION="${OPENAPI_GENERATOR_VERSION:-7.12.0}"
OPENAPI_GENERATOR_IGNORE_LIST="${OPENAPI_GENERATOR_IGNORE_LIST:-README.md}"
TOOLS_DIR="$ROOT_DIR/.tools"
OPENAPI_GENERATOR_JAR="$TOOLS_DIR/openapi-generator-cli-${OPENAPI_GENERATOR_VERSION}.jar"

TEMP_DIR="$(mktemp -d)"
OUTPUT_DIR="$TEMP_DIR/generated"
trap 'rm -rf "$TEMP_DIR"' EXIT

if [[ ! -f "$SPEC_PATH" ]]; then
  echo "Spec file not found: $SPEC_PATH" >&2
  exit 1
fi

if [[ ! -f "$CONFIG_PATH" ]]; then
  echo "Config file not found: $CONFIG_PATH" >&2
  exit 1
fi

IGNORE_ARGS=(--openapi-generator-ignore-list "$OPENAPI_GENERATOR_IGNORE_LIST")

generate_with_openapi_cli() {
  openapi-generator-cli generate \
    --skip-validate-spec \
    "${IGNORE_ARGS[@]}" \
    -g "$GENERATOR_NAME" \
    -i "$SPEC_PATH" \
    -c "$CONFIG_PATH" \
    -o "$OUTPUT_DIR"
}

generate_with_openapi_jar() {
  java -jar "$OPENAPI_GENERATOR_JAR" generate \
    --skip-validate-spec \
    "${IGNORE_ARGS[@]}" \
    -g "$GENERATOR_NAME" \
    -i "$SPEC_PATH" \
    -c "$CONFIG_PATH" \
    -o "$OUTPUT_DIR"
}

install_openapi_generator_jar() {
  mkdir -p "$TOOLS_DIR"
  local jar_url="https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/${OPENAPI_GENERATOR_VERSION}/openapi-generator-cli-${OPENAPI_GENERATOR_VERSION}.jar"

  if command -v curl >/dev/null 2>&1; then
    curl -fL "$jar_url" -o "$OPENAPI_GENERATOR_JAR"
  elif command -v wget >/dev/null 2>&1; then
    wget -O "$OPENAPI_GENERATOR_JAR" "$jar_url"
  else
    echo "Install curl or wget to download openapi-generator-cli." >&2
    exit 1
  fi
}

echo "Generating SDK from: $SPEC_PATH"
echo "Using config: $CONFIG_PATH"
echo "OpenAPI Generator: ${OPENAPI_GENERATOR_VERSION} (per README)"

if command -v openapi-generator-cli >/dev/null 2>&1; then
  echo "Toolchain: openapi-generator-cli (PATH)"
  generate_with_openapi_cli
else
  if [[ ! -f "$OPENAPI_GENERATOR_JAR" ]]; then
    echo "Toolchain: openapi-generator-cli jar (auto-install ${OPENAPI_GENERATOR_VERSION})"
    install_openapi_generator_jar
  else
    echo "Toolchain: openapi-generator-cli jar (${OPENAPI_GENERATOR_VERSION})"
  fi

  if ! command -v java >/dev/null 2>&1; then
    echo "Java 1.8+ is required (see README Requirements)." >&2
    exit 1
  fi

  generate_with_openapi_jar
fi

NEW_FILES_MANIFEST="$OUTPUT_DIR/.openapi-generator/FILES"
OLD_FILES_MANIFEST="$ROOT_DIR/.openapi-generator/FILES"

if [[ ! -f "$NEW_FILES_MANIFEST" ]]; then
  echo "Generated output missing .openapi-generator/FILES, aborting sync." >&2
  exit 1
fi

is_preserved_path() {
  local rel="$1"
  local item
  IFS=',' read -ra _preserve_items <<< "${OPENAPI_GENERATOR_IGNORE_LIST:-}"
  for item in "${_preserve_items[@]}"; do
    [[ -z "$item" ]] && continue
    [[ "$item" == "$rel" ]] && return 0
  done
  return 1
}

if [[ -f "$OLD_FILES_MANIFEST" ]]; then
  while IFS= read -r rel_path; do
    [[ -z "$rel_path" ]] && continue
    if is_preserved_path "$rel_path"; then
      continue
    fi
    rm -f "$ROOT_DIR/$rel_path"
  done < "$OLD_FILES_MANIFEST"
fi

while IFS= read -r rel_path; do
  [[ -z "$rel_path" ]] && continue
  mkdir -p "$ROOT_DIR/$(dirname "$rel_path")"
  cp "$OUTPUT_DIR/$rel_path" "$ROOT_DIR/$rel_path"
done < "$NEW_FILES_MANIFEST"

mkdir -p "$ROOT_DIR/.openapi-generator"
cp "$OUTPUT_DIR/.openapi-generator/FILES" "$ROOT_DIR/.openapi-generator/FILES"
cp "$OUTPUT_DIR/.openapi-generator/VERSION" "$ROOT_DIR/.openapi-generator/VERSION"

echo "Generation complete. Files synchronized per .openapi-generator/FILES."
