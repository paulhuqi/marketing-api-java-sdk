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

package com.tencent.ads;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.tencent.ads.container.*;
import com.tencent.ads.guice.GuiceModule;

public class App {

  @Inject AdDiagnosisApiContainer adDiagnosisApiContainer;
  @Inject AdcreativePreviewsApiContainer adcreativePreviewsApiContainer;
  @Inject AdcreativeTemplateDetailApiContainer adcreativeTemplateDetailApiContainer;
  @Inject AdcreativeTemplatePreviewApiContainer adcreativeTemplatePreviewApiContainer;
  @Inject AdcreativeTemplatePreviewsApiContainer adcreativeTemplatePreviewsApiContainer;
  @Inject AdcreativeTemplatesApiContainer adcreativeTemplatesApiContainer;
  @Inject AdcreativesApiContainer adcreativesApiContainer;
  @Inject AdcreativesRelatedCapabilityApiContainer adcreativesRelatedCapabilityApiContainer;
  @Inject AdgroupsApiContainer adgroupsApiContainer;
  @Inject AdsApiContainer adsApiContainer;
  @Inject AdvertiserApiContainer advertiserApiContainer;
  @Inject AndroidChannelPackagesApiContainer androidChannelPackagesApiContainer;
  @Inject AndroidUnionChannelPackagesApiContainer androidUnionChannelPackagesApiContainer;
  @Inject AssetPermissionsApiContainer assetPermissionsApiContainer;
  @Inject AsyncReportFilesApiContainer asyncReportFilesApiContainer;
  @Inject AsyncReportsApiContainer asyncReportsApiContainer;
  @Inject AsyncTaskFilesApiContainer asyncTaskFilesApiContainer;
  @Inject AsyncTasksApiContainer asyncTasksApiContainer;
  @Inject AudienceGrantRelationsApiContainer audienceGrantRelationsApiContainer;
  @Inject AuthorizationApiContainer authorizationApiContainer;
  @Inject BatchOperationApiContainer batchOperationApiContainer;
  @Inject BatchRequestsApiContainer batchRequestsApiContainer;
  @Inject BidSimulationApiContainer bidSimulationApiContainer;
  @Inject BrandApiContainer brandApiContainer;
  @Inject BusinessManagerRelationsApiContainer businessManagerRelationsApiContainer;
  @Inject CampaignsApiContainer campaignsApiContainer;
  @Inject CapabilitiesApiContainer capabilitiesApiContainer;
  @Inject ComplianceValidationApiContainer complianceValidationApiContainer;
  @Inject ConversionsApiContainer conversionsApiContainer;
  @Inject CustomAudienceEstimationsApiContainer customAudienceEstimationsApiContainer;
  @Inject CustomAudienceFilesApiContainer customAudienceFilesApiContainer;
  @Inject CustomAudienceInsightsApiContainer customAudienceInsightsApiContainer;
  @Inject CustomAudienceReportsApiContainer customAudienceReportsApiContainer;
  @Inject CustomAudiencesApiContainer customAudiencesApiContainer;
  @Inject CustomDataSaltApiContainer customDataSaltApiContainer;
  @Inject CustomFeaturesApiContainer customFeaturesApiContainer;
  @Inject CustomTagFilesApiContainer customTagFilesApiContainer;
  @Inject CustomTagsApiContainer customTagsApiContainer;
  @Inject DailyCostApiContainer dailyCostApiContainer;
  @Inject DailyReportsApiContainer dailyReportsApiContainer;
  @Inject DiagnosisApiContainer diagnosisApiContainer;
  @Inject DynamicAdImagesApiContainer dynamicAdImagesApiContainer;
  @Inject DynamicAdTemplatesApiContainer dynamicAdTemplatesApiContainer;
  @Inject DynamicAdVideoApiContainer dynamicAdVideoApiContainer;
  @Inject DynamicCreativesApiContainer dynamicCreativesApiContainer;
  @Inject EcommerceOrderApiContainer ecommerceOrderApiContainer;
  @Inject EstimationApiContainer estimationApiContainer;
  @Inject FundStatementsDailyApiContainer fundStatementsDailyApiContainer;
  @Inject FundStatementsDetailedApiContainer fundStatementsDetailedApiContainer;
  @Inject FundTransferApiContainer fundTransferApiContainer;
  @Inject FundsApiContainer fundsApiContainer;
  @Inject HourlyReportsApiContainer hourlyReportsApiContainer;
  @Inject ImageProcessingApiContainer imageProcessingApiContainer;
  @Inject ImagesApiContainer imagesApiContainer;
  @Inject LabelAudiencesApiContainer labelAudiencesApiContainer;
  @Inject LabelsApiContainer labelsApiContainer;
  @Inject LeadCluesApiContainer leadCluesApiContainer;
  @Inject LeadsApiContainer leadsApiContainer;
  @Inject LeadsFormApiContainer leadsFormApiContainer;
  @Inject LeadsFormListApiContainer leadsFormListApiContainer;
  @Inject LocalEndadsmanuallyApiContainer localEndadsmanuallyApiContainer;
  @Inject LocalEstimatedamountApiContainer localEstimatedamountApiContainer;
  @Inject LocalStoresApiContainer localStoresApiContainer;
  @Inject LocalStoresAddressParsingResultApiContainer localStoresAddressParsingResultApiContainer;
  @Inject LocalStoresSearchInfoApiContainer localStoresSearchInfoApiContainer;
  @Inject OauthApiContainer oauthApiContainer;
  @Inject OptimizationGoalPermissionsApiContainer optimizationGoalPermissionsApiContainer;
  @Inject PagesApiContainer pagesApiContainer;
  @Inject PlayablePagesApiContainer playablePagesApiContainer;
  @Inject ProductCatalogsApiContainer productCatalogsApiContainer;
  @Inject ProductCatalogsReportsApiContainer productCatalogsReportsApiContainer;
  @Inject ProductCategoriesListApiContainer productCategoriesListApiContainer;
  @Inject ProductItemsApiContainer productItemsApiContainer;
  @Inject ProductItemsDetailApiContainer productItemsDetailApiContainer;
  @Inject ProductsSystemStatusApiContainer productsSystemStatusApiContainer;
  @Inject ProfilesApiContainer profilesApiContainer;
  @Inject PromotedObjectsApiContainer promotedObjectsApiContainer;
  @Inject QualificationsApiContainer qualificationsApiContainer;
  @Inject RealtimeCostApiContainer realtimeCostApiContainer;
  @Inject SplitTestsApiContainer splitTestsApiContainer;
  @Inject SystemStatusApiContainer systemStatusApiContainer;
  @Inject TargetingTagReportsApiContainer targetingTagReportsApiContainer;
  @Inject TargetingTagsApiContainer targetingTagsApiContainer;
  @Inject TargetingsApiContainer targetingsApiContainer;
  @Inject TrackingReportsApiContainer trackingReportsApiContainer;
  @Inject UnionPositionPackagesApiContainer unionPositionPackagesApiContainer;
  @Inject UserActionSetReportsApiContainer userActionSetReportsApiContainer;
  @Inject UserActionSetsApiContainer userActionSetsApiContainer;
  @Inject UserActionsApiContainer userActionsApiContainer;
  @Inject UserPropertiesApiContainer userPropertiesApiContainer;
  @Inject UserPropertySetsApiContainer userPropertySetsApiContainer;
  @Inject VideosApiContainer videosApiContainer;
  @Inject WechatAdFollowersApiContainer wechatAdFollowersApiContainer;
  @Inject WechatAdLabelsApiContainer wechatAdLabelsApiContainer;
  @Inject WechatAdvertiserApiContainer wechatAdvertiserApiContainer;
  @Inject WechatAdvertiserDetailApiContainer wechatAdvertiserDetailApiContainer;
  @Inject WechatAdvertiserLocalBusinessApiContainer wechatAdvertiserLocalBusinessApiContainer;
  @Inject WechatAdvertiserSpecificationApiContainer wechatAdvertiserSpecificationApiContainer;
  @Inject WechatAgencyApiContainer wechatAgencyApiContainer;
  @Inject WechatDailyCostApiContainer wechatDailyCostApiContainer;
  @Inject WechatFundStatementsDetailedApiContainer wechatFundStatementsDetailedApiContainer;
  @Inject WechatFundTransferApiContainer wechatFundTransferApiContainer;
  @Inject WechatFundsApiContainer wechatFundsApiContainer;
  @Inject WechatLeadsApiContainer wechatLeadsApiContainer;
  @Inject WechatPagesApiContainer wechatPagesApiContainer;
  @Inject WechatQualificationsApiContainer wechatQualificationsApiContainer;
  @Inject XijingPageApiContainer xijingPageApiContainer;
  @Inject XijingPageByComponentsApiContainer xijingPageByComponentsApiContainer;
  @Inject XijingPageListApiContainer xijingPageListApiContainer;
  @Inject XijingTemplateApiContainer xijingTemplateApiContainer;

