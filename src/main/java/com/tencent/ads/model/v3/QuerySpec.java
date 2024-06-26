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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 查询定向标签的条件 */
@ApiModel(description = "查询定向标签的条件")
public class QuerySpec {
  @SerializedName("query")
  private String query = null;

  @SerializedName("query_list")
  private List<String> queryList = null;

  @SerializedName("max_result_number")
  private Long maxResultNumber = null;

  @SerializedName("excluding_targeting_tags")
  private List<String> excludingTargetingTags = null;

  @SerializedName("advanced_recommend_type")
  private TargetingAdvancedRecommendType advancedRecommendType = null;

  public QuerySpec query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   *
   * @return query
   */
  @ApiModelProperty(value = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public QuerySpec queryList(List<String> queryList) {
    this.queryList = queryList;
    return this;
  }

  public QuerySpec addQueryListItem(String queryListItem) {
    if (this.queryList == null) {
      this.queryList = new ArrayList<String>();
    }
    this.queryList.add(queryListItem);
    return this;
  }

  /**
   * Get queryList
   *
   * @return queryList
   */
  @ApiModelProperty(value = "")
  public List<String> getQueryList() {
    return queryList;
  }

  public void setQueryList(List<String> queryList) {
    this.queryList = queryList;
  }

  public QuerySpec maxResultNumber(Long maxResultNumber) {
    this.maxResultNumber = maxResultNumber;
    return this;
  }

  /**
   * Get maxResultNumber
   *
   * @return maxResultNumber
   */
  @ApiModelProperty(value = "")
  public Long getMaxResultNumber() {
    return maxResultNumber;
  }

  public void setMaxResultNumber(Long maxResultNumber) {
    this.maxResultNumber = maxResultNumber;
  }

  public QuerySpec excludingTargetingTags(List<String> excludingTargetingTags) {
    this.excludingTargetingTags = excludingTargetingTags;
    return this;
  }

  public QuerySpec addExcludingTargetingTagsItem(String excludingTargetingTagsItem) {
    if (this.excludingTargetingTags == null) {
      this.excludingTargetingTags = new ArrayList<String>();
    }
    this.excludingTargetingTags.add(excludingTargetingTagsItem);
    return this;
  }

  /**
   * Get excludingTargetingTags
   *
   * @return excludingTargetingTags
   */
  @ApiModelProperty(value = "")
  public List<String> getExcludingTargetingTags() {
    return excludingTargetingTags;
  }

  public void setExcludingTargetingTags(List<String> excludingTargetingTags) {
    this.excludingTargetingTags = excludingTargetingTags;
  }

  public QuerySpec advancedRecommendType(TargetingAdvancedRecommendType advancedRecommendType) {
    this.advancedRecommendType = advancedRecommendType;
    return this;
  }

  /**
   * Get advancedRecommendType
   *
   * @return advancedRecommendType
   */
  @ApiModelProperty(value = "")
  public TargetingAdvancedRecommendType getAdvancedRecommendType() {
    return advancedRecommendType;
  }

  public void setAdvancedRecommendType(TargetingAdvancedRecommendType advancedRecommendType) {
    this.advancedRecommendType = advancedRecommendType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuerySpec querySpec = (QuerySpec) o;
    return Objects.equals(this.query, querySpec.query)
        && Objects.equals(this.queryList, querySpec.queryList)
        && Objects.equals(this.maxResultNumber, querySpec.maxResultNumber)
        && Objects.equals(this.excludingTargetingTags, querySpec.excludingTargetingTags)
        && Objects.equals(this.advancedRecommendType, querySpec.advancedRecommendType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        query, queryList, maxResultNumber, excludingTargetingTags, advancedRecommendType);
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
