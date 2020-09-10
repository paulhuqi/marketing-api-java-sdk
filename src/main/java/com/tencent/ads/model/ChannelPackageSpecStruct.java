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

/** 渠道包详细信息 */
@ApiModel(description = "渠道包详细信息")
public class ChannelPackageSpecStruct {
  @SerializedName("app_android_channel_package_id")
  private String appAndroidChannelPackageId = null;

  @SerializedName("package_name")
  private String packageName = null;

  public ChannelPackageSpecStruct appAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
    return this;
  }

  /**
   * Get appAndroidChannelPackageId
   *
   * @return appAndroidChannelPackageId
   */
  @ApiModelProperty(value = "")
  public String getAppAndroidChannelPackageId() {
    return appAndroidChannelPackageId;
  }

  public void setAppAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
  }

  public ChannelPackageSpecStruct packageName(String packageName) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelPackageSpecStruct channelPackageSpecStruct = (ChannelPackageSpecStruct) o;
    return Objects.equals(
            this.appAndroidChannelPackageId, channelPackageSpecStruct.appAndroidChannelPackageId)
        && Objects.equals(this.packageName, channelPackageSpecStruct.packageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appAndroidChannelPackageId, packageName);
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
