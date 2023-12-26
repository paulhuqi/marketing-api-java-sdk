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

/** 匹配规则 */
@ApiModel(description = "匹配规则")
public class UrlMatcher {
  @SerializedName("param_value")
  private String paramValue = null;

  @SerializedName("operator")
  private FilterOperator operator = null;

  public UrlMatcher paramValue(String paramValue) {
    this.paramValue = paramValue;
    return this;
  }

  /**
   * Get paramValue
   *
   * @return paramValue
   */
  @ApiModelProperty(value = "")
  public String getParamValue() {
    return paramValue;
  }

  public void setParamValue(String paramValue) {
    this.paramValue = paramValue;
  }

  public UrlMatcher operator(FilterOperator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   *
   * @return operator
   */
  @ApiModelProperty(value = "")
  public FilterOperator getOperator() {
    return operator;
  }

  public void setOperator(FilterOperator operator) {
    this.operator = operator;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlMatcher urlMatcher = (UrlMatcher) o;
    return Objects.equals(this.paramValue, urlMatcher.paramValue)
        && Objects.equals(this.operator, urlMatcher.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramValue, operator);
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
