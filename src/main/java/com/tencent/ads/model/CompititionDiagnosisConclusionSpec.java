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

/** 竞争表现维度的曝光评估结果 */
@ApiModel(description = "竞争表现维度的曝光评估结果")
public class CompititionDiagnosisConclusionSpec {
  @SerializedName("compitition_diagnosis_score")
  private Long compititionDiagnosisScore = null;

  @SerializedName("compitition_diagnosis_result")
  private String compititionDiagnosisResult = null;

  @SerializedName("bid_amount_diagnosis_score")
  private Long bidAmountDiagnosisScore = null;

  @SerializedName("bid_amount_diagnosis_conclusion")
  private String bidAmountDiagnosisConclusion = null;

  @SerializedName("click_diagnosis_score")
  private Long clickDiagnosisScore = null;

  @SerializedName("click_diagnosis_conclusion")
  private String clickDiagnosisConclusion = null;

  @SerializedName("conversion_diagnosis_score")
  private Long conversionDiagnosisScore = null;

  @SerializedName("conversion_diagnosis_conclusion")
  private String conversionDiagnosisConclusion = null;

  @SerializedName("user_acceptance_diagnosis_score")
  private Long userAcceptanceDiagnosisScore = null;

  @SerializedName("user_acceptance_diagnosis_conclusion")
  private String userAcceptanceDiagnosisConclusion = null;

  @SerializedName("compitition_analysis_detail_spec_list")
  private List<CompititionAnalysisDetailSpec> compititionAnalysisDetailSpecList = null;

  public CompititionDiagnosisConclusionSpec compititionDiagnosisScore(
      Long compititionDiagnosisScore) {
    this.compititionDiagnosisScore = compititionDiagnosisScore;
    return this;
  }

  /**
   * Get compititionDiagnosisScore
   *
   * @return compititionDiagnosisScore
   */
  @ApiModelProperty(value = "")
  public Long getCompititionDiagnosisScore() {
    return compititionDiagnosisScore;
  }

  public void setCompititionDiagnosisScore(Long compititionDiagnosisScore) {
    this.compititionDiagnosisScore = compititionDiagnosisScore;
  }

  public CompititionDiagnosisConclusionSpec compititionDiagnosisResult(
      String compititionDiagnosisResult) {
    this.compititionDiagnosisResult = compititionDiagnosisResult;
    return this;
  }

  /**
   * Get compititionDiagnosisResult
   *
   * @return compititionDiagnosisResult
   */
  @ApiModelProperty(value = "")
  public String getCompititionDiagnosisResult() {
    return compititionDiagnosisResult;
  }

  public void setCompititionDiagnosisResult(String compititionDiagnosisResult) {
    this.compititionDiagnosisResult = compititionDiagnosisResult;
  }

  public CompititionDiagnosisConclusionSpec bidAmountDiagnosisScore(Long bidAmountDiagnosisScore) {
    this.bidAmountDiagnosisScore = bidAmountDiagnosisScore;
    return this;
  }

  /**
   * Get bidAmountDiagnosisScore
   *
   * @return bidAmountDiagnosisScore
   */
  @ApiModelProperty(value = "")
  public Long getBidAmountDiagnosisScore() {
    return bidAmountDiagnosisScore;
  }

  public void setBidAmountDiagnosisScore(Long bidAmountDiagnosisScore) {
    this.bidAmountDiagnosisScore = bidAmountDiagnosisScore;
  }

  public CompititionDiagnosisConclusionSpec bidAmountDiagnosisConclusion(
      String bidAmountDiagnosisConclusion) {
    this.bidAmountDiagnosisConclusion = bidAmountDiagnosisConclusion;
    return this;
  }

  /**
   * Get bidAmountDiagnosisConclusion
   *
   * @return bidAmountDiagnosisConclusion
   */
  @ApiModelProperty(value = "")
  public String getBidAmountDiagnosisConclusion() {
    return bidAmountDiagnosisConclusion;
  }

