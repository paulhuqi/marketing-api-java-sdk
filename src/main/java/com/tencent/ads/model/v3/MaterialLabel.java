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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 素材标签 */
@ApiModel(description = "素材标签")
public class MaterialLabel {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("label_id")
  private Long labelId = null;

  @SerializedName("label_name")
  private String labelName = null;

  @SerializedName("first_label_level_id")
  private Long firstLabelLevelId = null;

  @SerializedName("first_label_level_name")
  private String firstLabelLevelName = null;

  @SerializedName("second_label_level_id")
  private Long secondLabelLevelId = null;

  @SerializedName("second_label_level_name")
  private String secondLabelLevelName = null;

  @SerializedName("create_time")
  private String createTime = null;

  @SerializedName("label_source")
  private MaterialLabelSource labelSource = null;

  @SerializedName("relation_image_count")
  private Long relationImageCount = null;

  @SerializedName("relation_media_count")
  private Long relationMediaCount = null;

  @SerializedName("business_scenario_val")
  private BusinessScenario businessScenarioVal = null;

  public MaterialLabel accountId(Long accountId) {
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

  public MaterialLabel labelId(Long labelId) {
    this.labelId = labelId;
    return this;
  }

  /**
   * Get labelId
   *
   * @return labelId
   */
  @ApiModelProperty(value = "")
  public Long getLabelId() {
    return labelId;
  }

  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }

  public MaterialLabel labelName(String labelName) {
    this.labelName = labelName;
    return this;
  }

  /**
   * Get labelName
   *
   * @return labelName
   */
  @ApiModelProperty(value = "")
  public String getLabelName() {
    return labelName;
  }

  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }

  public MaterialLabel firstLabelLevelId(Long firstLabelLevelId) {
    this.firstLabelLevelId = firstLabelLevelId;
    return this;
  }

  /**
   * Get firstLabelLevelId
   *
   * @return firstLabelLevelId
   */
  @ApiModelProperty(value = "")
  public Long getFirstLabelLevelId() {
    return firstLabelLevelId;
  }

  public void setFirstLabelLevelId(Long firstLabelLevelId) {
    this.firstLabelLevelId = firstLabelLevelId;
  }

  public MaterialLabel firstLabelLevelName(String firstLabelLevelName) {
    this.firstLabelLevelName = firstLabelLevelName;
    return this;
  }

  /**
   * Get firstLabelLevelName
   *
   * @return firstLabelLevelName
   */
  @ApiModelProperty(value = "")
  public String getFirstLabelLevelName() {
    return firstLabelLevelName;
  }

  public void setFirstLabelLevelName(String firstLabelLevelName) {
    this.firstLabelLevelName = firstLabelLevelName;
  }

  public MaterialLabel secondLabelLevelId(Long secondLabelLevelId) {
    this.secondLabelLevelId = secondLabelLevelId;
    return this;
  }

  /**
   * Get secondLabelLevelId
   *
   * @return secondLabelLevelId
   */
  @ApiModelProperty(value = "")
  public Long getSecondLabelLevelId() {
    return secondLabelLevelId;
  }

  public void setSecondLabelLevelId(Long secondLabelLevelId) {
    this.secondLabelLevelId = secondLabelLevelId;
  }

  public MaterialLabel secondLabelLevelName(String secondLabelLevelName) {
    this.secondLabelLevelName = secondLabelLevelName;
    return this;
  }

  /**
   * Get secondLabelLevelName
   *
   * @return secondLabelLevelName
   */
  @ApiModelProperty(value = "")
  public String getSecondLabelLevelName() {
    return secondLabelLevelName;
  }

  public void setSecondLabelLevelName(String secondLabelLevelName) {
    this.secondLabelLevelName = secondLabelLevelName;
  }

  public MaterialLabel createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   *
   * @return createTime
   */
  @ApiModelProperty(value = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public MaterialLabel labelSource(MaterialLabelSource labelSource) {
    this.labelSource = labelSource;
    return this;
  }

  /**
   * Get labelSource
   *
   * @return labelSource
   */
  @ApiModelProperty(value = "")
  public MaterialLabelSource getLabelSource() {
    return labelSource;
  }

  public void setLabelSource(MaterialLabelSource labelSource) {
    this.labelSource = labelSource;
  }

  public MaterialLabel relationImageCount(Long relationImageCount) {
    this.relationImageCount = relationImageCount;
    return this;
  }

  /**
   * Get relationImageCount
   *
   * @return relationImageCount
   */
  @ApiModelProperty(value = "")
  public Long getRelationImageCount() {
    return relationImageCount;
  }

  public void setRelationImageCount(Long relationImageCount) {
    this.relationImageCount = relationImageCount;
  }

  public MaterialLabel relationMediaCount(Long relationMediaCount) {
    this.relationMediaCount = relationMediaCount;
    return this;
  }

  /**
   * Get relationMediaCount
   *
   * @return relationMediaCount
   */
  @ApiModelProperty(value = "")
  public Long getRelationMediaCount() {
    return relationMediaCount;
  }

  public void setRelationMediaCount(Long relationMediaCount) {
    this.relationMediaCount = relationMediaCount;
  }

  public MaterialLabel businessScenarioVal(BusinessScenario businessScenarioVal) {
    this.businessScenarioVal = businessScenarioVal;
    return this;
  }

  /**
   * Get businessScenarioVal
   *
   * @return businessScenarioVal
   */
  @ApiModelProperty(value = "")
  public BusinessScenario getBusinessScenarioVal() {
    return businessScenarioVal;
  }

  public void setBusinessScenarioVal(BusinessScenario businessScenarioVal) {
    this.businessScenarioVal = businessScenarioVal;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialLabel materialLabel = (MaterialLabel) o;
    return Objects.equals(this.accountId, materialLabel.accountId)
        && Objects.equals(this.labelId, materialLabel.labelId)
        && Objects.equals(this.labelName, materialLabel.labelName)
        && Objects.equals(this.firstLabelLevelId, materialLabel.firstLabelLevelId)
        && Objects.equals(this.firstLabelLevelName, materialLabel.firstLabelLevelName)
        && Objects.equals(this.secondLabelLevelId, materialLabel.secondLabelLevelId)
        && Objects.equals(this.secondLabelLevelName, materialLabel.secondLabelLevelName)
        && Objects.equals(this.createTime, materialLabel.createTime)
        && Objects.equals(this.labelSource, materialLabel.labelSource)
        && Objects.equals(this.relationImageCount, materialLabel.relationImageCount)
        && Objects.equals(this.relationMediaCount, materialLabel.relationMediaCount)
        && Objects.equals(this.businessScenarioVal, materialLabel.businessScenarioVal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        labelId,
        labelName,
        firstLabelLevelId,
        firstLabelLevelName,
        secondLabelLevelId,
        secondLabelLevelName,
        createTime,
        labelSource,
        relationImageCount,
        relationMediaCount,
        businessScenarioVal);
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
