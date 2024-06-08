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
import java.math.BigDecimal;

/**
 * PersonalCertificate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-08T16:07:59.097019+08:00[Asia/Shanghai]")
public class PersonalCertificate {
  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_CERTIFICATE_ID = "certificateId";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ID)
  private String certificateId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

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

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private String profile;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private Integer quality;

  public static final String SERIALIZED_NAME_QUALITY_TIME = "qualityTime";
  @SerializedName(SERIALIZED_NAME_QUALITY_TIME)
  private String qualityTime;

  public static final String SERIALIZED_NAME_REFER = "refer";
  @SerializedName(SERIALIZED_NAME_REFER)
  private String refer;

  public static final String SERIALIZED_NAME_REPAIR = "repair";
  @SerializedName(SERIALIZED_NAME_REPAIR)
  private Boolean repair;

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


  public PersonalCertificate certificate(String certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * 设备证书P12
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设备证书P12")

  public String getCertificate() {
    return certificate;
  }


  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public PersonalCertificate certificateId(String certificateId) {
    
    this.certificateId = certificateId;
    return this;
  }

   /**
   * 证书ID
   * @return certificateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书ID")

  public String getCertificateId() {
    return certificateId;
  }


  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }


  public PersonalCertificate code(String code) {
    
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


  public PersonalCertificate createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 证书创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public PersonalCertificate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 证书描述信息
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书描述信息")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PersonalCertificate deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * 设备ID
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设备ID")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public PersonalCertificate mobileprovision(String mobileprovision) {
    
    this.mobileprovision = mobileprovision;
    return this;
  }

   /**
   * 设备的描述文件Mobileprovision
   * @return mobileprovision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设备的描述文件Mobileprovision")

  public String getMobileprovision() {
    return mobileprovision;
  }


  public void setMobileprovision(String mobileprovision) {
    this.mobileprovision = mobileprovision;
  }


  public PersonalCertificate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 证书名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PersonalCertificate password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * 设备证书密码
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设备证书密码")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public PersonalCertificate phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 预定手机
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预定手机")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public PersonalCertificate price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * 服务价格
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务价格")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public PersonalCertificate profile(String profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfile() {
    return profile;
  }


  public void setProfile(String profile) {
    this.profile = profile;
  }


  public PersonalCertificate profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * 描述文件ID
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "描述文件ID")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public PersonalCertificate quality(Integer quality) {
    
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


  public PersonalCertificate qualityTime(String qualityTime) {
    
    this.qualityTime = qualityTime;
    return this;
  }

   /**
   * 证书质保到期时间
   * @return qualityTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书质保到期时间")

  public String getQualityTime() {
    return qualityTime;
  }


  public void setQualityTime(String qualityTime) {
    this.qualityTime = qualityTime;
  }


  public PersonalCertificate refer(String refer) {
    
    this.refer = refer;
    return this;
  }

   /**
   * 该设备的用户,后台自动透传该参数
   * @return refer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该设备的用户,后台自动透传该参数")

  public String getRefer() {
    return refer;
  }


  public void setRefer(String refer) {
    this.refer = refer;
  }


  public PersonalCertificate repair(Boolean repair) {
    
    this.repair = repair;
    return this;
  }

   /**
   * 补偿证书:预定失败或质保期内掉签，后台重订的设备标记，一般免服务费
   * @return repair
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "补偿证书:预定失败或质保期内掉签，后台重订的设备标记，一般免服务费")

  public Boolean getRepair() {
    return repair;
  }


  public void setRepair(Boolean repair) {
    this.repair = repair;
  }


  public PersonalCertificate reserve(Boolean reserve) {
    
    this.reserve = reserve;
    return this;
  }

   /**
   * 预定证书
   * @return reserve
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预定证书")

  public Boolean getReserve() {
    return reserve;
  }


  public void setReserve(Boolean reserve) {
    this.reserve = reserve;
  }


  public PersonalCertificate tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public PersonalCertificate team(String team) {
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTeam() {
    return team;
  }


  public void setTeam(String team) {
    this.team = team;
  }


  public PersonalCertificate udid(String udid) {
    
    this.udid = udid;
    return this;
  }

   /**
   * 设备的UDID
   * @return udid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设备的UDID")

  public String getUdid() {
    return udid;
  }


  public void setUdid(String udid) {
    this.udid = udid;
  }


  public PersonalCertificate uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * 单个设备证书UUID
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个设备证书UUID")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public PersonalCertificate valid(Boolean valid) {
    
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
    PersonalCertificate personalCertificate = (PersonalCertificate) o;
    return Objects.equals(this.certificate, personalCertificate.certificate) &&
        Objects.equals(this.certificateId, personalCertificate.certificateId) &&
        Objects.equals(this.code, personalCertificate.code) &&
        Objects.equals(this.createTime, personalCertificate.createTime) &&
        Objects.equals(this.description, personalCertificate.description) &&
        Objects.equals(this.deviceId, personalCertificate.deviceId) &&
        Objects.equals(this.mobileprovision, personalCertificate.mobileprovision) &&
        Objects.equals(this.name, personalCertificate.name) &&
        Objects.equals(this.password, personalCertificate.password) &&
        Objects.equals(this.phone, personalCertificate.phone) &&
        Objects.equals(this.price, personalCertificate.price) &&
        Objects.equals(this.profile, personalCertificate.profile) &&
        Objects.equals(this.profileId, personalCertificate.profileId) &&
        Objects.equals(this.quality, personalCertificate.quality) &&
        Objects.equals(this.qualityTime, personalCertificate.qualityTime) &&
        Objects.equals(this.refer, personalCertificate.refer) &&
        Objects.equals(this.repair, personalCertificate.repair) &&
        Objects.equals(this.reserve, personalCertificate.reserve) &&
        Objects.equals(this.tag, personalCertificate.tag) &&
        Objects.equals(this.team, personalCertificate.team) &&
        Objects.equals(this.udid, personalCertificate.udid) &&
        Objects.equals(this.uuid, personalCertificate.uuid) &&
        Objects.equals(this.valid, personalCertificate.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, certificateId, code, createTime, description, deviceId, mobileprovision, name, password, phone, price, profile, profileId, quality, qualityTime, refer, repair, reserve, tag, team, udid, uuid, valid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalCertificate {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    mobileprovision: ").append(toIndentedString(mobileprovision)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    qualityTime: ").append(toIndentedString(qualityTime)).append("\n");
    sb.append("    refer: ").append(toIndentedString(refer)).append("\n");
    sb.append("    repair: ").append(toIndentedString(repair)).append("\n");
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

