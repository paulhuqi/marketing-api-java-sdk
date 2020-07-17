/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 资金明细 */
@ApiModel(description = "资金明细")
public class DetailedFundStatement {
  @SerializedName("trade_type")
  private WechatAccountTradeType tradeType = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("amount")
  private Long amount = null;

  @SerializedName("wechat_account_id")
  private String wechatAccountId = null;

  @SerializedName("wechat_account_name")
  private String wechatAccountName = null;

  @SerializedName("fund_type")
  private WechatMpOpenFundType fundType = null;

  @SerializedName("external_bill_no")
  private String externalBillNo = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("operator")
  private String operator = null;

  @SerializedName("bill_no")
  private String billNo = null;

  @SerializedName("repayment_channel_type")
  private String repaymentChannelType = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("contact_name")
  private String contactName = null;

  @SerializedName("contact_phone")
  private String contactPhone = null;

  @SerializedName("status")
  private WechatAccountTradeStatus status = null;

  public DetailedFundStatement tradeType(WechatAccountTradeType tradeType) {
    this.tradeType = tradeType;
    return this;
  }

  /**
   * Get tradeType
   *
   * @return tradeType
   */
  @ApiModelProperty(value = "")
  public WechatAccountTradeType getTradeType() {
    return tradeType;
  }

  public void setTradeType(WechatAccountTradeType tradeType) {
    this.tradeType = tradeType;
  }

  public DetailedFundStatement time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   *
   * @return time
   */
  @ApiModelProperty(value = "")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public DetailedFundStatement amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   *
   * @return amount
   */
  @ApiModelProperty(value = "")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public DetailedFundStatement wechatAccountId(String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
    return this;
  }

  /**
   * Get wechatAccountId
   *
   * @return wechatAccountId
   */
  @ApiModelProperty(value = "")
  public String getWechatAccountId() {
    return wechatAccountId;
  }

  public void setWechatAccountId(String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
  }

  public DetailedFundStatement wechatAccountName(String wechatAccountName) {
    this.wechatAccountName = wechatAccountName;
    return this;
  }

  /**
   * Get wechatAccountName
   *
   * @return wechatAccountName
   */
  @ApiModelProperty(value = "")
  public String getWechatAccountName() {
    return wechatAccountName;
  }

  public void setWechatAccountName(String wechatAccountName) {
    this.wechatAccountName = wechatAccountName;
  }

  public DetailedFundStatement fundType(WechatMpOpenFundType fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * Get fundType
   *
   * @return fundType
   */
  @ApiModelProperty(value = "")
  public WechatMpOpenFundType getFundType() {
    return fundType;
  }

  public void setFundType(WechatMpOpenFundType fundType) {
    this.fundType = fundType;
  }

  public DetailedFundStatement externalBillNo(String externalBillNo) {
    this.externalBillNo = externalBillNo;
    return this;
  }

  /**
   * Get externalBillNo
   *
   * @return externalBillNo
   */
  @ApiModelProperty(value = "")
  public String getExternalBillNo() {
    return externalBillNo;
  }

  public void setExternalBillNo(String externalBillNo) {
    this.externalBillNo = externalBillNo;
  }

  public DetailedFundStatement description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DetailedFundStatement operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   *
   * @return operator
   */
  @ApiModelProperty(value = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public DetailedFundStatement billNo(String billNo) {
    this.billNo = billNo;
    return this;
  }

  /**
   * Get billNo
   *
   * @return billNo
   */
  @ApiModelProperty(value = "")
  public String getBillNo() {
    return billNo;
  }

  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }

  public DetailedFundStatement repaymentChannelType(String repaymentChannelType) {
    this.repaymentChannelType = repaymentChannelType;
    return this;
  }

  /**
   * Get repaymentChannelType
   *
   * @return repaymentChannelType
   */
  @ApiModelProperty(value = "")
  public String getRepaymentChannelType() {
    return repaymentChannelType;
  }

  public void setRepaymentChannelType(String repaymentChannelType) {
    this.repaymentChannelType = repaymentChannelType;
  }

  public DetailedFundStatement companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   *
   * @return companyName
   */
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public DetailedFundStatement contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * Get contactName
   *
   * @return contactName
   */
  @ApiModelProperty(value = "")
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public DetailedFundStatement contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

  /**
   * Get contactPhone
   *
   * @return contactPhone
   */
  @ApiModelProperty(value = "")
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public DetailedFundStatement status(WechatAccountTradeStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public WechatAccountTradeStatus getStatus() {
    return status;
  }

  public void setStatus(WechatAccountTradeStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedFundStatement detailedFundStatement = (DetailedFundStatement) o;
    return Objects.equals(this.tradeType, detailedFundStatement.tradeType)
        && Objects.equals(this.time, detailedFundStatement.time)
        && Objects.equals(this.amount, detailedFundStatement.amount)
        && Objects.equals(this.wechatAccountId, detailedFundStatement.wechatAccountId)
        && Objects.equals(this.wechatAccountName, detailedFundStatement.wechatAccountName)
        && Objects.equals(this.fundType, detailedFundStatement.fundType)
        && Objects.equals(this.externalBillNo, detailedFundStatement.externalBillNo)
        && Objects.equals(this.description, detailedFundStatement.description)
        && Objects.equals(this.operator, detailedFundStatement.operator)
        && Objects.equals(this.billNo, detailedFundStatement.billNo)
        && Objects.equals(this.repaymentChannelType, detailedFundStatement.repaymentChannelType)
        && Objects.equals(this.companyName, detailedFundStatement.companyName)
        && Objects.equals(this.contactName, detailedFundStatement.contactName)
        && Objects.equals(this.contactPhone, detailedFundStatement.contactPhone)
        && Objects.equals(this.status, detailedFundStatement.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        tradeType,
        time,
        amount,
        wechatAccountId,
        wechatAccountName,
        fundType,
        externalBillNo,
        description,
        operator,
        billNo,
        repaymentChannelType,
        companyName,
        contactName,
        contactPhone,
        status);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
