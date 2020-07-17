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

/** 地理位置定向 */
@ApiModel(description = "地理位置定向")
public class GeoLocations {
  @SerializedName("location_types")
  private List<String> locationTypes = null;

  @SerializedName("regions")
  private List<Long> regions = null;

  @SerializedName("business_districts")
  private List<Long> businessDistricts = null;

  @SerializedName("custom_locations")
  private List<CustomLocationsItem> customLocations = null;

  public GeoLocations locationTypes(List<String> locationTypes) {
    this.locationTypes = locationTypes;
    return this;
  }

  public GeoLocations addLocationTypesItem(String locationTypesItem) {
    if (this.locationTypes == null) {
      this.locationTypes = new ArrayList<String>();
    }
    this.locationTypes.add(locationTypesItem);
    return this;
  }

  /**
   * Get locationTypes
   *
   * @return locationTypes
   */
  @ApiModelProperty(value = "")
  public List<String> getLocationTypes() {
    return locationTypes;
  }

  public void setLocationTypes(List<String> locationTypes) {
    this.locationTypes = locationTypes;
  }

  public GeoLocations regions(List<Long> regions) {
    this.regions = regions;
    return this;
  }

  public GeoLocations addRegionsItem(Long regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<Long>();
    }
    this.regions.add(regionsItem);
    return this;
  }

  /**
   * Get regions
   *
   * @return regions
   */
  @ApiModelProperty(value = "")
  public List<Long> getRegions() {
    return regions;
  }

  public void setRegions(List<Long> regions) {
    this.regions = regions;
  }

  public GeoLocations businessDistricts(List<Long> businessDistricts) {
    this.businessDistricts = businessDistricts;
    return this;
  }

  public GeoLocations addBusinessDistrictsItem(Long businessDistrictsItem) {
    if (this.businessDistricts == null) {
      this.businessDistricts = new ArrayList<Long>();
    }
    this.businessDistricts.add(businessDistrictsItem);
    return this;
  }

  /**
   * Get businessDistricts
   *
   * @return businessDistricts
   */
  @ApiModelProperty(value = "")
  public List<Long> getBusinessDistricts() {
    return businessDistricts;
  }

  public void setBusinessDistricts(List<Long> businessDistricts) {
    this.businessDistricts = businessDistricts;
  }

  public GeoLocations customLocations(List<CustomLocationsItem> customLocations) {
    this.customLocations = customLocations;
    return this;
  }

  public GeoLocations addCustomLocationsItem(CustomLocationsItem customLocationsItem) {
    if (this.customLocations == null) {
      this.customLocations = new ArrayList<CustomLocationsItem>();
    }
    this.customLocations.add(customLocationsItem);
    return this;
  }

  /**
   * Get customLocations
   *
   * @return customLocations
   */
  @ApiModelProperty(value = "")
  public List<CustomLocationsItem> getCustomLocations() {
    return customLocations;
  }

  public void setCustomLocations(List<CustomLocationsItem> customLocations) {
    this.customLocations = customLocations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocations geoLocations = (GeoLocations) o;
    return Objects.equals(this.locationTypes, geoLocations.locationTypes)
        && Objects.equals(this.regions, geoLocations.regions)
        && Objects.equals(this.businessDistricts, geoLocations.businessDistricts)
        && Objects.equals(this.customLocations, geoLocations.customLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationTypes, regions, businessDistricts, customLocations);
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
