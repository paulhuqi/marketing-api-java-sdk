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

/** 视频播放结束页 */
@ApiModel(description = "视频播放结束页")
public class VideoEndPageSpec {
  @SerializedName("end_page_id")
  private String endPageId = null;

  @SerializedName("end_page_type")
  private VideoEndPageType endPageType = null;

  public VideoEndPageSpec endPageId(String endPageId) {
    this.endPageId = endPageId;
    return this;
  }

  /**
   * Get endPageId
   *
   * @return endPageId
   */
  @ApiModelProperty(value = "")
  public String getEndPageId() {
    return endPageId;
  }

  public void setEndPageId(String endPageId) {
    this.endPageId = endPageId;
  }

  public VideoEndPageSpec endPageType(VideoEndPageType endPageType) {
    this.endPageType = endPageType;
    return this;
  }

  /**
   * Get endPageType
   *
   * @return endPageType
   */
  @ApiModelProperty(value = "")
  public VideoEndPageType getEndPageType() {
    return endPageType;
  }

  public void setEndPageType(VideoEndPageType endPageType) {
    this.endPageType = endPageType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoEndPageSpec videoEndPageSpec = (VideoEndPageSpec) o;
    return Objects.equals(this.endPageId, videoEndPageSpec.endPageId)
        && Objects.equals(this.endPageType, videoEndPageSpec.endPageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPageId, endPageType);
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
