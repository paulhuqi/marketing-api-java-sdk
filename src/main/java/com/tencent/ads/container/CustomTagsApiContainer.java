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
import com.tencent.ads.api.CustomTagsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.CustomTagsAddRequest;
import com.tencent.ads.model.CustomTagsAddResponse;
import com.tencent.ads.model.CustomTagsAddResponseData;
import com.tencent.ads.model.CustomTagsDeleteRequest;
import com.tencent.ads.model.CustomTagsDeleteResponse;
import com.tencent.ads.model.CustomTagsGetResponse;
import com.tencent.ads.model.CustomTagsGetResponseData;
import com.tencent.ads.model.CustomTagsUpdateRequest;
import com.tencent.ads.model.CustomTagsUpdateResponse;
import java.util.List;

public class CustomTagsApiContainer extends ApiContainer {

  @Inject CustomTagsApi api;

  /**
   * 创建客户标签
   *
   * @param data (required)
   * @return CustomTagsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomTagsAddResponseData customTagsAdd(CustomTagsAddRequest data)
      throws ApiException, TencentAdsResponseException {
    CustomTagsAddResponse resp = api.customTagsAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除客户标签
   *
   * @param data (required)
   * @return CustomTagsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomTagsDeleteResponse customTagsDelete(CustomTagsDeleteRequest data)
      throws ApiException, TencentAdsResponseException {
    CustomTagsDeleteResponse resp = api.customTagsDelete(data);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 获取客户标签
   *
   * @param accountId (required)
   * @param parentTagId 父节点Id，parent_tag_id，tag_code，tag_id只能有一个存在 (optional)
   * @param tagId 标签id，parent_tag_id，tag_code，tag_id只能有一个存在 (optional)
   * @param tagCode 广告主对标签在自己系统里的编码，parent_tag_id，tag_code，tag_id只能有一个存在 (optional)
   * @param platform 数据应用，不填写默认为DMP (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CustomTagsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomTagsGetResponseData customTagsGet(
      Long accountId,
      Long parentTagId,
      Long tagId,
      String tagCode,
      String platform,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    CustomTagsGetResponse resp =
        api.customTagsGet(accountId, parentTagId, tagId, tagCode, platform, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新客户标签
   *
   * @param data (required)
   * @return CustomTagsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomTagsUpdateResponse customTagsUpdate(CustomTagsUpdateRequest data)
      throws ApiException, TencentAdsResponseException {
    CustomTagsUpdateResponse resp = api.customTagsUpdate(data);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}
