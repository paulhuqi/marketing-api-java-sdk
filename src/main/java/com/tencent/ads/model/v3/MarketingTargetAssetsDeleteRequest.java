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

/** MarketingTargetAssetsDeleteRequest */
public class MarketingTargetAssetsDeleteRequest {
  @SerializedName("organization_id")
  private Long organizationId = null;

  @SerializedName("marketing_asset_id")
  private Long marketingAssetId = null;

  public MarketingTargetAssetsDeleteRequest organizationId(Long organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId
   *
   * @return organizationId
   */
  @ApiModelProperty(value = "")
  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }

  public MarketingTargetAssetsDeleteRequest marketingAssetId(Long marketingAssetId) {
    this.marketingAssetId = marketingAssetId;
    return this;
  }

  /**
   * Get marketingAssetId
   *
   * @return marketingAssetId
   */
  @ApiModelProperty(value = "")
  public Long getMarketingAssetId() {
    return marketingAssetId;
  }

  public void setMarketingAssetId(Long marketingAssetId) {
    this.marketingAssetId = marketingAssetId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketingTargetAssetsDeleteRequest marketingTargetAssetsDeleteRequest =
        (MarketingTargetAssetsDeleteRequest) o;
    return Objects.equals(this.organizationId, marketingTargetAssetsDeleteRequest.organizationId)
        && Objects.equals(
            this.marketingAssetId, marketingTargetAssetsDeleteRequest.marketingAssetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, marketingAssetId);
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
