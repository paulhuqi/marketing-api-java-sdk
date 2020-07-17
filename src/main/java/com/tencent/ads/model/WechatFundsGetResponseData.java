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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** WechatFundsGetResponseData */
public class WechatFundsGetResponseData {
  @SerializedName("list")
  private List<WechatFundsGetListStruct> list = null;

  @SerializedName("memo")
  private Memo memo = null;

  public WechatFundsGetResponseData list(List<WechatFundsGetListStruct> list) {
    this.list = list;
    return this;
  }

  public WechatFundsGetResponseData addListItem(WechatFundsGetListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<WechatFundsGetListStruct>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  @ApiModelProperty(value = "")
  public List<WechatFundsGetListStruct> getList() {
    return list;
  }

  public void setList(List<WechatFundsGetListStruct> list) {
    this.list = list;
  }

  public WechatFundsGetResponseData memo(Memo memo) {
    this.memo = memo;
    return this;
  }

  /**
   * Get memo
   *
   * @return memo
   */
  @ApiModelProperty(value = "")
  public Memo getMemo() {
    return memo;
  }

  public void setMemo(Memo memo) {
    this.memo = memo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatFundsGetResponseData wechatFundsGetResponseData = (WechatFundsGetResponseData) o;
    return Objects.equals(this.list, wechatFundsGetResponseData.list)
        && Objects.equals(this.memo, wechatFundsGetResponseData.memo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, memo);
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
