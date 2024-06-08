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
 * DeviceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-08T15:57:37.996995+08:00[Asia/Shanghai]")
public class DeviceRequest {
  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  private String callback;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private Integer quality;

  public static final String SERIALIZED_NAME_REFER = "refer";
  @SerializedName(SERIALIZED_NAME_REFER)
  private String refer;

  public static final String SERIALIZED_NAME_RESERVE = "reserve";
  @SerializedName(SERIALIZED_NAME_RESERVE)
  private Boolean reserve;

  public static final String SERIALIZED_NAME_UDID = "udid";
  @SerializedName(SERIALIZED_NAME_UDID)
  private String udid;


  public DeviceRequest callback(String callback) {
    
    this.callback = callback;
    return this;
  }

   /**
   * 预定证书激活时可通过回调地址将证书推送到业务系统中，为空将不会回调
   * @return callback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预定证书激活时可通过回调地址将证书推送到业务系统中，为空将不会回调")

  public String getCallback() {
    return callback;
  }


  public void setCallback(String callback) {
    this.callback = callback;
  }


  public DeviceRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 可使用兑换码注册设备
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "可使用兑换码注册设备")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public DeviceRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 当调用的预定证书激活时，激活通知短信将发送该名称，方便区分，允许为空值
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "当调用的预定证书激活时，激活通知短信将发送该名称，方便区分，允许为空值")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DeviceRequest phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 预定手机:设备激活后发送可以安装APP的通知短信，当注册预定证书时，电话号码不能为空值
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预定手机:设备激活后发送可以安装APP的通知短信，当注册预定证书时，电话号码不能为空值")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public DeviceRequest quality(Integer quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * 增加质保天数后台可能会增加计费
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "增加质保天数后台可能会增加计费")

  public Integer getQuality() {
    return quality;
  }


  public void setQuality(Integer quality) {
    this.quality = quality;
  }


  public DeviceRequest refer(String refer) {
    
    this.refer = refer;
    return this;
  }

   /**
   * 下游系统可以标记该设备的注册用户，上游系统将透传回去，非必要参数
   * @return refer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下游系统可以标记该设备的注册用户，上游系统将透传回去，非必要参数")

  public String getRefer() {
    return refer;
  }


  public void setRefer(String refer) {
    this.refer = refer;
  }


  public DeviceRequest reserve(Boolean reserve) {
    
    this.reserve = reserve;
    return this;
  }

   /**
   * 证书预定参数开关如果卡设备，将在设备处于激活状态时通知用户安装
   * @return reserve
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书预定参数开关如果卡设备，将在设备处于激活状态时通知用户安装")

  public Boolean getReserve() {
    return reserve;
  }


  public void setReserve(Boolean reserve) {
    this.reserve = reserve;
  }


  public DeviceRequest udid(String udid) {
    
    this.udid = udid;
    return this;
  }

   /**
   * iOS或iPad设备UDID
   * @return udid
  **/
  @ApiModelProperty(required = true, value = "iOS或iPad设备UDID")

  public String getUdid() {
    return udid;
  }


  public void setUdid(String udid) {
    this.udid = udid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRequest deviceRequest = (DeviceRequest) o;
    return Objects.equals(this.callback, deviceRequest.callback) &&
        Objects.equals(this.code, deviceRequest.code) &&
        Objects.equals(this.name, deviceRequest.name) &&
        Objects.equals(this.phone, deviceRequest.phone) &&
        Objects.equals(this.quality, deviceRequest.quality) &&
        Objects.equals(this.refer, deviceRequest.refer) &&
        Objects.equals(this.reserve, deviceRequest.reserve) &&
        Objects.equals(this.udid, deviceRequest.udid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callback, code, name, phone, quality, refer, reserve, udid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRequest {\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    refer: ").append(toIndentedString(refer)).append("\n");
    sb.append("    reserve: ").append(toIndentedString(reserve)).append("\n");
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
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

