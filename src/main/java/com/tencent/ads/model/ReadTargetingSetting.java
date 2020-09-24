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

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 定向详细设置 */
@ApiModel(description = "定向详细设置")
public class ReadTargetingSetting {
  @SerializedName("age")
  private List<AgeStruct> age = null;

  @SerializedName("gender")
  private List<String> gender = null;

  @SerializedName("education")
  private List<String> education = null;

  @SerializedName("marital_status")
  private List<String> maritalStatus = null;

  @SerializedName("working_status")
  private List<String> workingStatus = null;

  @SerializedName("geo_location")
  private GeoLocations geoLocation = null;

  @SerializedName("user_os")
  private List<String> userOs = null;

  @SerializedName("new_device")
  private List<String> newDevice = null;

  @SerializedName("device_price")
  private List<String> devicePrice = null;

  @SerializedName("device_brand_model")
  private DeviceBrandModel deviceBrandModel = null;

  @SerializedName("network_type")
  private List<String> networkType = null;

  @SerializedName("network_operator")
  private List<String> networkOperator = null;

  @SerializedName("network_scene")
  private List<String> networkScene = null;

  @SerializedName("dressing_index")
  private List<String> dressingIndex = null;

  @SerializedName("uv_index")
  private List<String> uvIndex = null;

  @SerializedName("makeup_index")
  private List<String> makeupIndex = null;

  @SerializedName("climate")
  private List<String> climate = null;

  @SerializedName("temperature")
  private List<TemperatureStruct> temperature = null;

  @SerializedName("air_quality_index")
  private List<String> airQualityIndex = null;

  @SerializedName("app_install_status")
  private List<String> appInstallStatus = null;

  @SerializedName("mini_game_qq_status")
  private List<String> miniGameQqStatus = null;

  @SerializedName("consumption_status")
  private List<String> consumptionStatus = null;

  @SerializedName("game_consumption_level")
  private List<String> gameConsumptionLevel = null;

  @SerializedName("residential_community_price")
  private List<ResidentialCommunityPriceStruct> residentialCommunityPrice = null;

  @SerializedName("financial_situation")
  private List<String> financialSituation = null;

  @SerializedName("consumption_type")
  private List<String> consumptionType = null;

  @SerializedName("wechat_ad_behavior")
  private WechatAdBehavior wechatAdBehavior = null;

  @SerializedName("custom_audience")
  private List<Long> customAudience = null;

  @SerializedName("excluded_custom_audience")
  private List<Long> excludedCustomAudience = null;

  @SerializedName("behavior_or_interest")
  private BehaviorOrInterest behaviorOrInterest = null;

  @SerializedName("wechat_official_account_category")
  private List<Long> wechatOfficialAccountCategory = null;

  @SerializedName("mobile_union_category")
  private List<Long> mobileUnionCategory = null;

  @SerializedName("business_interest")
  private List<Long> businessInterest = null;

  @SerializedName("keyword")
  private Keyword keyword = null;

  @SerializedName("app_behavior")
  private AppBehavior appBehavior = null;

  @SerializedName("paid_user")
  private List<String> paidUser = null;

  @SerializedName("deprecated_custom_audience")
  private List<Long> deprecatedCustomAudience = null;

  @SerializedName("deprecated_excluded_custom_audience")
  private List<Long> deprecatedExcludedCustomAudience = null;

  @SerializedName("deprecated_region")
  private List<Long> deprecatedRegion = null;

  public ReadTargetingSetting age(List<AgeStruct> age) {
    this.age = age;
    return this;
  }

