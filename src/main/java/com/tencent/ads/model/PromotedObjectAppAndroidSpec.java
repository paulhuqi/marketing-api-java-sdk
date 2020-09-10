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

/** android应用信息 */
@ApiModel(description = "android应用信息")
public class PromotedObjectAppAndroidSpec {
  @SerializedName("packname")
  private String packname = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("average_rating")
  private String averageRating = null;

  @SerializedName("package_size")
  private String packageSize = null;

  @SerializedName("genres")
  private List<String> genres = null;

  @SerializedName("package_download_url")
  private String packageDownloadUrl = null;

  @SerializedName("channel_package_spec")
  private List<ChannelPackageSpecStruct> channelPackageSpec = null;

  public PromotedObjectAppAndroidSpec packname(String packname) {
    this.packname = packname;
    return this;
  }

  /**
   * Get packname
   *
   * @return packname
   */
  @ApiModelProperty(value = "")
  public String getPackname() {
    return packname;
  }

  public void setPackname(String packname) {
    this.packname = packname;
  }

  public PromotedObjectAppAndroidSpec version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   *
   * @return version
   */
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PromotedObjectAppAndroidSpec icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   *
   * @return icon
   */
  @ApiModelProperty(value = "")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public PromotedObjectAppAndroidSpec averageRating(String averageRating) {
    this.averageRating = averageRating;
    return this;
  }

  /**
   * Get averageRating
   *
   * @return averageRating
   */
  @ApiModelProperty(value = "")
  public String getAverageRating() {
    return averageRating;
  }

  public void setAverageRating(String averageRating) {
    this.averageRating = averageRating;
  }

  public PromotedObjectAppAndroidSpec packageSize(String packageSize) {
    this.packageSize = packageSize;
    return this;
  }

  /**
   * Get packageSize
   *
   * @return packageSize
   */
  @ApiModelProperty(value = "")
  public String getPackageSize() {
    return packageSize;
  }

  public void setPackageSize(String packageSize) {
    this.packageSize = packageSize;
  }

  public PromotedObjectAppAndroidSpec genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public PromotedObjectAppAndroidSpec addGenresItem(String genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<String>();
    }
    this.genres.add(genresItem);
    return this;
  }

  /**
   * Get genres
   *
   * @return genres
   */
  @ApiModelProperty(value = "")
  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public PromotedObjectAppAndroidSpec packageDownloadUrl(String packageDownloadUrl) {
    this.packageDownloadUrl = packageDownloadUrl;
    return this;
  }

  /**
   * Get packageDownloadUrl
   *
   * @return packageDownloadUrl
   */
  @ApiModelProperty(value = "")
  public String getPackageDownloadUrl() {
    return packageDownloadUrl;
  }

  public void setPackageDownloadUrl(String packageDownloadUrl) {
    this.packageDownloadUrl = packageDownloadUrl;
  }

  public PromotedObjectAppAndroidSpec channelPackageSpec(
      List<ChannelPackageSpecStruct> channelPackageSpec) {
    this.channelPackageSpec = channelPackageSpec;
    return this;
  }

  public PromotedObjectAppAndroidSpec addChannelPackageSpecItem(
      ChannelPackageSpecStruct channelPackageSpecItem) {
    if (this.channelPackageSpec == null) {
      this.channelPackageSpec = new ArrayList<ChannelPackageSpecStruct>();
    }
    this.channelPackageSpec.add(channelPackageSpecItem);
    return this;
  }

  /**
   * Get channelPackageSpec
   *
   * @return channelPackageSpec
   */
  @ApiModelProperty(value = "")
  public List<ChannelPackageSpecStruct> getChannelPackageSpec() {
    return channelPackageSpec;
  }

  public void setChannelPackageSpec(List<ChannelPackageSpecStruct> channelPackageSpec) {
    this.channelPackageSpec = channelPackageSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotedObjectAppAndroidSpec promotedObjectAppAndroidSpec = (PromotedObjectAppAndroidSpec) o;
    return Objects.equals(this.packname, promotedObjectAppAndroidSpec.packname)
        && Objects.equals(this.version, promotedObjectAppAndroidSpec.version)
        && Objects.equals(this.icon, promotedObjectAppAndroidSpec.icon)
        && Objects.equals(this.averageRating, promotedObjectAppAndroidSpec.averageRating)
        && Objects.equals(this.packageSize, promotedObjectAppAndroidSpec.packageSize)
        && Objects.equals(this.genres, promotedObjectAppAndroidSpec.genres)
        && Objects.equals(this.packageDownloadUrl, promotedObjectAppAndroidSpec.packageDownloadUrl)
        && Objects.equals(this.channelPackageSpec, promotedObjectAppAndroidSpec.channelPackageSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        packname,
        version,
        icon,
        averageRating,
        packageSize,
        genres,
        packageDownloadUrl,
        channelPackageSpec);
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
