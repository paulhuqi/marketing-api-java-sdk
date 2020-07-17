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

/** 推广目标信息 */
@ApiModel(description = "推广目标信息")
public class AdProduct {
  @SerializedName("product_type")
  private AudienceProductType productType = null;

  @SerializedName("product_refs_id")
  private String productRefsId = null;

  public AdProduct productType(AudienceProductType productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   *
   * @return productType
   */
  @ApiModelProperty(value = "")
  public AudienceProductType getProductType() {
    return productType;
  }

  public void setProductType(AudienceProductType productType) {
    this.productType = productType;
  }

  public AdProduct productRefsId(String productRefsId) {
    this.productRefsId = productRefsId;
    return this;
  }

  /**
   * Get productRefsId
   *
   * @return productRefsId
   */
  @ApiModelProperty(value = "")
  public String getProductRefsId() {
    return productRefsId;
  }

  public void setProductRefsId(String productRefsId) {
    this.productRefsId = productRefsId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdProduct adProduct = (AdProduct) o;
    return Objects.equals(this.productType, adProduct.productType)
        && Objects.equals(this.productRefsId, adProduct.productRefsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productType, productRefsId);
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
