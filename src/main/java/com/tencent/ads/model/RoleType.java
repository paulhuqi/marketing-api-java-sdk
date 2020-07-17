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

/** 角色 */
@JsonAdapter(RoleType.Adapter.class)
public enum RoleType {
  UNKNOWN("ROLE_TYPE_UNKNOWN"),

  ADMIN("ROLE_TYPE_ADMIN"),

  OBSERVER("ROLE_TYPE_OBSERVER"),

  OPERATOR("ROLE_TYPE_OPERATOR"),

  TREASURER("ROLE_TYPE_TREASURER"),

  ASSISTANT("ROLE_TYPE_ASSISTANT"),

  SELF_OPERATOR("ROLE_TYPE_SELF_OPERATOR"),

  ROOT("ROLE_TYPE_ROOT"),

  AGENCY_BOSS("ROLE_TYPE_AGENCY_BOSS"),

  AGENCY_ADMIN("ROLE_TYPE_AGENCY_ADMIN"),

  AGENCY_OBSERVER("ROLE_TYPE_AGENCY_OBSERVER"),

  AGENCY_TREASURER("ROLE_TYPE_AGENCY_TREASURER"),

  AGENCY_OPERATOR("ROLE_TYPE_AGENCY_OPERATOR"),

  AGENCY_PROVIDER_OPERATOR("ROLE_TYPE_AGENCY_PROVIDER_OPERATOR"),

  AGENCY_PROVIDER_OBSERVER("ROLE_TYPE_AGENCY_PROVIDER_OBSERVER"),

  AGENCY_YYB("ROLE_TYPE_AGENCY_YYB"),

  AGENCY_AGENT_OPERATOR("ROLE_TYPE_AGENCY_AGENT_OPERATOR"),

  AGENCY_SELF_OPERATOR("ROLE_TYPE_AGENCY_SELF_OPERATOR"),

  AGENCY_MDM_BOSS("ROLE_TYPE_AGENCY_MDM_BOSS"),

  AGENCY_MDM_ADMIN("ROLE_TYPE_AGENCY_MDM_ADMIN"),

  AGENCY_MDM_TREASURER("ROLE_TYPE_AGENCY_MDM_TREASURER"),

  AGENCY_MDM_OBSERVER("ROLE_TYPE_AGENCY_MDM_OBSERVER"),

  AGENCY_MDM_OPERATOR("ROLE_TYPE_AGENCY_MDM_OPERATOR");

  private String value;

  RoleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RoleType fromValue(String text) {
    for (RoleType b : RoleType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RoleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RoleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RoleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RoleType.fromValue(String.valueOf(value));
    }
  }
}