  public App() {
    Guice.createInjector(new GuiceModule()).injectMembers(this);
  }

  public AdDiagnosisApiContainer adDiagnosis() {
    return adDiagnosisApiContainer;
  }

  public AdcreativePreviewsApiContainer adcreativePreviews() {
    return adcreativePreviewsApiContainer;
  }

  public AdcreativeTemplateDetailApiContainer adcreativeTemplateDetail() {
    return adcreativeTemplateDetailApiContainer;
  }

  public AdcreativeTemplatePreviewApiContainer adcreativeTemplatePreview() {
    return adcreativeTemplatePreviewApiContainer;
  }

  public AdcreativeTemplatePreviewsApiContainer adcreativeTemplatePreviews() {
    return adcreativeTemplatePreviewsApiContainer;
  }

  public AdcreativeTemplatesApiContainer adcreativeTemplates() {
    return adcreativeTemplatesApiContainer;
  }

  public AdcreativesApiContainer adcreatives() {
    return adcreativesApiContainer;
  }

  public AdcreativesRelatedCapabilityApiContainer adcreativesRelatedCapability() {
    return adcreativesRelatedCapabilityApiContainer;
  }

  public AdgroupsApiContainer adgroups() {
    return adgroupsApiContainer;
  }

  public AdsApiContainer ads() {
    return adsApiContainer;
  }

