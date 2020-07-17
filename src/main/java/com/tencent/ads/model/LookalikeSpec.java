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

/** Lookalike人群信息 */
@ApiModel(description = "Lookalike人群信息")
public class LookalikeSpec {
  @SerializedName("seed_audience_id")
  private Long seedAudienceId = null;

  @SerializedName("expand_user_count")
  private Long expandUserCount = null;

  public LookalikeSpec seedAudienceId(Long seedAudienceId) {
    this.seedAudienceId = seedAudienceId;
    return this;
  }

  /**
   * Get seedAudienceId
   *
   * @return seedAudienceId
   */
  @ApiModelProperty(value = "")
  public Long getSeedAudienceId() {
    return seedAudienceId;
  }

  public void setSeedAudienceId(Long seedAudienceId) {
    this.seedAudienceId = seedAudienceId;
  }

  public LookalikeSpec expandUserCount(Long expandUserCount) {
    this.expandUserCount = expandUserCount;
    return this;
  }

  /**
   * Get expandUserCount
   *
   * @return expandUserCount
   */
  @ApiModelProperty(value = "")
  public Long getExpandUserCount() {
    return expandUserCount;
  }

  public void setExpandUserCount(Long expandUserCount) {
    this.expandUserCount = expandUserCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookalikeSpec lookalikeSpec = (LookalikeSpec) o;
    return Objects.equals(this.seedAudienceId, lookalikeSpec.seedAudienceId)
        && Objects.equals(this.expandUserCount, lookalikeSpec.expandUserCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seedAudienceId, expandUserCount);
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
