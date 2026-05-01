# SDK Generation Usage

This document is intentionally placed under `scripts/` to avoid being overwritten by code generation.

## Commands

- Compatibility mode (default, OpenAPI Generator 5.x):

```bash
./scripts/generate-sdk.sh
```

- Modern mode (OpenAPI Generator 7.x):

```bash
./scripts/generate-sdk.sh --modern
```

## Default Inputs

Both modes use:

- spec: `api/api.json`
- config: `api/java.json`
- generator: `java`

## Version Mapping

- default mode: `openapi-generator-cli 5.0.0` (Maven: `https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/5.0.0/openapi-generator-cli-5.0.0.jar`)
- `--modern`: `openapi-generator-cli 7.7.0`

If the required generator is missing locally, the script auto-downloads the corresponding jar into `.tools/`.

## Regeneration Behavior

The script performs:

1. clean old generated files
2. regenerate from current inputs
3. compatibility backfill from `HEAD` for missing historical generated files (enabled by default)

## Optional Environment Variables

- `OPENAPI_GENERATOR_VERSION`  
  Override generator version for the current run.

- `CLEAN_REGEN`  
  Default: `true`. Controls cleanup before regeneration.

- `COMPAT_RESTORE_MISSING_FROM_HEAD`  
  Default: `true`. Controls compatibility backfill from `HEAD`.

## Strict Spec-Only Output

If you want output only from current spec/tool (no historical backfill):

```bash
CLEAN_REGEN=true COMPAT_RESTORE_MISSING_FROM_HEAD=false ./scripts/generate-sdk.sh
```

## Notes

- For OpenAPI 3.1 + generator 5.x, the script applies a temporary in-memory compatibility conversion (without modifying your source `api/api.json`).
- If you need stable comparison between modes, run default mode and modern mode separately and compare `git diff`.
