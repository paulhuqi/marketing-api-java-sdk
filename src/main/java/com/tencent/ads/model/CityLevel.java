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

/** 城市级别，仅当 type&#x3D;REGION、BUSINESS_DISTRICT 时有效 */
@JsonAdapter(CityLevel.Adapter.class)
public enum CityLevel {
  FIRST("CITY_LEVEL_FIRST"),

  SECOND("CITY_LEVEL_SECOND"),

  THIRD("CITY_LEVEL_THIRD"),

  NONE("CITY_LEVEL_NONE");

  private String value;

  CityLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CityLevel fromValue(String text) {
    for (CityLevel b : CityLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CityLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final CityLevel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CityLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CityLevel.fromValue(String.valueOf(value));
    }
  }
}
