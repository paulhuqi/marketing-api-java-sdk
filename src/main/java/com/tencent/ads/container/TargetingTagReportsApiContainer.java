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

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.TargetingTagReportsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.OrderByStruct;
import com.tencent.ads.model.ReportDateRange;
import com.tencent.ads.model.TargetingTagReportsGetResponse;
import com.tencent.ads.model.TargetingTagReportsGetResponseData;
import java.util.List;

public class TargetingTagReportsApiContainer extends ApiContainer {

  @Inject TargetingTagReportsApi api;

  /**
   * 获取定向标签报表
   *
   * @param accountId (required)
   * @param type (required)
   * @param level (required)
   * @param dateRange (required)
   * @param posType (optional)
   * @param filtering (optional)
   * @param groupBy (optional)
   * @param orderBy (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param timeLine (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return TargetingTagReportsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public TargetingTagReportsGetResponseData targetingTagReportsGet(
      Long accountId,
      String type,
      String level,
      ReportDateRange dateRange,
      String posType,
      List<FilteringStruct> filtering,
      List<String> groupBy,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      String timeLine,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    TargetingTagReportsGetResponse resp =
        api.targetingTagReportsGet(
            accountId, type, level, dateRange, posType, filtering, groupBy, orderBy, page, pageSize,
            timeLine, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
