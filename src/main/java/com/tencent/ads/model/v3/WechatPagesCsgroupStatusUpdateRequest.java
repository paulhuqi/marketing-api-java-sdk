/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model.v3;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** WechatPagesCsgroupStatusUpdateRequest */
public class WechatPagesCsgroupStatusUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("corp_id")
  private String corpId = null;

  @SerializedName("userid")
  private String userid = null;

  @SerializedName("status")
  private Long status = null;

  public WechatPagesCsgroupStatusUpdateRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public WechatPagesCsgroupStatusUpdateRequest corpId(String corpId) {
    this.corpId = corpId;
    return this;
  }

  /**
   * Get corpId
   *
   * @return corpId
   */
  @ApiModelProperty(value = "")
  public String getCorpId() {
    return corpId;
  }

  public void setCorpId(String corpId) {
    this.corpId = corpId;
  }

  public WechatPagesCsgroupStatusUpdateRequest userid(String userid) {
    this.userid = userid;
    return this;
  }

  /**
   * Get userid
   *
   * @return userid
   */
  @ApiModelProperty(value = "")
  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public WechatPagesCsgroupStatusUpdateRequest status(Long status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
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
    WechatPagesCsgroupStatusUpdateRequest wechatPagesCsgroupStatusUpdateRequest =
        (WechatPagesCsgroupStatusUpdateRequest) o;
    return Objects.equals(this.accountId, wechatPagesCsgroupStatusUpdateRequest.accountId)
        && Objects.equals(this.corpId, wechatPagesCsgroupStatusUpdateRequest.corpId)
        && Objects.equals(this.userid, wechatPagesCsgroupStatusUpdateRequest.userid)
        && Objects.equals(this.status, wechatPagesCsgroupStatusUpdateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, corpId, userid, status);
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
