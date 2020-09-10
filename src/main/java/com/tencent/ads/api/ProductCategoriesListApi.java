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

package com.tencent.ads.api;

import com.google.gson.reflect.TypeToken;
import com.tencent.ads.ApiCallback;
import com.tencent.ads.ApiClient;
import com.tencent.ads.ApiException;
import com.tencent.ads.ApiResponse;
import com.tencent.ads.Configuration;
import com.tencent.ads.Pair;
import com.tencent.ads.ProgressRequestBody;
import com.tencent.ads.ProgressResponseBody;
import com.tencent.ads.model.ProductCategoriesListGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCategoriesListApi {
  private ApiClient apiClient;

  public ProductCategoriesListApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProductCategoriesListApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for productCategoriesListGet
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param page (required)
   * @param pageSize (required)
   * @param level (optional)
   * @param categoryId (optional)
   * @param categoryName (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call productCategoriesListGetCall(
      Long accountId,
      Long productCatalogId,
      Long page,
      Long pageSize,
      Long level,
      Long categoryId,
      String categoryName,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/product_categories_list/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (productCatalogId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("product_catalog_id", productCatalogId));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    if (level != null) localVarQueryParams.addAll(apiClient.parameterToPair("level", level));
    if (categoryId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("category_id", categoryId));
    if (categoryName != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("category_name", categoryName));
    if (fields != null)
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"text/plain"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
      apiClient
          .getHttpClient()
          .networkInterceptors()
          .add(
              new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(
                    com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                  com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                  return originalResponse
                      .newBuilder()
                      .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                      .build();
                }
              });
    }

    String[] localVarAuthNames = new String[] {"accessToken", "nonce", "timestamp"};
    return apiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call productCategoriesListGetValidateBeforeCall(
      Long accountId,
      Long productCatalogId,
      Long page,
      Long pageSize,
      Long level,
      Long categoryId,
      String categoryName,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling productCategoriesListGet(Async)");
    }

    // verify the required parameter 'productCatalogId' is set
    if (productCatalogId == null) {
      throw new ApiException(
          "Missing the required parameter 'productCatalogId' when calling productCategoriesListGet(Async)");
    }

    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(
          "Missing the required parameter 'page' when calling productCategoriesListGet(Async)");
    }

    // verify the required parameter 'pageSize' is set
    if (pageSize == null) {
      throw new ApiException(
          "Missing the required parameter 'pageSize' when calling productCategoriesListGet(Async)");
    }

    com.squareup.okhttp.Call call =
        productCategoriesListGetCall(
            accountId,
            productCatalogId,
            page,
            pageSize,
            level,
            categoryId,
            categoryName,
            fields,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 获取商品类目
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param page (required)
   * @param pageSize (required)
   * @param level (optional)
   * @param categoryId (optional)
   * @param categoryName (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ProductCategoriesListGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductCategoriesListGetResponse productCategoriesListGet(
      Long accountId,
      Long productCatalogId,
      Long page,
      Long pageSize,
      Long level,
      Long categoryId,
      String categoryName,
      List<String> fields)
      throws ApiException {
    ApiResponse<ProductCategoriesListGetResponse> resp =
        productCategoriesListGetWithHttpInfo(
            accountId, productCatalogId, page, pageSize, level, categoryId, categoryName, fields);
    return resp.getData();
  }

  /**
   * 获取商品类目
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param page (required)
   * @param pageSize (required)
   * @param level (optional)
   * @param categoryId (optional)
   * @param categoryName (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;ProductCategoriesListGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<ProductCategoriesListGetResponse> productCategoriesListGetWithHttpInfo(
      Long accountId,
      Long productCatalogId,
      Long page,
      Long pageSize,
      Long level,
      Long categoryId,
      String categoryName,
      List<String> fields)
      throws ApiException {
    com.squareup.okhttp.Call call =
        productCategoriesListGetValidateBeforeCall(
            accountId,
            productCatalogId,
            page,
            pageSize,
            level,
            categoryId,
            categoryName,
            fields,
            null,
            null);
    Type localVarReturnType = new TypeToken<ProductCategoriesListGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取商品类目 (asynchronously)
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param page (required)
   * @param pageSize (required)
   * @param level (optional)
   * @param categoryId (optional)
   * @param categoryName (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call productCategoriesListGetAsync(
      Long accountId,
      Long productCatalogId,
      Long page,
      Long pageSize,
      Long level,
      Long categoryId,
      String categoryName,
      List<String> fields,
      final ApiCallback<ProductCategoriesListGetResponse> callback)
      throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener =
          new ProgressResponseBody.ProgressListener() {
            @Override
            public void update(long bytesRead, long contentLength, boolean done) {
              callback.onDownloadProgress(bytesRead, contentLength, done);
            }
          };

      progressRequestListener =
          new ProgressRequestBody.ProgressRequestListener() {
            @Override
            public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
              callback.onUploadProgress(bytesWritten, contentLength, done);
            }
          };
    }

    com.squareup.okhttp.Call call =
        productCategoriesListGetValidateBeforeCall(
            accountId,
            productCatalogId,
            page,
            pageSize,
            level,
            categoryId,
            categoryName,
            fields,
            progressListener,
            progressRequestListener);
    Type localVarReturnType = new TypeToken<ProductCategoriesListGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