  public AdvertiserApiContainer advertiser() {
    return advertiserApiContainer;
  }

  public AndroidChannelPackagesApiContainer androidChannelPackages() {
    return androidChannelPackagesApiContainer;
  }

  public AndroidUnionChannelPackagesApiContainer androidUnionChannelPackages() {
    return androidUnionChannelPackagesApiContainer;
  }

  public AssetPermissionsApiContainer assetPermissions() {
    return assetPermissionsApiContainer;
  }

  public AsyncReportFilesApiContainer asyncReportFiles() {
    return asyncReportFilesApiContainer;
  }

  public AsyncReportsApiContainer asyncReports() {
    return asyncReportsApiContainer;
  }

  public AsyncTaskFilesApiContainer asyncTaskFiles() {
    return asyncTaskFilesApiContainer;
  }

  public AsyncTasksApiContainer asyncTasks() {
    return asyncTasksApiContainer;
  }

  public AudienceGrantRelationsApiContainer audienceGrantRelations() {
    return audienceGrantRelationsApiContainer;
  }

  public AuthorizationApiContainer authorization() {
    return authorizationApiContainer;
  }

  public BatchOperationApiContainer batchOperation() {
    return batchOperationApiContainer;
  }

  public BatchRequestsApiContainer batchRequests() {
    return batchRequestsApiContainer;
  }

  public BidSimulationApiContainer bidSimulation() {
    return bidSimulationApiContainer;
  }

  public BrandApiContainer brand() {
    return brandApiContainer;
  }

  public BusinessManagerRelationsApiContainer businessManagerRelations() {
    return businessManagerRelationsApiContainer;
  }

  public CampaignsApiContainer campaigns() {
    return campaignsApiContainer;
  }

  public CapabilitiesApiContainer capabilities() {
    return capabilitiesApiContainer;
  }

  public ComplianceValidationApiContainer complianceValidation() {
    return complianceValidationApiContainer;
  }

  public ConversionsApiContainer conversions() {
    return conversionsApiContainer;
  }

  public CustomAudienceEstimationsApiContainer customAudienceEstimations() {
    return customAudienceEstimationsApiContainer;
  }

  public CustomAudienceFilesApiContainer customAudienceFiles() {
    return customAudienceFilesApiContainer;
  }

  public CustomAudienceInsightsApiContainer customAudienceInsights() {
    return customAudienceInsightsApiContainer;
  }

