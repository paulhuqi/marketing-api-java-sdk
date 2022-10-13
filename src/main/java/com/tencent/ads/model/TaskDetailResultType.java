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

/** 任务详情每项执行结果类型 */
@JsonAdapter(TaskDetailResultType.Adapter.class)
public enum TaskDetailResultType {
  PENDING("TASK_DETAIL_RESULT_TYPE_PENDING"),

  FAIL("TASK_DETAIL_RESULT_TYPE_FAIL"),

  SUCCESS("TASK_DETAIL_RESULT_TYPE_SUCCESS"),

  SYSTEM_ERROR("TASK_DETAIL_RESULT_TYPE_SYSTEM_ERROR"),

  PROCESSING("TASK_DETAIL_RESULT_TYPE_PROCESSING");

  private String value;

  TaskDetailResultType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskDetailResultType fromValue(String text) {
    for (TaskDetailResultType b : TaskDetailResultType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TaskDetailResultType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskDetailResultType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaskDetailResultType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaskDetailResultType.fromValue(String.valueOf(value));
    }
  }
}
