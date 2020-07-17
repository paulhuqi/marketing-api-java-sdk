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

/** custom_feature_class返回结构 */
@ApiModel(description = "custom_feature_class返回结构")
public class CustomFeature {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("feature_id")
  private Long featureId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("feature_class_id")
  private Long featureClassId = null;

  @SerializedName("feature_spec")
  private FeatureSpec featureSpec = null;

  @SerializedName("is_supported_time_window")
  private Boolean isSupportedTimeWindow = null;

  @SerializedName("time_window")
  private List<Long> timeWindow = null;

  @SerializedName("created_time")
  private String createdTime = null;

  public CustomFeature accountId(Long accountId) {
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

  public CustomFeature featureId(Long featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * Get featureId
   *
   * @return featureId
   */
  @ApiModelProperty(value = "")
  public Long getFeatureId() {
    return featureId;
  }

  public void setFeatureId(Long featureId) {
    this.featureId = featureId;
  }

  public CustomFeature name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomFeature description(String description) {
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

  public CustomFeature featureClassId(Long featureClassId) {
    this.featureClassId = featureClassId;
    return this;
  }

  /**
   * Get featureClassId
   *
   * @return featureClassId
   */
  @ApiModelProperty(value = "")
  public Long getFeatureClassId() {
    return featureClassId;
  }

  public void setFeatureClassId(Long featureClassId) {
    this.featureClassId = featureClassId;
  }

  public CustomFeature featureSpec(FeatureSpec featureSpec) {
    this.featureSpec = featureSpec;
    return this;
  }

  /**
   * Get featureSpec
   *
   * @return featureSpec
   */
  @ApiModelProperty(value = "")
  public FeatureSpec getFeatureSpec() {
    return featureSpec;
  }

  public void setFeatureSpec(FeatureSpec featureSpec) {
    this.featureSpec = featureSpec;
  }

  public CustomFeature isSupportedTimeWindow(Boolean isSupportedTimeWindow) {
    this.isSupportedTimeWindow = isSupportedTimeWindow;
    return this;
  }

  /**
   * Get isSupportedTimeWindow
   *
   * @return isSupportedTimeWindow
   */
  @ApiModelProperty(value = "")
  public Boolean isIsSupportedTimeWindow() {
    return isSupportedTimeWindow;
  }

  public void setIsSupportedTimeWindow(Boolean isSupportedTimeWindow) {
    this.isSupportedTimeWindow = isSupportedTimeWindow;
  }

  public CustomFeature timeWindow(List<Long> timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

  public CustomFeature addTimeWindowItem(Long timeWindowItem) {
    if (this.timeWindow == null) {
      this.timeWindow = new ArrayList<Long>();
    }
    this.timeWindow.add(timeWindowItem);
    return this;
  }

  /**
   * Get timeWindow
   *
   * @return timeWindow
   */
  @ApiModelProperty(value = "")
  public List<Long> getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(List<Long> timeWindow) {
    this.timeWindow = timeWindow;
  }

  public CustomFeature createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFeature customFeature = (CustomFeature) o;
    return Objects.equals(this.accountId, customFeature.accountId)
        && Objects.equals(this.featureId, customFeature.featureId)
        && Objects.equals(this.name, customFeature.name)
        && Objects.equals(this.description, customFeature.description)
        && Objects.equals(this.featureClassId, customFeature.featureClassId)
        && Objects.equals(this.featureSpec, customFeature.featureSpec)
        && Objects.equals(this.isSupportedTimeWindow, customFeature.isSupportedTimeWindow)
        && Objects.equals(this.timeWindow, customFeature.timeWindow)
        && Objects.equals(this.createdTime, customFeature.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        featureId,
        name,
        description,
        featureClassId,
        featureSpec,
        isSupportedTimeWindow,
        timeWindow,
        createdTime);
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
