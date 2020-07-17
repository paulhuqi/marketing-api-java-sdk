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
import java.util.Objects;

/** PromotedObjectsAddRequest */
public class PromotedObjectsAddRequest {
  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("promoted_object_spec")
  private PromotedObjectSpec promotedObjectSpec = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public PromotedObjectsAddRequest promotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  /**
   * Get promotedObjectType
   *
   * @return promotedObjectType
   */
  @ApiModelProperty(value = "")
  public PromotedObjectType getPromotedObjectType() {
    return promotedObjectType;
  }

  public void setPromotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
  }

  public PromotedObjectsAddRequest promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  /**
   * Get promotedObjectId
   *
   * @return promotedObjectId
   */
  @ApiModelProperty(value = "")
  public String getPromotedObjectId() {
    return promotedObjectId;
  }

  public void setPromotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
  }

  public PromotedObjectsAddRequest promotedObjectSpec(PromotedObjectSpec promotedObjectSpec) {
    this.promotedObjectSpec = promotedObjectSpec;
    return this;
  }

  /**
   * Get promotedObjectSpec
   *
   * @return promotedObjectSpec
   */
  @ApiModelProperty(value = "")
  public PromotedObjectSpec getPromotedObjectSpec() {
    return promotedObjectSpec;
  }

  public void setPromotedObjectSpec(PromotedObjectSpec promotedObjectSpec) {
    this.promotedObjectSpec = promotedObjectSpec;
  }

  public PromotedObjectsAddRequest accountId(Long accountId) {
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
    PromotedObjectsAddRequest promotedObjectsAddRequest = (PromotedObjectsAddRequest) o;
    return Objects.equals(this.promotedObjectType, promotedObjectsAddRequest.promotedObjectType)
        && Objects.equals(this.promotedObjectId, promotedObjectsAddRequest.promotedObjectId)
        && Objects.equals(this.promotedObjectSpec, promotedObjectsAddRequest.promotedObjectSpec)
        && Objects.equals(this.accountId, promotedObjectsAddRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotedObjectType, promotedObjectId, promotedObjectSpec, accountId);
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
