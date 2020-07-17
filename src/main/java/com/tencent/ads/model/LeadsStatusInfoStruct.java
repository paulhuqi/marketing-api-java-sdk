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

/** 回传信息结构 */
@ApiModel(description = "回传信息结构")
public class LeadsStatusInfoStruct {
  @SerializedName("leads_id")
  private Long leadsId = null;

  @SerializedName("leads_convert_type")
  private LeadCluesLeadsConvertType leadsConvertType = null;

  @SerializedName("leads_ineffect_reason")
  private String leadsIneffectReason = null;

  public LeadsStatusInfoStruct leadsId(Long leadsId) {
    this.leadsId = leadsId;
    return this;
  }

  /**
   * Get leadsId
   *
   * @return leadsId
   */
  @ApiModelProperty(value = "")
  public Long getLeadsId() {
    return leadsId;
  }

  public void setLeadsId(Long leadsId) {
    this.leadsId = leadsId;
  }

  public LeadsStatusInfoStruct leadsConvertType(LeadCluesLeadsConvertType leadsConvertType) {
    this.leadsConvertType = leadsConvertType;
    return this;
  }

  /**
   * Get leadsConvertType
   *
   * @return leadsConvertType
   */
  @ApiModelProperty(value = "")
  public LeadCluesLeadsConvertType getLeadsConvertType() {
    return leadsConvertType;
  }

  public void setLeadsConvertType(LeadCluesLeadsConvertType leadsConvertType) {
    this.leadsConvertType = leadsConvertType;
  }

  public LeadsStatusInfoStruct leadsIneffectReason(String leadsIneffectReason) {
    this.leadsIneffectReason = leadsIneffectReason;
    return this;
  }

  /**
   * Get leadsIneffectReason
   *
   * @return leadsIneffectReason
   */
  @ApiModelProperty(value = "")
  public String getLeadsIneffectReason() {
    return leadsIneffectReason;
  }

  public void setLeadsIneffectReason(String leadsIneffectReason) {
    this.leadsIneffectReason = leadsIneffectReason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsStatusInfoStruct leadsStatusInfoStruct = (LeadsStatusInfoStruct) o;
    return Objects.equals(this.leadsId, leadsStatusInfoStruct.leadsId)
        && Objects.equals(this.leadsConvertType, leadsStatusInfoStruct.leadsConvertType)
        && Objects.equals(this.leadsIneffectReason, leadsStatusInfoStruct.leadsIneffectReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadsId, leadsConvertType, leadsIneffectReason);
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
