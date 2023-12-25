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

/** 直播数据信息结构 */
@ApiModel(description = "直播数据信息结构")
public class LiveInfoListStruct {
  @SerializedName("dealer_id")
  private Long dealerId = null;

  @SerializedName("dealer_name")
  private String dealerName = null;

  @SerializedName("video_channel_id")
  private String videoChannelId = null;

  @SerializedName("video_channel_name")
  private String videoChannelName = null;

  @SerializedName("showings_id")
  private String showingsId = null;

  @SerializedName("live_start_time")
  private String liveStartTime = null;

  @SerializedName("live_end_time")
  private String liveEndTime = null;

  @SerializedName("watching_person_uv")
  private Long watchingPersonUv = null;

  @SerializedName("avg_watching_duration")
  private Long avgWatchingDuration = null;

  @SerializedName("cheers_cnt")
  private Long cheersCnt = null;

  @SerializedName("share_cnt")
  private Long shareCnt = null;

  @SerializedName("comment_cnt")
  private Long commentCnt = null;

  @SerializedName("living_duration")
  private Long livingDuration = null;

  public LiveInfoListStruct dealerId(Long dealerId) {
    this.dealerId = dealerId;
    return this;
  }

  /**
   * Get dealerId
   *
   * @return dealerId
   */
  @ApiModelProperty(value = "")
  public Long getDealerId() {
    return dealerId;
  }

  public void setDealerId(Long dealerId) {
    this.dealerId = dealerId;
  }

  public LiveInfoListStruct dealerName(String dealerName) {
    this.dealerName = dealerName;
    return this;
  }

  /**
   * Get dealerName
   *
   * @return dealerName
   */
  @ApiModelProperty(value = "")
  public String getDealerName() {
    return dealerName;
  }

  public void setDealerName(String dealerName) {
    this.dealerName = dealerName;
  }

  public LiveInfoListStruct videoChannelId(String videoChannelId) {
    this.videoChannelId = videoChannelId;
    return this;
  }

  /**
   * Get videoChannelId
   *
   * @return videoChannelId
   */
  @ApiModelProperty(value = "")
  public String getVideoChannelId() {
    return videoChannelId;
  }

  public void setVideoChannelId(String videoChannelId) {
    this.videoChannelId = videoChannelId;
  }

  public LiveInfoListStruct videoChannelName(String videoChannelName) {
    this.videoChannelName = videoChannelName;
    return this;
  }

  /**
   * Get videoChannelName
   *
   * @return videoChannelName
   */
  @ApiModelProperty(value = "")
  public String getVideoChannelName() {
    return videoChannelName;
  }

  public void setVideoChannelName(String videoChannelName) {
    this.videoChannelName = videoChannelName;
  }

  public LiveInfoListStruct showingsId(String showingsId) {
    this.showingsId = showingsId;
    return this;
  }

  /**
   * Get showingsId
   *
   * @return showingsId
   */
  @ApiModelProperty(value = "")
  public String getShowingsId() {
    return showingsId;
  }

  public void setShowingsId(String showingsId) {
    this.showingsId = showingsId;
  }

  public LiveInfoListStruct liveStartTime(String liveStartTime) {
    this.liveStartTime = liveStartTime;
    return this;
  }

  /**
   * Get liveStartTime
   *
   * @return liveStartTime
   */
  @ApiModelProperty(value = "")
  public String getLiveStartTime() {
    return liveStartTime;
  }

  public void setLiveStartTime(String liveStartTime) {
    this.liveStartTime = liveStartTime;
  }

  public LiveInfoListStruct liveEndTime(String liveEndTime) {
    this.liveEndTime = liveEndTime;
    return this;
  }

  /**
   * Get liveEndTime
   *
   * @return liveEndTime
   */
  @ApiModelProperty(value = "")
  public String getLiveEndTime() {
    return liveEndTime;
  }

  public void setLiveEndTime(String liveEndTime) {
    this.liveEndTime = liveEndTime;
  }

  public LiveInfoListStruct watchingPersonUv(Long watchingPersonUv) {
    this.watchingPersonUv = watchingPersonUv;
    return this;
  }

