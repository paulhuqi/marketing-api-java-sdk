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

/** 商品系列条件 */
@ApiModel(description = "商品系列条件")
public class ProductSeriesSearchFilteringStruct {
  @SerializedName("field")
  private String field = null;

  @SerializedName("operator")
  private StringOperatorWithIn operator = null;

  @SerializedName("value")
  private String value = null;

  public ProductSeriesSearchFilteringStruct field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   *
   * @return field
   */
  @ApiModelProperty(value = "")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ProductSeriesSearchFilteringStruct operator(StringOperatorWithIn operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   *
   * @return operator
   */
  @ApiModelProperty(value = "")
  public StringOperatorWithIn getOperator() {
    return operator;
  }

  public void setOperator(StringOperatorWithIn operator) {
    this.operator = operator;
  }

  public ProductSeriesSearchFilteringStruct value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSeriesSearchFilteringStruct productSeriesSearchFilteringStruct =
        (ProductSeriesSearchFilteringStruct) o;
    return Objects.equals(this.field, productSeriesSearchFilteringStruct.field)
        && Objects.equals(this.operator, productSeriesSearchFilteringStruct.operator)
        && Objects.equals(this.value, productSeriesSearchFilteringStruct.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, value);
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
