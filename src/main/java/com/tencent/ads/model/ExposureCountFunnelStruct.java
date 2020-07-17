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

/** 曝光量分析 */
@ApiModel(description = "曝光量分析")
public class ExposureCountFunnelStruct {
  @SerializedName("value")
  private Double value = null;

  @SerializedName("score")
  private Long score = null;

  @SerializedName("score_desc")
  private String scoreDesc = null;

  @SerializedName("rank_category")
  private Long rankCategory = null;

  @SerializedName("rank_overall")
  private Long rankOverall = null;

  public ExposureCountFunnelStruct value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(value = "")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public ExposureCountFunnelStruct score(Long score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   *
   * @return score
   */
  @ApiModelProperty(value = "")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public ExposureCountFunnelStruct scoreDesc(String scoreDesc) {
    this.scoreDesc = scoreDesc;
    return this;
  }

  /**
   * Get scoreDesc
   *
   * @return scoreDesc
   */
  @ApiModelProperty(value = "")
  public String getScoreDesc() {
    return scoreDesc;
  }

  public void setScoreDesc(String scoreDesc) {
    this.scoreDesc = scoreDesc;
  }

  public ExposureCountFunnelStruct rankCategory(Long rankCategory) {
    this.rankCategory = rankCategory;
    return this;
  }

  /**
   * Get rankCategory
   *
   * @return rankCategory
   */
  @ApiModelProperty(value = "")
  public Long getRankCategory() {
    return rankCategory;
  }

  public void setRankCategory(Long rankCategory) {
    this.rankCategory = rankCategory;
  }

  public ExposureCountFunnelStruct rankOverall(Long rankOverall) {
    this.rankOverall = rankOverall;
    return this;
  }

  /**
   * Get rankOverall
   *
   * @return rankOverall
   */
  @ApiModelProperty(value = "")
  public Long getRankOverall() {
    return rankOverall;
  }

  public void setRankOverall(Long rankOverall) {
    this.rankOverall = rankOverall;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExposureCountFunnelStruct exposureCountFunnelStruct = (ExposureCountFunnelStruct) o;
    return Objects.equals(this.value, exposureCountFunnelStruct.value)
        && Objects.equals(this.score, exposureCountFunnelStruct.score)
        && Objects.equals(this.scoreDesc, exposureCountFunnelStruct.scoreDesc)
        && Objects.equals(this.rankCategory, exposureCountFunnelStruct.rankCategory)
        && Objects.equals(this.rankOverall, exposureCountFunnelStruct.rankOverall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, score, scoreDesc, rankCategory, rankOverall);
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