  public ReadTargetingSetting addAgeItem(AgeStruct ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<AgeStruct>();
    }
    this.age.add(ageItem);
    return this;
  }

  /**
   * Get age
   *
   * @return age
   */
  @ApiModelProperty(value = "")
  public List<AgeStruct> getAge() {
    return age;
  }

  public void setAge(List<AgeStruct> age) {
    this.age = age;
  }

  public ReadTargetingSetting gender(List<String> gender) {
    this.gender = gender;
    return this;
  }

  public ReadTargetingSetting addGenderItem(String genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<String>();
    }
    this.gender.add(genderItem);
    return this;
  }

  /**
   * Get gender
   *
   * @return gender
   */
  @ApiModelProperty(value = "")
  public List<String> getGender() {
    return gender;
  }

  public void setGender(List<String> gender) {
    this.gender = gender;
  }

  public ReadTargetingSetting education(List<String> education) {
    this.education = education;
    return this;
  }

  public ReadTargetingSetting addEducationItem(String educationItem) {
    if (this.education == null) {
      this.education = new ArrayList<String>();
    }
    this.education.add(educationItem);
    return this;
  }

  /**
   * Get education
   *
   * @return education
   */
  @ApiModelProperty(value = "")
  public List<String> getEducation() {
    return education;
  }

  public void setEducation(List<String> education) {
    this.education = education;
  }

  public ReadTargetingSetting maritalStatus(List<String> maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  public ReadTargetingSetting addMaritalStatusItem(String maritalStatusItem) {
    if (this.maritalStatus == null) {
      this.maritalStatus = new ArrayList<String>();
    }
    this.maritalStatus.add(maritalStatusItem);
    return this;
  }

  /**
   * Get maritalStatus
   *
   * @return maritalStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(List<String> maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public ReadTargetingSetting workingStatus(List<String> workingStatus) {
    this.workingStatus = workingStatus;
    return this;
  }

  public ReadTargetingSetting addWorkingStatusItem(String workingStatusItem) {
    if (this.workingStatus == null) {
      this.workingStatus = new ArrayList<String>();
    }
    this.workingStatus.add(workingStatusItem);
    return this;
  }

  /**
   * Get workingStatus
   *
   * @return workingStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getWorkingStatus() {
    return workingStatus;
  }

  public void setWorkingStatus(List<String> workingStatus) {
    this.workingStatus = workingStatus;
  }

  public ReadTargetingSetting geoLocation(GeoLocations geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * Get geoLocation
   *
   * @return geoLocation
   */
  @ApiModelProperty(value = "")
  public GeoLocations getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(GeoLocations geoLocation) {
    this.geoLocation = geoLocation;
  }

  public ReadTargetingSetting userOs(List<String> userOs) {
    this.userOs = userOs;
    return this;
  }

  public ReadTargetingSetting addUserOsItem(String userOsItem) {
    if (this.userOs == null) {
      this.userOs = new ArrayList<String>();
    }
    this.userOs.add(userOsItem);
    return this;
  }

  /**
   * Get userOs
   *
   * @return userOs
   */
  @ApiModelProperty(value = "")
  public List<String> getUserOs() {
    return userOs;
  }

  public void setUserOs(List<String> userOs) {
    this.userOs = userOs;
  }

  public ReadTargetingSetting newDevice(List<String> newDevice) {
    this.newDevice = newDevice;
    return this;
  }

  public ReadTargetingSetting addNewDeviceItem(String newDeviceItem) {
    if (this.newDevice == null) {
      this.newDevice = new ArrayList<String>();
    }
    this.newDevice.add(newDeviceItem);
    return this;
  }

  /**
   * Get newDevice
   *
   * @return newDevice
   */
  @ApiModelProperty(value = "")
  public List<String> getNewDevice() {
    return newDevice;
  }

  public void setNewDevice(List<String> newDevice) {
    this.newDevice = newDevice;
  }

  public ReadTargetingSetting devicePrice(List<String> devicePrice) {
    this.devicePrice = devicePrice;
    return this;
  }

  public ReadTargetingSetting addDevicePriceItem(String devicePriceItem) {
    if (this.devicePrice == null) {
      this.devicePrice = new ArrayList<String>();
    }
    this.devicePrice.add(devicePriceItem);
    return this;
  }

  /**
   * Get devicePrice
   *
   * @return devicePrice
   */
  @ApiModelProperty(value = "")
  public List<String> getDevicePrice() {
    return devicePrice;
  }

  public void setDevicePrice(List<String> devicePrice) {
    this.devicePrice = devicePrice;
  }

  public ReadTargetingSetting deviceBrandModel(DeviceBrandModel deviceBrandModel) {
    this.deviceBrandModel = deviceBrandModel;
    return this;
  }

  /**
   * Get deviceBrandModel
   *
   * @return deviceBrandModel
   */
  @ApiModelProperty(value = "")
  public DeviceBrandModel getDeviceBrandModel() {
    return deviceBrandModel;
  }

  public void setDeviceBrandModel(DeviceBrandModel deviceBrandModel) {
    this.deviceBrandModel = deviceBrandModel;
  }

  public ReadTargetingSetting networkType(List<String> networkType) {
    this.networkType = networkType;
    return this;
  }

  public ReadTargetingSetting addNetworkTypeItem(String networkTypeItem) {
    if (this.networkType == null) {
      this.networkType = new ArrayList<String>();
    }
    this.networkType.add(networkTypeItem);
    return this;
  }

  /**
   * Get networkType
   *
   * @return networkType
   */
  @ApiModelProperty(value = "")
  public List<String> getNetworkType() {
    return networkType;
  }

  public void setNetworkType(List<String> networkType) {
    this.networkType = networkType;
  }

  public ReadTargetingSetting networkOperator(List<String> networkOperator) {
    this.networkOperator = networkOperator;
    return this;
  }

  public ReadTargetingSetting addNetworkOperatorItem(String networkOperatorItem) {
    if (this.networkOperator == null) {
      this.networkOperator = new ArrayList<String>();
    }
    this.networkOperator.add(networkOperatorItem);
    return this;
  }

  /**
   * Get networkOperator
   *
   * @return networkOperator
   */
  @ApiModelProperty(value = "")
  public List<String> getNetworkOperator() {
    return networkOperator;
  }

  public void setNetworkOperator(List<String> networkOperator) {
    this.networkOperator = networkOperator;
  }

  public ReadTargetingSetting networkScene(List<String> networkScene) {
    this.networkScene = networkScene;
    return this;
  }

  public ReadTargetingSetting addNetworkSceneItem(String networkSceneItem) {
    if (this.networkScene == null) {
      this.networkScene = new ArrayList<String>();
    }
    this.networkScene.add(networkSceneItem);
    return this;
  }

  /**
   * Get networkScene
   *
   * @return networkScene
   */
  @ApiModelProperty(value = "")
  public List<String> getNetworkScene() {
    return networkScene;
  }

  public void setNetworkScene(List<String> networkScene) {
    this.networkScene = networkScene;
  }

  public ReadTargetingSetting dressingIndex(List<String> dressingIndex) {
    this.dressingIndex = dressingIndex;
    return this;
  }

  public ReadTargetingSetting addDressingIndexItem(String dressingIndexItem) {
    if (this.dressingIndex == null) {
      this.dressingIndex = new ArrayList<String>();
    }
    this.dressingIndex.add(dressingIndexItem);
    return this;
  }

  /**
   * Get dressingIndex
   *
   * @return dressingIndex
   */
  @ApiModelProperty(value = "")
  public List<String> getDressingIndex() {
    return dressingIndex;
  }

  public void setDressingIndex(List<String> dressingIndex) {
    this.dressingIndex = dressingIndex;
  }

  public ReadTargetingSetting uvIndex(List<String> uvIndex) {
    this.uvIndex = uvIndex;
    return this;
  }

  public ReadTargetingSetting addUvIndexItem(String uvIndexItem) {
    if (this.uvIndex == null) {
      this.uvIndex = new ArrayList<String>();
    }
    this.uvIndex.add(uvIndexItem);
    return this;
  }

  /**
   * Get uvIndex
   *
   * @return uvIndex
   */
  @ApiModelProperty(value = "")
  public List<String> getUvIndex() {
    return uvIndex;
  }

  public void setUvIndex(List<String> uvIndex) {
    this.uvIndex = uvIndex;
  }

  public ReadTargetingSetting makeupIndex(List<String> makeupIndex) {
    this.makeupIndex = makeupIndex;
    return this;
  }

  public ReadTargetingSetting addMakeupIndexItem(String makeupIndexItem) {
    if (this.makeupIndex == null) {
      this.makeupIndex = new ArrayList<String>();
    }
    this.makeupIndex.add(makeupIndexItem);
    return this;
  }

  /**
   * Get makeupIndex
   *
   * @return makeupIndex
   */
  @ApiModelProperty(value = "")
  public List<String> getMakeupIndex() {
    return makeupIndex;
  }

  public void setMakeupIndex(List<String> makeupIndex) {
    this.makeupIndex = makeupIndex;
  }

  public ReadTargetingSetting climate(List<String> climate) {
    this.climate = climate;
    return this;
  }

  public ReadTargetingSetting addClimateItem(String climateItem) {
    if (this.climate == null) {
      this.climate = new ArrayList<String>();
    }
    this.climate.add(climateItem);
    return this;
  }

  /**
   * Get climate
   *
   * @return climate
   */
  @ApiModelProperty(value = "")
  public List<String> getClimate() {
    return climate;
  }

  public void setClimate(List<String> climate) {
    this.climate = climate;
  }

  public ReadTargetingSetting temperature(List<TemperatureStruct> temperature) {
    this.temperature = temperature;
    return this;
  }

  public ReadTargetingSetting addTemperatureItem(TemperatureStruct temperatureItem) {
    if (this.temperature == null) {
      this.temperature = new ArrayList<TemperatureStruct>();
    }
    this.temperature.add(temperatureItem);
    return this;
  }

  /**
   * Get temperature
   *
   * @return temperature
   */
  @ApiModelProperty(value = "")
  public List<TemperatureStruct> getTemperature() {
    return temperature;
  }

  public void setTemperature(List<TemperatureStruct> temperature) {
    this.temperature = temperature;
  }

  public ReadTargetingSetting airQualityIndex(List<String> airQualityIndex) {
    this.airQualityIndex = airQualityIndex;
    return this;
  }

  public ReadTargetingSetting addAirQualityIndexItem(String airQualityIndexItem) {
    if (this.airQualityIndex == null) {
      this.airQualityIndex = new ArrayList<String>();
    }
    this.airQualityIndex.add(airQualityIndexItem);
    return this;
  }

  /**
   * Get airQualityIndex
   *
   * @return airQualityIndex
   */
  @ApiModelProperty(value = "")
  public List<String> getAirQualityIndex() {
    return airQualityIndex;
  }

  public void setAirQualityIndex(List<String> airQualityIndex) {
    this.airQualityIndex = airQualityIndex;
  }

  public ReadTargetingSetting appInstallStatus(List<String> appInstallStatus) {
    this.appInstallStatus = appInstallStatus;
    return this;
  }

  public ReadTargetingSetting addAppInstallStatusItem(String appInstallStatusItem) {
    if (this.appInstallStatus == null) {
      this.appInstallStatus = new ArrayList<String>();
    }
    this.appInstallStatus.add(appInstallStatusItem);
    return this;
  }

  /**
   * Get appInstallStatus
   *
   * @return appInstallStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getAppInstallStatus() {
    return appInstallStatus;
  }

  public void setAppInstallStatus(List<String> appInstallStatus) {
    this.appInstallStatus = appInstallStatus;
  }

  public ReadTargetingSetting miniGameQqStatus(List<String> miniGameQqStatus) {
    this.miniGameQqStatus = miniGameQqStatus;
    return this;
  }

  public ReadTargetingSetting addMiniGameQqStatusItem(String miniGameQqStatusItem) {
    if (this.miniGameQqStatus == null) {
      this.miniGameQqStatus = new ArrayList<String>();
    }
    this.miniGameQqStatus.add(miniGameQqStatusItem);
    return this;
  }

  /**
   * Get miniGameQqStatus
   *
   * @return miniGameQqStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getMiniGameQqStatus() {
    return miniGameQqStatus;
  }

  public void setMiniGameQqStatus(List<String> miniGameQqStatus) {
    this.miniGameQqStatus = miniGameQqStatus;
  }

  public ReadTargetingSetting consumptionStatus(List<String> consumptionStatus) {
    this.consumptionStatus = consumptionStatus;
    return this;
  }

  public ReadTargetingSetting addConsumptionStatusItem(String consumptionStatusItem) {
    if (this.consumptionStatus == null) {
      this.consumptionStatus = new ArrayList<String>();
    }
    this.consumptionStatus.add(consumptionStatusItem);
    return this;
  }

  /**
   * Get consumptionStatus
   *
   * @return consumptionStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getConsumptionStatus() {
    return consumptionStatus;
  }

  public void setConsumptionStatus(List<String> consumptionStatus) {
    this.consumptionStatus = consumptionStatus;
  }

  public ReadTargetingSetting gameConsumptionLevel(List<String> gameConsumptionLevel) {
    this.gameConsumptionLevel = gameConsumptionLevel;
    return this;
  }

  public ReadTargetingSetting addGameConsumptionLevelItem(String gameConsumptionLevelItem) {
    if (this.gameConsumptionLevel == null) {
      this.gameConsumptionLevel = new ArrayList<String>();
    }
    this.gameConsumptionLevel.add(gameConsumptionLevelItem);
    return this;
  }

  /**
   * Get gameConsumptionLevel
   *
   * @return gameConsumptionLevel
   */
  @ApiModelProperty(value = "")
  public List<String> getGameConsumptionLevel() {
    return gameConsumptionLevel;
  }

  public void setGameConsumptionLevel(List<String> gameConsumptionLevel) {
    this.gameConsumptionLevel = gameConsumptionLevel;
  }

  public ReadTargetingSetting residentialCommunityPrice(
      List<ResidentialCommunityPriceStruct> residentialCommunityPrice) {
    this.residentialCommunityPrice = residentialCommunityPrice;
    return this;
  }

  public ReadTargetingSetting addResidentialCommunityPriceItem(
      ResidentialCommunityPriceStruct residentialCommunityPriceItem) {
    if (this.residentialCommunityPrice == null) {
      this.residentialCommunityPrice = new ArrayList<ResidentialCommunityPriceStruct>();
    }
    this.residentialCommunityPrice.add(residentialCommunityPriceItem);
    return this;
  }

  /**
   * Get residentialCommunityPrice
   *
   * @return residentialCommunityPrice
   */
  @ApiModelProperty(value = "")
  public List<ResidentialCommunityPriceStruct> getResidentialCommunityPrice() {
    return residentialCommunityPrice;
  }

  public void setResidentialCommunityPrice(
      List<ResidentialCommunityPriceStruct> residentialCommunityPrice) {
    this.residentialCommunityPrice = residentialCommunityPrice;
  }

  public ReadTargetingSetting financialSituation(List<String> financialSituation) {
    this.financialSituation = financialSituation;
    return this;
  }

  public ReadTargetingSetting addFinancialSituationItem(String financialSituationItem) {
    if (this.financialSituation == null) {
      this.financialSituation = new ArrayList<String>();
    }
    this.financialSituation.add(financialSituationItem);
    return this;
  }

  /**
   * Get financialSituation
   *
   * @return financialSituation
   */
  @ApiModelProperty(value = "")
  public List<String> getFinancialSituation() {
    return financialSituation;
  }

  public void setFinancialSituation(List<String> financialSituation) {
    this.financialSituation = financialSituation;
  }

  public ReadTargetingSetting consumptionType(List<String> consumptionType) {
    this.consumptionType = consumptionType;
    return this;
  }

  public ReadTargetingSetting addConsumptionTypeItem(String consumptionTypeItem) {
    if (this.consumptionType == null) {
      this.consumptionType = new ArrayList<String>();
    }
    this.consumptionType.add(consumptionTypeItem);
    return this;
  }

  /**
   * Get consumptionType
   *
   * @return consumptionType
   */
  @ApiModelProperty(value = "")
  public List<String> getConsumptionType() {
    return consumptionType;
  }

  public void setConsumptionType(List<String> consumptionType) {
    this.consumptionType = consumptionType;
  }

  public ReadTargetingSetting wechatAdBehavior(WechatAdBehavior wechatAdBehavior) {
    this.wechatAdBehavior = wechatAdBehavior;
    return this;
  }

  /**
   * Get wechatAdBehavior
   *
   * @return wechatAdBehavior
   */
  @ApiModelProperty(value = "")
  public WechatAdBehavior getWechatAdBehavior() {
    return wechatAdBehavior;
  }

  public void setWechatAdBehavior(WechatAdBehavior wechatAdBehavior) {
    this.wechatAdBehavior = wechatAdBehavior;
  }

  public ReadTargetingSetting customAudience(List<Long> customAudience) {
    this.customAudience = customAudience;
    return this;
  }

  public ReadTargetingSetting addCustomAudienceItem(Long customAudienceItem) {
    if (this.customAudience == null) {
      this.customAudience = new ArrayList<Long>();
    }
    this.customAudience.add(customAudienceItem);
    return this;
  }

  /**
   * Get customAudience
   *
   * @return customAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getCustomAudience() {
    return customAudience;
  }

  public void setCustomAudience(List<Long> customAudience) {
    this.customAudience = customAudience;
  }

  public ReadTargetingSetting excludedCustomAudience(List<Long> excludedCustomAudience) {
    this.excludedCustomAudience = excludedCustomAudience;
    return this;
  }

  public ReadTargetingSetting addExcludedCustomAudienceItem(Long excludedCustomAudienceItem) {
    if (this.excludedCustomAudience == null) {
      this.excludedCustomAudience = new ArrayList<Long>();
    }
    this.excludedCustomAudience.add(excludedCustomAudienceItem);
    return this;
  }

  /**
   * Get excludedCustomAudience
   *
   * @return excludedCustomAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getExcludedCustomAudience() {
    return excludedCustomAudience;
  }

  public void setExcludedCustomAudience(List<Long> excludedCustomAudience) {
    this.excludedCustomAudience = excludedCustomAudience;
  }

  public ReadTargetingSetting behaviorOrInterest(BehaviorOrInterest behaviorOrInterest) {
    this.behaviorOrInterest = behaviorOrInterest;
    return this;
  }

  /**
   * Get behaviorOrInterest
   *
   * @return behaviorOrInterest
   */
  @ApiModelProperty(value = "")
  public BehaviorOrInterest getBehaviorOrInterest() {
    return behaviorOrInterest;
  }

  public void setBehaviorOrInterest(BehaviorOrInterest behaviorOrInterest) {
    this.behaviorOrInterest = behaviorOrInterest;
  }

  public ReadTargetingSetting wechatOfficialAccountCategory(
      List<Long> wechatOfficialAccountCategory) {
    this.wechatOfficialAccountCategory = wechatOfficialAccountCategory;
    return this;
  }

  public ReadTargetingSetting addWechatOfficialAccountCategoryItem(
      Long wechatOfficialAccountCategoryItem) {
    if (this.wechatOfficialAccountCategory == null) {
      this.wechatOfficialAccountCategory = new ArrayList<Long>();
    }
    this.wechatOfficialAccountCategory.add(wechatOfficialAccountCategoryItem);
    return this;
  }

  /**
   * Get wechatOfficialAccountCategory
   *
   * @return wechatOfficialAccountCategory
   */
  @ApiModelProperty(value = "")
  public List<Long> getWechatOfficialAccountCategory() {
    return wechatOfficialAccountCategory;
  }

  public void setWechatOfficialAccountCategory(List<Long> wechatOfficialAccountCategory) {
    this.wechatOfficialAccountCategory = wechatOfficialAccountCategory;
  }

  public ReadTargetingSetting mobileUnionCategory(List<Long> mobileUnionCategory) {
    this.mobileUnionCategory = mobileUnionCategory;
    return this;
  }

  public ReadTargetingSetting addMobileUnionCategoryItem(Long mobileUnionCategoryItem) {
    if (this.mobileUnionCategory == null) {
      this.mobileUnionCategory = new ArrayList<Long>();
    }
    this.mobileUnionCategory.add(mobileUnionCategoryItem);
    return this;
  }

  /**
   * Get mobileUnionCategory
   *
   * @return mobileUnionCategory
   */
  @ApiModelProperty(value = "")
  public List<Long> getMobileUnionCategory() {
    return mobileUnionCategory;
  }

  public void setMobileUnionCategory(List<Long> mobileUnionCategory) {
    this.mobileUnionCategory = mobileUnionCategory;
  }

  public ReadTargetingSetting businessInterest(List<Long> businessInterest) {
    this.businessInterest = businessInterest;
    return this;
  }

  public ReadTargetingSetting addBusinessInterestItem(Long businessInterestItem) {
    if (this.businessInterest == null) {
      this.businessInterest = new ArrayList<Long>();
    }
    this.businessInterest.add(businessInterestItem);
    return this;
  }

  /**
   * Get businessInterest
   *
   * @return businessInterest
   */
  @ApiModelProperty(value = "")
  public List<Long> getBusinessInterest() {
    return businessInterest;
  }

  public void setBusinessInterest(List<Long> businessInterest) {
    this.businessInterest = businessInterest;
  }

  public ReadTargetingSetting keyword(Keyword keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Get keyword
   *
   * @return keyword
   */
  @ApiModelProperty(value = "")
  public Keyword getKeyword() {
    return keyword;
  }

  public void setKeyword(Keyword keyword) {
    this.keyword = keyword;
  }

  public ReadTargetingSetting appBehavior(AppBehavior appBehavior) {
    this.appBehavior = appBehavior;
    return this;
  }

  /**
   * Get appBehavior
   *
   * @return appBehavior
   */
  @ApiModelProperty(value = "")
  public AppBehavior getAppBehavior() {
    return appBehavior;
  }

  public void setAppBehavior(AppBehavior appBehavior) {
    this.appBehavior = appBehavior;
  }

  public ReadTargetingSetting paidUser(List<String> paidUser) {
    this.paidUser = paidUser;
    return this;
  }

  public ReadTargetingSetting addPaidUserItem(String paidUserItem) {
    if (this.paidUser == null) {
      this.paidUser = new ArrayList<String>();
    }
    this.paidUser.add(paidUserItem);
    return this;
  }

  /**
   * Get paidUser
   *
   * @return paidUser
   */
  @ApiModelProperty(value = "")
  public List<String> getPaidUser() {
    return paidUser;
  }

  public void setPaidUser(List<String> paidUser) {
    this.paidUser = paidUser;
  }

  public ReadTargetingSetting deprecatedCustomAudience(List<Long> deprecatedCustomAudience) {
    this.deprecatedCustomAudience = deprecatedCustomAudience;
    return this;
  }

  public ReadTargetingSetting addDeprecatedCustomAudienceItem(Long deprecatedCustomAudienceItem) {
    if (this.deprecatedCustomAudience == null) {
      this.deprecatedCustomAudience = new ArrayList<Long>();
    }
    this.deprecatedCustomAudience.add(deprecatedCustomAudienceItem);
    return this;
  }

  /**
   * Get deprecatedCustomAudience
   *
   * @return deprecatedCustomAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getDeprecatedCustomAudience() {
    return deprecatedCustomAudience;
  }

  public void setDeprecatedCustomAudience(List<Long> deprecatedCustomAudience) {
    this.deprecatedCustomAudience = deprecatedCustomAudience;
  }

  public ReadTargetingSetting deprecatedExcludedCustomAudience(
      List<Long> deprecatedExcludedCustomAudience) {
    this.deprecatedExcludedCustomAudience = deprecatedExcludedCustomAudience;
    return this;
  }

  public ReadTargetingSetting addDeprecatedExcludedCustomAudienceItem(
      Long deprecatedExcludedCustomAudienceItem) {
    if (this.deprecatedExcludedCustomAudience == null) {
      this.deprecatedExcludedCustomAudience = new ArrayList<Long>();
    }
    this.deprecatedExcludedCustomAudience.add(deprecatedExcludedCustomAudienceItem);
    return this;
  }

  /**
   * Get deprecatedExcludedCustomAudience
   *
   * @return deprecatedExcludedCustomAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getDeprecatedExcludedCustomAudience() {
    return deprecatedExcludedCustomAudience;
  }

  public void setDeprecatedExcludedCustomAudience(List<Long> deprecatedExcludedCustomAudience) {
    this.deprecatedExcludedCustomAudience = deprecatedExcludedCustomAudience;
  }

  public ReadTargetingSetting deprecatedRegion(List<Long> deprecatedRegion) {
    this.deprecatedRegion = deprecatedRegion;
    return this;
  }

  public ReadTargetingSetting addDeprecatedRegionItem(Long deprecatedRegionItem) {
    if (this.deprecatedRegion == null) {
      this.deprecatedRegion = new ArrayList<Long>();
    }
    this.deprecatedRegion.add(deprecatedRegionItem);
    return this;
  }

  /**
   * Get deprecatedRegion
   *
   * @return deprecatedRegion
   */
  @ApiModelProperty(value = "")
  public List<Long> getDeprecatedRegion() {
    return deprecatedRegion;
  }

  public void setDeprecatedRegion(List<Long> deprecatedRegion) {
    this.deprecatedRegion = deprecatedRegion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadTargetingSetting readTargetingSetting = (ReadTargetingSetting) o;
    return Objects.equals(this.age, readTargetingSetting.age)
        && Objects.equals(this.gender, readTargetingSetting.gender)
        && Objects.equals(this.education, readTargetingSetting.education)
        && Objects.equals(this.maritalStatus, readTargetingSetting.maritalStatus)
        && Objects.equals(this.workingStatus, readTargetingSetting.workingStatus)
        && Objects.equals(this.geoLocation, readTargetingSetting.geoLocation)
        && Objects.equals(this.userOs, readTargetingSetting.userOs)
        && Objects.equals(this.newDevice, readTargetingSetting.newDevice)
        && Objects.equals(this.devicePrice, readTargetingSetting.devicePrice)
        && Objects.equals(this.deviceBrandModel, readTargetingSetting.deviceBrandModel)
        && Objects.equals(this.networkType, readTargetingSetting.networkType)
        && Objects.equals(this.networkOperator, readTargetingSetting.networkOperator)
        && Objects.equals(this.networkScene, readTargetingSetting.networkScene)
        && Objects.equals(this.dressingIndex, readTargetingSetting.dressingIndex)
        && Objects.equals(this.uvIndex, readTargetingSetting.uvIndex)
        && Objects.equals(this.makeupIndex, readTargetingSetting.makeupIndex)
        && Objects.equals(this.climate, readTargetingSetting.climate)
        && Objects.equals(this.temperature, readTargetingSetting.temperature)
        && Objects.equals(this.airQualityIndex, readTargetingSetting.airQualityIndex)
        && Objects.equals(this.appInstallStatus, readTargetingSetting.appInstallStatus)
        && Objects.equals(this.miniGameQqStatus, readTargetingSetting.miniGameQqStatus)
        && Objects.equals(this.consumptionStatus, readTargetingSetting.consumptionStatus)
        && Objects.equals(this.gameConsumptionLevel, readTargetingSetting.gameConsumptionLevel)
        && Objects.equals(
            this.residentialCommunityPrice, readTargetingSetting.residentialCommunityPrice)
        && Objects.equals(this.financialSituation, readTargetingSetting.financialSituation)
        && Objects.equals(this.consumptionType, readTargetingSetting.consumptionType)
        && Objects.equals(this.wechatAdBehavior, readTargetingSetting.wechatAdBehavior)
        && Objects.equals(this.customAudience, readTargetingSetting.customAudience)
        && Objects.equals(this.excludedCustomAudience, readTargetingSetting.excludedCustomAudience)
        && Objects.equals(this.behaviorOrInterest, readTargetingSetting.behaviorOrInterest)
        && Objects.equals(
            this.wechatOfficialAccountCategory, readTargetingSetting.wechatOfficialAccountCategory)
        && Objects.equals(this.mobileUnionCategory, readTargetingSetting.mobileUnionCategory)
        && Objects.equals(this.businessInterest, readTargetingSetting.businessInterest)
        && Objects.equals(this.keyword, readTargetingSetting.keyword)
        && Objects.equals(this.appBehavior, readTargetingSetting.appBehavior)
        && Objects.equals(this.paidUser, readTargetingSetting.paidUser)
        && Objects.equals(
            this.deprecatedCustomAudience, readTargetingSetting.deprecatedCustomAudience)
        && Objects.equals(
            this.deprecatedExcludedCustomAudience,
            readTargetingSetting.deprecatedExcludedCustomAudience)
        && Objects.equals(this.deprecatedRegion, readTargetingSetting.deprecatedRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        age,
        gender,
        education,
        maritalStatus,
        workingStatus,
        geoLocation,
        userOs,
        newDevice,
        devicePrice,
        deviceBrandModel,
        networkType,
        networkOperator,
        networkScene,
        dressingIndex,
        uvIndex,
        makeupIndex,
        climate,
        temperature,
        airQualityIndex,
        appInstallStatus,
        miniGameQqStatus,
        consumptionStatus,
        gameConsumptionLevel,
        residentialCommunityPrice,
        financialSituation,
        consumptionType,
        wechatAdBehavior,
        customAudience,
        excludedCustomAudience,
        behaviorOrInterest,
        wechatOfficialAccountCategory,
        mobileUnionCategory,
        businessInterest,
        keyword,
        appBehavior,
        paidUser,
        deprecatedCustomAudience,
        deprecatedExcludedCustomAudience,
        deprecatedRegion);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
