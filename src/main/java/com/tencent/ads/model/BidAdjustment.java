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

/** 调价设置内容 */
@ApiModel(description = "调价设置内容")
public class BidAdjustment {
  @SerializedName("site_set_package")
  private List<SiteSetPackageStruct> siteSetPackage = null;

  public BidAdjustment siteSetPackage(List<SiteSetPackageStruct> siteSetPackage) {
    this.siteSetPackage = siteSetPackage;
    return this;
  }

  public BidAdjustment addSiteSetPackageItem(SiteSetPackageStruct siteSetPackageItem) {
    if (this.siteSetPackage == null) {
      this.siteSetPackage = new ArrayList<SiteSetPackageStruct>();
    }
    this.siteSetPackage.add(siteSetPackageItem);
    return this;
  }

  /**
   * Get siteSetPackage
   *
   * @return siteSetPackage
   */
  @ApiModelProperty(value = "")
  public List<SiteSetPackageStruct> getSiteSetPackage() {
    return siteSetPackage;
  }

  public void setSiteSetPackage(List<SiteSetPackageStruct> siteSetPackage) {
    this.siteSetPackage = siteSetPackage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidAdjustment bidAdjustment = (BidAdjustment) o;
    return Objects.equals(this.siteSetPackage, bidAdjustment.siteSetPackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteSetPackage);
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
