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

/** 二级线索类型 */
@JsonAdapter(LeadsSubType.Adapter.class)
public enum LeadsSubType {
  FORM_SUBMIT__UNKNOWN("FORM_SUBMIT__UNKNOWN"),

  FORM_SUBMIT__FORM_SUBMIT("FORM_SUBMIT__FORM_SUBMIT"),

  FORM_SUBMIT__LEAVE_MESSAGE_CONSULT("FORM_SUBMIT__LEAVE_MESSAGE_CONSULT"),

  FORM_SUBMIT__LEAVE_INFORMATION_CONSULT("FORM_SUBMIT__LEAVE_INFORMATION_CONSULT"),

  FORM_SUBMIT__PHONE_CONSULT("FORM_SUBMIT__PHONE_CONSULT"),

  ONE_CLICK_AUTHORIZE__UNKNOWN("ONE_CLICK_AUTHORIZE__UNKNOWN"),

  ONE_CLICK_AUTHORIZE__FORM_SUBMIT("ONE_CLICK_AUTHORIZE__FORM_SUBMIT"),

  ONE_CLICK_AUTHORIZE__PHONE_CONSULT("ONE_CLICK_AUTHORIZE__PHONE_CONSULT"),

  ONE_CLICK_AUTHORIZE__CLICK_FORM("ONE_CLICK_AUTHORIZE__CLICK_FORM"),

  ONE_CLICK_AUTHORIZE__CLICK_CONSULT("ONE_CLICK_AUTHORIZE__CLICK_CONSULT"),

  ONE_CLICK_AUTHORIZE__CLICK_CALL("ONE_CLICK_AUTHORIZE__CLICK_CALL"),

  INTELLIGENT_TOOL__FIRST_TALK("INTELLIGENT_TOOL__FIRST_TALK"),

  INTELLIGENT_TOOL__LEAVE_INFORMATION("INTELLIGENT_TOOL__LEAVE_INFORMATION");

  private String value;

  LeadsSubType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LeadsSubType fromValue(String text) {
    for (LeadsSubType b : LeadsSubType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LeadsSubType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LeadsSubType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LeadsSubType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LeadsSubType.fromValue(String.valueOf(value));
    }
  }
}
