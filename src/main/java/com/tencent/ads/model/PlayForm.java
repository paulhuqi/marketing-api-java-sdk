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

/** 播讲形式，作品展现形式，主要用于音频类作品 */
@JsonAdapter(PlayForm.Adapter.class)
public enum PlayForm {
  ONE("PLAY_FORM_BY_ONE"),

  TWO("PLAY_FORM_BY_TWO"),

  MULTI("PLAY_FORM_BY_MULTI");

  private String value;

  PlayForm(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlayForm fromValue(String text) {
    for (PlayForm b : PlayForm.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlayForm> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlayForm enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlayForm read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PlayForm.fromValue(String.valueOf(value));
    }
  }
}