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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** AdsUpdateConfiguredStatusRequest */
public class AdsUpdateConfiguredStatusRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("update_configured_status_spec")
  private List<AdsUpdateConfiguredStatusUpdateConfiguredStatusStruct> updateConfiguredStatusSpec =
      null;

  public AdsUpdateConfiguredStatusRequest accountId(Long accountId) {
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

  public AdsUpdateConfiguredStatusRequest updateConfiguredStatusSpec(
      List<AdsUpdateConfiguredStatusUpdateConfiguredStatusStruct> updateConfiguredStatusSpec) {
    this.updateConfiguredStatusSpec = updateConfiguredStatusSpec;
    return this;
  }

  public AdsUpdateConfiguredStatusRequest addUpdateConfiguredStatusSpecItem(
      AdsUpdateConfiguredStatusUpdateConfiguredStatusStruct updateConfiguredStatusSpecItem) {
    if (this.updateConfiguredStatusSpec == null) {
      this.updateConfiguredStatusSpec =
          new ArrayList<AdsUpdateConfiguredStatusUpdateConfiguredStatusStruct>();
    }
    this.updateConfiguredStatusSpec.add(updateConfiguredStatusSpecItem);
    return this;
  }

  /**
   * Get updateConfiguredStatusSpec
   *
   * @return updateConfiguredStatusSpec
   */
  @ApiModelProperty(value = "")
  public List<AdsUpdateConfiguredStatusUpdateConfiguredStatusStruct>
      getUpdateConfiguredStatusSpec() {
    return updateConfiguredStatusSpec;
  }

  public void setUpdateConfiguredStatusSpec(
      List<AdsUpdateConfiguredStatusUpdateConfiguredStatusStruct> updateConfiguredStatusSpec) {
    this.updateConfiguredStatusSpec = updateConfiguredStatusSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsUpdateConfiguredStatusRequest adsUpdateConfiguredStatusRequest =
        (AdsUpdateConfiguredStatusRequest) o;
    return Objects.equals(this.accountId, adsUpdateConfiguredStatusRequest.accountId)
        && Objects.equals(
            this.updateConfiguredStatusSpec,
            adsUpdateConfiguredStatusRequest.updateConfiguredStatusSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, updateConfiguredStatusSpec);
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
