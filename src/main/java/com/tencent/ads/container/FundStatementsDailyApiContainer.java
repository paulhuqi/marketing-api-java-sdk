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
import com.tencent.ads.api.FundStatementsDailyApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.DateRange;
import com.tencent.ads.model.FundStatementsDailyGetResponse;
import com.tencent.ads.model.FundStatementsDailyGetResponseData;
import java.util.List;

public class FundStatementsDailyApiContainer extends ApiContainer {

  @Inject FundStatementsDailyApi api;

  /**
   * 获取资金账户日结明细
   *
   * @param accountId (required)
   * @param fundType (required)
   * @param dateRange (required)
   * @param tradeType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return FundStatementsDailyGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public FundStatementsDailyGetResponseData fundStatementsDailyGet(
      Long accountId, String fundType, DateRange dateRange, String tradeType, List<String> fields)
      throws ApiException, TencentAdsResponseException {
    FundStatementsDailyGetResponse resp =
        api.fundStatementsDailyGet(accountId, fundType, dateRange, tradeType, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
