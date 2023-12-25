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

/** 悬浮按钮内组件类型 */
@JsonAdapter(CanvasFloatElementType.Adapter.class)
public enum CanvasFloatElementType {
  APP_DOWNLOAD("APP_DOWNLOAD"),

  WEAPP("WEAPP"),

  GH("GH"),

  ENTERPRISE_WX("ENTERPRISE_WX");

  private String value;

  CanvasFloatElementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CanvasFloatElementType fromValue(String text) {
    for (CanvasFloatElementType b : CanvasFloatElementType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CanvasFloatElementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CanvasFloatElementType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CanvasFloatElementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CanvasFloatElementType.fromValue(String.valueOf(value));
    }
  }
}