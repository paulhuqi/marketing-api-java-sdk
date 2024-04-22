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

/** 审核状态 */
@JsonAdapter(CreativeComponentAuditStatus.Adapter.class)
public enum CreativeComponentAuditStatus {
  UNKNOWN("AUDIT_STATUS_UNKNOWN"),

  PENDING("AUDIT_STATUS_PENDING"),

  APPROVED("AUDIT_STATUS_APPROVED"),

  REJECTED("AUDIT_STATUS_REJECTED");

  private String value;

  CreativeComponentAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeComponentAuditStatus fromValue(String text) {
    for (CreativeComponentAuditStatus b : CreativeComponentAuditStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeComponentAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeComponentAuditStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeComponentAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeComponentAuditStatus.fromValue(String.valueOf(value));
    }
  }
}