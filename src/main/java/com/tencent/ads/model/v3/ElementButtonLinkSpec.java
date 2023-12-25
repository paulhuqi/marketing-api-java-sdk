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
import java.util.Objects;

/** 外链信息 */
@ApiModel(description = "外链信息")
public class ElementButtonLinkSpec {
  @SerializedName("title")
  private String title = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("deep_link_android_spec")
  private DeepLinkAppAndroidSpec deepLinkAndroidSpec = null;

  @SerializedName("deep_link_ios_spec")
  private DeepLinkAppIosSpec deepLinkIosSpec = null;

  @SerializedName("mini_program_spec")
  private SimplifyMiniProgramSpec miniProgramSpec = null;

  public ElementButtonLinkSpec title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ElementButtonLinkSpec url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   *
   * @return url
   */
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ElementButtonLinkSpec deepLinkAndroidSpec(DeepLinkAppAndroidSpec deepLinkAndroidSpec) {
    this.deepLinkAndroidSpec = deepLinkAndroidSpec;
    return this;
  }

  /**
   * Get deepLinkAndroidSpec
   *
   * @return deepLinkAndroidSpec
   */
  @ApiModelProperty(value = "")
  public DeepLinkAppAndroidSpec getDeepLinkAndroidSpec() {
    return deepLinkAndroidSpec;
  }

  public void setDeepLinkAndroidSpec(DeepLinkAppAndroidSpec deepLinkAndroidSpec) {
    this.deepLinkAndroidSpec = deepLinkAndroidSpec;
  }

  public ElementButtonLinkSpec deepLinkIosSpec(DeepLinkAppIosSpec deepLinkIosSpec) {
    this.deepLinkIosSpec = deepLinkIosSpec;
    return this;
  }

  /**
   * Get deepLinkIosSpec
   *
   * @return deepLinkIosSpec
   */
  @ApiModelProperty(value = "")
  public DeepLinkAppIosSpec getDeepLinkIosSpec() {
    return deepLinkIosSpec;
  }

  public void setDeepLinkIosSpec(DeepLinkAppIosSpec deepLinkIosSpec) {
    this.deepLinkIosSpec = deepLinkIosSpec;
  }

  public ElementButtonLinkSpec miniProgramSpec(SimplifyMiniProgramSpec miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
    return this;
  }

  /**
   * Get miniProgramSpec
   *
   * @return miniProgramSpec
   */
  @ApiModelProperty(value = "")
  public SimplifyMiniProgramSpec getMiniProgramSpec() {
    return miniProgramSpec;
  }

  public void setMiniProgramSpec(SimplifyMiniProgramSpec miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementButtonLinkSpec elementButtonLinkSpec = (ElementButtonLinkSpec) o;
    return Objects.equals(this.title, elementButtonLinkSpec.title)
        && Objects.equals(this.url, elementButtonLinkSpec.url)
        && Objects.equals(this.deepLinkAndroidSpec, elementButtonLinkSpec.deepLinkAndroidSpec)
        && Objects.equals(this.deepLinkIosSpec, elementButtonLinkSpec.deepLinkIosSpec)
        && Objects.equals(this.miniProgramSpec, elementButtonLinkSpec.miniProgramSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, url, deepLinkAndroidSpec, deepLinkIosSpec, miniProgramSpec);
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