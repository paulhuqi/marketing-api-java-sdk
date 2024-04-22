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

/** 商品直投视频 */
@ApiModel(description = "商品直投视频")
public class AdDirectVideo {
  @SerializedName("video_url")
  private String videoUrl = null;

  @SerializedName("cover_image_url")
  private String coverImageUrl = null;

  public AdDirectVideo videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  /**
   * Get videoUrl
   *
   * @return videoUrl
   */
  @ApiModelProperty(value = "")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public AdDirectVideo coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  /**
   * Get coverImageUrl
   *
   * @return coverImageUrl
   */
  @ApiModelProperty(value = "")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdDirectVideo adDirectVideo = (AdDirectVideo) o;
    return Objects.equals(this.videoUrl, adDirectVideo.videoUrl)
        && Objects.equals(this.coverImageUrl, adDirectVideo.coverImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoUrl, coverImageUrl);
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