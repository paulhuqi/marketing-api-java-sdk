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

/** 广告组在系统中的状态 */
@JsonAdapter(AdgroupSysStatus.Adapter.class)
public enum AdgroupSysStatus {
  NORMAL("AD_GROUP_STATUS_NORMAL"),

  PENDING("AD_GROUP_STATUS_PENDING"),

  DENIED("AD_GROUP_STATUS_DENIED"),

  FROZEN("AD_GROUP_STATUS_FROZEN"),

  PARTIALLY_PENDING("AD_GROUP_STATUS_PARTIALLY_PENDING"),

  PARTIALLY_NORMAL("AD_GROUP_STATUS_PARTIALLY_NORMAL"),

  PREPARE("AD_GROUP_STATUS_PREPARE"),

  DELETED("AD_GROUP_STATUS_DELETED"),

  INVALID("AD_GROUP_STATUS_INVALID"),

  TO_BE_STARTED("AD_GROUP_STATUS_TO_BE_STARTED"),

  ENDED("AD_GROUP_STATUS_ENDED");

  private String value;

  AdgroupSysStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdgroupSysStatus fromValue(String text) {
    for (AdgroupSysStatus b : AdgroupSysStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdgroupSysStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdgroupSysStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdgroupSysStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdgroupSysStatus.fromValue(String.valueOf(value));
    }
  }
}
