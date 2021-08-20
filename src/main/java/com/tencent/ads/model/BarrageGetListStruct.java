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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class BarrageGetListStruct {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("review_status")
  private SysStatus reviewStatus = null;

  public BarrageGetListStruct id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BarrageGetListStruct text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   *
   * @return text
   */
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public BarrageGetListStruct reviewStatus(SysStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

  /**
   * Get reviewStatus
   *
   * @return reviewStatus
   */
  @ApiModelProperty(value = "")
  public SysStatus getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(SysStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarrageGetListStruct barrageGetListStruct = (BarrageGetListStruct) o;
    return Objects.equals(this.id, barrageGetListStruct.id)
        && Objects.equals(this.text, barrageGetListStruct.text)
        && Objects.equals(this.reviewStatus, barrageGetListStruct.reviewStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, reviewStatus);
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