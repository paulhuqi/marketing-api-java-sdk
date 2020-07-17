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

/** 创建广告渠道包接口任务所需条件 */
@ApiModel(description = "创建广告渠道包接口任务所需条件")
public class CreateAndroidUnionChannelPackageSpec {
  @SerializedName("package_name")
  private String packageName = null;

  @SerializedName("download_url")
  private String downloadUrl = null;

  public CreateAndroidUnionChannelPackageSpec packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Get packageName
   *
   * @return packageName
   */
  @ApiModelProperty(value = "")
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public CreateAndroidUnionChannelPackageSpec downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * Get downloadUrl
   *
   * @return downloadUrl
   */
  @ApiModelProperty(value = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAndroidUnionChannelPackageSpec createAndroidUnionChannelPackageSpec =
        (CreateAndroidUnionChannelPackageSpec) o;
    return Objects.equals(this.packageName, createAndroidUnionChannelPackageSpec.packageName)
        && Objects.equals(this.downloadUrl, createAndroidUnionChannelPackageSpec.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageName, downloadUrl);
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
