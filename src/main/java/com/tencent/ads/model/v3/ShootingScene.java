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

/** 拍摄场景 */
@JsonAdapter(ShootingScene.Adapter.class)
public enum ShootingScene {
  IN("SHOOTING_SCENE_IN"),

  OUT("SHOOTING_SCENE_OUT"),

  BOTH("SHOOTING_SCENE_BOTH");

  private String value;

  ShootingScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShootingScene fromValue(String text) {
    for (ShootingScene b : ShootingScene.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ShootingScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShootingScene enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShootingScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ShootingScene.fromValue(String.valueOf(value));
    }
  }
}
