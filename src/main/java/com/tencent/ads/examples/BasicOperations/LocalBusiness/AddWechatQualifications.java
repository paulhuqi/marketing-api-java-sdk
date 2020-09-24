package com.tencent.ads.examples.BasicOperations.LocalBusiness;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.io.File;

public class AddWechatQualifications {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String wechatQualificationType = null;

  public File wechatQualificationFile = null;

  public String wechatQualificationFileSignature = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public WechatQualificationsAddResponseData addWechatQualifications() throws Exception {
    WechatQualificationsAddResponseData response =
        tencentAds
            .wechatQualifications()
            .wechatQualificationsAdd(
                accountId,
                wechatQualificationType,
                wechatQualificationFile,
                wechatQualificationFileSignature);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddWechatQualifications addWechatQualifications = new AddWechatQualifications();
      addWechatQualifications.init();
      WechatQualificationsAddResponseData response =
          addWechatQualifications.addWechatQualifications();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
