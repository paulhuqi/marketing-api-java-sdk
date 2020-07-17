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

/** 落地页配置结构 */
@ApiModel(description = "落地页配置结构")
public class PagesStruct {
  @SerializedName("page_type")
  private ComponentsPageType pageType = null;

  @SerializedName("page_name")
  private String pageName = null;

  @SerializedName("page_title")
  private String pageTitle = null;

  @SerializedName("mobile_app_id")
  private String mobileAppId = null;

  @SerializedName("bg_color")
  private String bgColor = null;

  @SerializedName("bg_image_id")
  private String bgImageId = null;

  @SerializedName("component_spec_list")
  private List<String> componentSpecList = null;

  public PagesStruct pageType(ComponentsPageType pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public ComponentsPageType getPageType() {
    return pageType;
  }

  public void setPageType(ComponentsPageType pageType) {
    this.pageType = pageType;
  }

  public PagesStruct pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

  /**
   * Get pageName
   *
   * @return pageName
   */
  @ApiModelProperty(value = "")
  public String getPageName() {
    return pageName;
  }

  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  public PagesStruct pageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
    return this;
  }

  /**
   * Get pageTitle
   *
   * @return pageTitle
   */
  @ApiModelProperty(value = "")
  public String getPageTitle() {
    return pageTitle;
  }

  public void setPageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
  }

  public PagesStruct mobileAppId(String mobileAppId) {
    this.mobileAppId = mobileAppId;
    return this;
  }

  /**
   * Get mobileAppId
   *
   * @return mobileAppId
   */
  @ApiModelProperty(value = "")
  public String getMobileAppId() {
    return mobileAppId;
  }

  public void setMobileAppId(String mobileAppId) {
    this.mobileAppId = mobileAppId;
  }

  public PagesStruct bgColor(String bgColor) {
    this.bgColor = bgColor;
    return this;
  }

  /**
   * Get bgColor
   *
   * @return bgColor
   */
  @ApiModelProperty(value = "")
  public String getBgColor() {
    return bgColor;
  }

  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }

  public PagesStruct bgImageId(String bgImageId) {
    this.bgImageId = bgImageId;
    return this;
  }

  /**
   * Get bgImageId
   *
   * @return bgImageId
   */
  @ApiModelProperty(value = "")
  public String getBgImageId() {
    return bgImageId;
  }

  public void setBgImageId(String bgImageId) {
    this.bgImageId = bgImageId;
  }

  public PagesStruct componentSpecList(List<String> componentSpecList) {
    this.componentSpecList = componentSpecList;
    return this;
  }

  public PagesStruct addComponentSpecListItem(String componentSpecListItem) {
    if (this.componentSpecList == null) {
      this.componentSpecList = new ArrayList<String>();
    }
    this.componentSpecList.add(componentSpecListItem);
    return this;
  }

  /**
   * Get componentSpecList
   *
   * @return componentSpecList
   */
  @ApiModelProperty(value = "")
  public List<String> getComponentSpecList() {
    return componentSpecList;
  }

  public void setComponentSpecList(List<String> componentSpecList) {
    this.componentSpecList = componentSpecList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagesStruct pagesStruct = (PagesStruct) o;
    return Objects.equals(this.pageType, pagesStruct.pageType)
        && Objects.equals(this.pageName, pagesStruct.pageName)
        && Objects.equals(this.pageTitle, pagesStruct.pageTitle)
        && Objects.equals(this.mobileAppId, pagesStruct.mobileAppId)
        && Objects.equals(this.bgColor, pagesStruct.bgColor)
        && Objects.equals(this.bgImageId, pagesStruct.bgImageId)
        && Objects.equals(this.componentSpecList, pagesStruct.componentSpecList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        pageType, pageName, pageTitle, mobileAppId, bgColor, bgImageId, componentSpecList);
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
