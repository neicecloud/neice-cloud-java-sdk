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
 * Balance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-30T12:28:02.341031+08:00[Asia/Shanghai]")
public class Balance {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private BigDecimal reward;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_USER_UUID = "userUuid";
  @SerializedName(SERIALIZED_NAME_USER_UUID)
  private String userUuid;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private BigDecimal voucher;


  public Balance balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public Balance reward(BigDecimal reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getReward() {
    return reward;
  }


  public void setReward(BigDecimal reward) {
    this.reward = reward;
  }


  public Balance total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public Balance userUuid(String userUuid) {
    
    this.userUuid = userUuid;
    return this;
  }

   /**
   * Get userUuid
   * @return userUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserUuid() {
    return userUuid;
  }


  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }


  public Balance voucher(BigDecimal voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getVoucher() {
    return voucher;
  }


  public void setVoucher(BigDecimal voucher) {
    this.voucher = voucher;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.balance, balance.balance) &&
        Objects.equals(this.reward, balance.reward) &&
        Objects.equals(this.total, balance.total) &&
        Objects.equals(this.userUuid, balance.userUuid) &&
        Objects.equals(this.voucher, balance.voucher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, reward, total, userUuid, voucher);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
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

