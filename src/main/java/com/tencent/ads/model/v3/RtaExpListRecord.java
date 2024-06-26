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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** RTA实验信息 */
@ApiModel(description = "RTA实验信息")
public class RtaExpListRecord {
  @SerializedName("ExpId")
  private Long expId = null;

  @SerializedName("ExpName")
  private String expName = null;

  @SerializedName("FlowRate")
  private Long flowRate = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("SiteSet")
  private List<Long> siteSet = null;

  @SerializedName("Status")
  private Long status = null;

  public RtaExpListRecord expId(Long expId) {
    this.expId = expId;
    return this;
  }

  /**
   * Get expId
   *
   * @return expId
   */
  @ApiModelProperty(value = "")
  public Long getExpId() {
    return expId;
  }

  public void setExpId(Long expId) {
    this.expId = expId;
  }

  public RtaExpListRecord expName(String expName) {
    this.expName = expName;
    return this;
  }

  /**
   * Get expName
   *
   * @return expName
   */
  @ApiModelProperty(value = "")
  public String getExpName() {
    return expName;
  }

  public void setExpName(String expName) {
    this.expName = expName;
  }

  public RtaExpListRecord flowRate(Long flowRate) {
    this.flowRate = flowRate;
    return this;
  }

  /**
   * Get flowRate
   *
   * @return flowRate
   */
  @ApiModelProperty(value = "")
  public Long getFlowRate() {
    return flowRate;
  }

  public void setFlowRate(Long flowRate) {
    this.flowRate = flowRate;
  }

  public RtaExpListRecord endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   *
   * @return endTime
   */
  @ApiModelProperty(value = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public RtaExpListRecord siteSet(List<Long> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public RtaExpListRecord addSiteSetItem(Long siteSetItem) {
    if (this.siteSet == null) {
      this.siteSet = new ArrayList<Long>();
    }
    this.siteSet.add(siteSetItem);
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   */
  @ApiModelProperty(value = "")
  public List<Long> getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(List<Long> siteSet) {
    this.siteSet = siteSet;
  }

  public RtaExpListRecord status(Long status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtaExpListRecord rtaExpListRecord = (RtaExpListRecord) o;
    return Objects.equals(this.expId, rtaExpListRecord.expId)
        && Objects.equals(this.expName, rtaExpListRecord.expName)
        && Objects.equals(this.flowRate, rtaExpListRecord.flowRate)
        && Objects.equals(this.endTime, rtaExpListRecord.endTime)
        && Objects.equals(this.siteSet, rtaExpListRecord.siteSet)
        && Objects.equals(this.status, rtaExpListRecord.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expId, expName, flowRate, endTime, siteSet, status);
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
