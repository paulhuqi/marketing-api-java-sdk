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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AdcreativePreviewsQrcodeGetResponseData */
public class AdcreativePreviewsQrcodeGetResponseData {
  @SerializedName("qrcode_url")
  private String qrcodeUrl = null;

  public AdcreativePreviewsQrcodeGetResponseData qrcodeUrl(String qrcodeUrl) {
    this.qrcodeUrl = qrcodeUrl;
    return this;
  }

  /**
   * Get qrcodeUrl
   *
   * @return qrcodeUrl
   */
  @ApiModelProperty(value = "")
  public String getQrcodeUrl() {
    return qrcodeUrl;
  }

  public void setQrcodeUrl(String qrcodeUrl) {
    this.qrcodeUrl = qrcodeUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativePreviewsQrcodeGetResponseData adcreativePreviewsQrcodeGetResponseData =
        (AdcreativePreviewsQrcodeGetResponseData) o;
    return Objects.equals(this.qrcodeUrl, adcreativePreviewsQrcodeGetResponseData.qrcodeUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qrcodeUrl);
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
