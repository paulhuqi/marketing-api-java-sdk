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

/** 落地页数据结构 */
@ApiModel(description = "落地页数据结构")
public class KeywordLandingPageInfo {
  @SerializedName("page_type")
  private PageTypeRead pageType = null;

  @SerializedName("page_url")
  private String pageUrl = null;

  @SerializedName("mini_program_spec")
  private MiniProgramSpecStruct miniProgramSpec = null;

  @SerializedName("deep_link_spec")
  private DeepLinkSpecStruct deepLinkSpec = null;

  @SerializedName("universal_link_spec")
  private UniversalLinkSpecStruct universalLinkSpec = null;

  @SerializedName("xijing_spec")
  private XijingSpecStruct xijingSpec = null;

  @SerializedName("lingque_spec")
  private LingqueSpecStruct lingqueSpec = null;

  public KeywordLandingPageInfo pageType(PageTypeRead pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public PageTypeRead getPageType() {
    return pageType;
  }

  public void setPageType(PageTypeRead pageType) {
    this.pageType = pageType;
  }

  public KeywordLandingPageInfo pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  /**
   * Get pageUrl
   *
   * @return pageUrl
   */
  @ApiModelProperty(value = "")
  public String getPageUrl() {
    return pageUrl;
  }

  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
  }

  public KeywordLandingPageInfo miniProgramSpec(MiniProgramSpecStruct miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
    return this;
  }

  /**
   * Get miniProgramSpec
   *
   * @return miniProgramSpec
   */
  @ApiModelProperty(value = "")
  public MiniProgramSpecStruct getMiniProgramSpec() {
    return miniProgramSpec;
  }

  public void setMiniProgramSpec(MiniProgramSpecStruct miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
  }

  public KeywordLandingPageInfo deepLinkSpec(DeepLinkSpecStruct deepLinkSpec) {
    this.deepLinkSpec = deepLinkSpec;
    return this;
  }

  /**
   * Get deepLinkSpec
   *
   * @return deepLinkSpec
   */
  @ApiModelProperty(value = "")
  public DeepLinkSpecStruct getDeepLinkSpec() {
    return deepLinkSpec;
  }

  public void setDeepLinkSpec(DeepLinkSpecStruct deepLinkSpec) {
    this.deepLinkSpec = deepLinkSpec;
  }

  public KeywordLandingPageInfo universalLinkSpec(UniversalLinkSpecStruct universalLinkSpec) {
    this.universalLinkSpec = universalLinkSpec;
    return this;
  }

  /**
   * Get universalLinkSpec
   *
   * @return universalLinkSpec
   */
  @ApiModelProperty(value = "")
  public UniversalLinkSpecStruct getUniversalLinkSpec() {
    return universalLinkSpec;
  }

  public void setUniversalLinkSpec(UniversalLinkSpecStruct universalLinkSpec) {
    this.universalLinkSpec = universalLinkSpec;
  }

  public KeywordLandingPageInfo xijingSpec(XijingSpecStruct xijingSpec) {
    this.xijingSpec = xijingSpec;
    return this;
  }

  /**
   * Get xijingSpec
   *
   * @return xijingSpec
   */
  @ApiModelProperty(value = "")
  public XijingSpecStruct getXijingSpec() {
    return xijingSpec;
  }

  public void setXijingSpec(XijingSpecStruct xijingSpec) {
    this.xijingSpec = xijingSpec;
  }

  public KeywordLandingPageInfo lingqueSpec(LingqueSpecStruct lingqueSpec) {
    this.lingqueSpec = lingqueSpec;
    return this;
  }

  /**
   * Get lingqueSpec
   *
   * @return lingqueSpec
   */
  @ApiModelProperty(value = "")
  public LingqueSpecStruct getLingqueSpec() {
    return lingqueSpec;
  }

  public void setLingqueSpec(LingqueSpecStruct lingqueSpec) {
    this.lingqueSpec = lingqueSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordLandingPageInfo keywordLandingPageInfo = (KeywordLandingPageInfo) o;
    return Objects.equals(this.pageType, keywordLandingPageInfo.pageType)
        && Objects.equals(this.pageUrl, keywordLandingPageInfo.pageUrl)
        && Objects.equals(this.miniProgramSpec, keywordLandingPageInfo.miniProgramSpec)
        && Objects.equals(this.deepLinkSpec, keywordLandingPageInfo.deepLinkSpec)
        && Objects.equals(this.universalLinkSpec, keywordLandingPageInfo.universalLinkSpec)
        && Objects.equals(this.xijingSpec, keywordLandingPageInfo.xijingSpec)
        && Objects.equals(this.lingqueSpec, keywordLandingPageInfo.lingqueSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        pageType,
        pageUrl,
        miniProgramSpec,
        deepLinkSpec,
        universalLinkSpec,
        xijingSpec,
        lingqueSpec);
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
