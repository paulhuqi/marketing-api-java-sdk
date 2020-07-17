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
import com.tencent.ads.api.CustomTagFilesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.CustomTagFilesAddResponse;
import com.tencent.ads.model.CustomTagFilesAddResponseData;
import com.tencent.ads.model.CustomTagFilesGetResponse;
import com.tencent.ads.model.CustomTagFilesGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.io.File;
import java.util.List;

public class CustomTagFilesApiContainer extends ApiContainer {

  @Inject CustomTagFilesApi api;

  /**
   * 上传客户标签人群数据文件
   *
   * @param accountId (required)
   * @param userIdType (required)
   * @param tagId (required)
   * @param file (required)
   * @param operationType (optional)
   * @param openAppId (optional)
   * @return CustomTagFilesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomTagFilesAddResponseData customTagFilesAdd(
      Long accountId,
      String userIdType,
      Long tagId,
      File file,
      String operationType,
      String openAppId)
      throws ApiException, TencentAdsResponseException {
    CustomTagFilesAddResponse resp =
        api.customTagFilesAdd(accountId, userIdType, tagId, file, operationType, openAppId);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取客户标签人群文件
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CustomTagFilesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomTagFilesGetResponseData customTagFilesGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    CustomTagFilesGetResponse resp =
        api.customTagFilesGet(accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
