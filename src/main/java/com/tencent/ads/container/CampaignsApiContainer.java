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
import com.tencent.ads.api.CampaignsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.CampaignsAddRequest;
import com.tencent.ads.model.CampaignsAddResponse;
import com.tencent.ads.model.CampaignsAddResponseData;
import com.tencent.ads.model.CampaignsDeleteRequest;
import com.tencent.ads.model.CampaignsDeleteResponse;
import com.tencent.ads.model.CampaignsDeleteResponseData;
import com.tencent.ads.model.CampaignsGetResponse;
import com.tencent.ads.model.CampaignsGetResponseData;
import com.tencent.ads.model.CampaignsUpdateConfiguredStatusRequest;
import com.tencent.ads.model.CampaignsUpdateConfiguredStatusResponse;
import com.tencent.ads.model.CampaignsUpdateConfiguredStatusResponseData;
import com.tencent.ads.model.CampaignsUpdateDailyBudgetRequest;
import com.tencent.ads.model.CampaignsUpdateDailyBudgetResponse;
import com.tencent.ads.model.CampaignsUpdateDailyBudgetResponseData;
import com.tencent.ads.model.CampaignsUpdateRequest;
import com.tencent.ads.model.CampaignsUpdateResponse;
import com.tencent.ads.model.CampaignsUpdateResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;

public class CampaignsApiContainer extends ApiContainer {

  @Inject CampaignsApi api;

  /**
   * 创建推广计划
   *
   * @param data (required)
   * @return CampaignsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CampaignsAddResponseData campaignsAdd(CampaignsAddRequest data)
      throws ApiException, TencentAdsResponseException {
    CampaignsAddResponse resp = api.campaignsAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除推广计划
   *
   * @param data (required)
   * @return CampaignsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CampaignsDeleteResponseData campaignsDelete(CampaignsDeleteRequest data)
      throws ApiException, TencentAdsResponseException {
    CampaignsDeleteResponse resp = api.campaignsDelete(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取推广计划
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CampaignsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CampaignsGetResponseData campaignsGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Boolean isDeleted,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    CampaignsGetResponse resp =
        api.campaignsGet(accountId, filtering, page, pageSize, isDeleted, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新推广计划
   *
   * @param data (required)
   * @return CampaignsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CampaignsUpdateResponseData campaignsUpdate(CampaignsUpdateRequest data)
      throws ApiException, TencentAdsResponseException {
    CampaignsUpdateResponse resp = api.campaignsUpdate(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新推广计划状态
   *
   * @param data (required)
   * @return CampaignsUpdateConfiguredStatusResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CampaignsUpdateConfiguredStatusResponseData campaignsUpdateConfiguredStatus(
      CampaignsUpdateConfiguredStatusRequest data)
      throws ApiException, TencentAdsResponseException {
    CampaignsUpdateConfiguredStatusResponse resp = api.campaignsUpdateConfiguredStatus(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新推广计划日限额信息
   *
   * @param data (required)
   * @return CampaignsUpdateDailyBudgetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CampaignsUpdateDailyBudgetResponseData campaignsUpdateDailyBudget(
      CampaignsUpdateDailyBudgetRequest data) throws ApiException, TencentAdsResponseException {
    CampaignsUpdateDailyBudgetResponse resp = api.campaignsUpdateDailyBudget(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
