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

/** 小游戏试玩页组件 */
@ApiModel(description = "小游戏试玩页组件")
public class WxgamePlayablePageStruct {
  @SerializedName("wxgame_playable_page_switch")
  private Boolean wxgamePlayablePageSwitch = null;

  @SerializedName("wxgame_playable_page_path")
  private String wxgamePlayablePagePath = null;

  @SerializedName("wxgame_playable_page_end_cover_img")
  private String wxgamePlayablePageEndCoverImg = null;

  @SerializedName("wxgame_playable_page_end_desc")
  private String wxgamePlayablePageEndDesc = null;

  @SerializedName("wxgame_playable_page_orientation")
  private WxgamePlayablePageOrientation wxgamePlayablePageOrientation = null;

  public WxgamePlayablePageStruct wxgamePlayablePageSwitch(Boolean wxgamePlayablePageSwitch) {
    this.wxgamePlayablePageSwitch = wxgamePlayablePageSwitch;
    return this;
  }

  /**
   * Get wxgamePlayablePageSwitch
   *
   * @return wxgamePlayablePageSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isWxgamePlayablePageSwitch() {
    return wxgamePlayablePageSwitch;
  }

  public void setWxgamePlayablePageSwitch(Boolean wxgamePlayablePageSwitch) {
    this.wxgamePlayablePageSwitch = wxgamePlayablePageSwitch;
  }

  public WxgamePlayablePageStruct wxgamePlayablePagePath(String wxgamePlayablePagePath) {
    this.wxgamePlayablePagePath = wxgamePlayablePagePath;
    return this;
  }

  /**
   * Get wxgamePlayablePagePath
   *
   * @return wxgamePlayablePagePath
   */
  @ApiModelProperty(value = "")
  public String getWxgamePlayablePagePath() {
    return wxgamePlayablePagePath;
  }

  public void setWxgamePlayablePagePath(String wxgamePlayablePagePath) {
    this.wxgamePlayablePagePath = wxgamePlayablePagePath;
  }

  public WxgamePlayablePageStruct wxgamePlayablePageEndCoverImg(
      String wxgamePlayablePageEndCoverImg) {
    this.wxgamePlayablePageEndCoverImg = wxgamePlayablePageEndCoverImg;
    return this;
  }

  /**
   * Get wxgamePlayablePageEndCoverImg
   *
   * @return wxgamePlayablePageEndCoverImg
   */
  @ApiModelProperty(value = "")
  public String getWxgamePlayablePageEndCoverImg() {
    return wxgamePlayablePageEndCoverImg;
  }

  public void setWxgamePlayablePageEndCoverImg(String wxgamePlayablePageEndCoverImg) {
    this.wxgamePlayablePageEndCoverImg = wxgamePlayablePageEndCoverImg;
  }

  public WxgamePlayablePageStruct wxgamePlayablePageEndDesc(String wxgamePlayablePageEndDesc) {
    this.wxgamePlayablePageEndDesc = wxgamePlayablePageEndDesc;
    return this;
  }

  /**
   * Get wxgamePlayablePageEndDesc
   *
   * @return wxgamePlayablePageEndDesc
   */
  @ApiModelProperty(value = "")
  public String getWxgamePlayablePageEndDesc() {
    return wxgamePlayablePageEndDesc;
  }

  public void setWxgamePlayablePageEndDesc(String wxgamePlayablePageEndDesc) {
    this.wxgamePlayablePageEndDesc = wxgamePlayablePageEndDesc;
  }

  public WxgamePlayablePageStruct wxgamePlayablePageOrientation(
      WxgamePlayablePageOrientation wxgamePlayablePageOrientation) {
    this.wxgamePlayablePageOrientation = wxgamePlayablePageOrientation;
    return this;
  }

  /**
   * Get wxgamePlayablePageOrientation
   *
   * @return wxgamePlayablePageOrientation
   */
  @ApiModelProperty(value = "")
  public WxgamePlayablePageOrientation getWxgamePlayablePageOrientation() {
    return wxgamePlayablePageOrientation;
  }

  public void setWxgamePlayablePageOrientation(
      WxgamePlayablePageOrientation wxgamePlayablePageOrientation) {
    this.wxgamePlayablePageOrientation = wxgamePlayablePageOrientation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WxgamePlayablePageStruct wxgamePlayablePageStruct = (WxgamePlayablePageStruct) o;
    return Objects.equals(
            this.wxgamePlayablePageSwitch, wxgamePlayablePageStruct.wxgamePlayablePageSwitch)
        && Objects.equals(
            this.wxgamePlayablePagePath, wxgamePlayablePageStruct.wxgamePlayablePagePath)
        && Objects.equals(
            this.wxgamePlayablePageEndCoverImg,
            wxgamePlayablePageStruct.wxgamePlayablePageEndCoverImg)
        && Objects.equals(
            this.wxgamePlayablePageEndDesc, wxgamePlayablePageStruct.wxgamePlayablePageEndDesc)
        && Objects.equals(
            this.wxgamePlayablePageOrientation,
            wxgamePlayablePageStruct.wxgamePlayablePageOrientation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        wxgamePlayablePageSwitch,
        wxgamePlayablePagePath,
        wxgamePlayablePageEndCoverImg,
        wxgamePlayablePageEndDesc,
        wxgamePlayablePageOrientation);
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