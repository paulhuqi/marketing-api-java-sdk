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

/** 图文复合组件 */
@ApiModel(description = "图文复合组件")
public class ShelfSpecStruct {
  @SerializedName("shelf_button_spec")
  private ShelfButtonSpec shelfButtonSpec = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("image_id_list")
  private String imageIdList = null;

  public ShelfSpecStruct shelfButtonSpec(ShelfButtonSpec shelfButtonSpec) {
    this.shelfButtonSpec = shelfButtonSpec;
    return this;
  }

  /**
   * Get shelfButtonSpec
   *
   * @return shelfButtonSpec
   */
  @ApiModelProperty(value = "")
  public ShelfButtonSpec getShelfButtonSpec() {
    return shelfButtonSpec;
  }

  public void setShelfButtonSpec(ShelfButtonSpec shelfButtonSpec) {
    this.shelfButtonSpec = shelfButtonSpec;
  }

  public ShelfSpecStruct title(String title) {
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

  public ShelfSpecStruct desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   *
   * @return desc
   */
  @ApiModelProperty(value = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ShelfSpecStruct imageIdList(String imageIdList) {
    this.imageIdList = imageIdList;
    return this;
  }

  /**
   * Get imageIdList
   *
   * @return imageIdList
   */
  @ApiModelProperty(value = "")
  public String getImageIdList() {
    return imageIdList;
  }

  public void setImageIdList(String imageIdList) {
    this.imageIdList = imageIdList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShelfSpecStruct shelfSpecStruct = (ShelfSpecStruct) o;
    return Objects.equals(this.shelfButtonSpec, shelfSpecStruct.shelfButtonSpec)
        && Objects.equals(this.title, shelfSpecStruct.title)
        && Objects.equals(this.desc, shelfSpecStruct.desc)
        && Objects.equals(this.imageIdList, shelfSpecStruct.imageIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shelfButtonSpec, title, desc, imageIdList);
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
