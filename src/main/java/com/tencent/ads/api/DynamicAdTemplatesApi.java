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
import com.tencent.ads.model.DynamicAdTemplatesGetResponse;
import com.tencent.ads.model.FilteringStruct;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicAdTemplatesApi {
  private ApiClient apiClient;

  public DynamicAdTemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DynamicAdTemplatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for dynamicAdTemplatesGet
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param dynamicAdTemplateWidth (required)
   * @param dynamicAdTemplateHeight (required)
   * @param dynamicAdTemplateType (optional)
   * @param dynamicAdTemplateOwnershipType (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call dynamicAdTemplatesGetCall(
      Long accountId,
      Long productCatalogId,
      Long dynamicAdTemplateWidth,
      Long dynamicAdTemplateHeight,
      String dynamicAdTemplateType,
      String dynamicAdTemplateOwnershipType,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/dynamic_ad_templates/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (productCatalogId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("product_catalog_id", productCatalogId));
    if (dynamicAdTemplateType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("dynamic_ad_template_type", dynamicAdTemplateType));
    if (dynamicAdTemplateOwnershipType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair(
              "dynamic_ad_template_ownership_type", dynamicAdTemplateOwnershipType));
    if (dynamicAdTemplateWidth != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("dynamic_ad_template_width", dynamicAdTemplateWidth));
    if (dynamicAdTemplateHeight != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("dynamic_ad_template_height", dynamicAdTemplateHeight));
    if (filtering != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "filtering", filtering));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
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
  private com.squareup.okhttp.Call dynamicAdTemplatesGetValidateBeforeCall(
      Long accountId,
      Long productCatalogId,
      Long dynamicAdTemplateWidth,
      Long dynamicAdTemplateHeight,
      String dynamicAdTemplateType,
      String dynamicAdTemplateOwnershipType,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling dynamicAdTemplatesGet(Async)");
    }

    // verify the required parameter 'productCatalogId' is set
    if (productCatalogId == null) {
      throw new ApiException(
          "Missing the required parameter 'productCatalogId' when calling dynamicAdTemplatesGet(Async)");
    }

    // verify the required parameter 'dynamicAdTemplateWidth' is set
    if (dynamicAdTemplateWidth == null) {
      throw new ApiException(
          "Missing the required parameter 'dynamicAdTemplateWidth' when calling dynamicAdTemplatesGet(Async)");
    }

    // verify the required parameter 'dynamicAdTemplateHeight' is set
    if (dynamicAdTemplateHeight == null) {
      throw new ApiException(
          "Missing the required parameter 'dynamicAdTemplateHeight' when calling dynamicAdTemplatesGet(Async)");
    }

    com.squareup.okhttp.Call call =
        dynamicAdTemplatesGetCall(
            accountId,
            productCatalogId,
            dynamicAdTemplateWidth,
            dynamicAdTemplateHeight,
            dynamicAdTemplateType,
            dynamicAdTemplateOwnershipType,
            filtering,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 获取动态模板信息
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param dynamicAdTemplateWidth (required)
   * @param dynamicAdTemplateHeight (required)
   * @param dynamicAdTemplateType (optional)
   * @param dynamicAdTemplateOwnershipType (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return DynamicAdTemplatesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DynamicAdTemplatesGetResponse dynamicAdTemplatesGet(
      Long accountId,
      Long productCatalogId,
      Long dynamicAdTemplateWidth,
      Long dynamicAdTemplateHeight,
      String dynamicAdTemplateType,
      String dynamicAdTemplateOwnershipType,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException {
    ApiResponse<DynamicAdTemplatesGetResponse> resp =
        dynamicAdTemplatesGetWithHttpInfo(
            accountId,
            productCatalogId,
            dynamicAdTemplateWidth,
            dynamicAdTemplateHeight,
            dynamicAdTemplateType,
            dynamicAdTemplateOwnershipType,
            filtering,
            page,
            pageSize,
            fields);
    return resp.getData();
  }

  /**
   * 获取动态模板信息
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param dynamicAdTemplateWidth (required)
   * @param dynamicAdTemplateHeight (required)
   * @param dynamicAdTemplateType (optional)
   * @param dynamicAdTemplateOwnershipType (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;DynamicAdTemplatesGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<DynamicAdTemplatesGetResponse> dynamicAdTemplatesGetWithHttpInfo(
      Long accountId,
      Long productCatalogId,
      Long dynamicAdTemplateWidth,
      Long dynamicAdTemplateHeight,
      String dynamicAdTemplateType,
      String dynamicAdTemplateOwnershipType,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException {
    com.squareup.okhttp.Call call =
        dynamicAdTemplatesGetValidateBeforeCall(
            accountId,
            productCatalogId,
            dynamicAdTemplateWidth,
            dynamicAdTemplateHeight,
            dynamicAdTemplateType,
            dynamicAdTemplateOwnershipType,
            filtering,
            page,
            pageSize,
            fields,
            null,
            null);
    Type localVarReturnType = new TypeToken<DynamicAdTemplatesGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取动态模板信息 (asynchronously)
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param dynamicAdTemplateWidth (required)
   * @param dynamicAdTemplateHeight (required)
   * @param dynamicAdTemplateType (optional)
   * @param dynamicAdTemplateOwnershipType (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call dynamicAdTemplatesGetAsync(
      Long accountId,
      Long productCatalogId,
      Long dynamicAdTemplateWidth,
      Long dynamicAdTemplateHeight,
      String dynamicAdTemplateType,
      String dynamicAdTemplateOwnershipType,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      final ApiCallback<DynamicAdTemplatesGetResponse> callback)
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
        dynamicAdTemplatesGetValidateBeforeCall(
            accountId,
            productCatalogId,
            dynamicAdTemplateWidth,
            dynamicAdTemplateHeight,
            dynamicAdTemplateType,
            dynamicAdTemplateOwnershipType,
            filtering,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener);
    Type localVarReturnType = new TypeToken<DynamicAdTemplatesGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
