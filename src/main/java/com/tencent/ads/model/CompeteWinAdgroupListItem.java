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

/** 账户内部竞争激烈度列表节点 */
@ApiModel(description = "账户内部竞争激烈度列表节点")
public class CompeteWinAdgroupListItem {
  @SerializedName("rank")
  private Long rank = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("adgroup_name")
  private String adgroupName = null;

  public CompeteWinAdgroupListItem rank(Long rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Get rank
   *
   * @return rank
   */
  @ApiModelProperty(value = "")
  public Long getRank() {
    return rank;
  }

  public void setRank(Long rank) {
    this.rank = rank;
  }

  public CompeteWinAdgroupListItem adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public CompeteWinAdgroupListItem adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

  /**
   * Get adgroupName
   *
   * @return adgroupName
   */
  @ApiModelProperty(value = "")
  public String getAdgroupName() {
    return adgroupName;
  }

  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompeteWinAdgroupListItem competeWinAdgroupListItem = (CompeteWinAdgroupListItem) o;
    return Objects.equals(this.rank, competeWinAdgroupListItem.rank)
        && Objects.equals(this.adgroupId, competeWinAdgroupListItem.adgroupId)
        && Objects.equals(this.adgroupName, competeWinAdgroupListItem.adgroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, adgroupId, adgroupName);
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
