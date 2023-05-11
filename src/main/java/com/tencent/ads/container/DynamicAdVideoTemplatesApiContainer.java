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
import com.tencent.ads.api.DynamicAdVideoTemplatesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.DynamicAdVideoTemplatesGetResponse;
import com.tencent.ads.model.DynamicAdVideoTemplatesGetResponseData;
import java.util.List;

public class DynamicAdVideoTemplatesApiContainer extends ApiContainer {

  @Inject DynamicAdVideoTemplatesApi api;

  /**
   * 获取动态商品视频模板
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param adcreativeTemplateId (required)
   * @param productMode (required)
   * @param supportChannel (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return DynamicAdVideoTemplatesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DynamicAdVideoTemplatesGetResponseData dynamicAdVideoTemplatesGet(
      Long accountId,
      Long productCatalogId,
      Long adcreativeTemplateId,
      String productMode,
      Boolean supportChannel,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    DynamicAdVideoTemplatesGetResponse resp =
        api.dynamicAdVideoTemplatesGet(
            accountId,
            productCatalogId,
            adcreativeTemplateId,
            productMode,
            supportChannel,
            page,
            pageSize,
            fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
