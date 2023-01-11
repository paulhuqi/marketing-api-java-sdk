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

/** DataSourceDispatchUpdateResponseData */
public class DataSourceDispatchUpdateResponseData {
  @SerializedName("success_count")
  private Long successCount = null;

  @SerializedName("fail_list")
  private List<SingleUpdateFail> failList = null;

  public DataSourceDispatchUpdateResponseData successCount(Long successCount) {
    this.successCount = successCount;
    return this;
  }

  /**
   * Get successCount
   *
   * @return successCount
   */
  @ApiModelProperty(value = "")
  public Long getSuccessCount() {
    return successCount;
  }

  public void setSuccessCount(Long successCount) {
    this.successCount = successCount;
  }

  public DataSourceDispatchUpdateResponseData failList(List<SingleUpdateFail> failList) {
    this.failList = failList;
    return this;
  }

  public DataSourceDispatchUpdateResponseData addFailListItem(SingleUpdateFail failListItem) {
    if (this.failList == null) {
      this.failList = new ArrayList<SingleUpdateFail>();
    }
    this.failList.add(failListItem);
    return this;
  }

  /**
   * Get failList
   *
   * @return failList
   */
  @ApiModelProperty(value = "")
  public List<SingleUpdateFail> getFailList() {
    return failList;
  }

  public void setFailList(List<SingleUpdateFail> failList) {
    this.failList = failList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSourceDispatchUpdateResponseData dataSourceDispatchUpdateResponseData =
        (DataSourceDispatchUpdateResponseData) o;
    return Objects.equals(this.successCount, dataSourceDispatchUpdateResponseData.successCount)
        && Objects.equals(this.failList, dataSourceDispatchUpdateResponseData.failList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successCount, failList);
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
