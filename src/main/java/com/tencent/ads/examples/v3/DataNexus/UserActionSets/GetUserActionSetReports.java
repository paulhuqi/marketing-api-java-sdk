package com.tencent.ads.examples.v3.DataNexus.UserActionSets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.DateRangeDn;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class GetUserActionSetReports {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long userActionSetId = null;

  public DateRangeDn dateRange = new DateRangeDn();

  public String timeGranularity = "DAILY";

  public String aggregation = null;

  public List<String> fields =
      Arrays.asList(
          "date",
          "action_type",
          "custom_action",
          "raw_action_count",
          "identified_action_count",
          "identified_user_count");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    String startDate = "REPORT START DATE";
    dateRange.setStartDate(startDate);
    String endDate = "REPORT END DATE";
    dateRange.setEndDate(endDate);
  }

  public UserActionSetReportsGetResponseData getUserActionSetReports() throws Exception {
    UserActionSetReportsGetResponseData response =
        tencentAds
            .userActionSetReports()
            .userActionSetReportsGet(
                accountId, userActionSetId, dateRange, timeGranularity, aggregation, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetUserActionSetReports getUserActionSetReports = new GetUserActionSetReports();
      getUserActionSetReports.init();
      UserActionSetReportsGetResponseData response =
          getUserActionSetReports.getUserActionSetReports();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
