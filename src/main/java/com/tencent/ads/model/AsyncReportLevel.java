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

/** 异步报表类型级别 */
@JsonAdapter(AsyncReportLevel.Adapter.class)
public enum AsyncReportLevel {
  ADGROUP_WECHAT("REPORT_LEVEL_ADGROUP_WECHAT"),

  AD_WECHAT("REPORT_LEVEL_AD_WECHAT"),

  POI_WECHAT("REPORT_LEVEL_POI_WECHAT"),

  AD("REPORT_LEVEL_AD"),

  ADVERTISER("REPORT_LEVEL_ADVERTISER"),

  CAMPAIGN("REPORT_LEVEL_CAMPAIGN"),

  ADGROUP("REPORT_LEVEL_ADGROUP"),

  MATERIAL_VIDEO("REPORT_LEVEL_MATERIAL_VIDEO"),

  MATERIAL_IMAGE("REPORT_LEVEL_MATERIAL_IMAGE"),

  PROMOTED_OBJECT("REPORT_LEVEL_PROMOTED_OBJECT"),

  CREATIVE_TEMPLATE("REPORT_LEVEL_CREATIVE_TEMPLATE"),

  PRODUCT_CATELOG("REPORT_LEVEL_PRODUCT_CATELOG"),

  AGE("REPORT_LEVEL_AGE"),

  GENDER("REPORT_LEVEL_GENDER"),

  REGION_RECENTLY_IN("REPORT_LEVEL_REGION_RECENTLY_IN"),

  REGION_VISITED_IN("REPORT_LEVEL_REGION_VISITED_IN"),

  REGION_LIVE_IN("REPORT_LEVEL_REGION_LIVE_IN"),

  REGION_TRAVEL_IN("REPORT_LEVEL_REGION_TRAVEL_IN"),

  CITY_RECENTLY_IN("REPORT_LEVEL_CITY_RECENTLY_IN"),

  CITY_VISITED_IN("REPORT_LEVEL_CITY_VISITED_IN"),

  CITY_LIVE_IN("REPORT_LEVEL_CITY_LIVE_IN"),

  CITY_TRAVEL_IN("REPORT_LEVEL_CITY_TRAVEL_IN");

  private String value;

  AsyncReportLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AsyncReportLevel fromValue(String text) {
    for (AsyncReportLevel b : AsyncReportLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AsyncReportLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final AsyncReportLevel enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AsyncReportLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AsyncReportLevel.fromValue(String.valueOf(value));
    }
  }
}
