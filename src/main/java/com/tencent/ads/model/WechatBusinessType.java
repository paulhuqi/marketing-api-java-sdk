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

/** 经营性质类型 */
@JsonAdapter(WechatBusinessType.Adapter.class)
public enum WechatBusinessType {
  ONLINE_INCLUDE_THIRD_PARTY_MERCHANTS("ONLINE_INCLUDE_THIRD_PARTY_MERCHANTS"),

  ONLINE_EXCLUDE_THIRD_PARTY_MERCHANTS("ONLINE_EXCLUDE_THIRD_PARTY_MERCHANTS"),

  OFFLINE("OFFLINE");

  private String value;

  WechatBusinessType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WechatBusinessType fromValue(String text) {
    for (WechatBusinessType b : WechatBusinessType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WechatBusinessType> {
    @Override
    public void write(final JsonWriter jsonWriter, final WechatBusinessType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WechatBusinessType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WechatBusinessType.fromValue(String.valueOf(value));
    }
  }
}
