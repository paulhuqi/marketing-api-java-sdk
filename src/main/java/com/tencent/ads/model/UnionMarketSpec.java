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

/** 厂商下载信息 */
@ApiModel(description = "厂商下载信息")
public class UnionMarketSpec {
  @SerializedName("union_market_jump_type")
  private UnionMarketJumpType unionMarketJumpType = null;

  public UnionMarketSpec unionMarketJumpType(UnionMarketJumpType unionMarketJumpType) {
    this.unionMarketJumpType = unionMarketJumpType;
    return this;
  }

  /**
   * Get unionMarketJumpType
   *
   * @return unionMarketJumpType
   */
  @ApiModelProperty(value = "")
  public UnionMarketJumpType getUnionMarketJumpType() {
    return unionMarketJumpType;
  }

  public void setUnionMarketJumpType(UnionMarketJumpType unionMarketJumpType) {
    this.unionMarketJumpType = unionMarketJumpType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnionMarketSpec unionMarketSpec = (UnionMarketSpec) o;
    return Objects.equals(this.unionMarketJumpType, unionMarketSpec.unionMarketJumpType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unionMarketJumpType);
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