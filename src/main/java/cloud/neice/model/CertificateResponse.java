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
 * CertificateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-08T15:57:37.996995+08:00[Asia/Shanghai]")
public class CertificateResponse {
  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MOBILEPROVISION = "mobileprovision";
  @SerializedName(SERIALIZED_NAME_MOBILEPROVISION)
  private String mobileprovision;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private String profile;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private Integer quality;

  public static final String SERIALIZED_NAME_RESERVE = "reserve";
  @SerializedName(SERIALIZED_NAME_RESERVE)
  private Boolean reserve;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private String team;

  public static final String SERIALIZED_NAME_UDID = "udid";
  @SerializedName(SERIALIZED_NAME_UDID)
  private String udid;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;


  public CertificateResponse certificate(String certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Base64格式的证书P12文件
   * @return certificate
  **/
  @ApiModelProperty(required = true, value = "Base64格式的证书P12文件")

  public String getCertificate() {
    return certificate;
  }


  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public CertificateResponse code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 证书兑换码
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书兑换码")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CertificateResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 证书说明
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书说明")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CertificateResponse mobileprovision(String mobileprovision) {
    
    this.mobileprovision = mobileprovision;
    return this;
  }

   /**
   * Base64格式的证书描述文件
   * @return mobileprovision
  **/
  @ApiModelProperty(required = true, value = "Base64格式的证书描述文件")

  public String getMobileprovision() {
    return mobileprovision;
  }


  public void setMobileprovision(String mobileprovision) {
    this.mobileprovision = mobileprovision;
  }


  public CertificateResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 证书名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CertificateResponse password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * 证书P12对应的密码
   * @return password
  **/
  @ApiModelProperty(required = true, value = "证书P12对应的密码")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CertificateResponse phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 预定证书的手机号
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预定证书的手机号")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public CertificateResponse profile(String profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * 证书描述文件ID
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书描述文件ID")

  public String getProfile() {
    return profile;
  }


  public void setProfile(String profile) {
    this.profile = profile;
  }


  public CertificateResponse quality(Integer quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * 证书质保天数
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书质保天数")

  public Integer getQuality() {
    return quality;
  }


  public void setQuality(Integer quality) {
    this.quality = quality;
  }


  public CertificateResponse reserve(Boolean reserve) {
    
    this.reserve = reserve;
    return this;
  }

   /**
   * 是否为预定的证书
   * @return reserve
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否为预定的证书")

  public Boolean getReserve() {
    return reserve;
  }


  public void setReserve(Boolean reserve) {
    this.reserve = reserve;
  }


  public CertificateResponse tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 标记
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标记")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public CertificateResponse team(String team) {
    
    this.team = team;
    return this;
  }

   /**
   * 证书TEAM
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书TEAM")

  public String getTeam() {
    return team;
  }


  public void setTeam(String team) {
    this.team = team;
  }


  public CertificateResponse udid(String udid) {
    
    this.udid = udid;
    return this;
  }

   /**
   * 证书的UDID
   * @return udid
  **/
  @ApiModelProperty(required = true, value = "证书的UDID")

  public String getUdid() {
    return udid;
  }


  public void setUdid(String udid) {
    this.udid = udid;
  }


  public CertificateResponse uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * 上游渠道生成的证书的UUID
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上游渠道生成的证书的UUID")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public CertificateResponse valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * 证书是否有效
   * @return valid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书是否有效")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateResponse certificateResponse = (CertificateResponse) o;
    return Objects.equals(this.certificate, certificateResponse.certificate) &&
        Objects.equals(this.code, certificateResponse.code) &&
        Objects.equals(this.description, certificateResponse.description) &&
        Objects.equals(this.mobileprovision, certificateResponse.mobileprovision) &&
        Objects.equals(this.name, certificateResponse.name) &&
        Objects.equals(this.password, certificateResponse.password) &&
        Objects.equals(this.phone, certificateResponse.phone) &&
        Objects.equals(this.profile, certificateResponse.profile) &&
        Objects.equals(this.quality, certificateResponse.quality) &&
        Objects.equals(this.reserve, certificateResponse.reserve) &&
        Objects.equals(this.tag, certificateResponse.tag) &&
        Objects.equals(this.team, certificateResponse.team) &&
        Objects.equals(this.udid, certificateResponse.udid) &&
        Objects.equals(this.uuid, certificateResponse.uuid) &&
        Objects.equals(this.valid, certificateResponse.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, code, description, mobileprovision, name, password, phone, profile, quality, reserve, tag, team, udid, uuid, valid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateResponse {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mobileprovision: ").append(toIndentedString(mobileprovision)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    reserve: ").append(toIndentedString(reserve)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