  /**
   * Get watchingPersonUv
   *
   * @return watchingPersonUv
   */
  @ApiModelProperty(value = "")
  public Long getWatchingPersonUv() {
    return watchingPersonUv;
  }

  public void setWatchingPersonUv(Long watchingPersonUv) {
    this.watchingPersonUv = watchingPersonUv;
  }

  public LiveInfoListStruct avgWatchingDuration(Long avgWatchingDuration) {
    this.avgWatchingDuration = avgWatchingDuration;
    return this;
  }

  /**
   * Get avgWatchingDuration
   *
   * @return avgWatchingDuration
   */
  @ApiModelProperty(value = "")
  public Long getAvgWatchingDuration() {
    return avgWatchingDuration;
  }

  public void setAvgWatchingDuration(Long avgWatchingDuration) {
    this.avgWatchingDuration = avgWatchingDuration;
  }

  public LiveInfoListStruct cheersCnt(Long cheersCnt) {
    this.cheersCnt = cheersCnt;
    return this;
  }

  /**
   * Get cheersCnt
   *
   * @return cheersCnt
   */
  @ApiModelProperty(value = "")
  public Long getCheersCnt() {
    return cheersCnt;
  }

  public void setCheersCnt(Long cheersCnt) {
    this.cheersCnt = cheersCnt;
  }

  public LiveInfoListStruct shareCnt(Long shareCnt) {
    this.shareCnt = shareCnt;
    return this;
  }

  /**
   * Get shareCnt
   *
   * @return shareCnt
   */
  @ApiModelProperty(value = "")
  public Long getShareCnt() {
    return shareCnt;
  }

  public void setShareCnt(Long shareCnt) {
    this.shareCnt = shareCnt;
  }

  public LiveInfoListStruct commentCnt(Long commentCnt) {
    this.commentCnt = commentCnt;
    return this;
  }

  /**
   * Get commentCnt
   *
   * @return commentCnt
   */
  @ApiModelProperty(value = "")
  public Long getCommentCnt() {
    return commentCnt;
  }

  public void setCommentCnt(Long commentCnt) {
    this.commentCnt = commentCnt;
  }

  public LiveInfoListStruct livingDuration(Long livingDuration) {
    this.livingDuration = livingDuration;
    return this;
  }

  /**
   * Get livingDuration
   *
   * @return livingDuration
   */
  @ApiModelProperty(value = "")
  public Long getLivingDuration() {
    return livingDuration;
  }

  public void setLivingDuration(Long livingDuration) {
    this.livingDuration = livingDuration;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveInfoListStruct liveInfoListStruct = (LiveInfoListStruct) o;
    return Objects.equals(this.dealerId, liveInfoListStruct.dealerId)
        && Objects.equals(this.dealerName, liveInfoListStruct.dealerName)
        && Objects.equals(this.videoChannelId, liveInfoListStruct.videoChannelId)
        && Objects.equals(this.videoChannelName, liveInfoListStruct.videoChannelName)
        && Objects.equals(this.showingsId, liveInfoListStruct.showingsId)
        && Objects.equals(this.liveStartTime, liveInfoListStruct.liveStartTime)
        && Objects.equals(this.liveEndTime, liveInfoListStruct.liveEndTime)
        && Objects.equals(this.watchingPersonUv, liveInfoListStruct.watchingPersonUv)
        && Objects.equals(this.avgWatchingDuration, liveInfoListStruct.avgWatchingDuration)
        && Objects.equals(this.cheersCnt, liveInfoListStruct.cheersCnt)
        && Objects.equals(this.shareCnt, liveInfoListStruct.shareCnt)
        && Objects.equals(this.commentCnt, liveInfoListStruct.commentCnt)
        && Objects.equals(this.livingDuration, liveInfoListStruct.livingDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dealerId,
        dealerName,
        videoChannelId,
        videoChannelName,
        showingsId,
        liveStartTime,
        liveEndTime,
        watchingPersonUv,
        avgWatchingDuration,
        cheersCnt,
        shareCnt,
        commentCnt,
        livingDuration);
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