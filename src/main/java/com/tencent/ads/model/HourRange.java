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

/** 查询的具体时段范围 */
@ApiModel(description = "查询的具体时段范围")
public class HourRange {
  @SerializedName("begin_hour")
  private Long beginHour = null;

  @SerializedName("end_hour")
  private Long endHour = null;

  public HourRange beginHour(Long beginHour) {
    this.beginHour = beginHour;
    return this;
  }

  /**
   * Get beginHour
   *
   * @return beginHour
   */
  @ApiModelProperty(value = "")
  public Long getBeginHour() {
    return beginHour;
  }

  public void setBeginHour(Long beginHour) {
    this.beginHour = beginHour;
  }

  public HourRange endHour(Long endHour) {
    this.endHour = endHour;
    return this;
  }

  /**
   * Get endHour
   *
   * @return endHour
   */
  @ApiModelProperty(value = "")
  public Long getEndHour() {
    return endHour;
  }

  public void setEndHour(Long endHour) {
    this.endHour = endHour;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourRange hourRange = (HourRange) o;
    return Objects.equals(this.beginHour, hourRange.beginHour)
        && Objects.equals(this.endHour, hourRange.endHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginHour, endHour);
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
