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
import com.tencent.ads.api.XijingPageApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.XijingPageAddRequest;
import com.tencent.ads.model.XijingPageAddResponse;
import com.tencent.ads.model.XijingPageAddResponseData;
import com.tencent.ads.model.XijingPageDeleteRequest;
import com.tencent.ads.model.XijingPageDeleteResponse;
import com.tencent.ads.model.XijingPageDeleteResponseData;
import com.tencent.ads.model.XijingPageUpdateRequest;
import com.tencent.ads.model.XijingPageUpdateResponse;
import com.tencent.ads.model.XijingPageUpdateResponseData;

public class XijingPageApiContainer extends ApiContainer {

  @Inject XijingPageApi api;

  /**
   * 基于模板创建落地页
   *
   * @param data (required)
   * @return XijingPageAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingPageAddResponseData xijingPageAdd(XijingPageAddRequest data)
      throws ApiException, TencentAdsResponseException {
    XijingPageAddResponse resp = api.xijingPageAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 送审落地页
   *
   * @param data (required)
   * @return XijingPageDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingPageDeleteResponseData xijingPageDelete(XijingPageDeleteRequest data)
      throws ApiException, TencentAdsResponseException {
    XijingPageDeleteResponse resp = api.xijingPageDelete(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 送审落地页
   *
   * @param data (required)
   * @return XijingPageUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingPageUpdateResponseData xijingPageUpdate(XijingPageUpdateRequest data)
      throws ApiException, TencentAdsResponseException {
    XijingPageUpdateResponse resp = api.xijingPageUpdate(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
