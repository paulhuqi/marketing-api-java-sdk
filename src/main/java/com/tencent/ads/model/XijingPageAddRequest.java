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

/** XijingPageAddRequest */
public class XijingPageAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("is_auto_submit")
  private Long isAutoSubmit = null;

  @SerializedName("pages")
  private List<PagesStruct> pages = null;

  public XijingPageAddRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public XijingPageAddRequest isAutoSubmit(Long isAutoSubmit) {
    this.isAutoSubmit = isAutoSubmit;
    return this;
  }

  /**
   * Get isAutoSubmit
   *
   * @return isAutoSubmit
   */
  @ApiModelProperty(value = "")
  public Long getIsAutoSubmit() {
    return isAutoSubmit;
  }

  public void setIsAutoSubmit(Long isAutoSubmit) {
    this.isAutoSubmit = isAutoSubmit;
  }

  public XijingPageAddRequest pages(List<PagesStruct> pages) {
    this.pages = pages;
    return this;
  }

  public XijingPageAddRequest addPagesItem(PagesStruct pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PagesStruct>();
    }
    this.pages.add(pagesItem);
    return this;
  }

  /**
   * Get pages
   *
   * @return pages
   */
  @ApiModelProperty(value = "")
  public List<PagesStruct> getPages() {
    return pages;
  }

  public void setPages(List<PagesStruct> pages) {
    this.pages = pages;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XijingPageAddRequest xijingPageAddRequest = (XijingPageAddRequest) o;
    return Objects.equals(this.accountId, xijingPageAddRequest.accountId)
        && Objects.equals(this.isAutoSubmit, xijingPageAddRequest.isAutoSubmit)
        && Objects.equals(this.pages, xijingPageAddRequest.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, isAutoSubmit, pages);
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
