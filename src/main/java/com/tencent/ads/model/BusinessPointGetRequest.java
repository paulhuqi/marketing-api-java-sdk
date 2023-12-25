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

/** BusinessPointGetRequest */
public class BusinessPointGetRequest {
  @SerializedName("site_sets")
  private List<String> siteSets = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public BusinessPointGetRequest siteSets(List<String> siteSets) {
    this.siteSets = siteSets;
    return this;
  }

  public BusinessPointGetRequest addSiteSetsItem(String siteSetsItem) {
    if (this.siteSets == null) {
      this.siteSets = new ArrayList<String>();
    }
    this.siteSets.add(siteSetsItem);
    return this;
  }

  /**
   * Get siteSets
   *
   * @return siteSets
   */
  @ApiModelProperty(value = "")
  public List<String> getSiteSets() {
    return siteSets;
  }

  public void setSiteSets(List<String> siteSets) {
    this.siteSets = siteSets;
  }

  public BusinessPointGetRequest accountId(Long accountId) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPointGetRequest businessPointGetRequest = (BusinessPointGetRequest) o;
    return Objects.equals(this.siteSets, businessPointGetRequest.siteSets)
        && Objects.equals(this.accountId, businessPointGetRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteSets, accountId);
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