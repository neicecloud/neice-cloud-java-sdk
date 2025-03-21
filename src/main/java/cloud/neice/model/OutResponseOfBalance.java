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
import cloud.neice.model.Balance;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OutResponseOfBalance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-30T12:28:02.341031+08:00[Asia/Shanghai]")
public class OutResponseOfBalance {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Balance data;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;


  public OutResponseOfBalance code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * 响应代码
   * @return code
  **/
  @ApiModelProperty(required = true, value = "响应代码")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public OutResponseOfBalance data(Balance data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Balance getData() {
    return data;
  }


  public void setData(Balance data) {
    this.data = data;
  }


  public OutResponseOfBalance msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * 错误信息:成功时为空或为success
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "错误信息:成功时为空或为success")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutResponseOfBalance outResponseOfBalance = (OutResponseOfBalance) o;
    return Objects.equals(this.code, outResponseOfBalance.code) &&
        Objects.equals(this.data, outResponseOfBalance.data) &&
        Objects.equals(this.msg, outResponseOfBalance.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, msg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutResponseOfBalance {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

