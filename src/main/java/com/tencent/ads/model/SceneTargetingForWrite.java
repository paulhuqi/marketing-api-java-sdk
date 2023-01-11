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

/** 场景定向 */
@ApiModel(description = "场景定向")
public class SceneTargetingForWrite {
  @SerializedName("union_position_package")
  private List<Long> unionPositionPackage = null;

  @SerializedName("exclude_union_position_package")
  private List<Long> excludeUnionPositionPackage = null;

  @SerializedName("display_scene")
  private List<String> displayScene = null;

  @SerializedName("tencent_news")
  private List<String> tencentNews = null;

  @SerializedName("wechat_scene")
  private WechatScene wechatScene = null;

  @SerializedName("wechat_position")
  private List<Long> wechatPosition = null;

  @SerializedName("qbsearch_scene")
  private List<String> qbsearchScene = null;

  @SerializedName("wechat_channels_scene")
  private List<Long> wechatChannelsScene = null;

  public SceneTargetingForWrite unionPositionPackage(List<Long> unionPositionPackage) {
    this.unionPositionPackage = unionPositionPackage;
    return this;
  }

  public SceneTargetingForWrite addUnionPositionPackageItem(Long unionPositionPackageItem) {
    if (this.unionPositionPackage == null) {
      this.unionPositionPackage = new ArrayList<Long>();
    }
    this.unionPositionPackage.add(unionPositionPackageItem);
    return this;
  }

  /**
   * Get unionPositionPackage
   *
   * @return unionPositionPackage
   */
  @ApiModelProperty(value = "")
  public List<Long> getUnionPositionPackage() {
    return unionPositionPackage;
  }

  public void setUnionPositionPackage(List<Long> unionPositionPackage) {
    this.unionPositionPackage = unionPositionPackage;
  }

  public SceneTargetingForWrite excludeUnionPositionPackage(
      List<Long> excludeUnionPositionPackage) {
    this.excludeUnionPositionPackage = excludeUnionPositionPackage;
    return this;
  }

  public SceneTargetingForWrite addExcludeUnionPositionPackageItem(
      Long excludeUnionPositionPackageItem) {
    if (this.excludeUnionPositionPackage == null) {
      this.excludeUnionPositionPackage = new ArrayList<Long>();
    }
    this.excludeUnionPositionPackage.add(excludeUnionPositionPackageItem);
    return this;
  }

  /**
   * Get excludeUnionPositionPackage
   *
   * @return excludeUnionPositionPackage
   */
  @ApiModelProperty(value = "")
  public List<Long> getExcludeUnionPositionPackage() {
    return excludeUnionPositionPackage;
  }

  public void setExcludeUnionPositionPackage(List<Long> excludeUnionPositionPackage) {
    this.excludeUnionPositionPackage = excludeUnionPositionPackage;
  }

  public SceneTargetingForWrite displayScene(List<String> displayScene) {
    this.displayScene = displayScene;
    return this;
  }

  public SceneTargetingForWrite addDisplaySceneItem(String displaySceneItem) {
    if (this.displayScene == null) {
      this.displayScene = new ArrayList<String>();
    }
    this.displayScene.add(displaySceneItem);
    return this;
  }

  /**
   * Get displayScene
   *
   * @return displayScene
   */
  @ApiModelProperty(value = "")
  public List<String> getDisplayScene() {
    return displayScene;
  }

  public void setDisplayScene(List<String> displayScene) {
    this.displayScene = displayScene;
  }

  public SceneTargetingForWrite tencentNews(List<String> tencentNews) {
    this.tencentNews = tencentNews;
    return this;
  }

  public SceneTargetingForWrite addTencentNewsItem(String tencentNewsItem) {
    if (this.tencentNews == null) {
      this.tencentNews = new ArrayList<String>();
    }
    this.tencentNews.add(tencentNewsItem);
    return this;
  }

  /**
   * Get tencentNews
   *
   * @return tencentNews
   */
  @ApiModelProperty(value = "")
  public List<String> getTencentNews() {
    return tencentNews;
  }

