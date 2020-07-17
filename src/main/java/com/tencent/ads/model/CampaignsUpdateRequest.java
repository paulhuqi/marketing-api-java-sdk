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

/** CampaignsUpdateRequest */
public class CampaignsUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("campaign_name")
  private String campaignName = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("configured_status")
  private AdStatus configuredStatus = null;

  @SerializedName("speed_mode")
  private SpeedMode speedMode = null;

  @SerializedName("begin_date")
  private String beginDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("is_auto_replenish")
  private Long isAutoReplenish = null;

  public CampaignsUpdateRequest accountId(Long accountId) {
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

  public CampaignsUpdateRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   *
   * @return campaignId
   */
  @ApiModelProperty(value = "")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignsUpdateRequest campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * Get campaignName
   *
   * @return campaignName
   */
  @ApiModelProperty(value = "")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public CampaignsUpdateRequest dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  /**
   * Get dailyBudget
   *
   * @return dailyBudget
   */
  @ApiModelProperty(value = "")
  public Long getDailyBudget() {
    return dailyBudget;
  }

  public void setDailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
  }

  public CampaignsUpdateRequest configuredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   */
  @ApiModelProperty(value = "")
  public AdStatus getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  public CampaignsUpdateRequest speedMode(SpeedMode speedMode) {
    this.speedMode = speedMode;
    return this;
  }

  /**
   * Get speedMode
   *
   * @return speedMode
   */
  @ApiModelProperty(value = "")
  public SpeedMode getSpeedMode() {
    return speedMode;
  }

  public void setSpeedMode(SpeedMode speedMode) {
    this.speedMode = speedMode;
  }

  public CampaignsUpdateRequest beginDate(String beginDate) {
    this.beginDate = beginDate;
    return this;
  }

  /**
   * Get beginDate
   *
   * @return beginDate
   */
  @ApiModelProperty(value = "")
  public String getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(String beginDate) {
    this.beginDate = beginDate;
  }

  public CampaignsUpdateRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   *
   * @return endDate
   */
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public CampaignsUpdateRequest isAutoReplenish(Long isAutoReplenish) {
    this.isAutoReplenish = isAutoReplenish;
    return this;
  }

  /**
   * Get isAutoReplenish
   *
   * @return isAutoReplenish
   */
  @ApiModelProperty(value = "")
  public Long getIsAutoReplenish() {
    return isAutoReplenish;
  }

  public void setIsAutoReplenish(Long isAutoReplenish) {
    this.isAutoReplenish = isAutoReplenish;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsUpdateRequest campaignsUpdateRequest = (CampaignsUpdateRequest) o;
    return Objects.equals(this.accountId, campaignsUpdateRequest.accountId)
        && Objects.equals(this.campaignId, campaignsUpdateRequest.campaignId)
        && Objects.equals(this.campaignName, campaignsUpdateRequest.campaignName)
        && Objects.equals(this.dailyBudget, campaignsUpdateRequest.dailyBudget)
        && Objects.equals(this.configuredStatus, campaignsUpdateRequest.configuredStatus)
        && Objects.equals(this.speedMode, campaignsUpdateRequest.speedMode)
        && Objects.equals(this.beginDate, campaignsUpdateRequest.beginDate)
        && Objects.equals(this.endDate, campaignsUpdateRequest.endDate)
        && Objects.equals(this.isAutoReplenish, campaignsUpdateRequest.isAutoReplenish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        campaignId,
        campaignName,
        dailyBudget,
        configuredStatus,
        speedMode,
        beginDate,
        endDate,
        isAutoReplenish);
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
