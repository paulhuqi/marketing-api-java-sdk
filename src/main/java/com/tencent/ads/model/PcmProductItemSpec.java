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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 商品信息 */
@ApiModel(description = "商品信息")
public class PcmProductItemSpec {
  @SerializedName("product_catalog_id")
  private Long productCatalogId = null;

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("product_outer_id")
  private String productOuterId = null;

  @SerializedName("product_name")
  private String productName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("custom_data")
  private String customData = null;

  @SerializedName("author")
  private String author = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("price")
  private Long price = null;

  @SerializedName("target_url_mobile")
  private String targetUrlMobile = null;

  @SerializedName("product_hash_id")
  private Long productHashId = null;

  @SerializedName("reject_message")
  private String rejectMessage = null;

  @SerializedName("system_status")
  private AuditStatus systemStatus = null;

  @SerializedName("last_modified_time")
  private String lastModifiedTime = null;

  @SerializedName("additional_image_url")
  private List<String> additionalImageUrl = null;

  @SerializedName("product_sale_status")
  private AuditStatus productSaleStatus = null;

  @SerializedName("first_category_id")
  private Long firstCategoryId = null;

  @SerializedName("second_category_id")
  private Long secondCategoryId = null;

  @SerializedName("third_category_id")
  private Long thirdCategoryId = null;

  @SerializedName("fourth_category_id")
  private Long fourthCategoryId = null;

  @SerializedName("first_category_name")
  private String firstCategoryName = null;

  @SerializedName("second_category_name")
  private String secondCategoryName = null;

  @SerializedName("third_category_name")
  private String thirdCategoryName = null;

  @SerializedName("fourth_category_name")
  private String fourthCategoryName = null;

  public PcmProductItemSpec productCatalogId(Long productCatalogId) {
    this.productCatalogId = productCatalogId;
    return this;
  }

  /**
   * Get productCatalogId
   *
   * @return productCatalogId
   */
  @ApiModelProperty(value = "")
  public Long getProductCatalogId() {
    return productCatalogId;
  }

  public void setProductCatalogId(Long productCatalogId) {
    this.productCatalogId = productCatalogId;
  }

