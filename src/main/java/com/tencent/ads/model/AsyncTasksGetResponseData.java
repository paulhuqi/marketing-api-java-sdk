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

/** AsyncTasksGetResponseData */
public class AsyncTasksGetResponseData {
  @SerializedName("list")
  private List<AsyncTasksGetTaskListStruct> list = null;

  @SerializedName("page_info")
  private Conf pageInfo = null;

  public AsyncTasksGetResponseData list(List<AsyncTasksGetTaskListStruct> list) {
    this.list = list;
    return this;
  }

  public AsyncTasksGetResponseData addListItem(AsyncTasksGetTaskListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<AsyncTasksGetTaskListStruct>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  @ApiModelProperty(value = "")
  public List<AsyncTasksGetTaskListStruct> getList() {
    return list;
  }

  public void setList(List<AsyncTasksGetTaskListStruct> list) {
    this.list = list;
  }

  public AsyncTasksGetResponseData pageInfo(Conf pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   *
   * @return pageInfo
   */
  @ApiModelProperty(value = "")
  public Conf getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(Conf pageInfo) {
    this.pageInfo = pageInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncTasksGetResponseData asyncTasksGetResponseData = (AsyncTasksGetResponseData) o;
    return Objects.equals(this.list, asyncTasksGetResponseData.list)
        && Objects.equals(this.pageInfo, asyncTasksGetResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, pageInfo);
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
