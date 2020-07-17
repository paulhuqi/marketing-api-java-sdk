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
import com.tencent.ads.api.DailyReportsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.DailyReportsGetResponse;
import com.tencent.ads.model.DailyReportsGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.OrderByStruct;
import com.tencent.ads.model.ReportDateRange;
import java.util.List;

public class DailyReportsApiContainer extends ApiContainer {

  @Inject DailyReportsApi api;

  /**
   * 获取日报表
   *
   * @param accountId (required)
   * @param level (required)
   * @param dateRange (required)
   * @param filtering (optional)
   * @param groupBy (optional)
   * @param orderBy (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param timeLine (optional)
   * @param fields (optional)
   * @return DailyReportsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DailyReportsGetResponseData dailyReportsGet(
      Long accountId,
      String level,
      ReportDateRange dateRange,
      List<FilteringStruct> filtering,
      List<String> groupBy,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      String timeLine,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    DailyReportsGetResponse resp =
        api.dailyReportsGet(
            accountId, level, dateRange, filtering, groupBy, orderBy, page, pageSize, timeLine,
            fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
