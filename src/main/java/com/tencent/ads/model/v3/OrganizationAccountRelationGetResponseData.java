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

/** OrganizationAccountRelationGetResponseData */
public class OrganizationAccountRelationGetResponseData {
  @SerializedName("list")
  private List<OrganizationAccountRelationGetListStruct> list = null;

  @SerializedName("page_info")
  private PageInfo pageInfo = null;

  @SerializedName("cursor_page_info")
  private CursorPageInfo cursorPageInfo = null;

  public OrganizationAccountRelationGetResponseData list(
      List<OrganizationAccountRelationGetListStruct> list) {
    this.list = list;
    return this;
  }

  public OrganizationAccountRelationGetResponseData addListItem(
      OrganizationAccountRelationGetListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<OrganizationAccountRelationGetListStruct>();
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
  public List<OrganizationAccountRelationGetListStruct> getList() {
    return list;
  }

  public void setList(List<OrganizationAccountRelationGetListStruct> list) {
    this.list = list;
  }

  public OrganizationAccountRelationGetResponseData pageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   *
   * @return pageInfo
   */
  @ApiModelProperty(value = "")
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  public OrganizationAccountRelationGetResponseData cursorPageInfo(CursorPageInfo cursorPageInfo) {
    this.cursorPageInfo = cursorPageInfo;
    return this;
  }

  /**
   * Get cursorPageInfo
   *
   * @return cursorPageInfo
   */
  @ApiModelProperty(value = "")
  public CursorPageInfo getCursorPageInfo() {
    return cursorPageInfo;
  }

  public void setCursorPageInfo(CursorPageInfo cursorPageInfo) {
    this.cursorPageInfo = cursorPageInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationAccountRelationGetResponseData organizationAccountRelationGetResponseData =
        (OrganizationAccountRelationGetResponseData) o;
    return Objects.equals(this.list, organizationAccountRelationGetResponseData.list)
        && Objects.equals(this.pageInfo, organizationAccountRelationGetResponseData.pageInfo)
        && Objects.equals(
            this.cursorPageInfo, organizationAccountRelationGetResponseData.cursorPageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, pageInfo, cursorPageInfo);
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