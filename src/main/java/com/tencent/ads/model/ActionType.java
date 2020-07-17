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

/** 标准行为类型，当值为 &#39;CUSTOM&#39; 时表示自定义行为类型 */
@JsonAdapter(ActionType.Adapter.class)
public enum ActionType {
  CUSTOM("CUSTOM"),

  REGISTER("REGISTER"),

  VIEW_CONTENT("VIEW_CONTENT"),

  CONSULT("CONSULT"),

  ADD_TO_CART("ADD_TO_CART"),

  PURCHASE("PURCHASE"),

  ACTIVATE_APP("ACTIVATE_APP"),

  SEARCH("SEARCH"),

  ADD_TO_WISHLIST("ADD_TO_WISHLIST"),

  INITIATE_CHECKOUT("INITIATE_CHECKOUT"),

  COMPLETE_ORDER("COMPLETE_ORDER"),

  START_APP("START_APP"),

  RATE("RATE"),

  PAGE_VIEW("PAGE_VIEW"),

  RESERVATION("RESERVATION"),

  SHARE("SHARE"),

  APPLY("APPLY"),

  CLAIM_OFFER("CLAIM_OFFER"),

  NAVIGATE("NAVIGATE"),

  PRODUCT_RECOMMEND("PRODUCT_RECOMMEND"),

  VISIT_STORE("VISIT_STORE"),

  TRY_OUT("TRY_OUT"),

  DELIVER("DELIVER"),

  SIGN_IN("SIGN_IN");

  private String value;

  ActionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActionType fromValue(String text) {
    for (ActionType b : ActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ActionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActionType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActionType.fromValue(String.valueOf(value));
    }
  }
}
