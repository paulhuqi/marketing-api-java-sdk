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
import java.util.Objects;

/** AdsAddResponseData */
public class AdsAddResponseData {
  @SerializedName("ad_id")
  private Long adId = null;

  public AdsAddResponseData adId(Long adId) {
    this.adId = adId;
    return this;
  }

  /**
   * Get adId
   *
   * @return adId
   */
  @ApiModelProperty(value = "")
  public Long getAdId() {
    return adId;
  }

  public void setAdId(Long adId) {
    this.adId = adId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsAddResponseData adsAddResponseData = (AdsAddResponseData) o;
    return Objects.equals(this.adId, adsAddResponseData.adId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId);
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
