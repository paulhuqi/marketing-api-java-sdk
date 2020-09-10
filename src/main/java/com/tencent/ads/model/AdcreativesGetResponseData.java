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

/** AdcreativesGetResponseData */
public class AdcreativesGetResponseData {
  @SerializedName("list")
  private List<AdcreativesGetListStruct> list = null;

  @SerializedName("page_info")
  private ConfPageSize500 pageInfo = null;

  public AdcreativesGetResponseData list(List<AdcreativesGetListStruct> list) {
    this.list = list;
    return this;
  }

  public AdcreativesGetResponseData addListItem(AdcreativesGetListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<AdcreativesGetListStruct>();
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
  public List<AdcreativesGetListStruct> getList() {
    return list;
  }

  public void setList(List<AdcreativesGetListStruct> list) {
    this.list = list;
  }

  public AdcreativesGetResponseData pageInfo(ConfPageSize500 pageInfo) {
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
    AdcreativesGetResponseData adcreativesGetResponseData = (AdcreativesGetResponseData) o;
    return Objects.equals(this.list, adcreativesGetResponseData.list)
        && Objects.equals(this.pageInfo, adcreativesGetResponseData.pageInfo);
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
