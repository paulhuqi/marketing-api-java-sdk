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

/** 支持的落地页类型 */
@ApiModel(description = "支持的落地页类型")
public class LandingPageConfigPermit {
  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("support_page_type_list")
  private List<SupportPageTypeStructPermit> supportPageTypeList = null;

  public LandingPageConfigPermit required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Get required
   *
   * @return required
   */
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public LandingPageConfigPermit supportPageTypeList(
      List<SupportPageTypeStructPermit> supportPageTypeList) {
    this.supportPageTypeList = supportPageTypeList;
    return this;
  }

  public LandingPageConfigPermit addSupportPageTypeListItem(
      SupportPageTypeStructPermit supportPageTypeListItem) {
    if (this.supportPageTypeList == null) {
      this.supportPageTypeList = new ArrayList<SupportPageTypeStructPermit>();
    }
    this.supportPageTypeList.add(supportPageTypeListItem);
    return this;
  }

  /**
   * Get supportPageTypeList
   *
   * @return supportPageTypeList
   */
  @ApiModelProperty(value = "")
  public List<SupportPageTypeStructPermit> getSupportPageTypeList() {
    return supportPageTypeList;
  }

  public void setSupportPageTypeList(List<SupportPageTypeStructPermit> supportPageTypeList) {
    this.supportPageTypeList = supportPageTypeList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LandingPageConfigPermit landingPageConfigPermit = (LandingPageConfigPermit) o;
    return Objects.equals(this.required, landingPageConfigPermit.required)
        && Objects.equals(this.supportPageTypeList, landingPageConfigPermit.supportPageTypeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, supportPageTypeList);
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