  public CustomAudienceReportsApiContainer customAudienceReports() {
    return customAudienceReportsApiContainer;
  }

  public CustomAudiencesApiContainer customAudiences() {
    return customAudiencesApiContainer;
  }

  public CustomDataSaltApiContainer customDataSalt() {
    return customDataSaltApiContainer;
  }

  public CustomFeaturesApiContainer customFeatures() {
    return customFeaturesApiContainer;
  }

  public CustomTagFilesApiContainer customTagFiles() {
    return customTagFilesApiContainer;
  }

  public CustomTagsApiContainer customTags() {
    return customTagsApiContainer;
  }

  public DailyCostApiContainer dailyCost() {
    return dailyCostApiContainer;
  }

  public DailyReportsApiContainer dailyReports() {
    return dailyReportsApiContainer;
  }

  public DiagnosisApiContainer diagnosis() {
    return diagnosisApiContainer;
  }

  public DynamicAdImagesApiContainer dynamicAdImages() {
    return dynamicAdImagesApiContainer;
  }

  public DynamicAdTemplatesApiContainer dynamicAdTemplates() {
    return dynamicAdTemplatesApiContainer;
  }

  public DynamicAdVideoApiContainer dynamicAdVideo() {
    return dynamicAdVideoApiContainer;
  }

  public DynamicCreativesApiContainer dynamicCreatives() {
    return dynamicCreativesApiContainer;
  }

  public EcommerceOrderApiContainer ecommerceOrder() {
    return ecommerceOrderApiContainer;
  }

  public EstimationApiContainer estimation() {
    return estimationApiContainer;
  }

  public FundStatementsDailyApiContainer fundStatementsDaily() {
    return fundStatementsDailyApiContainer;
  }

  public FundStatementsDetailedApiContainer fundStatementsDetailed() {
    return fundStatementsDetailedApiContainer;
  }

  public FundTransferApiContainer fundTransfer() {
    return fundTransferApiContainer;
  }

  public FundsApiContainer funds() {
    return fundsApiContainer;
  }

  public HourlyReportsApiContainer hourlyReports() {
    return hourlyReportsApiContainer;
  }

  public ImageProcessingApiContainer imageProcessing() {
    return imageProcessingApiContainer;
  }

  public ImagesApiContainer images() {
    return imagesApiContainer;
  }

  public LabelAudiencesApiContainer labelAudiences() {
    return labelAudiencesApiContainer;
  }

  public LabelsApiContainer labels() {
    return labelsApiContainer;
  }

  public LeadCluesApiContainer leadClues() {
    return leadCluesApiContainer;
  }

  public LeadsApiContainer leads() {
    return leadsApiContainer;
  }

  public LeadsFormApiContainer leadsForm() {
    return leadsFormApiContainer;
  }

  public LeadsFormListApiContainer leadsFormList() {
    return leadsFormListApiContainer;
  }

  public LocalEndadsmanuallyApiContainer localEndadsmanually() {
    return localEndadsmanuallyApiContainer;
  }

  public LocalEstimatedamountApiContainer localEstimatedamount() {
    return localEstimatedamountApiContainer;
  }

  public LocalStoresApiContainer localStores() {
    return localStoresApiContainer;
  }

  public LocalStoresAddressParsingResultApiContainer localStoresAddressParsingResult() {
    return localStoresAddressParsingResultApiContainer;
  }

  public LocalStoresSearchInfoApiContainer localStoresSearchInfo() {
    return localStoresSearchInfoApiContainer;
  }

  public OauthApiContainer oauth() {
    return oauthApiContainer;
  }

  public OptimizationGoalPermissionsApiContainer optimizationGoalPermissions() {
    return optimizationGoalPermissionsApiContainer;
  }

  public PagesApiContainer pages() {
    return pagesApiContainer;
  }

  public PlayablePagesApiContainer playablePages() {
    return playablePagesApiContainer;
  }

  public ProductCatalogsApiContainer productCatalogs() {
    return productCatalogsApiContainer;
  }

  public ProductCatalogsReportsApiContainer productCatalogsReports() {
    return productCatalogsReportsApiContainer;
  }

  public ProductCategoriesListApiContainer productCategoriesList() {
    return productCategoriesListApiContainer;
  }

