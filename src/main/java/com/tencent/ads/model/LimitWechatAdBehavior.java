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

/** 微信广告行为定向 */
@ApiModel(description = "微信广告行为定向")
public class LimitWechatAdBehavior {
  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("excluded_actions")
  private List<String> excludedActions = null;

  public LimitWechatAdBehavior actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public LimitWechatAdBehavior addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   *
   * @return actions
   */
  @ApiModelProperty(value = "")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public LimitWechatAdBehavior excludedActions(List<String> excludedActions) {
    this.excludedActions = excludedActions;
    return this;
  }

  public LimitWechatAdBehavior addExcludedActionsItem(String excludedActionsItem) {
    if (this.excludedActions == null) {
      this.excludedActions = new ArrayList<String>();
    }
    this.excludedActions.add(excludedActionsItem);
    return this;
  }

  /**
   * Get excludedActions
   *
   * @return excludedActions
   */
  @ApiModelProperty(value = "")
  public List<String> getExcludedActions() {
    return excludedActions;
  }

  public void setExcludedActions(List<String> excludedActions) {
    this.excludedActions = excludedActions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitWechatAdBehavior limitWechatAdBehavior = (LimitWechatAdBehavior) o;
    return Objects.equals(this.actions, limitWechatAdBehavior.actions)
        && Objects.equals(this.excludedActions, limitWechatAdBehavior.excludedActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, excludedActions);
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
