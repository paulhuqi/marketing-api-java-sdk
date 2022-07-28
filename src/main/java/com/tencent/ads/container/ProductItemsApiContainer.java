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
import com.tencent.ads.api.ProductItemsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.ProductItemsAddRequest;
import com.tencent.ads.model.ProductItemsAddResponse;
import com.tencent.ads.model.ProductItemsAddResponseData;
import com.tencent.ads.model.ProductItemsBatchUpdateRequest;
import com.tencent.ads.model.ProductItemsBatchUpdateResponse;
import com.tencent.ads.model.ProductItemsGetResponse;
import com.tencent.ads.model.ProductItemsGetResponseData;
import com.tencent.ads.model.ProductItemsUpdateRequest;
import com.tencent.ads.model.ProductItemsUpdateResponse;
import java.util.List;

public class ProductItemsApiContainer extends ApiContainer {

  @Inject ProductItemsApi api;

  /**
   * 添加商品
   *
   * @param data (required)
   * @return ProductItemsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductItemsAddResponseData productItemsAdd(ProductItemsAddRequest data)
      throws ApiException, TencentAdsResponseException {
    ProductItemsAddResponse resp = api.productItemsAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 批量更新商品信息
   *
   * @param data (required)
   * @return ProductItemsBatchUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductItemsBatchUpdateResponse productItemsBatchUpdate(
      ProductItemsBatchUpdateRequest data) throws ApiException, TencentAdsResponseException {
    ProductItemsBatchUpdateResponse resp = api.productItemsBatchUpdate(data);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 获取商品
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param filtering (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ProductItemsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductItemsGetResponseData productItemsGet(
      Long accountId, Long productCatalogId, List<FilteringStruct> filtering, List<String> fields)
      throws ApiException, TencentAdsResponseException {
    ProductItemsGetResponse resp =
        api.productItemsGet(accountId, productCatalogId, filtering, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新商品信息
   *
   * @param data (required)
   * @return ProductItemsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductItemsUpdateResponse productItemsUpdate(ProductItemsUpdateRequest data)
      throws ApiException, TencentAdsResponseException {
    ProductItemsUpdateResponse resp = api.productItemsUpdate(data);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}
