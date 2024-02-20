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

/** 获取报表类型级别 */
@JsonAdapter(ReportDailyLevel.Adapter.class)
public enum ReportDailyLevel {
  ADVERTISER("REPORT_LEVEL_ADVERTISER"),

  ADGROUP("REPORT_LEVEL_ADGROUP"),

  DYNAMIC_CREATIVE("REPORT_LEVEL_DYNAMIC_CREATIVE"),

  COMPONENT("REPORT_LEVEL_COMPONENT"),

  CHANNEL("REPORT_LEVEL_CHANNEL"),

  BIDWORD("REPORT_LEVEL_BIDWORD"),

  MATERIAL_IMAGE("REPORT_LEVEL_MATERIAL_IMAGE"),

  MATERIAL_VIDEO("REPORT_LEVEL_MATERIAL_VIDEO"),

  ADVERTISER_TOTAL("REPORT_LEVEL_ADVERTISER_TOTAL");

  private String value;

  ReportDailyLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportDailyLevel fromValue(String text) {
    for (ReportDailyLevel b : ReportDailyLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReportDailyLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportDailyLevel enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportDailyLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportDailyLevel.fromValue(String.valueOf(value));
    }
  }
}
