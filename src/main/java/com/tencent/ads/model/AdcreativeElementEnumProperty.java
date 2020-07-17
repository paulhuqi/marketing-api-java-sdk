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

/** 广告创意元素枚举值特性 */
@ApiModel(description = "广告创意元素枚举值特性")
public class AdcreativeElementEnumProperty {
  @SerializedName("default")
  private String _default = null;

  @SerializedName("enumeration")
  private List<AdcreativeElementEnumOption> enumeration = null;

  public AdcreativeElementEnumProperty _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   *
   * @return _default
   */
  @ApiModelProperty(value = "")
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public AdcreativeElementEnumProperty enumeration(List<AdcreativeElementEnumOption> enumeration) {
    this.enumeration = enumeration;
    return this;
  }

  public AdcreativeElementEnumProperty addEnumerationItem(
      AdcreativeElementEnumOption enumerationItem) {
    if (this.enumeration == null) {
      this.enumeration = new ArrayList<AdcreativeElementEnumOption>();
    }
    this.enumeration.add(enumerationItem);
    return this;
  }

  /**
   * Get enumeration
   *
   * @return enumeration
   */
  @ApiModelProperty(value = "")
  public List<AdcreativeElementEnumOption> getEnumeration() {
    return enumeration;
  }

  public void setEnumeration(List<AdcreativeElementEnumOption> enumeration) {
    this.enumeration = enumeration;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativeElementEnumProperty adcreativeElementEnumProperty = (AdcreativeElementEnumProperty) o;
    return Objects.equals(this._default, adcreativeElementEnumProperty._default)
        && Objects.equals(this.enumeration, adcreativeElementEnumProperty.enumeration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, enumeration);
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
