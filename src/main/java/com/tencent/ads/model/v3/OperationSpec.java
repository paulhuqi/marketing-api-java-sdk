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

/** 处理操作信息 */
@ApiModel(description = "处理操作信息")
public class OperationSpec {
  @SerializedName("crop_customized_spec")
  private CropCustomizedSpec cropCustomizedSpec = null;

  @SerializedName("crop_smart_spec")
  private CropSmartSpec cropSmartSpec = null;

  @SerializedName("resize_spec")
  private ResizeSpec resizeSpec = null;

  @SerializedName("crop_customized_spec_and_resize")
  private CropCustomizedSpecAndResize cropCustomizedSpecAndResize = null;

  public OperationSpec cropCustomizedSpec(CropCustomizedSpec cropCustomizedSpec) {
    this.cropCustomizedSpec = cropCustomizedSpec;
    return this;
  }

  /**
   * Get cropCustomizedSpec
   *
   * @return cropCustomizedSpec
   */
  @ApiModelProperty(value = "")
  public CropCustomizedSpec getCropCustomizedSpec() {
    return cropCustomizedSpec;
  }

  public void setCropCustomizedSpec(CropCustomizedSpec cropCustomizedSpec) {
    this.cropCustomizedSpec = cropCustomizedSpec;
  }

  public OperationSpec cropSmartSpec(CropSmartSpec cropSmartSpec) {
    this.cropSmartSpec = cropSmartSpec;
    return this;
  }

  /**
   * Get cropSmartSpec
   *
   * @return cropSmartSpec
   */
  @ApiModelProperty(value = "")
  public CropSmartSpec getCropSmartSpec() {
    return cropSmartSpec;
  }

  public void setCropSmartSpec(CropSmartSpec cropSmartSpec) {
    this.cropSmartSpec = cropSmartSpec;
  }

  public OperationSpec resizeSpec(ResizeSpec resizeSpec) {
    this.resizeSpec = resizeSpec;
    return this;
  }

  /**
   * Get resizeSpec
   *
   * @return resizeSpec
   */
  @ApiModelProperty(value = "")
  public ResizeSpec getResizeSpec() {
    return resizeSpec;
  }

  public void setResizeSpec(ResizeSpec resizeSpec) {
    this.resizeSpec = resizeSpec;
  }

  public OperationSpec cropCustomizedSpecAndResize(
      CropCustomizedSpecAndResize cropCustomizedSpecAndResize) {
    this.cropCustomizedSpecAndResize = cropCustomizedSpecAndResize;
    return this;
  }

  /**
   * Get cropCustomizedSpecAndResize
   *
   * @return cropCustomizedSpecAndResize
   */
  @ApiModelProperty(value = "")
  public CropCustomizedSpecAndResize getCropCustomizedSpecAndResize() {
    return cropCustomizedSpecAndResize;
  }

  public void setCropCustomizedSpecAndResize(
      CropCustomizedSpecAndResize cropCustomizedSpecAndResize) {
    this.cropCustomizedSpecAndResize = cropCustomizedSpecAndResize;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationSpec operationSpec = (OperationSpec) o;
    return Objects.equals(this.cropCustomizedSpec, operationSpec.cropCustomizedSpec)
        && Objects.equals(this.cropSmartSpec, operationSpec.cropSmartSpec)
        && Objects.equals(this.resizeSpec, operationSpec.resizeSpec)
        && Objects.equals(
            this.cropCustomizedSpecAndResize, operationSpec.cropCustomizedSpecAndResize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cropCustomizedSpec, cropSmartSpec, resizeSpec, cropCustomizedSpecAndResize);
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
