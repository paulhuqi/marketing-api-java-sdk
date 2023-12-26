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

/** 推广类容类型 */
@JsonAdapter(PromotedAssetType.Adapter.class)
public enum PromotedAssetType {
  UNKNOWN("PROMOTED_ASSET_TYPE_UNKNOWN"),

  APP_ANDROID("PROMOTED_ASSET_TYPE_APP_ANDROID"),

  APP_IOS("PROMOTED_ASSET_TYPE_APP_IOS"),

  WECHAT_OFFICIAL_ACCOUNT("PROMOTED_ASSET_TYPE_WECHAT_OFFICIAL_ACCOUNT"),

  EDUCATION("PROMOTED_ASSET_TYPE_EDUCATION"),

  TRAFFIC("PROMOTED_ASSET_TYPE_TRAFFIC"),

  HOUSE_PROPERTY("PROMOTED_ASSET_TYPE_HOUSE_PROPERTY"),

  TELECOM("PROMOTED_ASSET_TYPE_TELECOM"),

  MINIGAME("PROMOTED_ASSET_TYPE_MINIGAME"),

  CONSUMER_PRODUCT("PROMOTED_ASSET_TYPE_CONSUMER_PRODUCT"),

  WECHAT_CHANNELS("PROMOTED_ASSET_TYPE_WECHAT_CHANNELS"),

  WECHAT_CHANNELS_LIVE("PROMOTED_ASSET_TYPE_WECHAT_CHANNELS_LIVE"),

  WECHAT_CHANNELS_LIVE_RESERVATION("PROMOTED_ASSET_TYPE_WECHAT_CHANNELS_LIVE_RESERVATION"),

  MINI_PROGRAM_WECHAT("PROMOTED_ASSET_TYPE_MINI_PROGRAM_WECHAT"),

  APP_QUICK_APP("PROMOTED_ASSET_TYPE_APP_QUICK_APP"),

  CONSUME_MEDICAL("PROMOTED_ASSET_TYPE_CONSUME_MEDICAL"),

  COMPREHENSIVE_HOUSEKEEPING("PROMOTED_ASSET_TYPE_COMPREHENSIVE_HOUSEKEEPING");

  private String value;

  PromotedAssetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotedAssetType fromValue(String text) {
    for (PromotedAssetType b : PromotedAssetType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotedAssetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotedAssetType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotedAssetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotedAssetType.fromValue(String.valueOf(value));
    }
  }
}
