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
import java.util.Objects;

/** 跳转落地页信息 */
@ApiModel(description = "跳转落地页信息")
public class LandingPageStructure {
  @SerializedName("page_spec")
  private PageSpec pageSpec = null;

  @SerializedName("page_type")
  private DestinationType pageType = null;

  @SerializedName("link_name_type")
  private LinkUrlLinkNameType linkNameType = null;

  @SerializedName("landing_page_platform")
  private LandingPagePlatform landingPagePlatform = null;

  @SerializedName("landing_page_info")
  private LandingPageInfo landingPageInfo = null;

  @SerializedName("media_query")
  private LandingPageMediaQuery mediaQuery = null;

  @SerializedName("link_name_text")
  private String linkNameText = null;

  @SerializedName("landing_page_url_type")
  private LandingPageUrlType landingPageUrlType = null;

  public LandingPageStructure pageSpec(PageSpec pageSpec) {
    this.pageSpec = pageSpec;
    return this;
  }

  /**
   * Get pageSpec
   *
   * @return pageSpec
   */
  @ApiModelProperty(value = "")
  public PageSpec getPageSpec() {
    return pageSpec;
  }

  public void setPageSpec(PageSpec pageSpec) {
    this.pageSpec = pageSpec;
  }

  public LandingPageStructure pageType(DestinationType pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public DestinationType getPageType() {
    return pageType;
  }

  public void setPageType(DestinationType pageType) {
    this.pageType = pageType;
  }

  public LandingPageStructure linkNameType(LinkUrlLinkNameType linkNameType) {
    this.linkNameType = linkNameType;
    return this;
  }

  /**
   * Get linkNameType
   *
   * @return linkNameType
   */
  @ApiModelProperty(value = "")
  public LinkUrlLinkNameType getLinkNameType() {
    return linkNameType;
  }

  public void setLinkNameType(LinkUrlLinkNameType linkNameType) {
    this.linkNameType = linkNameType;
  }

  public LandingPageStructure landingPagePlatform(LandingPagePlatform landingPagePlatform) {
    this.landingPagePlatform = landingPagePlatform;
    return this;
  }

  /**
   * Get landingPagePlatform
   *
   * @return landingPagePlatform
   */
  @ApiModelProperty(value = "")
  public LandingPagePlatform getLandingPagePlatform() {
    return landingPagePlatform;
  }

  public void setLandingPagePlatform(LandingPagePlatform landingPagePlatform) {
    this.landingPagePlatform = landingPagePlatform;
  }

  public LandingPageStructure landingPageInfo(LandingPageInfo landingPageInfo) {
    this.landingPageInfo = landingPageInfo;
    return this;
  }

  /**
   * Get landingPageInfo
   *
   * @return landingPageInfo
   */
  @ApiModelProperty(value = "")
  public LandingPageInfo getLandingPageInfo() {
    return landingPageInfo;
  }

  public void setLandingPageInfo(LandingPageInfo landingPageInfo) {
    this.landingPageInfo = landingPageInfo;
  }

  public LandingPageStructure mediaQuery(LandingPageMediaQuery mediaQuery) {
    this.mediaQuery = mediaQuery;
    return this;
  }

  /**
   * Get mediaQuery
   *
   * @return mediaQuery
   */
  @ApiModelProperty(value = "")
  public LandingPageMediaQuery getMediaQuery() {
    return mediaQuery;
  }

  public void setMediaQuery(LandingPageMediaQuery mediaQuery) {
    this.mediaQuery = mediaQuery;
  }

  public LandingPageStructure linkNameText(String linkNameText) {
    this.linkNameText = linkNameText;
    return this;
  }

  /**
   * Get linkNameText
   *
   * @return linkNameText
   */
  @ApiModelProperty(value = "")
  public String getLinkNameText() {
    return linkNameText;
  }

  public void setLinkNameText(String linkNameText) {
    this.linkNameText = linkNameText;
  }

  public LandingPageStructure landingPageUrlType(LandingPageUrlType landingPageUrlType) {
    this.landingPageUrlType = landingPageUrlType;
    return this;
  }

  /**
   * Get landingPageUrlType
   *
   * @return landingPageUrlType
   */
  @ApiModelProperty(value = "")
  public LandingPageUrlType getLandingPageUrlType() {
    return landingPageUrlType;
  }

  public void setLandingPageUrlType(LandingPageUrlType landingPageUrlType) {
    this.landingPageUrlType = landingPageUrlType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LandingPageStructure landingPageStructure = (LandingPageStructure) o;
    return Objects.equals(this.pageSpec, landingPageStructure.pageSpec)
        && Objects.equals(this.pageType, landingPageStructure.pageType)
        && Objects.equals(this.linkNameType, landingPageStructure.linkNameType)
        && Objects.equals(this.landingPagePlatform, landingPageStructure.landingPagePlatform)
        && Objects.equals(this.landingPageInfo, landingPageStructure.landingPageInfo)
        && Objects.equals(this.mediaQuery, landingPageStructure.mediaQuery)
        && Objects.equals(this.linkNameText, landingPageStructure.linkNameText)
        && Objects.equals(this.landingPageUrlType, landingPageStructure.landingPageUrlType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        pageSpec,
        pageType,
        linkNameType,
        landingPagePlatform,
        landingPageInfo,
        mediaQuery,
        linkNameText,
        landingPageUrlType);
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
