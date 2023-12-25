/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model.v3;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 小程序落地页 */
@ApiModel(description = "小程序落地页")
public class WechatMiniProgramPageSpec {
  @SerializedName("mini_program_id")
  private String miniProgramId = null;

  @SerializedName("mini_program_path")
  private String miniProgramPath = null;

  @SerializedName("mini_program_paths")
  private List<String> miniProgramPaths = null;

  @SerializedName("backup_option")
  private BackUpOption backupOption = null;

  public WechatMiniProgramPageSpec miniProgramId(String miniProgramId) {
    this.miniProgramId = miniProgramId;
    return this;
  }

  /**
   * Get miniProgramId
   *
   * @return miniProgramId
   */
  @ApiModelProperty(value = "")
  public String getMiniProgramId() {
    return miniProgramId;
  }

  public void setMiniProgramId(String miniProgramId) {
    this.miniProgramId = miniProgramId;
  }

  public WechatMiniProgramPageSpec miniProgramPath(String miniProgramPath) {
    this.miniProgramPath = miniProgramPath;
    return this;
  }

  /**
   * Get miniProgramPath
   *
   * @return miniProgramPath
   */
  @ApiModelProperty(value = "")
  public String getMiniProgramPath() {
    return miniProgramPath;
  }

  public void setMiniProgramPath(String miniProgramPath) {
    this.miniProgramPath = miniProgramPath;
  }

  public WechatMiniProgramPageSpec miniProgramPaths(List<String> miniProgramPaths) {
    this.miniProgramPaths = miniProgramPaths;
    return this;
  }

  public WechatMiniProgramPageSpec addMiniProgramPathsItem(String miniProgramPathsItem) {
    if (this.miniProgramPaths == null) {
      this.miniProgramPaths = new ArrayList<String>();
    }
    this.miniProgramPaths.add(miniProgramPathsItem);
    return this;
  }

  /**
   * Get miniProgramPaths
   *
   * @return miniProgramPaths
   */
  @ApiModelProperty(value = "")
  public List<String> getMiniProgramPaths() {
    return miniProgramPaths;
  }

  public void setMiniProgramPaths(List<String> miniProgramPaths) {
    this.miniProgramPaths = miniProgramPaths;
  }

  public WechatMiniProgramPageSpec backupOption(BackUpOption backupOption) {
    this.backupOption = backupOption;
    return this;
  }

  /**
   * Get backupOption
   *
   * @return backupOption
   */
  @ApiModelProperty(value = "")
  public BackUpOption getBackupOption() {
    return backupOption;
  }

  public void setBackupOption(BackUpOption backupOption) {
    this.backupOption = backupOption;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatMiniProgramPageSpec wechatMiniProgramPageSpec = (WechatMiniProgramPageSpec) o;
    return Objects.equals(this.miniProgramId, wechatMiniProgramPageSpec.miniProgramId)
        && Objects.equals(this.miniProgramPath, wechatMiniProgramPageSpec.miniProgramPath)
        && Objects.equals(this.miniProgramPaths, wechatMiniProgramPageSpec.miniProgramPaths)
        && Objects.equals(this.backupOption, wechatMiniProgramPageSpec.backupOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniProgramId, miniProgramPath, miniProgramPaths, backupOption);
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