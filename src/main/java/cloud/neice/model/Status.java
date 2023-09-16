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
 * Status
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-16T22:35:05.881170+08:00[Asia/Shanghai]")
public class Status {
  public static final String SERIALIZED_NAME_MAGIC = "magic";
  @SerializedName(SERIALIZED_NAME_MAGIC)
  private Boolean magic;

  public static final String SERIALIZED_NAME_QUICK = "quick";
  @SerializedName(SERIALIZED_NAME_QUICK)
  private Boolean quick;

  public static final String SERIALIZED_NAME_RESERVE = "reserve";
  @SerializedName(SERIALIZED_NAME_RESERVE)
  private Boolean reserve;


  public Status magic(Boolean magic) {
    
    this.magic = magic;
    return this;
  }

   /**
   * 标记该系统是否支持部分设备证书能秒出激活的功能
   * @return magic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标记该系统是否支持部分设备证书能秒出激活的功能")

  public Boolean getMagic() {
    return magic;
  }


  public void setMagic(Boolean magic) {
    this.magic = magic;
  }


  public Status quick(Boolean quick) {
    
    this.quick = quick;
    return this;
  }

   /**
   * 标记该系统是否支持全部设备证书能立即秒出激活的功能
   * @return quick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标记该系统是否支持全部设备证书能立即秒出激活的功能")

  public Boolean getQuick() {
    return quick;
  }


  public void setQuick(Boolean quick) {
    this.quick = quick;
  }


  public Status reserve(Boolean reserve) {
    
    this.reserve = reserve;
    return this;
  }

   /**
   * 标记该系统是否支持预定设备证书的功能
   * @return reserve
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标记该系统是否支持预定设备证书的功能")

  public Boolean getReserve() {
    return reserve;
  }


  public void setReserve(Boolean reserve) {
    this.reserve = reserve;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.magic, status.magic) &&
        Objects.equals(this.quick, status.quick) &&
        Objects.equals(this.reserve, status.reserve);
  }

  @Override
  public int hashCode() {
    return Objects.hash(magic, quick, reserve);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    sb.append("    magic: ").append(toIndentedString(magic)).append("\n");
    sb.append("    quick: ").append(toIndentedString(quick)).append("\n");
    sb.append("    reserve: ").append(toIndentedString(reserve)).append("\n");
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

