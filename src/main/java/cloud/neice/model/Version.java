/*
 * 内测云分发开发者API接口
 * 内测云开发者服务平台应用程序接口文档
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: henryxm@163.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cloud.neice.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Version
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-08T16:07:59.097019+08:00[Asia/Shanghai]")
public class Version {
  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private Integer build;

  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  private Integer major;

  public static final String SERIALIZED_NAME_MINOR = "minor";
  @SerializedName(SERIALIZED_NAME_MINOR)
  private Integer minor;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private Integer revision;


  public Version build(Integer build) {
    
    this.build = build;
    return this;
  }

   /**
   * 构建版本
   * @return build
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "构建版本")

  public Integer getBuild() {
    return build;
  }


  public void setBuild(Integer build) {
    this.build = build;
  }


  public Version major(Integer major) {
    
    this.major = major;
    return this;
  }

   /**
   * 主版本号
   * @return major
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "主版本号")

  public Integer getMajor() {
    return major;
  }


  public void setMajor(Integer major) {
    this.major = major;
  }


  public Version minor(Integer minor) {
    
    this.minor = minor;
    return this;
  }

   /**
   * 次版本号
   * @return minor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "次版本号")

  public Integer getMinor() {
    return minor;
  }


  public void setMinor(Integer minor) {
    this.minor = minor;
  }


  public Version revision(Integer revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * 修订版本
   * @return revision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "修订版本")

  public Integer getRevision() {
    return revision;
  }


  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.build, version.build) &&
        Objects.equals(this.major, version.major) &&
        Objects.equals(this.minor, version.minor) &&
        Objects.equals(this.revision, version.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(build, major, minor, revision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

