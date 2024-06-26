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

/** 子推荐方式 */
@ApiModel(description = "子推荐方式")
public class SubMethod {
  @SerializedName("sub_method_id")
  private Long subMethodId = null;

  @SerializedName("sub_method_name")
  private String subMethodName = null;

  @SerializedName("sub_method_description")
  private String subMethodDescription = null;

  public SubMethod subMethodId(Long subMethodId) {
    this.subMethodId = subMethodId;
    return this;
  }

  /**
   * Get subMethodId
   *
   * @return subMethodId
   */
  @ApiModelProperty(value = "")
  public Long getSubMethodId() {
    return subMethodId;
  }

  public void setSubMethodId(Long subMethodId) {
    this.subMethodId = subMethodId;
  }

  public SubMethod subMethodName(String subMethodName) {
    this.subMethodName = subMethodName;
    return this;
  }

  /**
   * Get subMethodName
   *
   * @return subMethodName
   */
  @ApiModelProperty(value = "")
  public String getSubMethodName() {
    return subMethodName;
  }

  public void setSubMethodName(String subMethodName) {
    this.subMethodName = subMethodName;
  }

  public SubMethod subMethodDescription(String subMethodDescription) {
    this.subMethodDescription = subMethodDescription;
    return this;
  }

  /**
   * Get subMethodDescription
   *
   * @return subMethodDescription
   */
  @ApiModelProperty(value = "")
  public String getSubMethodDescription() {
    return subMethodDescription;
  }

  public void setSubMethodDescription(String subMethodDescription) {
    this.subMethodDescription = subMethodDescription;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubMethod subMethod = (SubMethod) o;
    return Objects.equals(this.subMethodId, subMethod.subMethodId)
        && Objects.equals(this.subMethodName, subMethod.subMethodName)
        && Objects.equals(this.subMethodDescription, subMethod.subMethodDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subMethodId, subMethodName, subMethodDescription);
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
