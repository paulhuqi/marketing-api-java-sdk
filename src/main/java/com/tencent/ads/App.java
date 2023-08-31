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

  @Inject AdAppealQuotaApiContainer adAppealQuotaApiContainer;
  @Inject AdDiagnosisApiContainer adDiagnosisApiContainer;
  @Inject AdLabelApiContainer adLabelApiContainer;
  @Inject AdParamApiContainer adParamApiContainer;
  @Inject AdcreativePreviewsApiContainer adcreativePreviewsApiContainer;
  @Inject AdcreativePreviewsQrcodeApiContainer adcreativePreviewsQrcodeApiContainer;
  @Inject AdcreativeTemplateApiContainer adcreativeTemplateApiContainer;
  @Inject AdcreativeTemplateDetailApiContainer adcreativeTemplateDetailApiContainer;
  @Inject AdcreativeTemplateListApiContainer adcreativeTemplateListApiContainer;
  @Inject AdcreativeTemplatePreviewApiContainer adcreativeTemplatePreviewApiContainer;
  @Inject AdcreativeTemplatePreviewsApiContainer adcreativeTemplatePreviewsApiContainer;
  @Inject AdcreativeTemplatesApiContainer adcreativeTemplatesApiContainer;
  @Inject AdcreativesApiContainer adcreativesApiContainer;
  @Inject AdcreativesRelatedCapabilityApiContainer adcreativesRelatedCapabilityApiContainer;
  @Inject AdgroupNegativewordsApiContainer adgroupNegativewordsApiContainer;
  @Inject AdgroupsApiContainer adgroupsApiContainer;
  @Inject AdqReportsUpgradeStatusApiContainer adqReportsUpgradeStatusApiContainer;
  @Inject AdsApiContainer adsApiContainer;
  @Inject AdvertiserApiContainer advertiserApiContainer;
  @Inject AdvertiserDailyBudgetApiContainer advertiserDailyBudgetApiContainer;
  @Inject AgencyInnerTransferApiContainer agencyInnerTransferApiContainer;
  @Inject AgencyRealtimeCostApiContainer agencyRealtimeCostApiContainer;
  @Inject AppAndroidChannelPackagesApiContainer appAndroidChannelPackagesApiContainer;
  @Inject AssetPermissionsApiContainer assetPermissionsApiContainer;
  @Inject AssetPermissionsScenesApiContainer assetPermissionsScenesApiContainer;
  @Inject AssetPrePermissionsApiContainer assetPrePermissionsApiContainer;
  @Inject AsyncReportFilesApiContainer asyncReportFilesApiContainer;
  @Inject AsyncReportsApiContainer asyncReportsApiContainer;
  @Inject AsyncTaskFilesApiContainer asyncTaskFilesApiContainer;
  @Inject AsyncTasksApiContainer asyncTasksApiContainer;
  @Inject AudienceGrantRelationsApiContainer audienceGrantRelationsApiContainer;
  @Inject AuthorizationApiContainer authorizationApiContainer;
  @Inject BarrageApiContainer barrageApiContainer;
  @Inject BarrageRecommendApiContainer barrageRecommendApiContainer;
  @Inject BatchAsyncRequestSpecificationApiContainer batchAsyncRequestSpecificationApiContainer;
  @Inject BatchAsyncRequestsApiContainer batchAsyncRequestsApiContainer;
  @Inject BatchOperationApiContainer batchOperationApiContainer;
  @Inject BatchRequestsApiContainer batchRequestsApiContainer;
  @Inject BidSimulationApiContainer bidSimulationApiContainer;
  @Inject BidwordApiContainer bidwordApiContainer;
  @Inject BidwordFlowApiContainer bidwordFlowApiContainer;
  @Inject BidwordRptApiContainer bidwordRptApiContainer;
  @Inject BrandApiContainer brandApiContainer;
  @Inject BusinessManagerRelationsApiContainer businessManagerRelationsApiContainer;
  @Inject BusinessMdmAccountRelationsApiContainer businessMdmAccountRelationsApiContainer;
  @Inject BusinessPointApiContainer businessPointApiContainer;
  @Inject CampaignNegativewordsApiContainer campaignNegativewordsApiContainer;
  @Inject CampaignsApiContainer campaignsApiContainer;
  @Inject CapabilitiesApiContainer capabilitiesApiContainer;
  @Inject ComplianceValidationApiContainer complianceValidationApiContainer;
  @Inject ConversionsApiContainer conversionsApiContainer;
  @Inject CreativeComponentsApiContainer creativeComponentsApiContainer;
  @Inject CreativeSampleProductsApiContainer creativeSampleProductsApiContainer;
  @Inject CreativetoolsTextApiContainer creativetoolsTextApiContainer;
  @Inject CustomAudienceEstimationsApiContainer customAudienceEstimationsApiContainer;
  @Inject CustomAudienceFilesApiContainer customAudienceFilesApiContainer;
  @Inject CustomAudienceInsightsApiContainer customAudienceInsightsApiContainer;
  @Inject CustomAudienceReportsApiContainer customAudienceReportsApiContainer;
  @Inject CustomAudiencesApiContainer customAudiencesApiContainer;
  @Inject CustomFeaturesApiContainer customFeaturesApiContainer;
  @Inject CustomTagFilesApiContainer customTagFilesApiContainer;
  @Inject CustomTagsApiContainer customTagsApiContainer;
  @Inject DailyBalanceReportApiContainer dailyBalanceReportApiContainer;
  @Inject DailyReportsApiContainer dailyReportsApiContainer;
  @Inject DataSetApiContainer dataSetApiContainer;
  @Inject DataSourceDispatchApiContainer dataSourceDispatchApiContainer;
  @Inject DiagnosisApiContainer diagnosisApiContainer;
  @Inject DplabelAdLabelApiContainer dplabelAdLabelApiContainer;
  @Inject DynamicAdImageTemplatesApiContainer dynamicAdImageTemplatesApiContainer;
  @Inject DynamicAdImagesApiContainer dynamicAdImagesApiContainer;
  @Inject DynamicAdVideoApiContainer dynamicAdVideoApiContainer;
  @Inject DynamicAdVideoTemplatesApiContainer dynamicAdVideoTemplatesApiContainer;
  @Inject DynamicCreativesApiContainer dynamicCreativesApiContainer;
  @Inject EcommerceOrderApiContainer ecommerceOrderApiContainer;
  @Inject EstimationApiContainer estimationApiContainer;
  @Inject ExtendPackageApiContainer extendPackageApiContainer;
  @Inject FundStatementsDailyApiContainer fundStatementsDailyApiContainer;
  @Inject FundStatementsDetailedApiContainer fundStatementsDetailedApiContainer;
  @Inject FundTransferApiContainer fundTransferApiContainer;
  @Inject FundsApiContainer fundsApiContainer;
  @Inject GameFeatureApiContainer gameFeatureApiContainer;
  @Inject GameFeatureTagsApiContainer gameFeatureTagsApiContainer;
  @Inject HourlyReportsApiContainer hourlyReportsApiContainer;
  @Inject ImageProcessingApiContainer imageProcessingApiContainer;
  @Inject ImagesApiContainer imagesApiContainer;
  @Inject KeywordRecommendApiContainer keywordRecommendApiContainer;
  @Inject LabelAudiencesApiContainer labelAudiencesApiContainer;
  @Inject LabelsApiContainer labelsApiContainer;
  @Inject LeadCluesApiContainer leadCluesApiContainer;
  @Inject LeadsCallApiContainer leadsCallApiContainer;
  @Inject LeadsCallRecordApiContainer leadsCallRecordApiContainer;
  @Inject LeadsCallRecordsApiContainer leadsCallRecordsApiContainer;
  @Inject LeadsCallTokenApiContainer leadsCallTokenApiContainer;
  @Inject LeadsCallVirtualNumberApiContainer leadsCallVirtualNumberApiContainer;
  @Inject LeadsFormApiContainer leadsFormApiContainer;
  @Inject LeadsFormListApiContainer leadsFormListApiContainer;
  @Inject LeadsInvalidPayApiContainer leadsInvalidPayApiContainer;
  @Inject LocalStoresApiContainer localStoresApiContainer;
  @Inject LocalStoresAddressParsingResultApiContainer localStoresAddressParsingResultApiContainer;
  @Inject LocalStoresCategoriesApiContainer localStoresCategoriesApiContainer;
  @Inject LocalStoresSearchInfoApiContainer localStoresSearchInfoApiContainer;
  @Inject LocalStoresWxpayMerchantsApiContainer localStoresWxpayMerchantsApiContainer;
  @Inject MaterialLabelsApiContainer materialLabelsApiContainer;
  @Inject MergeFundTypeDailyBalanceReportApiContainer mergeFundTypeDailyBalanceReportApiContainer;

  @Inject
  MergeFundTypeFundStatementsDetailedApiContainer mergeFundTypeFundStatementsDetailedApiContainer;

  @Inject MergeFundTypeFundsApiContainer mergeFundTypeFundsApiContainer;
  @Inject MergeFundTypeSubcustomerTransferApiContainer mergeFundTypeSubcustomerTransferApiContainer;
  @Inject OauthApiContainer oauthApiContainer;
  @Inject ObjectCommentFlagApiContainer objectCommentFlagApiContainer;
  @Inject OptimizationGoalPermissionsApiContainer optimizationGoalPermissionsApiContainer;
  @Inject OuterCluesApiContainer outerCluesApiContainer;
  @Inject OuterCluesContactApiContainer outerCluesContactApiContainer;
  @Inject PagesApiContainer pagesApiContainer;
  @Inject PlayablePagesApiContainer playablePagesApiContainer;
  @Inject ProductCatalogsApiContainer productCatalogsApiContainer;
  @Inject ProductCatalogsReportsApiContainer productCatalogsReportsApiContainer;
  @Inject ProductCategoriesListApiContainer productCategoriesListApiContainer;
  @Inject ProductItemsApiContainer productItemsApiContainer;
  @Inject ProductItemsDetailApiContainer productItemsDetailApiContainer;
  @Inject ProductItemsVerticalsApiContainer productItemsVerticalsApiContainer;
  @Inject ProductSeriesApiContainer productSeriesApiContainer;
  @Inject ProductsSystemStatusApiContainer productsSystemStatusApiContainer;
  @Inject ProfilesApiContainer profilesApiContainer;
  @Inject ProgrammedApiContainer programmedApiContainer;
  @Inject ProgrammedTemplateApiContainer programmedTemplateApiContainer;
  @Inject PromotedObjectAuthorizationApiContainer promotedObjectAuthorizationApiContainer;
  @Inject PromotedObjectsApiContainer promotedObjectsApiContainer;
  @Inject PropertyFileSessionsApiContainer propertyFileSessionsApiContainer;
  @Inject PropertyFilesApiContainer propertyFilesApiContainer;
  @Inject PropertySetSchemasApiContainer propertySetSchemasApiContainer;
  @Inject PropertySetsApiContainer propertySetsApiContainer;
  @Inject QualificationsApiContainer qualificationsApiContainer;
  @Inject QuerywordRptApiContainer querywordRptApiContainer;
  @Inject RealtimeCostApiContainer realtimeCostApiContainer;
  @Inject ReportApiContainer reportApiContainer;
  @Inject ReviewAdAppealApiContainer reviewAdAppealApiContainer;
  @Inject ReviewElementPrereviewResultsApiContainer reviewElementPrereviewResultsApiContainer;
  @Inject SceneSpecTagsApiContainer sceneSpecTagsApiContainer;
  @Inject SplitTestsApiContainer splitTestsApiContainer;
  @Inject SubcustomerTransferApiContainer subcustomerTransferApiContainer;
  @Inject SystemStatusApiContainer systemStatusApiContainer;
  @Inject TargetcpaTagApiContainer targetcpaTagApiContainer;
  @Inject TargetingTagReportsApiContainer targetingTagReportsApiContainer;
  @Inject TargetingTagsApiContainer targetingTagsApiContainer;
  @Inject TargetingTagsUvApiContainer targetingTagsUvApiContainer;
  @Inject TargetingsApiContainer targetingsApiContainer;
  @Inject TargetingsShareApiContainer targetingsShareApiContainer;
  @Inject TrackingReportsApiContainer trackingReportsApiContainer;
  @Inject UnionPositionPackagesApiContainer unionPositionPackagesApiContainer;
  @Inject UserActionSetReportsApiContainer userActionSetReportsApiContainer;
  @Inject UserActionSetsApiContainer userActionSetsApiContainer;
  @Inject UserActionsApiContainer userActionsApiContainer;
  @Inject UserPropertiesApiContainer userPropertiesApiContainer;
  @Inject UserPropertySetsApiContainer userPropertySetsApiContainer;
  @Inject VideomakerAutoadjustmentsApiContainer videomakerAutoadjustmentsApiContainer;
  @Inject VideomakerSubtitlesApiContainer videomakerSubtitlesApiContainer;
  @Inject VideomakerTasksApiContainer videomakerTasksApiContainer;
  @Inject VideomakerVideocapturesApiContainer videomakerVideocapturesApiContainer;
  @Inject VideosApiContainer videosApiContainer;
  @Inject WechatAdLabelsApiContainer wechatAdLabelsApiContainer;
  @Inject WechatFundStatementsDetailedApiContainer wechatFundStatementsDetailedApiContainer;
  @Inject WechatFundsApiContainer wechatFundsApiContainer;
  @Inject WechatPagesApiContainer wechatPagesApiContainer;
  @Inject WechatPagesCsgroupStatusApiContainer wechatPagesCsgroupStatusApiContainer;
  @Inject WechatPagesCsgroupUserApiContainer wechatPagesCsgroupUserApiContainer;
  @Inject WechatPagesCsgrouplistApiContainer wechatPagesCsgrouplistApiContainer;
  @Inject WechatPagesCustomApiContainer wechatPagesCustomApiContainer;
  @Inject WechatPagesGrantinfoApiContainer wechatPagesGrantinfoApiContainer;

  @Inject
  WeixinOfficialAccountsUpgradeStatusApiContainer weixinOfficialAccountsUpgradeStatusApiContainer;

  @Inject WildcardsApiContainer wildcardsApiContainer;
  @Inject WxPackageAccountApiContainer wxPackageAccountApiContainer;
  @Inject WxPackagePackageApiContainer wxPackagePackageApiContainer;
  @Inject XijingComplexTemplateApiContainer xijingComplexTemplateApiContainer;
  @Inject XijingDeriveClickEffectApiContainer xijingDeriveClickEffectApiContainer;
  @Inject XijingDeriveRoleApiContainer xijingDeriveRoleApiContainer;
  @Inject XijingDeriveTempTokenApiContainer xijingDeriveTempTokenApiContainer;
  @Inject XijingPageApiContainer xijingPageApiContainer;
  @Inject XijingPageByComponentsApiContainer xijingPageByComponentsApiContainer;
  @Inject XijingPageInteractiveApiContainer xijingPageInteractiveApiContainer;
  @Inject XijingPageListApiContainer xijingPageListApiContainer;
  @Inject XijingTemplateApiContainer xijingTemplateApiContainer;
  @Inject XijingTemplateListApiContainer xijingTemplateListApiContainer;

  public App() {
    Guice.createInjector(new GuiceModule()).injectMembers(this);
  }

  public AdAppealQuotaApiContainer adAppealQuota() {
    return adAppealQuotaApiContainer;
  }

  public AdDiagnosisApiContainer adDiagnosis() {
    return adDiagnosisApiContainer;
  }

  public AdLabelApiContainer adLabel() {
    return adLabelApiContainer;
  }

  public AdParamApiContainer adParam() {
    return adParamApiContainer;
  }

  public AdcreativePreviewsApiContainer adcreativePreviews() {
    return adcreativePreviewsApiContainer;
  }

  public AdcreativePreviewsQrcodeApiContainer adcreativePreviewsQrcode() {
    return adcreativePreviewsQrcodeApiContainer;
  }

  public AdcreativeTemplateApiContainer adcreativeTemplate() {
    return adcreativeTemplateApiContainer;
  }

  public AdcreativeTemplateDetailApiContainer adcreativeTemplateDetail() {
    return adcreativeTemplateDetailApiContainer;
  }

  public AdcreativeTemplateListApiContainer adcreativeTemplateList() {
    return adcreativeTemplateListApiContainer;
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

  public AdgroupNegativewordsApiContainer adgroupNegativewords() {
    return adgroupNegativewordsApiContainer;
  }

  public AdgroupsApiContainer adgroups() {
    return adgroupsApiContainer;
  }

  public AdqReportsUpgradeStatusApiContainer adqReportsUpgradeStatus() {
    return adqReportsUpgradeStatusApiContainer;
  }

  public AdsApiContainer ads() {
    return adsApiContainer;
  }

  public AdvertiserApiContainer advertiser() {
    return advertiserApiContainer;
  }

  public AdvertiserDailyBudgetApiContainer advertiserDailyBudget() {
    return advertiserDailyBudgetApiContainer;
  }

  public AgencyInnerTransferApiContainer agencyInnerTransfer() {
    return agencyInnerTransferApiContainer;
  }

  public AgencyRealtimeCostApiContainer agencyRealtimeCost() {
    return agencyRealtimeCostApiContainer;
  }

  public AppAndroidChannelPackagesApiContainer appAndroidChannelPackages() {
    return appAndroidChannelPackagesApiContainer;
  }

  public AssetPermissionsApiContainer assetPermissions() {
    return assetPermissionsApiContainer;
  }

  public AssetPermissionsScenesApiContainer assetPermissionsScenes() {
    return assetPermissionsScenesApiContainer;
  }

  public AssetPrePermissionsApiContainer assetPrePermissions() {
    return assetPrePermissionsApiContainer;
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

  public BarrageApiContainer barrage() {
    return barrageApiContainer;
  }

  public BarrageRecommendApiContainer barrageRecommend() {
    return barrageRecommendApiContainer;
  }

  public BatchAsyncRequestSpecificationApiContainer batchAsyncRequestSpecification() {
    return batchAsyncRequestSpecificationApiContainer;
  }

  public BatchAsyncRequestsApiContainer batchAsyncRequests() {
    return batchAsyncRequestsApiContainer;
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

  public BidwordApiContainer bidword() {
    return bidwordApiContainer;
  }

  public BidwordFlowApiContainer bidwordFlow() {
    return bidwordFlowApiContainer;
  }

  public BidwordRptApiContainer bidwordRpt() {
    return bidwordRptApiContainer;
  }

  public BrandApiContainer brand() {
    return brandApiContainer;
  }

  public BusinessManagerRelationsApiContainer businessManagerRelations() {
    return businessManagerRelationsApiContainer;
  }

  public BusinessMdmAccountRelationsApiContainer businessMdmAccountRelations() {
    return businessMdmAccountRelationsApiContainer;
  }

  public BusinessPointApiContainer businessPoint() {
    return businessPointApiContainer;
  }

  public CampaignNegativewordsApiContainer campaignNegativewords() {
    return campaignNegativewordsApiContainer;
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

  public CreativeComponentsApiContainer creativeComponents() {
    return creativeComponentsApiContainer;
  }

  public CreativeSampleProductsApiContainer creativeSampleProducts() {
    return creativeSampleProductsApiContainer;
  }

  public CreativetoolsTextApiContainer creativetoolsText() {
    return creativetoolsTextApiContainer;
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

  public CustomFeaturesApiContainer customFeatures() {
    return customFeaturesApiContainer;
  }

  public CustomTagFilesApiContainer customTagFiles() {
    return customTagFilesApiContainer;
  }

  public CustomTagsApiContainer customTags() {
    return customTagsApiContainer;
  }

  public DailyBalanceReportApiContainer dailyBalanceReport() {
    return dailyBalanceReportApiContainer;
  }

  public DailyReportsApiContainer dailyReports() {
    return dailyReportsApiContainer;
  }

  public DataSetApiContainer dataSet() {
    return dataSetApiContainer;
  }

  public DataSourceDispatchApiContainer dataSourceDispatch() {
    return dataSourceDispatchApiContainer;
  }

  public DiagnosisApiContainer diagnosis() {
    return diagnosisApiContainer;
  }

  public DplabelAdLabelApiContainer dplabelAdLabel() {
    return dplabelAdLabelApiContainer;
  }

  public DynamicAdImageTemplatesApiContainer dynamicAdImageTemplates() {
    return dynamicAdImageTemplatesApiContainer;
  }

  public DynamicAdImagesApiContainer dynamicAdImages() {
    return dynamicAdImagesApiContainer;
  }

  public DynamicAdVideoApiContainer dynamicAdVideo() {
    return dynamicAdVideoApiContainer;
  }

  public DynamicAdVideoTemplatesApiContainer dynamicAdVideoTemplates() {
    return dynamicAdVideoTemplatesApiContainer;
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

  public ExtendPackageApiContainer extendPackage() {
    return extendPackageApiContainer;
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

  public GameFeatureApiContainer gameFeature() {
    return gameFeatureApiContainer;
  }

  public GameFeatureTagsApiContainer gameFeatureTags() {
    return gameFeatureTagsApiContainer;
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

  public KeywordRecommendApiContainer keywordRecommend() {
    return keywordRecommendApiContainer;
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

  public LeadsCallApiContainer leadsCall() {
    return leadsCallApiContainer;
  }

  public LeadsCallRecordApiContainer leadsCallRecord() {
    return leadsCallRecordApiContainer;
  }

  public LeadsCallRecordsApiContainer leadsCallRecords() {
    return leadsCallRecordsApiContainer;
  }

  public LeadsCallTokenApiContainer leadsCallToken() {
    return leadsCallTokenApiContainer;
  }

  public LeadsCallVirtualNumberApiContainer leadsCallVirtualNumber() {
    return leadsCallVirtualNumberApiContainer;
  }

  public LeadsFormApiContainer leadsForm() {
    return leadsFormApiContainer;
  }

  public LeadsFormListApiContainer leadsFormList() {
    return leadsFormListApiContainer;
  }

  public LeadsInvalidPayApiContainer leadsInvalidPay() {
    return leadsInvalidPayApiContainer;
  }

  public LocalStoresApiContainer localStores() {
    return localStoresApiContainer;
  }

  public LocalStoresAddressParsingResultApiContainer localStoresAddressParsingResult() {
    return localStoresAddressParsingResultApiContainer;
  }

  public LocalStoresCategoriesApiContainer localStoresCategories() {
    return localStoresCategoriesApiContainer;
  }

  public LocalStoresSearchInfoApiContainer localStoresSearchInfo() {
    return localStoresSearchInfoApiContainer;
  }

  public LocalStoresWxpayMerchantsApiContainer localStoresWxpayMerchants() {
    return localStoresWxpayMerchantsApiContainer;
  }

  public MaterialLabelsApiContainer materialLabels() {
    return materialLabelsApiContainer;
  }

  public MergeFundTypeDailyBalanceReportApiContainer mergeFundTypeDailyBalanceReport() {
    return mergeFundTypeDailyBalanceReportApiContainer;
  }

  public MergeFundTypeFundStatementsDetailedApiContainer mergeFundTypeFundStatementsDetailed() {
    return mergeFundTypeFundStatementsDetailedApiContainer;
  }

  public MergeFundTypeFundsApiContainer mergeFundTypeFunds() {
    return mergeFundTypeFundsApiContainer;
  }

  public MergeFundTypeSubcustomerTransferApiContainer mergeFundTypeSubcustomerTransfer() {
    return mergeFundTypeSubcustomerTransferApiContainer;
  }

  public OauthApiContainer oauth() {
    return oauthApiContainer;
  }

  public ObjectCommentFlagApiContainer objectCommentFlag() {
    return objectCommentFlagApiContainer;
  }

  public OptimizationGoalPermissionsApiContainer optimizationGoalPermissions() {
    return optimizationGoalPermissionsApiContainer;
  }

  public OuterCluesApiContainer outerClues() {
    return outerCluesApiContainer;
  }

  public OuterCluesContactApiContainer outerCluesContact() {
    return outerCluesContactApiContainer;
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

  public ProductItemsVerticalsApiContainer productItemsVerticals() {
    return productItemsVerticalsApiContainer;
  }

  public ProductSeriesApiContainer productSeries() {
    return productSeriesApiContainer;
  }

  public ProductsSystemStatusApiContainer productsSystemStatus() {
    return productsSystemStatusApiContainer;
  }

  public ProfilesApiContainer profiles() {
    return profilesApiContainer;
  }

  public ProgrammedApiContainer programmed() {
    return programmedApiContainer;
  }

  public ProgrammedTemplateApiContainer programmedTemplate() {
    return programmedTemplateApiContainer;
  }

  public PromotedObjectAuthorizationApiContainer promotedObjectAuthorization() {
    return promotedObjectAuthorizationApiContainer;
  }

  public PromotedObjectsApiContainer promotedObjects() {
    return promotedObjectsApiContainer;
  }

  public PropertyFileSessionsApiContainer propertyFileSessions() {
    return propertyFileSessionsApiContainer;
  }

  public PropertyFilesApiContainer propertyFiles() {
    return propertyFilesApiContainer;
  }

  public PropertySetSchemasApiContainer propertySetSchemas() {
    return propertySetSchemasApiContainer;
  }

  public PropertySetsApiContainer propertySets() {
    return propertySetsApiContainer;
  }

  public QualificationsApiContainer qualifications() {
    return qualificationsApiContainer;
  }

  public QuerywordRptApiContainer querywordRpt() {
    return querywordRptApiContainer;
  }

  public RealtimeCostApiContainer realtimeCost() {
    return realtimeCostApiContainer;
  }

  public ReportApiContainer report() {
    return reportApiContainer;
  }

  public ReviewAdAppealApiContainer reviewAdAppeal() {
    return reviewAdAppealApiContainer;
  }

  public ReviewElementPrereviewResultsApiContainer reviewElementPrereviewResults() {
    return reviewElementPrereviewResultsApiContainer;
  }

  public SceneSpecTagsApiContainer sceneSpecTags() {
    return sceneSpecTagsApiContainer;
  }

  public SplitTestsApiContainer splitTests() {
    return splitTestsApiContainer;
  }

  public SubcustomerTransferApiContainer subcustomerTransfer() {
    return subcustomerTransferApiContainer;
  }

  public SystemStatusApiContainer systemStatus() {
    return systemStatusApiContainer;
  }

  public TargetcpaTagApiContainer targetcpaTag() {
    return targetcpaTagApiContainer;
  }

  public TargetingTagReportsApiContainer targetingTagReports() {
    return targetingTagReportsApiContainer;
  }

  public TargetingTagsApiContainer targetingTags() {
    return targetingTagsApiContainer;
  }

  public TargetingTagsUvApiContainer targetingTagsUv() {
    return targetingTagsUvApiContainer;
  }

  public TargetingsApiContainer targetings() {
    return targetingsApiContainer;
  }

  public TargetingsShareApiContainer targetingsShare() {
    return targetingsShareApiContainer;
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

  public VideomakerAutoadjustmentsApiContainer videomakerAutoadjustments() {
    return videomakerAutoadjustmentsApiContainer;
  }

  public VideomakerSubtitlesApiContainer videomakerSubtitles() {
    return videomakerSubtitlesApiContainer;
  }

  public VideomakerTasksApiContainer videomakerTasks() {
    return videomakerTasksApiContainer;
  }

  public VideomakerVideocapturesApiContainer videomakerVideocaptures() {
    return videomakerVideocapturesApiContainer;
  }

  public VideosApiContainer videos() {
    return videosApiContainer;
  }

  public WechatAdLabelsApiContainer wechatAdLabels() {
    return wechatAdLabelsApiContainer;
  }

  public WechatFundStatementsDetailedApiContainer wechatFundStatementsDetailed() {
    return wechatFundStatementsDetailedApiContainer;
  }

  public WechatFundsApiContainer wechatFunds() {
    return wechatFundsApiContainer;
  }

  public WechatPagesApiContainer wechatPages() {
    return wechatPagesApiContainer;
  }

  public WechatPagesCsgroupStatusApiContainer wechatPagesCsgroupStatus() {
    return wechatPagesCsgroupStatusApiContainer;
  }

  public WechatPagesCsgroupUserApiContainer wechatPagesCsgroupUser() {
    return wechatPagesCsgroupUserApiContainer;
  }

  public WechatPagesCsgrouplistApiContainer wechatPagesCsgrouplist() {
    return wechatPagesCsgrouplistApiContainer;
  }

  public WechatPagesCustomApiContainer wechatPagesCustom() {
    return wechatPagesCustomApiContainer;
  }

  public WechatPagesGrantinfoApiContainer wechatPagesGrantinfo() {
    return wechatPagesGrantinfoApiContainer;
  }

  public WeixinOfficialAccountsUpgradeStatusApiContainer weixinOfficialAccountsUpgradeStatus() {
    return weixinOfficialAccountsUpgradeStatusApiContainer;
  }

  public WildcardsApiContainer wildcards() {
    return wildcardsApiContainer;
  }

  public WxPackageAccountApiContainer wxPackageAccount() {
    return wxPackageAccountApiContainer;
  }

  public WxPackagePackageApiContainer wxPackagePackage() {
    return wxPackagePackageApiContainer;
  }

  public XijingComplexTemplateApiContainer xijingComplexTemplate() {
    return xijingComplexTemplateApiContainer;
  }

  public XijingDeriveClickEffectApiContainer xijingDeriveClickEffect() {
    return xijingDeriveClickEffectApiContainer;
  }

  public XijingDeriveRoleApiContainer xijingDeriveRole() {
    return xijingDeriveRoleApiContainer;
  }

  public XijingDeriveTempTokenApiContainer xijingDeriveTempToken() {
    return xijingDeriveTempTokenApiContainer;
  }

  public XijingPageApiContainer xijingPage() {
    return xijingPageApiContainer;
  }

  public XijingPageByComponentsApiContainer xijingPageByComponents() {
    return xijingPageByComponentsApiContainer;
  }

  public XijingPageInteractiveApiContainer xijingPageInteractive() {
    return xijingPageInteractiveApiContainer;
  }

  public XijingPageListApiContainer xijingPageList() {
    return xijingPageListApiContainer;
  }

  public XijingTemplateApiContainer xijingTemplate() {
    return xijingTemplateApiContainer;
  }

  public XijingTemplateListApiContainer xijingTemplateList() {
    return xijingTemplateListApiContainer;
  }
}
