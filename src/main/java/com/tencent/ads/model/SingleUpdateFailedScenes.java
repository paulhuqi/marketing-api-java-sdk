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

/** 应用场景信息 */
@ApiModel(description = "应用场景信息")
public class SingleUpdateFailedScenes {
  @SerializedName("scene")
  private DataNexusScene scene = null;

  @SerializedName("asset_ids")
  private List<SingleUpdateFailedAssetArray> assetIds = null;

  @SerializedName("fail_reason")
  private String failReason = null;

  public SingleUpdateFailedScenes scene(DataNexusScene scene) {
    this.scene = scene;
    return this;
  }

  /**
   * Get scene
   *
   * @return scene
   */
  @ApiModelProperty(value = "")
  public DataNexusScene getScene() {
    return scene;
  }

  public void setScene(DataNexusScene scene) {
    this.scene = scene;
  }

  public SingleUpdateFailedScenes assetIds(List<SingleUpdateFailedAssetArray> assetIds) {
    this.assetIds = assetIds;
    return this;
  }

  public SingleUpdateFailedScenes addAssetIdsItem(SingleUpdateFailedAssetArray assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<SingleUpdateFailedAssetArray>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

  /**
   * Get assetIds
   *
   * @return assetIds
   */
  @ApiModelProperty(value = "")
  public List<SingleUpdateFailedAssetArray> getAssetIds() {
    return assetIds;
  }

  public void setAssetIds(List<SingleUpdateFailedAssetArray> assetIds) {
    this.assetIds = assetIds;
  }

  public SingleUpdateFailedScenes failReason(String failReason) {
    this.failReason = failReason;
    return this;
  }

  /**
   * Get failReason
   *
   * @return failReason
   */
  @ApiModelProperty(value = "")
  public String getFailReason() {
    return failReason;
  }

  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleUpdateFailedScenes singleUpdateFailedScenes = (SingleUpdateFailedScenes) o;
    return Objects.equals(this.scene, singleUpdateFailedScenes.scene)
        && Objects.equals(this.assetIds, singleUpdateFailedScenes.assetIds)
        && Objects.equals(this.failReason, singleUpdateFailedScenes.failReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scene, assetIds, failReason);
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
