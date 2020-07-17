package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetVideos {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = new ArrayList<>();

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "video_id",
          "width",
          "height",
          "video_frames",
          "video_fps",
          "video_codec",
          "video_bit_rate",
          "audio_codec",
          "audio_bit_rate",
          "file_size",
          "type",
          "signature",
          "system_status",
          "description",
          "preview_url",
          "created_time",
          "last_modified_time",
          "video_profile_name",
          "audio_sample_rate",
          "max_keyframe_interval",
          "min_keyframe_interval",
          "sample_aspect_ratio",
          "audio_profile_name",
          "scan_type",
          "image_duration_millisecond",
          "audio_duration_millisecond",
          "source_type");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    String field = "media_id";
    FilteringStruct filteringStruct = new FilteringStruct();
    filteringStruct.setField(field);
    String operator = "EQUALS";
    filteringStruct.setOperator(operator);
    List<String> values = Arrays.asList("YOUR VIDEO ID");
    filteringStruct.setValues(values);
    filtering.add(filteringStruct);
  }

  public VideosGetResponseData getVideos() throws Exception {
    VideosGetResponseData response =
        tencentAds.videos().videosGet(accountId, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetVideos getVideos = new GetVideos();
      getVideos.init();
      VideosGetResponseData response = getVideos.getVideos();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
