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

/** 转化创建来源 */
@JsonAdapter(CreateSourceType.Adapter.class)
public enum CreateSourceType {
  SELF_CREATED("SELF_CREATED"),

  PLATFORM("PLATFORM");

  private String value;

  CreateSourceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreateSourceType fromValue(String text) {
    for (CreateSourceType b : CreateSourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreateSourceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreateSourceType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreateSourceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreateSourceType.fromValue(String.valueOf(value));
    }
  }
}