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

/** 广告创意能力项 */
@ApiModel(description = "广告创意能力项")
public class AttributesStruct {
  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("field_type")
  private FieldType fieldType = null;

  @SerializedName("property_detail")
  private PropertyDetail propertyDetail = null;

  public AttributesStruct required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Get required
   *
   * @return required
   */
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public AttributesStruct name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttributesStruct description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AttributesStruct fieldType(FieldType fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Get fieldType
   *
   * @return fieldType
   */
  @ApiModelProperty(value = "")
  public FieldType getFieldType() {
    return fieldType;
  }

  public void setFieldType(FieldType fieldType) {
    this.fieldType = fieldType;
  }

  public AttributesStruct propertyDetail(PropertyDetail propertyDetail) {
    this.propertyDetail = propertyDetail;
    return this;
  }

  /**
   * Get propertyDetail
   *
   * @return propertyDetail
   */
  @ApiModelProperty(value = "")
  public PropertyDetail getPropertyDetail() {
    return propertyDetail;
  }

  public void setPropertyDetail(PropertyDetail propertyDetail) {
    this.propertyDetail = propertyDetail;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributesStruct attributesStruct = (AttributesStruct) o;
    return Objects.equals(this.required, attributesStruct.required)
        && Objects.equals(this.name, attributesStruct.name)
        && Objects.equals(this.description, attributesStruct.description)
        && Objects.equals(this.fieldType, attributesStruct.fieldType)
        && Objects.equals(this.propertyDetail, attributesStruct.propertyDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, name, description, fieldType, propertyDetail);
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