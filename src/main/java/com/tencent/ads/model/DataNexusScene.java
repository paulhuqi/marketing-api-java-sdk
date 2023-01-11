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

/** 应用场景 */
@JsonAdapter(DataNexusScene.Adapter.class)
public enum DataNexusScene {
  DMP("DMP"),

  TRANSFORMATION_ATTRIBUTION("TRANSFORMATION_ATTRIBUTION"),

  PKAM("PKAM"),

  DPA("DPA");

  private String value;

  DataNexusScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DataNexusScene fromValue(String text) {
    for (DataNexusScene b : DataNexusScene.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DataNexusScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final DataNexusScene enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DataNexusScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DataNexusScene.fromValue(String.valueOf(value));
    }
  }
}
