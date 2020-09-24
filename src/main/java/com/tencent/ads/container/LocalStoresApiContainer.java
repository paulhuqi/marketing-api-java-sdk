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
import com.tencent.ads.api.LocalStoresApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.LocalStoresAddRequest;
import com.tencent.ads.model.LocalStoresAddResponse;
import com.tencent.ads.model.LocalStoresAddResponseData;
import com.tencent.ads.model.LocalStoresDeleteRequest;
import com.tencent.ads.model.LocalStoresDeleteResponse;
import com.tencent.ads.model.LocalStoresDeleteResponseData;
import com.tencent.ads.model.LocalStoresGetResponse;
import com.tencent.ads.model.LocalStoresGetResponseData;
import java.util.List;

public class LocalStoresApiContainer extends ApiContainer {

  @Inject LocalStoresApi api;

  /**
   * 批量录入门店
   *
   * @param data (required)
   * @return LocalStoresAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LocalStoresAddResponseData localStoresAdd(LocalStoresAddRequest data)
      throws ApiException, TencentAdsResponseException {
    LocalStoresAddResponse resp = api.localStoresAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 批量删除门店信息
   *
   * @param data (required)
   * @return LocalStoresDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LocalStoresDeleteResponseData localStoresDelete(LocalStoresDeleteRequest data)
      throws ApiException, TencentAdsResponseException {
    LocalStoresDeleteResponse resp = api.localStoresDelete(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 查询门店信息
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return LocalStoresGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LocalStoresGetResponseData localStoresGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    LocalStoresGetResponse resp = api.localStoresGet(accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