  public ProductItemsApiContainer productItems() {
    return productItemsApiContainer;
  }

  public ProductItemsDetailApiContainer productItemsDetail() {
    return productItemsDetailApiContainer;
  }

  public ProductsSystemStatusApiContainer productsSystemStatus() {
    return productsSystemStatusApiContainer;
  }

  public ProfilesApiContainer profiles() {
    return profilesApiContainer;
  }

  public PromotedObjectsApiContainer promotedObjects() {
    return promotedObjectsApiContainer;
  }

  public QualificationsApiContainer qualifications() {
    return qualificationsApiContainer;
  }

  public RealtimeCostApiContainer realtimeCost() {
    return realtimeCostApiContainer;
  }

  public SplitTestsApiContainer splitTests() {
    return splitTestsApiContainer;
  }

  public SystemStatusApiContainer systemStatus() {
    return systemStatusApiContainer;
  }

  public TargetingTagReportsApiContainer targetingTagReports() {
    return targetingTagReportsApiContainer;
  }

  public TargetingTagsApiContainer targetingTags() {
    return targetingTagsApiContainer;
  }

  public TargetingsApiContainer targetings() {
    return targetingsApiContainer;
  }

  public TrackingReportsApiContainer trackingReports() {
    return trackingReportsApiContainer;
  }

  public UnionPositionPackagesApiContainer unionPositionPackages() {
    return unionPositionPackagesApiContainer;
  }

  public UserActionSetReportsApiContainer userActionSetReports() {
    return userActionSetReportsApiContainer;
  }

  public UserActionSetsApiContainer userActionSets() {
    return userActionSetsApiContainer;
  }

  public UserActionsApiContainer userActions() {
    return userActionsApiContainer;
  }

  public UserPropertiesApiContainer userProperties() {
    return userPropertiesApiContainer;
  }

  public UserPropertySetsApiContainer userPropertySets() {
    return userPropertySetsApiContainer;
  }

  public VideosApiContainer videos() {
    return videosApiContainer;
  }

  public WechatAdFollowersApiContainer wechatAdFollowers() {
    return wechatAdFollowersApiContainer;
  }

  public WechatAdLabelsApiContainer wechatAdLabels() {
    return wechatAdLabelsApiContainer;
  }

  public WechatAdvertiserApiContainer wechatAdvertiser() {
    return wechatAdvertiserApiContainer;
  }

  public WechatAdvertiserDetailApiContainer wechatAdvertiserDetail() {
    return wechatAdvertiserDetailApiContainer;
  }

  public WechatAdvertiserLocalBusinessApiContainer wechatAdvertiserLocalBusiness() {
    return wechatAdvertiserLocalBusinessApiContainer;
  }

  public WechatAdvertiserSpecificationApiContainer wechatAdvertiserSpecification() {
    return wechatAdvertiserSpecificationApiContainer;
  }

  public WechatAgencyApiContainer wechatAgency() {
    return wechatAgencyApiContainer;
  }

  public WechatDailyCostApiContainer wechatDailyCost() {
    return wechatDailyCostApiContainer;
  }

  public WechatFundStatementsDetailedApiContainer wechatFundStatementsDetailed() {
    return wechatFundStatementsDetailedApiContainer;
  }

  public WechatFundTransferApiContainer wechatFundTransfer() {
    return wechatFundTransferApiContainer;
  }

  public WechatFundsApiContainer wechatFunds() {
    return wechatFundsApiContainer;
  }

  public WechatLeadsApiContainer wechatLeads() {
    return wechatLeadsApiContainer;
  }

  public WechatPagesApiContainer wechatPages() {
    return wechatPagesApiContainer;
  }

  public WechatQualificationsApiContainer wechatQualifications() {
    return wechatQualificationsApiContainer;
  }

  public XijingPageApiContainer xijingPage() {
    return xijingPageApiContainer;
  }

  public XijingPageByComponentsApiContainer xijingPageByComponents() {
    return xijingPageByComponentsApiContainer;
  }

  public XijingPageListApiContainer xijingPageList() {
    return xijingPageListApiContainer;
  }

  public XijingTemplateApiContainer xijingTemplate() {
    return xijingTemplateApiContainer;
  }
}
