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

/** 基础文本组件元素 */
@ApiModel(description = "基础文本组件元素")
public class TextSpec {
  @SerializedName("text")
  private String text = null;

  @SerializedName("padding_top")
  private Long paddingTop = null;

  @SerializedName("padding_bottom")
  private Long paddingBottom = null;

  @SerializedName("font_size")
  private Long fontSize = null;

  @SerializedName("font_color")
  private String fontColor = null;

  @SerializedName("text_alignment")
  private Long textAlignment = null;

  @SerializedName("font_style")
  private Long fontStyle = null;

  public TextSpec text(String text) {
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

  public TextSpec paddingTop(Long paddingTop) {
    this.paddingTop = paddingTop;
    return this;
  }

  /**
   * Get paddingTop
   *
   * @return paddingTop
   */
  @ApiModelProperty(value = "")
  public Long getPaddingTop() {
    return paddingTop;
  }

  public void setPaddingTop(Long paddingTop) {
    this.paddingTop = paddingTop;
  }

  public TextSpec paddingBottom(Long paddingBottom) {
    this.paddingBottom = paddingBottom;
    return this;
  }

  /**
   * Get paddingBottom
   *
   * @return paddingBottom
   */
  @ApiModelProperty(value = "")
  public Long getPaddingBottom() {
    return paddingBottom;
  }

  public void setPaddingBottom(Long paddingBottom) {
    this.paddingBottom = paddingBottom;
  }

  public TextSpec fontSize(Long fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * Get fontSize
   *
   * @return fontSize
   */
  @ApiModelProperty(value = "")
  public Long getFontSize() {
    return fontSize;
  }

  public void setFontSize(Long fontSize) {
    this.fontSize = fontSize;
  }

  public TextSpec fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

  /**
   * Get fontColor
   *
   * @return fontColor
   */
  @ApiModelProperty(value = "")
  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public TextSpec textAlignment(Long textAlignment) {
    this.textAlignment = textAlignment;
    return this;
  }

  /**
   * Get textAlignment
   *
   * @return textAlignment
   */
  @ApiModelProperty(value = "")
  public Long getTextAlignment() {
    return textAlignment;
  }

  public void setTextAlignment(Long textAlignment) {
    this.textAlignment = textAlignment;
  }

  public TextSpec fontStyle(Long fontStyle) {
    this.fontStyle = fontStyle;
    return this;
  }

  /**
   * Get fontStyle
   *
   * @return fontStyle
   */
  @ApiModelProperty(value = "")
  public Long getFontStyle() {
    return fontStyle;
  }

  public void setFontStyle(Long fontStyle) {
    this.fontStyle = fontStyle;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextSpec textSpec = (TextSpec) o;
    return Objects.equals(this.text, textSpec.text)
        && Objects.equals(this.paddingTop, textSpec.paddingTop)
        && Objects.equals(this.paddingBottom, textSpec.paddingBottom)
        && Objects.equals(this.fontSize, textSpec.fontSize)
        && Objects.equals(this.fontColor, textSpec.fontColor)
        && Objects.equals(this.textAlignment, textSpec.textAlignment)
        && Objects.equals(this.fontStyle, textSpec.fontStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        text, paddingTop, paddingBottom, fontSize, fontColor, textAlignment, fontStyle);
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