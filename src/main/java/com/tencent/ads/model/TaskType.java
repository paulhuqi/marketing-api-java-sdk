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

/** 任务类型（部分任务待废弃）具体请参考 */
@JsonAdapter(TaskType.Adapter.class)
public enum TaskType {
  TASK_TYPE_REPORT_AGENCY_ADVERTISER_HOURLY("TASK_TYPE_REPORT_AGENCY_ADVERTISER_HOURLY"),

  TASK_TYPE_TSA_IMEI("TASK_TYPE_TSA_IMEI"),

  TASK_TYPE_CREATIVE_PICTURE_REPORT("TASK_TYPE_CREATIVE_PICTURE_REPORT"),

  TASK_TYPE_AD_HOURLY_REPORT("TASK_TYPE_AD_HOURLY_REPORT"),

  TASK_TYPE_ADGROUP_HOURLY_REPORT("TASK_TYPE_ADGROUP_HOURLY_REPORT"),

  TASK_TYPE_WECHAT_MOMENTS_ADGROUP_HOURLY_REPORT("TASK_TYPE_WECHAT_MOMENTS_ADGROUP_HOURLY_REPORT"),

  TASK_TYPE_ADGROUP_DAILY_REPORT("TASK_TYPE_ADGROUP_DAILY_REPORT"),

  TASK_TYPE_INDUSTRY_CREATIVE_TEMPLATE_REPORT("TASK_TYPE_INDUSTRY_CREATIVE_TEMPLATE_REPORT"),

  TASK_TYPE_WECHAT_ADGROUP_HOURLY_REPORT("TASK_TYPE_WECHAT_ADGROUP_HOURLY_REPORT"),

  TASK_TYPE_WECHAT_ADGROUP_DAILY_REPORT("TASK_TYPE_WECHAT_ADGROUP_DAILY_REPORT"),

  TASK_TYPE_WECHAT_AD_HOURLY_REPORT("TASK_TYPE_WECHAT_AD_HOURLY_REPORT"),

  TASK_TYPE_WECHAT_AD_DAILY_REPORT("TASK_TYPE_WECHAT_AD_DAILY_REPORT"),

  TASK_TYPE_WECHAT_ADVERTISING_DATA("TASK_TYPE_WECHAT_ADVERTISING_DATA"),

  TASK_TYPE_POI_HOURLY_REPORT("TASK_TYPE_POI_HOURLY_REPORT"),

  TASK_TYPE_WECHAT_POI_HOURLY_REPORT("TASK_TYPE_WECHAT_POI_HOURLY_REPORT"),

  TASK_TYPE_ENCRYPTED_CUSTOM_IMEI("TASK_TYPE_ENCRYPTED_CUSTOM_IMEI"),

  TASK_TYPE_ENCRYPTED_TENCENT_IMEI("TASK_TYPE_ENCRYPTED_TENCENT_IMEI"),

  TASK_TYPE_CLEAR_TENCENT_IMEI("TASK_TYPE_CLEAR_TENCENT_IMEI"),

  TASK_TYPE_DEVICE_INFO("TASK_TYPE_DEVICE_INFO"),

  TASK_TYPE_REBATE_DETAIL("TASK_TYPE_REBATE_DETAIL"),

  TASK_TYPE_DEVICE_DETAIL_CPC("TASK_TYPE_DEVICE_DETAIL_CPC"),

  TASK_TYPE_OM_ADVERTISING_INFO("TASK_TYPE_OM_ADVERTISING_INFO"),

  TASK_TYPE_CREATE_ANDROID_CHANNEL_PACKAGE("TASK_TYPE_CREATE_ANDROID_CHANNEL_PACKAGE"),

  TASK_TYPE_UPDATE_ANDROID_CHANNEL_PACKAGE("TASK_TYPE_UPDATE_ANDROID_CHANNEL_PACKAGE"),

  TASK_TYPE_CREATE_ANDROID_UNION_CHANNEL_PACKAGE("TASK_TYPE_CREATE_ANDROID_UNION_CHANNEL_PACKAGE"),

  TASK_TYPE_UPDATE_ANDROID_UNION_CHANNEL_PACKAGE("TASK_TYPE_UPDATE_ANDROID_UNION_CHANNEL_PACKAGE"),

  TASK_TYPE_UNION_POSITION_REPORT("TASK_TYPE_UNION_POSITION_REPORT"),

  TASK_TYPE_UPDATE_ANDROID_UNION_CHANNEL_PACKAGE_BY_URL(
      "TASK_TYPE_UPDATE_ANDROID_UNION_CHANNEL_PACKAGE_BY_URL"),

  TASK_TYPE_BATCH_REQUEST("TASK_TYPE_BATCH_REQUEST"),

  TASK_TYPE_CLICK_FORWARDED_DATA("TASK_TYPE_CLICK_FORWARDED_DATA"),

  TASK_TYPE_UPDATE_UNION_POSITION_PACKAGE("TASK_TYPE_UPDATE_UNION_POSITION_PACKAGE"),

  TASK_TYPE_UPDATE_EXCLUDE_UNION_POSITION_PACKAGE(
      "TASK_TYPE_UPDATE_EXCLUDE_UNION_POSITION_PACKAGE"),

  TASK_TYPE_UPDATE_TARGETING_ID("TASK_TYPE_UPDATE_TARGETING_ID"),

  TASK_TYPE_UPDATE_BID_STRATEGY("TASK_TYPE_UPDATE_BID_STRATEGY"),

  TASK_TYPE_UPDATE_DEEP_CONVERSION_BEHAVIOR_BID("TASK_TYPE_UPDATE_DEEP_CONVERSION_BEHAVIOR_BID"),

  TASK_TYPE_UPDATE_UNION_POSITION_PACKAGE_SUB_TASK(
      "TASK_TYPE_UPDATE_UNION_POSITION_PACKAGE_SUB_TASK"),

  TASK_TYPE_UPDATE_EXCLUDE_UNION_POSITION_PACKAGE_SUB_TASK(
      "TASK_TYPE_UPDATE_EXCLUDE_UNION_POSITION_PACKAGE_SUB_TASK"),

  TASK_TYPE_UPDATE_TARGETING_ID_SUB_TASK("TASK_TYPE_UPDATE_TARGETING_ID_SUB_TASK"),

  TASK_TYPE_UPDATE_BID_STRATEGY_SUB_TASK("TASK_TYPE_UPDATE_BID_STRATEGY_SUB_TASK"),

  UNKNOWN("UNKNOWN");

  private String value;

  TaskType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskType fromValue(String text) {
    for (TaskType b : TaskType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TaskType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaskType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaskType.fromValue(String.valueOf(value));
    }
  }
}
