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
import com.tencent.ads.api.DailyCostApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.DailyCostGetResponse;
import com.tencent.ads.model.DailyCostGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.ReportDateRange;
import java.util.List;

public class DailyCostApiContainer extends ApiContainer {

  @Inject DailyCostApi api;

  /**
   * 【待废弃，请使用新接口wechat_daily_cost/get】获取微信账户实时消耗
   *
   * @param dateRange (required)
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return DailyCostGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DailyCostGetResponseData dailyCostGet(
      ReportDateRange dateRange,
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    DailyCostGetResponse resp =
        api.dailyCostGet(dateRange, accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
