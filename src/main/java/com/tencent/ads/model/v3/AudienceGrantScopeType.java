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

/** 人群授权的范围 */
@JsonAdapter(AudienceGrantScopeType.Adapter.class)
public enum AudienceGrantScopeType {
  BUSINESS("GRANT_SCOPE_TYPE_BUSINESS"),

  ACCOUNT("GRANT_SCOPE_TYPE_ACCOUNT");

  private String value;

  AudienceGrantScopeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceGrantScopeType fromValue(String text) {
    for (AudienceGrantScopeType b : AudienceGrantScopeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudienceGrantScopeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudienceGrantScopeType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudienceGrantScopeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudienceGrantScopeType.fromValue(String.valueOf(value));
    }
  }
}