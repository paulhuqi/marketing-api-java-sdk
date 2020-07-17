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

/** 推广站点系统状态 */
@JsonAdapter(WebsiteStatus.Adapter.class)
public enum WebsiteStatus {
  NORMAL("WEBSITE_STATUS_NORMAL"),

  PENDING("WEBSITE_STATUS_PENDING"),

  DENIED("WEBSITE_STATUS_DENIED");

  private String value;

  WebsiteStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WebsiteStatus fromValue(String text) {
    for (WebsiteStatus b : WebsiteStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WebsiteStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final WebsiteStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WebsiteStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WebsiteStatus.fromValue(String.valueOf(value));
    }
  }
}
