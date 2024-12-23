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
 * Status
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-30T12:28:02.341031+08:00[Asia/Shanghai]")
public class Status {
  public static final String SERIALIZED_NAME_BLIND = "blind";
  @SerializedName(SERIALIZED_NAME_BLIND)
  private Boolean blind;

  public static final String SERIALIZED_NAME_BLIND_RESERVE = "blindReserve";
  @SerializedName(SERIALIZED_NAME_BLIND_RESERVE)
  private Boolean blindReserve;

  public static final String SERIALIZED_NAME_BLIND_RESERVE_UNIT = "blindReserveUnit";
  @SerializedName(SERIALIZED_NAME_BLIND_RESERVE_UNIT)
  private BigDecimal blindReserveUnit;

  public static final String SERIALIZED_NAME_BLIND_UNIT = "blindUnit";
  @SerializedName(SERIALIZED_NAME_BLIND_UNIT)
  private BigDecimal blindUnit;

  public static final String SERIALIZED_NAME_MAGIC = "magic";
  @SerializedName(SERIALIZED_NAME_MAGIC)
  private Boolean magic;

  public static final String SERIALIZED_NAME_MAGIC_UNIT = "magicUnit";
  @SerializedName(SERIALIZED_NAME_MAGIC_UNIT)
  private BigDecimal magicUnit;

  public static final String SERIALIZED_NAME_QUICK = "quick";
  @SerializedName(SERIALIZED_NAME_QUICK)
  private Boolean quick;

  public static final String SERIALIZED_NAME_QUICK_UNIT = "quickUnit";
  @SerializedName(SERIALIZED_NAME_QUICK_UNIT)
  private BigDecimal quickUnit;

  public static final String SERIALIZED_NAME_RESERVE = "reserve";
  @SerializedName(SERIALIZED_NAME_RESERVE)
  private Boolean reserve;

  public static final String SERIALIZED_NAME_RESERVE_UNIT = "reserveUnit";
  @SerializedName(SERIALIZED_NAME_RESERVE_UNIT)
  private BigDecimal reserveUnit;


  public Status blind(Boolean blind) {
    
    this.blind = blind;
    return this;
  }

   /**
   * 标记该系统是否支持盲盒设备证书能立即秒出激活的功能
   * @return blind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标记该系统是否支持盲盒设备证书能立即秒出激活的功能")

  public Boolean getBlind() {
    return blind;
  }


  public void setBlind(Boolean blind) {
    this.blind = blind;
  }


  public Status blindReserve(Boolean blindReserve) {
    
    this.blindReserve = blindReserve;
    return this;
  }

   /**
   * 标记该系统是否支持盲盒预定设备证书的功能
   * @return blindReserve
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标记该系统是否支持盲盒预定设备证书的功能")

  public Boolean getBlindReserve() {
    return blindReserve;
  }


  public void setBlindReserve(Boolean blindReserve) {
    this.blindReserve = blindReserve;
  }


  public Status blindReserveUnit(BigDecimal blindReserveUnit) {
    
    this.blindReserveUnit = blindReserveUnit;
    return this;
  }

   /**
   * 盲盒预定证书服务单价
   * @return blindReserveUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "盲盒预定证书服务单价")

  public BigDecimal getBlindReserveUnit() {
    return blindReserveUnit;
  }


  public void setBlindReserveUnit(BigDecimal blindReserveUnit) {
    this.blindReserveUnit = blindReserveUnit;
  }


  public Status blindUnit(BigDecimal blindUnit) {
    
    this.blindUnit = blindUnit;
    return this;
  }

   /**
   * 盲盒秒出证书单价
   * @return blindUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "盲盒秒出证书单价")

  public BigDecimal getBlindUnit() {
    return blindUnit;
  }


  public void setBlindUnit(BigDecimal blindUnit) {
    this.blindUnit = blindUnit;
  }


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


  public Status magicUnit(BigDecimal magicUnit) {
    
    this.magicUnit = magicUnit;
    return this;
  }

   /**
   * 部分秒出证书单价
   * @return magicUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "部分秒出证书单价")

  public BigDecimal getMagicUnit() {
    return magicUnit;
  }


  public void setMagicUnit(BigDecimal magicUnit) {
    this.magicUnit = magicUnit;
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


  public Status quickUnit(BigDecimal quickUnit) {
    
    this.quickUnit = quickUnit;
    return this;
  }

   /**
   * 全量秒出证书单价
   * @return quickUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "全量秒出证书单价")

  public BigDecimal getQuickUnit() {
    return quickUnit;
  }


  public void setQuickUnit(BigDecimal quickUnit) {
    this.quickUnit = quickUnit;
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


  public Status reserveUnit(BigDecimal reserveUnit) {
    
    this.reserveUnit = reserveUnit;
    return this;
  }

   /**
   * 预定证书服务单价
   * @return reserveUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预定证书服务单价")

  public BigDecimal getReserveUnit() {
    return reserveUnit;
  }


  public void setReserveUnit(BigDecimal reserveUnit) {
    this.reserveUnit = reserveUnit;
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
    return Objects.equals(this.blind, status.blind) &&
        Objects.equals(this.blindReserve, status.blindReserve) &&
        Objects.equals(this.blindReserveUnit, status.blindReserveUnit) &&
        Objects.equals(this.blindUnit, status.blindUnit) &&
        Objects.equals(this.magic, status.magic) &&
        Objects.equals(this.magicUnit, status.magicUnit) &&
        Objects.equals(this.quick, status.quick) &&
        Objects.equals(this.quickUnit, status.quickUnit) &&
        Objects.equals(this.reserve, status.reserve) &&
        Objects.equals(this.reserveUnit, status.reserveUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blind, blindReserve, blindReserveUnit, blindUnit, magic, magicUnit, quick, quickUnit, reserve, reserveUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    sb.append("    blind: ").append(toIndentedString(blind)).append("\n");
    sb.append("    blindReserve: ").append(toIndentedString(blindReserve)).append("\n");
    sb.append("    blindReserveUnit: ").append(toIndentedString(blindReserveUnit)).append("\n");
    sb.append("    blindUnit: ").append(toIndentedString(blindUnit)).append("\n");
    sb.append("    magic: ").append(toIndentedString(magic)).append("\n");
    sb.append("    magicUnit: ").append(toIndentedString(magicUnit)).append("\n");
    sb.append("    quick: ").append(toIndentedString(quick)).append("\n");
    sb.append("    quickUnit: ").append(toIndentedString(quickUnit)).append("\n");
    sb.append("    reserve: ").append(toIndentedString(reserve)).append("\n");
    sb.append("    reserveUnit: ").append(toIndentedString(reserveUnit)).append("\n");
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

