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

/** 素材信息 */
@ApiModel(description = "素材信息")
public class MaterialStruct {
  @SerializedName("type")
  private MaterialTypeEnum type = null;

  @SerializedName("media_id")
  private String mediaId = null;

  @SerializedName("material_name")
  private String materialName = null;

  @SerializedName("origin_media_id")
  private String originMediaId = null;

  @SerializedName("url")
  private String url = null;

  public MaterialStruct type(MaterialTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public MaterialTypeEnum getType() {
    return type;
  }

  public void setType(MaterialTypeEnum type) {
    this.type = type;
  }

  public MaterialStruct mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * Get mediaId
   *
   * @return mediaId
   */
  @ApiModelProperty(value = "")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public MaterialStruct materialName(String materialName) {
    this.materialName = materialName;
    return this;
  }

  /**
   * Get materialName
   *
   * @return materialName
   */
  @ApiModelProperty(value = "")
  public String getMaterialName() {
    return materialName;
  }

  public void setMaterialName(String materialName) {
    this.materialName = materialName;
  }

  public MaterialStruct originMediaId(String originMediaId) {
    this.originMediaId = originMediaId;
    return this;
  }

  /**
   * Get originMediaId
   *
   * @return originMediaId
   */
  @ApiModelProperty(value = "")
  public String getOriginMediaId() {
    return originMediaId;
  }

  public void setOriginMediaId(String originMediaId) {
    this.originMediaId = originMediaId;
  }

  public MaterialStruct url(String url) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialStruct materialStruct = (MaterialStruct) o;
    return Objects.equals(this.type, materialStruct.type)
        && Objects.equals(this.mediaId, materialStruct.mediaId)
        && Objects.equals(this.materialName, materialStruct.materialName)
        && Objects.equals(this.originMediaId, materialStruct.originMediaId)
        && Objects.equals(this.url, materialStruct.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mediaId, materialName, originMediaId, url);
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
