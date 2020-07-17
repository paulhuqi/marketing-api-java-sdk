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
import com.tencent.ads.api.WechatAdvertiserDetailApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.WechatAdvertiserDetailGetResponse;
import com.tencent.ads.model.WechatAdvertiserDetailGetResponseData;
import java.util.List;

public class WechatAdvertiserDetailApiContainer extends ApiContainer {

  @Inject WechatAdvertiserDetailApi api;

  /**
   * 【待废弃，请使用新接口wechat_advertiser_specification/get】查询微信公众平台广告主详情信息
   *
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return WechatAdvertiserDetailGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatAdvertiserDetailGetResponseData wechatAdvertiserDetailGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    WechatAdvertiserDetailGetResponse resp =
        api.wechatAdvertiserDetailGet(accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