  public void setBidAmountDiagnosisConclusion(String bidAmountDiagnosisConclusion) {
    this.bidAmountDiagnosisConclusion = bidAmountDiagnosisConclusion;
  }

  public CompititionDiagnosisConclusionSpec clickDiagnosisScore(Long clickDiagnosisScore) {
    this.clickDiagnosisScore = clickDiagnosisScore;
    return this;
  }

  /**
   * Get clickDiagnosisScore
   *
   * @return clickDiagnosisScore
   */
  @ApiModelProperty(value = "")
  public Long getClickDiagnosisScore() {
    return clickDiagnosisScore;
  }

  public void setClickDiagnosisScore(Long clickDiagnosisScore) {
    this.clickDiagnosisScore = clickDiagnosisScore;
  }

  public CompititionDiagnosisConclusionSpec clickDiagnosisConclusion(
      String clickDiagnosisConclusion) {
    this.clickDiagnosisConclusion = clickDiagnosisConclusion;
    return this;
  }

  /**
   * Get clickDiagnosisConclusion
   *
   * @return clickDiagnosisConclusion
   */
  @ApiModelProperty(value = "")
  public String getClickDiagnosisConclusion() {
    return clickDiagnosisConclusion;
  }

  public void setClickDiagnosisConclusion(String clickDiagnosisConclusion) {
    this.clickDiagnosisConclusion = clickDiagnosisConclusion;
  }

  public CompititionDiagnosisConclusionSpec conversionDiagnosisScore(
      Long conversionDiagnosisScore) {
    this.conversionDiagnosisScore = conversionDiagnosisScore;
    return this;
  }

  /**
   * Get conversionDiagnosisScore
   *
   * @return conversionDiagnosisScore
   */
  @ApiModelProperty(value = "")
  public Long getConversionDiagnosisScore() {
    return conversionDiagnosisScore;
  }

  public void setConversionDiagnosisScore(Long conversionDiagnosisScore) {
    this.conversionDiagnosisScore = conversionDiagnosisScore;
  }

  public CompititionDiagnosisConclusionSpec conversionDiagnosisConclusion(
      String conversionDiagnosisConclusion) {
    this.conversionDiagnosisConclusion = conversionDiagnosisConclusion;
    return this;
  }

  /**
   * Get conversionDiagnosisConclusion
   *
   * @return conversionDiagnosisConclusion
   */
  @ApiModelProperty(value = "")
  public String getConversionDiagnosisConclusion() {
    return conversionDiagnosisConclusion;
  }

  public void setConversionDiagnosisConclusion(String conversionDiagnosisConclusion) {
    this.conversionDiagnosisConclusion = conversionDiagnosisConclusion;
  }

  public CompititionDiagnosisConclusionSpec userAcceptanceDiagnosisScore(
      Long userAcceptanceDiagnosisScore) {
    this.userAcceptanceDiagnosisScore = userAcceptanceDiagnosisScore;
    return this;
  }

  /**
   * Get userAcceptanceDiagnosisScore
   *
   * @return userAcceptanceDiagnosisScore
   */
  @ApiModelProperty(value = "")
  public Long getUserAcceptanceDiagnosisScore() {
    return userAcceptanceDiagnosisScore;
  }

  public void setUserAcceptanceDiagnosisScore(Long userAcceptanceDiagnosisScore) {
    this.userAcceptanceDiagnosisScore = userAcceptanceDiagnosisScore;
  }

  public CompititionDiagnosisConclusionSpec userAcceptanceDiagnosisConclusion(
      String userAcceptanceDiagnosisConclusion) {
    this.userAcceptanceDiagnosisConclusion = userAcceptanceDiagnosisConclusion;
    return this;
  }

  /**
   * Get userAcceptanceDiagnosisConclusion
   *
   * @return userAcceptanceDiagnosisConclusion
   */
  @ApiModelProperty(value = "")
  public String getUserAcceptanceDiagnosisConclusion() {
    return userAcceptanceDiagnosisConclusion;
  }

