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

/** 跨城市规则 */
@ApiModel(description = "跨城市规则")
public class CrossCityRule {
  @SerializedName("route")
  private List<String> route = null;

  @SerializedName("date_range")
  private DateRange dateRange = null;

  @SerializedName("frequency")
  private Long frequency = null;

  public CrossCityRule route(List<String> route) {
    this.route = route;
    return this;
  }

  public CrossCityRule addRouteItem(String routeItem) {
    if (this.route == null) {
      this.route = new ArrayList<String>();
    }
    this.route.add(routeItem);
    return this;
  }

  /**
   * Get route
   *
   * @return route
   */
  @ApiModelProperty(value = "")
  public List<String> getRoute() {
    return route;
  }

  public void setRoute(List<String> route) {
    this.route = route;
  }

  public CrossCityRule dateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Get dateRange
   *
   * @return dateRange
   */
  @ApiModelProperty(value = "")
  public DateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
  }

  public CrossCityRule frequency(Long frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   *
   * @return frequency
   */
  @ApiModelProperty(value = "")
  public Long getFrequency() {
    return frequency;
  }

  public void setFrequency(Long frequency) {
    this.frequency = frequency;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossCityRule crossCityRule = (CrossCityRule) o;
    return Objects.equals(this.route, crossCityRule.route)
        && Objects.equals(this.dateRange, crossCityRule.dateRange)
        && Objects.equals(this.frequency, crossCityRule.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(route, dateRange, frequency);
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
