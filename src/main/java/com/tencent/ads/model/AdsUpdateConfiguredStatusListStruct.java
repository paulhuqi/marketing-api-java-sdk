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
public class AdsUpdateConfiguredStatusListStruct {
  @SerializedName("code")
  private Long code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("message_cn")
  private String messageCn = null;

  @SerializedName("ad_id")
  private Long adId = null;

  public AdsUpdateConfiguredStatusListStruct code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   *
   * @return code
   */
  @ApiModelProperty(value = "")
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public AdsUpdateConfiguredStatusListStruct message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message
   */
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AdsUpdateConfiguredStatusListStruct messageCn(String messageCn) {
    this.messageCn = messageCn;
    return this;
  }

  /**
   * Get messageCn
   *
   * @return messageCn
   */
  @ApiModelProperty(value = "")
  public String getMessageCn() {
    return messageCn;
  }

  public void setMessageCn(String messageCn) {
    this.messageCn = messageCn;
  }

  public AdsUpdateConfiguredStatusListStruct adId(Long adId) {
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
    AdsUpdateConfiguredStatusListStruct adsUpdateConfiguredStatusListStruct =
        (AdsUpdateConfiguredStatusListStruct) o;
    return Objects.equals(this.code, adsUpdateConfiguredStatusListStruct.code)
        && Objects.equals(this.message, adsUpdateConfiguredStatusListStruct.message)
        && Objects.equals(this.messageCn, adsUpdateConfiguredStatusListStruct.messageCn)
        && Objects.equals(this.adId, adsUpdateConfiguredStatusListStruct.adId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, messageCn, adId);
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
