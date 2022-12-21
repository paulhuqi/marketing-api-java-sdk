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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** CampaignNegativewordsUpdateRequest */
public class CampaignNegativewordsUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("phrase_negative_words")
  private List<String> phraseNegativeWords = null;

  @SerializedName("exact_negative_words")
  private List<String> exactNegativeWords = null;

  public CampaignNegativewordsUpdateRequest accountId(Long accountId) {
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

  public CampaignNegativewordsUpdateRequest campaignId(Long campaignId) {
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

  public CampaignNegativewordsUpdateRequest phraseNegativeWords(List<String> phraseNegativeWords) {
    this.phraseNegativeWords = phraseNegativeWords;
    return this;
  }

  public CampaignNegativewordsUpdateRequest addPhraseNegativeWordsItem(
      String phraseNegativeWordsItem) {
    if (this.phraseNegativeWords == null) {
      this.phraseNegativeWords = new ArrayList<String>();
    }
    this.phraseNegativeWords.add(phraseNegativeWordsItem);
    return this;
  }

  /**
   * Get phraseNegativeWords
   *
   * @return phraseNegativeWords
   */
  @ApiModelProperty(value = "")
  public List<String> getPhraseNegativeWords() {
    return phraseNegativeWords;
  }

  public void setPhraseNegativeWords(List<String> phraseNegativeWords) {
    this.phraseNegativeWords = phraseNegativeWords;
  }

  public CampaignNegativewordsUpdateRequest exactNegativeWords(List<String> exactNegativeWords) {
    this.exactNegativeWords = exactNegativeWords;
    return this;
  }

  public CampaignNegativewordsUpdateRequest addExactNegativeWordsItem(
      String exactNegativeWordsItem) {
    if (this.exactNegativeWords == null) {
      this.exactNegativeWords = new ArrayList<String>();
    }
    this.exactNegativeWords.add(exactNegativeWordsItem);
    return this;
  }

  /**
   * Get exactNegativeWords
   *
   * @return exactNegativeWords
   */
  @ApiModelProperty(value = "")
  public List<String> getExactNegativeWords() {
    return exactNegativeWords;
  }

  public void setExactNegativeWords(List<String> exactNegativeWords) {
    this.exactNegativeWords = exactNegativeWords;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignNegativewordsUpdateRequest campaignNegativewordsUpdateRequest =
        (CampaignNegativewordsUpdateRequest) o;
    return Objects.equals(this.accountId, campaignNegativewordsUpdateRequest.accountId)
        && Objects.equals(this.campaignId, campaignNegativewordsUpdateRequest.campaignId)
        && Objects.equals(
            this.phraseNegativeWords, campaignNegativewordsUpdateRequest.phraseNegativeWords)
        && Objects.equals(
            this.exactNegativeWords, campaignNegativewordsUpdateRequest.exactNegativeWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, phraseNegativeWords, exactNegativeWords);
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