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

/** 标签绑定类型 */
@JsonAdapter(BindingType.Adapter.class)
public enum BindingType {
  OVERWRITE("LABEL_BINDING_TYPE_OVERWRITE"),

  ADD("LABEL_BINDING_TYPE_ADD"),

  DELETE("LABEL_BINDING_TYPE_DELETE");

  private String value;

  BindingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BindingType fromValue(String text) {
    for (BindingType b : BindingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BindingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BindingType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BindingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BindingType.fromValue(String.valueOf(value));
    }
  }
}