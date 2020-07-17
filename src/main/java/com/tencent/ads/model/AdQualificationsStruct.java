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

/** 广告资质信息 */
@ApiModel(description = "广告资质信息")
public class AdQualificationsStruct {
  @SerializedName("qualification_id")
  private Long qualificationId = null;

  @SerializedName("qualification_code")
  private String qualificationCode = null;

  @SerializedName("image_id_list")
  private List<String> imageIdList = null;

  @SerializedName("qualification_status")
  private QualificationStatus qualificationStatus = null;

  @SerializedName("reject_message")
  private String rejectMessage = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  public AdQualificationsStruct qualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
    return this;
  }

  /**
   * Get qualificationId
   *
   * @return qualificationId
   */
  @ApiModelProperty(value = "")
  public Long getQualificationId() {
    return qualificationId;
  }

  public void setQualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
  }

  public AdQualificationsStruct qualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
    return this;
  }

  /**
   * Get qualificationCode
   *
   * @return qualificationCode
   */
  @ApiModelProperty(value = "")
  public String getQualificationCode() {
    return qualificationCode;
  }

  public void setQualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
  }

  public AdQualificationsStruct imageIdList(List<String> imageIdList) {
    this.imageIdList = imageIdList;
    return this;
  }

  public AdQualificationsStruct addImageIdListItem(String imageIdListItem) {
    if (this.imageIdList == null) {
      this.imageIdList = new ArrayList<String>();
    }
    this.imageIdList.add(imageIdListItem);
    return this;
  }

  /**
   * Get imageIdList
   *
   * @return imageIdList
   */
  @ApiModelProperty(value = "")
  public List<String> getImageIdList() {
    return imageIdList;
  }

  public void setImageIdList(List<String> imageIdList) {
    this.imageIdList = imageIdList;
  }

  public AdQualificationsStruct qualificationStatus(QualificationStatus qualificationStatus) {
    this.qualificationStatus = qualificationStatus;
    return this;
  }

  /**
   * Get qualificationStatus
   *
   * @return qualificationStatus
   */
  @ApiModelProperty(value = "")
  public QualificationStatus getQualificationStatus() {
    return qualificationStatus;
  }

  public void setQualificationStatus(QualificationStatus qualificationStatus) {
    this.qualificationStatus = qualificationStatus;
  }

  public AdQualificationsStruct rejectMessage(String rejectMessage) {
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

  public AdQualificationsStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public AdQualificationsStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdQualificationsStruct adQualificationsStruct = (AdQualificationsStruct) o;
    return Objects.equals(this.qualificationId, adQualificationsStruct.qualificationId)
        && Objects.equals(this.qualificationCode, adQualificationsStruct.qualificationCode)
        && Objects.equals(this.imageIdList, adQualificationsStruct.imageIdList)
        && Objects.equals(this.qualificationStatus, adQualificationsStruct.qualificationStatus)
        && Objects.equals(this.rejectMessage, adQualificationsStruct.rejectMessage)
        && Objects.equals(this.createdTime, adQualificationsStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, adQualificationsStruct.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        qualificationId,
        qualificationCode,
        imageIdList,
        qualificationStatus,
        rejectMessage,
        createdTime,
        lastModifiedTime);
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
