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

/** 定向包分享结构 */
@ApiModel(description = "定向包分享结构")
public class TargetingsShareItem {
  @SerializedName("targeting_id")
  private Long targetingId = null;

  @SerializedName("share_to_account_id")
  private Long shareToAccountId = null;

  @SerializedName("share_type")
  private TargetingShareType shareType = null;

  public TargetingsShareItem targetingId(Long targetingId) {
    this.targetingId = targetingId;
    return this;
  }

  /**
   * Get targetingId
   *
   * @return targetingId
   */
  @ApiModelProperty(value = "")
  public Long getTargetingId() {
    return targetingId;
  }

  public void setTargetingId(Long targetingId) {
    this.targetingId = targetingId;
  }

  public TargetingsShareItem shareToAccountId(Long shareToAccountId) {
    this.shareToAccountId = shareToAccountId;
    return this;
  }

  /**
   * Get shareToAccountId
   *
   * @return shareToAccountId
   */
  @ApiModelProperty(value = "")
  public Long getShareToAccountId() {
    return shareToAccountId;
  }

  public void setShareToAccountId(Long shareToAccountId) {
    this.shareToAccountId = shareToAccountId;
  }

  public TargetingsShareItem shareType(TargetingShareType shareType) {
    this.shareType = shareType;
    return this;
  }

  /**
   * Get shareType
   *
   * @return shareType
   */
  @ApiModelProperty(value = "")
  public TargetingShareType getShareType() {
    return shareType;
  }

  public void setShareType(TargetingShareType shareType) {
    this.shareType = shareType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingsShareItem targetingsShareItem = (TargetingsShareItem) o;
    return Objects.equals(this.targetingId, targetingsShareItem.targetingId)
        && Objects.equals(this.shareToAccountId, targetingsShareItem.shareToAccountId)
        && Objects.equals(this.shareType, targetingsShareItem.shareType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetingId, shareToAccountId, shareType);
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