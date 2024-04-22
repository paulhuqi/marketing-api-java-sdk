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


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** 资产验真状态 */
@JsonAdapter(MarketingAssetVerificationStatus.Adapter.class)
public enum MarketingAssetVerificationStatus {
  UNKNOWN("MARKETING_ASSET_VERIFICATION_STATUS_UNKNOWN"),

  VERIFYING("MARKETING_ASSET_VERIFICATION_STATUS_VERIFYING"),

  CONSISTENT("MARKETING_ASSET_VERIFICATION_STATUS_CONSISTENT"),

  PART_CONSISTENT("MARKETING_ASSET_VERIFICATION_STATUS_PART_CONSISTENT"),

  INCONSISTENT("MARKETING_ASSET_VERIFICATION_STATUS_INCONSISTENT"),

  NO_VERIFY("MARKETING_ASSET_VERIFICATION_STATUS_NO_VERIFY"),

  FAILED("MARKETING_ASSET_VERIFICATION_STATUS_FAILED");

  private String value;

  MarketingAssetVerificationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MarketingAssetVerificationStatus fromValue(String text) {
    for (MarketingAssetVerificationStatus b : MarketingAssetVerificationStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MarketingAssetVerificationStatus> {
    @Override
    public void write(
        final JsonWriter jsonWriter, final MarketingAssetVerificationStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MarketingAssetVerificationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MarketingAssetVerificationStatus.fromValue(String.valueOf(value));
    }
  }
}