  public PcmProductItemSpec accountId(Long accountId) {
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

  public PcmProductItemSpec productOuterId(String productOuterId) {
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

  public PcmProductItemSpec productName(String productName) {
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

  public PcmProductItemSpec description(String description) {
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

  public PcmProductItemSpec customData(String customData) {
    this.customData = customData;
    return this;
  }

  /**
   * Get customData
   *
   * @return customData
   */
  @ApiModelProperty(value = "")
  public String getCustomData() {
    return customData;
  }

  public void setCustomData(String customData) {
    this.customData = customData;
  }

  public PcmProductItemSpec author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   *
   * @return author
   */
  @ApiModelProperty(value = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public PcmProductItemSpec imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   *
   * @return imageUrl
   */
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public PcmProductItemSpec price(Long price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   *
   * @return price
   */
  @ApiModelProperty(value = "")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public PcmProductItemSpec targetUrlMobile(String targetUrlMobile) {
    this.targetUrlMobile = targetUrlMobile;
    return this;
  }

  /**
   * Get targetUrlMobile
   *
   * @return targetUrlMobile
   */
  @ApiModelProperty(value = "")
  public String getTargetUrlMobile() {
    return targetUrlMobile;
  }

  public void setTargetUrlMobile(String targetUrlMobile) {
    this.targetUrlMobile = targetUrlMobile;
  }

  public PcmProductItemSpec productHashId(Long productHashId) {
    this.productHashId = productHashId;
    return this;
  }

  /**
   * Get productHashId
   *
   * @return productHashId
   */
  @ApiModelProperty(value = "")
  public Long getProductHashId() {
    return productHashId;
  }

  public void setProductHashId(Long productHashId) {
    this.productHashId = productHashId;
  }

  public PcmProductItemSpec rejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  /**
   * Get rejectMessage
   *
   * @return rejectMessage
   */
  @ApiModelProperty(value = "")
  public String getRejectMessage() {
    return rejectMessage;
  }

  public void setRejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
  }

  public PcmProductItemSpec systemStatus(AuditStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public AuditStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(AuditStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  public PcmProductItemSpec lastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public PcmProductItemSpec additionalImageUrl(List<String> additionalImageUrl) {
    this.additionalImageUrl = additionalImageUrl;
    return this;
  }

  public PcmProductItemSpec addAdditionalImageUrlItem(String additionalImageUrlItem) {
    if (this.additionalImageUrl == null) {
      this.additionalImageUrl = new ArrayList<String>();
    }
    this.additionalImageUrl.add(additionalImageUrlItem);
    return this;
  }

  /**
   * Get additionalImageUrl
   *
   * @return additionalImageUrl
   */
  @ApiModelProperty(value = "")
  public List<String> getAdditionalImageUrl() {
    return additionalImageUrl;
  }

  public void setAdditionalImageUrl(List<String> additionalImageUrl) {
    this.additionalImageUrl = additionalImageUrl;
  }

  public PcmProductItemSpec productSaleStatus(AuditStatus productSaleStatus) {
    this.productSaleStatus = productSaleStatus;
    return this;
  }

  /**
   * Get productSaleStatus
   *
   * @return productSaleStatus
   */
  @ApiModelProperty(value = "")
  public AuditStatus getProductSaleStatus() {
    return productSaleStatus;
  }

  public void setProductSaleStatus(AuditStatus productSaleStatus) {
    this.productSaleStatus = productSaleStatus;
  }

  public PcmProductItemSpec firstCategoryId(Long firstCategoryId) {
    this.firstCategoryId = firstCategoryId;
    return this;
  }

  /**
   * Get firstCategoryId
   *
   * @return firstCategoryId
   */
  @ApiModelProperty(value = "")
  public Long getFirstCategoryId() {
    return firstCategoryId;
  }

  public void setFirstCategoryId(Long firstCategoryId) {
    this.firstCategoryId = firstCategoryId;
  }

  public PcmProductItemSpec secondCategoryId(Long secondCategoryId) {
    this.secondCategoryId = secondCategoryId;
    return this;
  }

  /**
   * Get secondCategoryId
   *
   * @return secondCategoryId
   */
  @ApiModelProperty(value = "")
  public Long getSecondCategoryId() {
    return secondCategoryId;
  }

  public void setSecondCategoryId(Long secondCategoryId) {
    this.secondCategoryId = secondCategoryId;
  }

  public PcmProductItemSpec thirdCategoryId(Long thirdCategoryId) {
    this.thirdCategoryId = thirdCategoryId;
    return this;
  }

  /**
   * Get thirdCategoryId
   *
   * @return thirdCategoryId
   */
  @ApiModelProperty(value = "")
  public Long getThirdCategoryId() {
    return thirdCategoryId;
  }

  public void setThirdCategoryId(Long thirdCategoryId) {
    this.thirdCategoryId = thirdCategoryId;
  }

  public PcmProductItemSpec fourthCategoryId(Long fourthCategoryId) {
    this.fourthCategoryId = fourthCategoryId;
    return this;
  }

  /**
   * Get fourthCategoryId
   *
   * @return fourthCategoryId
   */
  @ApiModelProperty(value = "")
  public Long getFourthCategoryId() {
    return fourthCategoryId;
  }

  public void setFourthCategoryId(Long fourthCategoryId) {
    this.fourthCategoryId = fourthCategoryId;
  }

  public PcmProductItemSpec firstCategoryName(String firstCategoryName) {
    this.firstCategoryName = firstCategoryName;
    return this;
  }

  /**
   * Get firstCategoryName
   *
   * @return firstCategoryName
   */
  @ApiModelProperty(value = "")
  public String getFirstCategoryName() {
    return firstCategoryName;
  }

  public void setFirstCategoryName(String firstCategoryName) {
    this.firstCategoryName = firstCategoryName;
  }

  public PcmProductItemSpec secondCategoryName(String secondCategoryName) {
    this.secondCategoryName = secondCategoryName;
    return this;
  }

  /**
   * Get secondCategoryName
   *
   * @return secondCategoryName
   */
  @ApiModelProperty(value = "")
  public String getSecondCategoryName() {
    return secondCategoryName;
  }

  public void setSecondCategoryName(String secondCategoryName) {
    this.secondCategoryName = secondCategoryName;
  }

  public PcmProductItemSpec thirdCategoryName(String thirdCategoryName) {
    this.thirdCategoryName = thirdCategoryName;
    return this;
  }

  /**
   * Get thirdCategoryName
   *
   * @return thirdCategoryName
   */
  @ApiModelProperty(value = "")
  public String getThirdCategoryName() {
    return thirdCategoryName;
  }

  public void setThirdCategoryName(String thirdCategoryName) {
    this.thirdCategoryName = thirdCategoryName;
  }

  public PcmProductItemSpec fourthCategoryName(String fourthCategoryName) {
    this.fourthCategoryName = fourthCategoryName;
    return this;
  }

  /**
   * Get fourthCategoryName
   *
   * @return fourthCategoryName
   */
  @ApiModelProperty(value = "")
  public String getFourthCategoryName() {
    return fourthCategoryName;
  }

  public void setFourthCategoryName(String fourthCategoryName) {
    this.fourthCategoryName = fourthCategoryName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PcmProductItemSpec pcmProductItemSpec = (PcmProductItemSpec) o;
    return Objects.equals(this.productCatalogId, pcmProductItemSpec.productCatalogId)
        && Objects.equals(this.accountId, pcmProductItemSpec.accountId)
        && Objects.equals(this.productOuterId, pcmProductItemSpec.productOuterId)
        && Objects.equals(this.productName, pcmProductItemSpec.productName)
        && Objects.equals(this.description, pcmProductItemSpec.description)
        && Objects.equals(this.customData, pcmProductItemSpec.customData)
        && Objects.equals(this.author, pcmProductItemSpec.author)
        && Objects.equals(this.imageUrl, pcmProductItemSpec.imageUrl)
        && Objects.equals(this.price, pcmProductItemSpec.price)
        && Objects.equals(this.targetUrlMobile, pcmProductItemSpec.targetUrlMobile)
        && Objects.equals(this.productHashId, pcmProductItemSpec.productHashId)
        && Objects.equals(this.rejectMessage, pcmProductItemSpec.rejectMessage)
        && Objects.equals(this.systemStatus, pcmProductItemSpec.systemStatus)
        && Objects.equals(this.lastModifiedTime, pcmProductItemSpec.lastModifiedTime)
        && Objects.equals(this.additionalImageUrl, pcmProductItemSpec.additionalImageUrl)
        && Objects.equals(this.productSaleStatus, pcmProductItemSpec.productSaleStatus)
        && Objects.equals(this.firstCategoryId, pcmProductItemSpec.firstCategoryId)
        && Objects.equals(this.secondCategoryId, pcmProductItemSpec.secondCategoryId)
        && Objects.equals(this.thirdCategoryId, pcmProductItemSpec.thirdCategoryId)
        && Objects.equals(this.fourthCategoryId, pcmProductItemSpec.fourthCategoryId)
        && Objects.equals(this.firstCategoryName, pcmProductItemSpec.firstCategoryName)
        && Objects.equals(this.secondCategoryName, pcmProductItemSpec.secondCategoryName)
        && Objects.equals(this.thirdCategoryName, pcmProductItemSpec.thirdCategoryName)
        && Objects.equals(this.fourthCategoryName, pcmProductItemSpec.fourthCategoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        productCatalogId,
        accountId,
        productOuterId,
        productName,
        description,
        customData,
        author,
        imageUrl,
        price,
        targetUrlMobile,
        productHashId,
        rejectMessage,
        systemStatus,
        lastModifiedTime,
        additionalImageUrl,
        productSaleStatus,
        firstCategoryId,
        secondCategoryId,
        thirdCategoryId,
        fourthCategoryId,
        firstCategoryName,
        secondCategoryName,
        thirdCategoryName,
        fourthCategoryName);
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
