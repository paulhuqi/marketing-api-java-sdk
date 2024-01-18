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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** LocalStoresAddressParsingResultGetRequest */
public class LocalStoresAddressParsingResultGetRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("store_address_list")
  private List<String> storeAddressList = null;

  public LocalStoresAddressParsingResultGetRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public LocalStoresAddressParsingResultGetRequest storeAddressList(List<String> storeAddressList) {
    this.storeAddressList = storeAddressList;
    return this;
  }

  public LocalStoresAddressParsingResultGetRequest addStoreAddressListItem(
      String storeAddressListItem) {
    if (this.storeAddressList == null) {
      this.storeAddressList = new ArrayList<String>();
    }
    this.storeAddressList.add(storeAddressListItem);
    return this;
  }

  /**
   * Get storeAddressList
   *
   * @return storeAddressList
   */
  @ApiModelProperty(value = "")
  public List<String> getStoreAddressList() {
    return storeAddressList;
  }

  public void setStoreAddressList(List<String> storeAddressList) {
    this.storeAddressList = storeAddressList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalStoresAddressParsingResultGetRequest localStoresAddressParsingResultGetRequest =
        (LocalStoresAddressParsingResultGetRequest) o;
    return Objects.equals(this.accountId, localStoresAddressParsingResultGetRequest.accountId)
        && Objects.equals(
            this.storeAddressList, localStoresAddressParsingResultGetRequest.storeAddressList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, storeAddressList);
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