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

/** 新增RTA策略绑定信息 */
@ApiModel(description = "新增RTA策略绑定信息")
public class RtaTargetBindAddObject {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("TargetType")
  private Long targetType = null;

  @SerializedName("OuterTargetId")
  private String outerTargetId = null;

  @SerializedName("IsMp")
  private Long isMp = null;

  @SerializedName("UId")
  private Long uid = null;

  @SerializedName("OptPlatform")
  private Long optPlatform = null;

  public RtaTargetBindAddObject id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RtaTargetBindAddObject targetType(Long targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * Get targetType
   *
   * @return targetType
   */
  @ApiModelProperty(value = "")
  public Long getTargetType() {
    return targetType;
  }

  public void setTargetType(Long targetType) {
    this.targetType = targetType;
  }

  public RtaTargetBindAddObject outerTargetId(String outerTargetId) {
    this.outerTargetId = outerTargetId;
    return this;
  }

  /**
   * Get outerTargetId
   *
   * @return outerTargetId
   */
  @ApiModelProperty(value = "")
  public String getOuterTargetId() {
    return outerTargetId;
  }

  public void setOuterTargetId(String outerTargetId) {
    this.outerTargetId = outerTargetId;
  }

  public RtaTargetBindAddObject isMp(Long isMp) {
    this.isMp = isMp;
    return this;
  }

  /**
   * Get isMp
   *
   * @return isMp
   */
  @ApiModelProperty(value = "")
  public Long getIsMp() {
    return isMp;
  }

  public void setIsMp(Long isMp) {
    this.isMp = isMp;
  }

  public RtaTargetBindAddObject uid(Long uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Get uid
   *
   * @return uid
   */
  @ApiModelProperty(value = "")
  public Long getUid() {
    return uid;
  }

  public void setUid(Long uid) {
    this.uid = uid;
  }

  public RtaTargetBindAddObject optPlatform(Long optPlatform) {
    this.optPlatform = optPlatform;
    return this;
  }

  /**
   * Get optPlatform
   *
   * @return optPlatform
   */
  @ApiModelProperty(value = "")
  public Long getOptPlatform() {
    return optPlatform;
  }

  public void setOptPlatform(Long optPlatform) {
    this.optPlatform = optPlatform;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtaTargetBindAddObject rtaTargetBindAddObject = (RtaTargetBindAddObject) o;
    return Objects.equals(this.id, rtaTargetBindAddObject.id)
        && Objects.equals(this.targetType, rtaTargetBindAddObject.targetType)
        && Objects.equals(this.outerTargetId, rtaTargetBindAddObject.outerTargetId)
        && Objects.equals(this.isMp, rtaTargetBindAddObject.isMp)
        && Objects.equals(this.uid, rtaTargetBindAddObject.uid)
        && Objects.equals(this.optPlatform, rtaTargetBindAddObject.optPlatform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, targetType, outerTargetId, isMp, uid, optPlatform);
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
