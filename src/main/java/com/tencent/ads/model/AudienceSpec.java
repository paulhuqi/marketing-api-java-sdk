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

/** 人群信息 */
@ApiModel(description = "人群信息")
public class AudienceSpec {
  @SerializedName("lookalike_spec")
  private LookalikeSpec lookalikeSpec = null;

  @SerializedName("user_action_spec")
  private UserActionSpec userActionSpec = null;

  @SerializedName("lbs_spec")
  private LbsSpec lbsSpec = null;

  @SerializedName("keyword_spec")
  private KeywordSpec keywordSpec = null;

  @SerializedName("ad_rule_spec")
  private AdRuleSpec adRuleSpec = null;

  @SerializedName("combine_spec")
  private CombineSpec combineSpec = null;

  public AudienceSpec lookalikeSpec(LookalikeSpec lookalikeSpec) {
    this.lookalikeSpec = lookalikeSpec;
    return this;
  }

  /**
   * Get lookalikeSpec
   *
   * @return lookalikeSpec
   */
  @ApiModelProperty(value = "")
  public LookalikeSpec getLookalikeSpec() {
    return lookalikeSpec;
  }

  public void setLookalikeSpec(LookalikeSpec lookalikeSpec) {
    this.lookalikeSpec = lookalikeSpec;
  }

  public AudienceSpec userActionSpec(UserActionSpec userActionSpec) {
    this.userActionSpec = userActionSpec;
    return this;
  }

  /**
   * Get userActionSpec
   *
   * @return userActionSpec
   */
  @ApiModelProperty(value = "")
  public UserActionSpec getUserActionSpec() {
    return userActionSpec;
  }

  public void setUserActionSpec(UserActionSpec userActionSpec) {
    this.userActionSpec = userActionSpec;
  }

  public AudienceSpec lbsSpec(LbsSpec lbsSpec) {
    this.lbsSpec = lbsSpec;
    return this;
  }

  /**
   * Get lbsSpec
   *
   * @return lbsSpec
   */
  @ApiModelProperty(value = "")
  public LbsSpec getLbsSpec() {
    return lbsSpec;
  }

  public void setLbsSpec(LbsSpec lbsSpec) {
    this.lbsSpec = lbsSpec;
  }

  public AudienceSpec keywordSpec(KeywordSpec keywordSpec) {
    this.keywordSpec = keywordSpec;
    return this;
  }

  /**
   * Get keywordSpec
   *
   * @return keywordSpec
   */
  @ApiModelProperty(value = "")
  public KeywordSpec getKeywordSpec() {
    return keywordSpec;
  }

  public void setKeywordSpec(KeywordSpec keywordSpec) {
    this.keywordSpec = keywordSpec;
  }

  public AudienceSpec adRuleSpec(AdRuleSpec adRuleSpec) {
    this.adRuleSpec = adRuleSpec;
    return this;
  }

  /**
   * Get adRuleSpec
   *
   * @return adRuleSpec
   */
  @ApiModelProperty(value = "")
  public AdRuleSpec getAdRuleSpec() {
    return adRuleSpec;
  }

  public void setAdRuleSpec(AdRuleSpec adRuleSpec) {
    this.adRuleSpec = adRuleSpec;
  }

  public AudienceSpec combineSpec(CombineSpec combineSpec) {
    this.combineSpec = combineSpec;
    return this;
  }

  /**
   * Get combineSpec
   *
   * @return combineSpec
   */
  @ApiModelProperty(value = "")
  public CombineSpec getCombineSpec() {
    return combineSpec;
  }

  public void setCombineSpec(CombineSpec combineSpec) {
    this.combineSpec = combineSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceSpec audienceSpec = (AudienceSpec) o;
    return Objects.equals(this.lookalikeSpec, audienceSpec.lookalikeSpec)
        && Objects.equals(this.userActionSpec, audienceSpec.userActionSpec)
        && Objects.equals(this.lbsSpec, audienceSpec.lbsSpec)
        && Objects.equals(this.keywordSpec, audienceSpec.keywordSpec)
        && Objects.equals(this.adRuleSpec, audienceSpec.adRuleSpec)
        && Objects.equals(this.combineSpec, audienceSpec.combineSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lookalikeSpec, userActionSpec, lbsSpec, keywordSpec, adRuleSpec, combineSpec);
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