  public void setUserAcceptanceDiagnosisConclusion(String userAcceptanceDiagnosisConclusion) {
    this.userAcceptanceDiagnosisConclusion = userAcceptanceDiagnosisConclusion;
  }

  public CompititionDiagnosisConclusionSpec compititionAnalysisDetailSpecList(
      List<CompititionAnalysisDetailSpec> compititionAnalysisDetailSpecList) {
    this.compititionAnalysisDetailSpecList = compititionAnalysisDetailSpecList;
    return this;
  }

  public CompititionDiagnosisConclusionSpec addCompititionAnalysisDetailSpecListItem(
      CompititionAnalysisDetailSpec compititionAnalysisDetailSpecListItem) {
    if (this.compititionAnalysisDetailSpecList == null) {
      this.compititionAnalysisDetailSpecList = new ArrayList<CompititionAnalysisDetailSpec>();
    }
    this.compititionAnalysisDetailSpecList.add(compititionAnalysisDetailSpecListItem);
    return this;
  }

  /**
   * Get compititionAnalysisDetailSpecList
   *
   * @return compititionAnalysisDetailSpecList
   */
  @ApiModelProperty(value = "")
  public List<CompititionAnalysisDetailSpec> getCompititionAnalysisDetailSpecList() {
    return compititionAnalysisDetailSpecList;
  }

  public void setCompititionAnalysisDetailSpecList(
      List<CompititionAnalysisDetailSpec> compititionAnalysisDetailSpecList) {
    this.compititionAnalysisDetailSpecList = compititionAnalysisDetailSpecList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompititionDiagnosisConclusionSpec compititionDiagnosisConclusionSpec =
        (CompititionDiagnosisConclusionSpec) o;
    return Objects.equals(
            this.compititionDiagnosisScore,
            compititionDiagnosisConclusionSpec.compititionDiagnosisScore)
        && Objects.equals(
            this.compititionDiagnosisResult,
            compititionDiagnosisConclusionSpec.compititionDiagnosisResult)
        && Objects.equals(
            this.bidAmountDiagnosisScore,
            compititionDiagnosisConclusionSpec.bidAmountDiagnosisScore)
        && Objects.equals(
            this.bidAmountDiagnosisConclusion,
            compititionDiagnosisConclusionSpec.bidAmountDiagnosisConclusion)
        && Objects.equals(
            this.clickDiagnosisScore, compititionDiagnosisConclusionSpec.clickDiagnosisScore)
        && Objects.equals(
            this.clickDiagnosisConclusion,
            compititionDiagnosisConclusionSpec.clickDiagnosisConclusion)
        && Objects.equals(
            this.conversionDiagnosisScore,
            compititionDiagnosisConclusionSpec.conversionDiagnosisScore)
        && Objects.equals(
            this.conversionDiagnosisConclusion,
            compititionDiagnosisConclusionSpec.conversionDiagnosisConclusion)
        && Objects.equals(
            this.userAcceptanceDiagnosisScore,
            compititionDiagnosisConclusionSpec.userAcceptanceDiagnosisScore)
        && Objects.equals(
            this.userAcceptanceDiagnosisConclusion,
            compititionDiagnosisConclusionSpec.userAcceptanceDiagnosisConclusion)
        && Objects.equals(
            this.compititionAnalysisDetailSpecList,
            compititionDiagnosisConclusionSpec.compititionAnalysisDetailSpecList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        compititionDiagnosisScore,
        compititionDiagnosisResult,
        bidAmountDiagnosisScore,
        bidAmountDiagnosisConclusion,
        clickDiagnosisScore,
        clickDiagnosisConclusion,
        conversionDiagnosisScore,
        conversionDiagnosisConclusion,
        userAcceptanceDiagnosisScore,
        userAcceptanceDiagnosisConclusion,
        compititionAnalysisDetailSpecList);
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
