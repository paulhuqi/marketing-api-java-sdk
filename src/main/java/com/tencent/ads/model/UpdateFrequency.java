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

/** 更新频率 */
@JsonAdapter(UpdateFrequency.Adapter.class)
public enum UpdateFrequency {
  DAILY("UPDATE_DAILY"),

  WEEKLY("UPDATE_WEEKLY"),

  MULTI_WEEKLY("UPDATE_MULTI_WEEKLY"),

  ONE_WEEK("UPDATE_ONE_WEEK"),

  MULTI_FORTNIGHT("UPDATE_MULTI_FORTNIGHT"),

  MONTHLY("UPDATE_MONTHLY"),

  MULTI_MONTHLY("UPDATE_MULTI_MONTHLY"),

  RANDOM("UPDATE_RANDOM");

  private String value;

  UpdateFrequency(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UpdateFrequency fromValue(String text) {
    for (UpdateFrequency b : UpdateFrequency.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UpdateFrequency> {
    @Override
    public void write(final JsonWriter jsonWriter, final UpdateFrequency enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UpdateFrequency read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UpdateFrequency.fromValue(String.valueOf(value));
    }
  }
}
