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
import com.tencent.ads.api.LabelsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.LabelsGetResponse;
import com.tencent.ads.model.LabelsGetResponseData;
import java.util.List;

public class LabelsApiContainer extends ApiContainer {

  @Inject LabelsApi api;

  /**
   * 标签广场标签获取
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return LabelsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LabelsGetResponseData labelsGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    LabelsGetResponse resp = api.labelsGet(accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
