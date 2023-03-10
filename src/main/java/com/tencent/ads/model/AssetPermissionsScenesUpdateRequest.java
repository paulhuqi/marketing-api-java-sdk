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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** AssetPermissionsScenesUpdateRequest */
public class AssetPermissionsScenesUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("asset_type")
  private DnAssetType assetType = null;

  @SerializedName("asset_id")
  private Long assetId = null;

  @SerializedName("licensing_account_id")
  private Long licensingAccountId = null;

  @SerializedName("path_type")
  private PathType pathType = null;

  @SerializedName("permission_list")
  private List<String> permissionList = null;

  public AssetPermissionsScenesUpdateRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AssetPermissionsScenesUpdateRequest assetType(DnAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Get assetType
   *
   * @return assetType
   */
  @ApiModelProperty(value = "")
  public DnAssetType getAssetType() {
    return assetType;
  }

  public void setAssetType(DnAssetType assetType) {
    this.assetType = assetType;
  }

  public AssetPermissionsScenesUpdateRequest assetId(Long assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Get assetId
   *
   * @return assetId
   */
  @ApiModelProperty(value = "")
  public Long getAssetId() {
    return assetId;
  }

  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }

  public AssetPermissionsScenesUpdateRequest licensingAccountId(Long licensingAccountId) {
    this.licensingAccountId = licensingAccountId;
    return this;
  }

  /**
   * Get licensingAccountId
   *
   * @return licensingAccountId
   */
  @ApiModelProperty(value = "")
  public Long getLicensingAccountId() {
    return licensingAccountId;
  }

  public void setLicensingAccountId(Long licensingAccountId) {
    this.licensingAccountId = licensingAccountId;
  }

  public AssetPermissionsScenesUpdateRequest pathType(PathType pathType) {
    this.pathType = pathType;
    return this;
  }

  /**
   * Get pathType
   *
   * @return pathType
   */
  @ApiModelProperty(value = "")
  public PathType getPathType() {
    return pathType;
  }

  public void setPathType(PathType pathType) {
    this.pathType = pathType;
  }

  public AssetPermissionsScenesUpdateRequest permissionList(List<String> permissionList) {
    this.permissionList = permissionList;
    return this;
  }

  public AssetPermissionsScenesUpdateRequest addPermissionListItem(String permissionListItem) {
    if (this.permissionList == null) {
      this.permissionList = new ArrayList<String>();
    }
    this.permissionList.add(permissionListItem);
    return this;
  }

  /**
   * Get permissionList
   *
   * @return permissionList
   */
  @ApiModelProperty(value = "")
  public List<String> getPermissionList() {
    return permissionList;
  }

  public void setPermissionList(List<String> permissionList) {
    this.permissionList = permissionList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetPermissionsScenesUpdateRequest assetPermissionsScenesUpdateRequest =
        (AssetPermissionsScenesUpdateRequest) o;
    return Objects.equals(this.accountId, assetPermissionsScenesUpdateRequest.accountId)
        && Objects.equals(this.assetType, assetPermissionsScenesUpdateRequest.assetType)
        && Objects.equals(this.assetId, assetPermissionsScenesUpdateRequest.assetId)
        && Objects.equals(
            this.licensingAccountId, assetPermissionsScenesUpdateRequest.licensingAccountId)
        && Objects.equals(this.pathType, assetPermissionsScenesUpdateRequest.pathType)
        && Objects.equals(this.permissionList, assetPermissionsScenesUpdateRequest.permissionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, assetType, assetId, licensingAccountId, pathType, permissionList);
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