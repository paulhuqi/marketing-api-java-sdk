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

/** 线索用户类型 */
@JsonAdapter(LeadsUserType.Adapter.class)
public enum LeadsUserType {
  QQ("USER_TYPE_QQ"),

  QQ_MD5("USER_TYPE_QQ_MD5"),

  TEL("USER_TYPE_TEL"),

  TEL_MD5("USER_TYPE_TEL_MD5"),

  IDFA("USER_TYPE_IDFA"),

  IDFA_MD5("USER_TYPE_IDFA_MD5"),

  IMEI("USER_TYPE_IMEI"),

  IMEI_MD5("USER_TYPE_IMEI_MD5"),

  GDT_OPENID("USER_TYPE_GDT_OPENID"),

  MAC_ADDRESS("USER_TYPE_MAC_ADDRESS"),

  MAC_ADDRESS_MD5("USER_TYPE_MAC_ADDRESS_MD5"),

  OAID("USER_TYPE_OAID"),

  OAID_MD5("USER_TYPE_OAID_MD5"),

  WX_OPENID("USER_TYPE_WX_OPENID"),

  WX_UNIONID("USER_TYPE_WX_UNIONID"),

  OTHERS("USER_TYPE_OTHERS");

  private String value;

  LeadsUserType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LeadsUserType fromValue(String text) {
    for (LeadsUserType b : LeadsUserType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LeadsUserType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LeadsUserType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LeadsUserType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LeadsUserType.fromValue(String.valueOf(value));
    }
  }
}
