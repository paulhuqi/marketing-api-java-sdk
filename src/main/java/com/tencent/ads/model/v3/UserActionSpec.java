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

/** UserAction人群信息 */
@ApiModel(description = "UserAction人群信息")
public class UserActionSpec {
  @SerializedName("user_action_set_id")
  private Long userActionSetId = null;

  @SerializedName("match_rule_type")
  private MatchRuleType matchRuleType = null;

  @SerializedName("extract_type")
  private ExtractRuleType extractType = null;

  @SerializedName("time_window")
  private Long timeWindow = null;

  @SerializedName("url_match_rule")
  private UrlMatchRule urlMatchRule = null;

  @SerializedName("action_match_rule")
  private ActionMatchRule actionMatchRule = null;

  @SerializedName("action_aggregation_rule")
  private ActionAggregationRule actionAggregationRule = null;

  public UserActionSpec userActionSetId(Long userActionSetId) {
    this.userActionSetId = userActionSetId;
    return this;
  }

  /**
   * Get userActionSetId
   *
   * @return userActionSetId
   */
  @ApiModelProperty(value = "")
  public Long getUserActionSetId() {
    return userActionSetId;
  }

  public void setUserActionSetId(Long userActionSetId) {
    this.userActionSetId = userActionSetId;
  }

  public UserActionSpec matchRuleType(MatchRuleType matchRuleType) {
    this.matchRuleType = matchRuleType;
    return this;
  }

  /**
   * Get matchRuleType
   *
   * @return matchRuleType
   */
  @ApiModelProperty(value = "")
  public MatchRuleType getMatchRuleType() {
    return matchRuleType;
  }

  public void setMatchRuleType(MatchRuleType matchRuleType) {
    this.matchRuleType = matchRuleType;
  }

  public UserActionSpec extractType(ExtractRuleType extractType) {
    this.extractType = extractType;
    return this;
  }

  /**
   * Get extractType
   *
   * @return extractType
   */
  @ApiModelProperty(value = "")
  public ExtractRuleType getExtractType() {
    return extractType;
  }

  public void setExtractType(ExtractRuleType extractType) {
    this.extractType = extractType;
  }

  public UserActionSpec timeWindow(Long timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

  /**
   * Get timeWindow
   *
   * @return timeWindow
   */
  @ApiModelProperty(value = "")
  public Long getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(Long timeWindow) {
    this.timeWindow = timeWindow;
  }

  public UserActionSpec urlMatchRule(UrlMatchRule urlMatchRule) {
    this.urlMatchRule = urlMatchRule;
    return this;
  }

  /**
   * Get urlMatchRule
   *
   * @return urlMatchRule
   */
  @ApiModelProperty(value = "")
  public UrlMatchRule getUrlMatchRule() {
    return urlMatchRule;
  }

  public void setUrlMatchRule(UrlMatchRule urlMatchRule) {
    this.urlMatchRule = urlMatchRule;
  }

  public UserActionSpec actionMatchRule(ActionMatchRule actionMatchRule) {
    this.actionMatchRule = actionMatchRule;
    return this;
  }

  /**
   * Get actionMatchRule
   *
   * @return actionMatchRule
   */
  @ApiModelProperty(value = "")
  public ActionMatchRule getActionMatchRule() {
    return actionMatchRule;
  }

  public void setActionMatchRule(ActionMatchRule actionMatchRule) {
    this.actionMatchRule = actionMatchRule;
  }

  public UserActionSpec actionAggregationRule(ActionAggregationRule actionAggregationRule) {
    this.actionAggregationRule = actionAggregationRule;
    return this;
  }

  /**
   * Get actionAggregationRule
   *
   * @return actionAggregationRule
   */
  @ApiModelProperty(value = "")
  public ActionAggregationRule getActionAggregationRule() {
    return actionAggregationRule;
  }

  public void setActionAggregationRule(ActionAggregationRule actionAggregationRule) {
    this.actionAggregationRule = actionAggregationRule;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActionSpec userActionSpec = (UserActionSpec) o;
    return Objects.equals(this.userActionSetId, userActionSpec.userActionSetId)
        && Objects.equals(this.matchRuleType, userActionSpec.matchRuleType)
        && Objects.equals(this.extractType, userActionSpec.extractType)
        && Objects.equals(this.timeWindow, userActionSpec.timeWindow)
        && Objects.equals(this.urlMatchRule, userActionSpec.urlMatchRule)
        && Objects.equals(this.actionMatchRule, userActionSpec.actionMatchRule)
        && Objects.equals(this.actionAggregationRule, userActionSpec.actionAggregationRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        userActionSetId,
        matchRuleType,
        extractType,
        timeWindow,
        urlMatchRule,
        actionMatchRule,
        actionAggregationRule);
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