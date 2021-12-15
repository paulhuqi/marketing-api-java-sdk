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

/** 书籍的连载状态 */
@JsonAdapter(SerialStatus.Adapter.class)
public enum SerialStatus {
  FINISH("SERIAL_STATUS_FINISH"),

  SERIALIZE("SERIAL_STATUS_SERIALIZE");

  private String value;

  SerialStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SerialStatus fromValue(String text) {
    for (SerialStatus b : SerialStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SerialStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SerialStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SerialStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SerialStatus.fromValue(String.valueOf(value));
    }
  }
}
