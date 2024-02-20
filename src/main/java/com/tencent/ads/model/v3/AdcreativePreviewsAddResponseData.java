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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** AdcreativePreviewsAddResponseData */
public class AdcreativePreviewsAddResponseData {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("trace_id")
  private String traceId = null;

  @SerializedName("wx_fail_user_name_list")
  private List<String> wxFailUserNameList = null;

  public AdcreativePreviewsAddResponseData accountId(Long accountId) {
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

  public AdcreativePreviewsAddResponseData traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Get traceId
   *
   * @return traceId
   */
  @ApiModelProperty(value = "")
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  public AdcreativePreviewsAddResponseData wxFailUserNameList(List<String> wxFailUserNameList) {
    this.wxFailUserNameList = wxFailUserNameList;
    return this;
  }

  public AdcreativePreviewsAddResponseData addWxFailUserNameListItem(
      String wxFailUserNameListItem) {
    if (this.wxFailUserNameList == null) {
      this.wxFailUserNameList = new ArrayList<String>();
    }
    this.wxFailUserNameList.add(wxFailUserNameListItem);
    return this;
  }

  /**
   * Get wxFailUserNameList
   *
   * @return wxFailUserNameList
   */
  @ApiModelProperty(value = "")
  public List<String> getWxFailUserNameList() {
    return wxFailUserNameList;
  }

  public void setWxFailUserNameList(List<String> wxFailUserNameList) {
    this.wxFailUserNameList = wxFailUserNameList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativePreviewsAddResponseData adcreativePreviewsAddResponseData =
        (AdcreativePreviewsAddResponseData) o;
    return Objects.equals(this.accountId, adcreativePreviewsAddResponseData.accountId)
        && Objects.equals(this.traceId, adcreativePreviewsAddResponseData.traceId)
        && Objects.equals(
            this.wxFailUserNameList, adcreativePreviewsAddResponseData.wxFailUserNameList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, traceId, wxFailUserNameList);
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
