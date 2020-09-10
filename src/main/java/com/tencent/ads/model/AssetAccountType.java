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


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** 被授权账号类型，素材授权功能目前白名单灰度中，若要使用可联系运营开通 */
@JsonAdapter(AssetAccountType.Adapter.class)
public enum AssetAccountType {
  ACCOUNT_BM("ASSET_TYPE_ACCOUNT_BM"),

  ACCOUNT_AGENCY("ASSET_TYPE_ACCOUNT_AGENCY"),

  ACCOUNT_MDM("ASSET_TYPE_ACCOUNT_MDM"),

  GROUP_BM("ASSET_TYPE_GROUP_BM"),

  GROUP_AGENCY("ASSET_TYPE_GROUP_AGENCY"),

  GROUP_MDM("ASSET_TYPE_GROUP_MDM"),

  GROUP_POINT_TO_POINT("ASSET_TYPE_GROUP_POINT_TO_POINT");

  private String value;

  AssetAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetAccountType fromValue(String text) {
    for (AssetAccountType b : AssetAccountType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AssetAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AssetAccountType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AssetAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AssetAccountType.fromValue(String.valueOf(value));
    }
  }
}
