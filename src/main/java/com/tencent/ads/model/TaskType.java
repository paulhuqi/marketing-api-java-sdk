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

  TASK_TYPE_PRODUCT_DAILY_DATA("TASK_TYPE_PRODUCT_DAILY_DATA"),

  TASK_TYPE_PRODUCT_ADGROUP_DATA("TASK_TYPE_PRODUCT_ADGROUP_DATA"),

  TASK_TYPE_PRODUCT_AD_DATA("TASK_TYPE_PRODUCT_AD_DATA"),

  TASK_TYPE_DOWNLOAD_OPERATION_LOG("TASK_TYPE_DOWNLOAD_OPERATION_LOG"),

  TASK_TYPE_BATCH_REQUEST("TASK_TYPE_BATCH_REQUEST"),

  TASK_TYPE_CLICK_FORWARDED_DATA("TASK_TYPE_CLICK_FORWARDED_DATA"),

  TASK_TYPE_UPDATE_UNION_POSITION_PACKAGE("TASK_TYPE_UPDATE_UNION_POSITION_PACKAGE"),

  TASK_TYPE_UPDATE_EXCLUDE_UNION_POSITION_PACKAGE(
      "TASK_TYPE_UPDATE_EXCLUDE_UNION_POSITION_PACKAGE"),

  TASK_TYPE_UPDATE_TARGETING_ID("TASK_TYPE_UPDATE_TARGETING_ID"),

  TASK_TYPE_UPDATE_BID_STRATEGY("TASK_TYPE_UPDATE_BID_STRATEGY"),

  TASK_TYPE_UPDATE_DEEP_CONVERSION_BEHAVIOR_BID("TASK_TYPE_UPDATE_DEEP_CONVERSION_BEHAVIOR_BID"),

  TASK_TYPE_CREATE_SCHEDULED_UPDATE_CAMPAIGN_DAILY_BUDGET(
      "TASK_TYPE_CREATE_SCHEDULED_UPDATE_CAMPAIGN_DAILY_BUDGET"),

  TASK_TYPE_CREATE_SCHEDULED_UPDATE_ADGROUP_DAILY_BUDGET(
      "TASK_TYPE_CREATE_SCHEDULED_UPDATE_ADGROUP_DAILY_BUDGET"),

  TASK_TYPE_DELETE_SCHEDULED_TASK("TASK_TYPE_DELETE_SCHEDULED_TASK"),

  TASK_TYPE_UPDATE_ADGROUP_APP_ANDROID_CHANNEL_PACKAGE_ID(
      "TASK_TYPE_UPDATE_ADGROUP_APP_ANDROID_CHANNEL_PACKAGE_ID"),

  TASK_TYPE_UPDATE_CAMPAIGN_SPEED_MODE("TASK_TYPE_UPDATE_CAMPAIGN_SPEED_MODE"),

  TASK_TYPE_DELETE_CAMPAIGN("TASK_TYPE_DELETE_CAMPAIGN"),

  TASK_TYPE_DELETE_ADGROUP("TASK_TYPE_DELETE_ADGROUP"),

  TASK_TYPE_DELETE_AD("TASK_TYPE_DELETE_AD"),

  TASK_TYPE_UPDATE_ADGROUP_DEEP_CONVERSION_WORTH_RATE(
      "TASK_TYPE_UPDATE_ADGROUP_DEEP_CONVERSION_WORTH_RATE"),

  TASK_TYPE_UPDATE_ADCREATIVE_DEEP_LINK_URL("TASK_TYPE_UPDATE_ADCREATIVE_DEEP_LINK_URL"),

  TASK_TYPE_TARGETINGS_SHARE("TASK_TYPE_TARGETINGS_SHARE"),

  TASK_TYPE_UPDATE_CAMPAIGN_CONFIGURED_STATUS("TASK_TYPE_UPDATE_CAMPAIGN_CONFIGURED_STATUS"),

  TASK_TYPE_UPDATE_CAMPAIGN_DAILY_BUDGET("TASK_TYPE_UPDATE_CAMPAIGN_DAILY_BUDGET"),

  TASK_TYPE_UPDATE_ADGROUP_CONFIGURED_STATUS("TASK_TYPE_UPDATE_ADGROUP_CONFIGURED_STATUS"),

  TASK_TYPE_UPDATE_ADGROUP_DAILY_BUDGET("TASK_TYPE_UPDATE_ADGROUP_DAILY_BUDGET"),

  TASK_TYPE_UPDATE_AD_CONFIGURED_STATUS("TASK_TYPE_UPDATE_AD_CONFIGURED_STATUS"),

  TASK_TYPE_UPDATE_ADGROUP_DATE("TASK_TYPE_UPDATE_ADGROUP_DATE"),

  TASK_TYPE_UPDATE_ADGROUP_BID_AMOUNT("TASK_TYPE_UPDATE_ADGROUP_BID_AMOUNT"),

  TASK_TYPE_UPDATE_ADGROUP_AUTO_ACQUISITION("TASK_TYPE_UPDATE_ADGROUP_AUTO_ACQUISITION"),

  TASK_TYPE_UPDATE_ADCREATIVE_LANDING_PAGE("TASK_TYPE_UPDATE_ADCREATIVE_LANDING_PAGE"),

  TASK_TYPE_UPDATE_ADGROUP_BIND_RTA_POLICY("TASK_TYPE_UPDATE_ADGROUP_BIND_RTA_POLICY"),

  TASK_TYPE_UPDATE_UNION_POSITION_PACKAGE_SUB_TASK(
      "TASK_TYPE_UPDATE_UNION_POSITION_PACKAGE_SUB_TASK"),

  TASK_TYPE_UPDATE_EXCLUDE_UNION_POSITION_PACKAGE_SUB_TASK(
      "TASK_TYPE_UPDATE_EXCLUDE_UNION_POSITION_PACKAGE_SUB_TASK"),

  TASK_TYPE_UPDATE_TARGETING_ID_SUB_TASK("TASK_TYPE_UPDATE_TARGETING_ID_SUB_TASK"),

  TASK_TYPE_UPDATE_BID_STRATEGY_SUB_TASK("TASK_TYPE_UPDATE_BID_STRATEGY_SUB_TASK"),

  TASK_TYPE_CREATE_SCHEDULED_UPDATE_CAMPAIGN_DAILY_BUDGET_SUB_TASK(
      "TASK_TYPE_CREATE_SCHEDULED_UPDATE_CAMPAIGN_DAILY_BUDGET_SUB_TASK"),

  TASK_TYPE_CREATE_SCHEDULED_UPDATE_ADGROUP_DAILY_BUDGET_SUB_TASK(
      "TASK_TYPE_CREATE_SCHEDULED_UPDATE_ADGROUP_DAILY_BUDGET_SUB_TASK"),

  TASK_TYPE_DELETE_SCHEDULED_TASK_SUB_TASK("TASK_TYPE_DELETE_SCHEDULED_TASK_SUB_TASK"),

  TASK_TYPE_UPDATE_ADGROUP_APP_ANDROID_CHANNEL_PACKAGE_ID_SUB_TASK(
      "TASK_TYPE_UPDATE_ADGROUP_APP_ANDROID_CHANNEL_PACKAGE_ID_SUB_TASK"),

  TASK_TYPE_UPDATE_CAMPAIGN_SPEED_MODE_SUB_TASK("TASK_TYPE_UPDATE_CAMPAIGN_SPEED_MODE_SUB_TASK"),

  TASK_TYPE_DELETE_CAMPAIGN_SUB_TASK("TASK_TYPE_DELETE_CAMPAIGN_SUB_TASK"),

  TASK_TYPE_DELETE_ADGROUP_SUB_TASK("TASK_TYPE_DELETE_ADGROUP_SUB_TASK"),

  TASK_TYPE_DELETE_AD_SUB_TASK("TASK_TYPE_DELETE_AD_SUB_TASK"),

  TASK_TYPE_UPDATE_ADGROUP_DEEP_CONVERSION_WORTH_RATE_SUB_TASK(
      "TASK_TYPE_UPDATE_ADGROUP_DEEP_CONVERSION_WORTH_RATE_SUB_TASK"),

  TASK_TYPE_UPDATE_ADCREATIVE_DEEP_LINK_URL_SUB_TASK(
      "TASK_TYPE_UPDATE_ADCREATIVE_DEEP_LINK_URL_SUB_TASK"),

  TASK_TYPE_TARGETINGS_SHARE_SUB_TASK("TASK_TYPE_TARGETINGS_SHARE_SUB_TASK"),

  TASK_TYPE_UPDATE_CAMPAIGN_CONFIGURED_STATUS_SUB_TASK(
      "TASK_TYPE_UPDATE_CAMPAIGN_CONFIGURED_STATUS_SUB_TASK"),

  TASK_TYPE_UPDATE_CAMPAIGN_DAILY_BUDGET_SUB_TASK(
      "TASK_TYPE_UPDATE_CAMPAIGN_DAILY_BUDGET_SUB_TASK"),

  TASK_TYPE_UPDATE_ADGROUP_CONFIGURED_STATUS_SUB_TASK(
      "TASK_TYPE_UPDATE_ADGROUP_CONFIGURED_STATUS_SUB_TASK"),

  TASK_TYPE_UPDATE_ADGROUP_DAILY_BUDGET_SUB_TASK("TASK_TYPE_UPDATE_ADGROUP_DAILY_BUDGET_SUB_TASK"),

  TASK_TYPE_UPDATE_AD_CONFIGURED_STATUS_SUB_TASK("TASK_TYPE_UPDATE_AD_CONFIGURED_STATUS_SUB_TASK"),

  TASK_TYPE_UPDATE_ADGROUP_DATE_SUB_TASK("TASK_TYPE_UPDATE_ADGROUP_DATE_SUB_TASK"),

  TASK_TYPE_UPDATE_ADGROUP_BID_AMOUNT_SUB_TASK("TASK_TYPE_UPDATE_ADGROUP_BID_AMOUNT_SUB_TASK"),

  TASK_TYPE_UPDATE_ADGROUP_AUTO_ACQUISITION_SUB_TASK(
      "TASK_TYPE_UPDATE_ADGROUP_AUTO_ACQUISITION_SUB_TASK"),

  TASK_TYPE_UPDATE_ADCREATIVE_LANDING_PAGE_SUB_TASK(
      "TASK_TYPE_UPDATE_ADCREATIVE_LANDING_PAGE_SUB_TASK"),

  TASK_TYPE_UPDATE_ADGROUP_BIND_RTA_POLICY_SUB_TASK(
      "TASK_TYPE_UPDATE_ADGROUP_BIND_RTA_POLICY_SUB_TASK"),

  TASK_TYPE_INVOICE_CONSUME("TASK_TYPE_INVOICE_CONSUME"),

  TASK_TYPE_AD_STATUS_CALC("TASK_TYPE_AD_STATUS_CALC"),

  TASK_TYPE_AUDIT_INVOICE_CONSUME("TASK_TYPE_AUDIT_INVOICE_CONSUME"),

  TASK_TYPE_AUTO_DERIVED_CREATIVE("TASK_TYPE_AUTO_DERIVED_CREATIVE"),

  TASK_TYPE_SCHEDULED_UPDATE_ADVERTISER_DAILY_BUDGET(
      "TASK_TYPE_SCHEDULED_UPDATE_ADVERTISER_DAILY_BUDGET"),

  TASK_TYPE_SCHEDULED_UPDATE_CAMPAIGN_DAILY_BUDGET(
      "TASK_TYPE_SCHEDULED_UPDATE_CAMPAIGN_DAILY_BUDGET"),

  TASK_TYPE_SCHEDULED_UPDATE_ADGROUP_DAILY_BUDGET(
      "TASK_TYPE_SCHEDULED_UPDATE_ADGROUP_DAILY_BUDGET"),

  TASK_TYPE_CHECK_EXPIRED("TASK_TYPE_CHECK_EXPIRED"),

  TASK_TYPE_UPDATE_DEEP_CONVERSION_BEHAVIOR_BID_SUB_TASK(
      "TASK_TYPE_UPDATE_DEEP_CONVERSION_BEHAVIOR_BID_SUB_TASK"),

  TASK_TYPE_REFRESH_CONTENT_TOKEN("TASK_TYPE_REFRESH_CONTENT_TOKEN"),

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
