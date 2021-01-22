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
public class LocalStoresGetListStruct {
  @SerializedName("poi_id")
  private String poiId = null;

  @SerializedName("local_store_name")
  private String localStoreName = null;

  @SerializedName("local_store_province")
  private String localStoreProvince = null;

  @SerializedName("local_store_city")
  private String localStoreCity = null;

  @SerializedName("local_store_address")
  private String localStoreAddress = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("system_status")
  private SysStatus systemStatus = null;

  public LocalStoresGetListStruct poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

  /**
   * Get poiId
   *
   * @return poiId
   */
  @ApiModelProperty(value = "")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public LocalStoresGetListStruct localStoreName(String localStoreName) {
    this.localStoreName = localStoreName;
    return this;
  }

  /**
   * Get localStoreName
   *
   * @return localStoreName
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreName() {
    return localStoreName;
  }

  public void setLocalStoreName(String localStoreName) {
    this.localStoreName = localStoreName;
  }

  public LocalStoresGetListStruct localStoreProvince(String localStoreProvince) {
    this.localStoreProvince = localStoreProvince;
    return this;
  }

  /**
   * Get localStoreProvince
   *
   * @return localStoreProvince
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreProvince() {
    return localStoreProvince;
  }

  public void setLocalStoreProvince(String localStoreProvince) {
    this.localStoreProvince = localStoreProvince;
  }

  public LocalStoresGetListStruct localStoreCity(String localStoreCity) {
    this.localStoreCity = localStoreCity;
    return this;
  }

  /**
   * Get localStoreCity
   *
   * @return localStoreCity
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreCity() {
    return localStoreCity;
  }

  public void setLocalStoreCity(String localStoreCity) {
    this.localStoreCity = localStoreCity;
  }

  public LocalStoresGetListStruct localStoreAddress(String localStoreAddress) {
    this.localStoreAddress = localStoreAddress;
    return this;
  }

  /**
   * Get localStoreAddress
   *
   * @return localStoreAddress
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreAddress() {
    return localStoreAddress;
  }

  public void setLocalStoreAddress(String localStoreAddress) {
    this.localStoreAddress = localStoreAddress;
  }

  public LocalStoresGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public LocalStoresGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public LocalStoresGetListStruct systemStatus(SysStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public SysStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(SysStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalStoresGetListStruct localStoresGetListStruct = (LocalStoresGetListStruct) o;
    return Objects.equals(this.poiId, localStoresGetListStruct.poiId)
        && Objects.equals(this.localStoreName, localStoresGetListStruct.localStoreName)
        && Objects.equals(this.localStoreProvince, localStoresGetListStruct.localStoreProvince)
        && Objects.equals(this.localStoreCity, localStoresGetListStruct.localStoreCity)
        && Objects.equals(this.localStoreAddress, localStoresGetListStruct.localStoreAddress)
        && Objects.equals(this.createdTime, localStoresGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, localStoresGetListStruct.lastModifiedTime)
        && Objects.equals(this.systemStatus, localStoresGetListStruct.systemStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        poiId,
        localStoreName,
        localStoreProvince,
        localStoreCity,
        localStoreAddress,
        createdTime,
        lastModifiedTime,
        systemStatus);
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