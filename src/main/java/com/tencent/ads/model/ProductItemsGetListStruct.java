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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class ProductItemsGetListStruct {
  @SerializedName("product_outer_id")
  private String productOuterId = null;

  @SerializedName("product_name")
  private String productName = null;

  @SerializedName("product_image_url")
  private String productImageUrl = null;

  public ProductItemsGetListStruct productOuterId(String productOuterId) {
    this.productOuterId = productOuterId;
    return this;
  }

  /**
   * Get productOuterId
   *
   * @return productOuterId
   */
  @ApiModelProperty(value = "")
  public String getProductOuterId() {
    return productOuterId;
  }

  public void setProductOuterId(String productOuterId) {
    this.productOuterId = productOuterId;
  }

  public ProductItemsGetListStruct productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   *
   * @return productName
   */
  @ApiModelProperty(value = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ProductItemsGetListStruct productImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
    return this;
  }

  /**
   * Get productImageUrl
   *
   * @return productImageUrl
   */
  @ApiModelProperty(value = "")
  public String getProductImageUrl() {
    return productImageUrl;
  }

  public void setProductImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductItemsGetListStruct productItemsGetListStruct = (ProductItemsGetListStruct) o;
    return Objects.equals(this.productOuterId, productItemsGetListStruct.productOuterId)
        && Objects.equals(this.productName, productItemsGetListStruct.productName)
        && Objects.equals(this.productImageUrl, productItemsGetListStruct.productImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productOuterId, productName, productImageUrl);
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