  public void setTencentNews(List<String> tencentNews) {
    this.tencentNews = tencentNews;
  }

  public SceneTargetingForWrite wechatScene(WechatScene wechatScene) {
    this.wechatScene = wechatScene;
    return this;
  }

  /**
   * Get wechatScene
   *
   * @return wechatScene
   */
  @ApiModelProperty(value = "")
  public WechatScene getWechatScene() {
    return wechatScene;
  }

  public void setWechatScene(WechatScene wechatScene) {
    this.wechatScene = wechatScene;
  }

  public SceneTargetingForWrite wechatPosition(List<Long> wechatPosition) {
    this.wechatPosition = wechatPosition;
    return this;
  }

  public SceneTargetingForWrite addWechatPositionItem(Long wechatPositionItem) {
    if (this.wechatPosition == null) {
      this.wechatPosition = new ArrayList<Long>();
    }
    this.wechatPosition.add(wechatPositionItem);
    return this;
  }

  /**
   * Get wechatPosition
   *
   * @return wechatPosition
   */
  @ApiModelProperty(value = "")
  public List<Long> getWechatPosition() {
    return wechatPosition;
  }

  public void setWechatPosition(List<Long> wechatPosition) {
    this.wechatPosition = wechatPosition;
  }

  public SceneTargetingForWrite qbsearchScene(List<String> qbsearchScene) {
    this.qbsearchScene = qbsearchScene;
    return this;
  }

  public SceneTargetingForWrite addQbsearchSceneItem(String qbsearchSceneItem) {
    if (this.qbsearchScene == null) {
      this.qbsearchScene = new ArrayList<String>();
    }
    this.qbsearchScene.add(qbsearchSceneItem);
    return this;
  }

  /**
   * Get qbsearchScene
   *
   * @return qbsearchScene
   */
  @ApiModelProperty(value = "")
  public List<String> getQbsearchScene() {
    return qbsearchScene;
  }

  public void setQbsearchScene(List<String> qbsearchScene) {
    this.qbsearchScene = qbsearchScene;
  }

  public SceneTargetingForWrite wechatChannelsScene(List<Long> wechatChannelsScene) {
    this.wechatChannelsScene = wechatChannelsScene;
    return this;
  }

  public SceneTargetingForWrite addWechatChannelsSceneItem(Long wechatChannelsSceneItem) {
    if (this.wechatChannelsScene == null) {
      this.wechatChannelsScene = new ArrayList<Long>();
    }
    this.wechatChannelsScene.add(wechatChannelsSceneItem);
    return this;
  }

  /**
   * Get wechatChannelsScene
   *
   * @return wechatChannelsScene
   */
  @ApiModelProperty(value = "")
  public List<Long> getWechatChannelsScene() {
    return wechatChannelsScene;
  }

  public void setWechatChannelsScene(List<Long> wechatChannelsScene) {
    this.wechatChannelsScene = wechatChannelsScene;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneTargetingForWrite sceneTargetingForWrite = (SceneTargetingForWrite) o;
    return Objects.equals(this.unionPositionPackage, sceneTargetingForWrite.unionPositionPackage)
        && Objects.equals(
            this.excludeUnionPositionPackage, sceneTargetingForWrite.excludeUnionPositionPackage)
        && Objects.equals(this.displayScene, sceneTargetingForWrite.displayScene)
        && Objects.equals(this.tencentNews, sceneTargetingForWrite.tencentNews)
        && Objects.equals(this.wechatScene, sceneTargetingForWrite.wechatScene)
        && Objects.equals(this.wechatPosition, sceneTargetingForWrite.wechatPosition)
        && Objects.equals(this.qbsearchScene, sceneTargetingForWrite.qbsearchScene)
        && Objects.equals(this.wechatChannelsScene, sceneTargetingForWrite.wechatChannelsScene);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        unionPositionPackage,
        excludeUnionPositionPackage,
        displayScene,
        tencentNews,
        wechatScene,
        wechatPosition,
        qbsearchScene,
        wechatChannelsScene);
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
