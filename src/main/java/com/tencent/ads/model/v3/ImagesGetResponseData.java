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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ImagesGetResponseData */
public class ImagesGetResponseData {
  @SerializedName("list")
  private List<ImagesGetListStruct> list = null;

  @SerializedName("page_info")
  private ConfPageSize500 pageInfo = null;

  public ImagesGetResponseData list(List<ImagesGetListStruct> list) {
    this.list = list;
    return this;
  }

  public ImagesGetResponseData addListItem(ImagesGetListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<ImagesGetListStruct>();
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
  public List<ImagesGetListStruct> getList() {
    return list;
  }

  public void setList(List<ImagesGetListStruct> list) {
    this.list = list;
  }

  public ImagesGetResponseData pageInfo(ConfPageSize500 pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   *
   * @return pageInfo
   */
  @ApiModelProperty(value = "")
  public ConfPageSize500 getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(ConfPageSize500 pageInfo) {
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
    ImagesGetResponseData imagesGetResponseData = (ImagesGetResponseData) o;
    return Objects.equals(this.list, imagesGetResponseData.list)
        && Objects.equals(this.pageInfo, imagesGetResponseData.pageInfo);
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