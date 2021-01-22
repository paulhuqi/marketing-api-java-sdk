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

/** 渠道包状态 */
@JsonAdapter(PackageSysStatus.Adapter.class)
public enum PackageSysStatus {
  PENDING("CHANNEL_PACKAGE_STATUS_PENDING"),

  NORMAL("CHANNEL_PACKAGE_STATUS_NORMAL"),

  DENIED("CHANNEL_PACKAGE_STATUS_DENIED"),

  OFFLINE("CHANNEL_PACKAGE_STATUS_OFFLINE");

  private String value;

  PackageSysStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PackageSysStatus fromValue(String text) {
    for (PackageSysStatus b : PackageSysStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PackageSysStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PackageSysStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PackageSysStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PackageSysStatus.fromValue(String.valueOf(value));
    }
  }
}