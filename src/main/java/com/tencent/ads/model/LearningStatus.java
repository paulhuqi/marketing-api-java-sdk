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

/** 学习状态 */
@JsonAdapter(LearningStatus.Adapter.class)
public enum LearningStatus {
  PROCESSING("LEARNING_STATUS_PROCESSING"),

  SUGGEST_CONTINUE("LEARNING_STATUS_SUGGEST_CONTINUE"),

  SUGGEST_STOP("LEARNING_STATUS_SUGGEST_STOP"),

  SUGGEST_IMPROVE("LEARNING_STATUS_SUGGEST_IMPROVE"),

  UNKNOWN("LEARNING_STATUS_UNKNOWN"),

  WIP("LEARNING_STATUS_WIP"),

  FINISHED("LEARNING_STATUS_FINISHED"),

  FAILED("LEARNING_STATUS_FAILED");

  private String value;

  LearningStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LearningStatus fromValue(String text) {
    for (LearningStatus b : LearningStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LearningStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LearningStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LearningStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LearningStatus.fromValue(String.valueOf(value));
    }
  }
}
