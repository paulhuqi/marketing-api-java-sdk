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

/** SplitTestsUpdateResponseData */
public class SplitTestsUpdateResponseData {
  @SerializedName("split_test_id")
  private Long splitTestId = null;

  public SplitTestsUpdateResponseData splitTestId(Long splitTestId) {
    this.splitTestId = splitTestId;
    return this;
  }

  /**
   * Get splitTestId
   *
   * @return splitTestId
   */
  @ApiModelProperty(value = "")
  public Long getSplitTestId() {
    return splitTestId;
  }

  public void setSplitTestId(Long splitTestId) {
    this.splitTestId = splitTestId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTestsUpdateResponseData splitTestsUpdateResponseData = (SplitTestsUpdateResponseData) o;
    return Objects.equals(this.splitTestId, splitTestsUpdateResponseData.splitTestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(splitTestId);
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
