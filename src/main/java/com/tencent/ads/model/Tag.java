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
import java.util.Objects;

/** */
@ApiModel(description = "")
public class Tag {
  @SerializedName("tag_id")
  private Long tagId = null;

  @SerializedName("parent_tag_id")
  private Long parentTagId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("tag_code")
  private String tagCode = null;

  @SerializedName("user_count")
  private Long userCount = null;

  @SerializedName("created_time")
  private String createdTime = null;

  public Tag tagId(Long tagId) {
    this.tagId = tagId;
    return this;
  }

  /**
   * Get tagId
   *
   * @return tagId
   */
  @ApiModelProperty(value = "")
  public Long getTagId() {
    return tagId;
  }

  public void setTagId(Long tagId) {
    this.tagId = tagId;
  }

  public Tag parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

  /**
   * Get parentTagId
   *
   * @return parentTagId
   */
  @ApiModelProperty(value = "")
  public Long getParentTagId() {
    return parentTagId;
  }

  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

  public Tag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tag tagCode(String tagCode) {
    this.tagCode = tagCode;
    return this;
  }

  /**
   * Get tagCode
   *
   * @return tagCode
   */
  @ApiModelProperty(value = "")
  public String getTagCode() {
    return tagCode;
  }

  public void setTagCode(String tagCode) {
    this.tagCode = tagCode;
  }

  public Tag userCount(Long userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * Get userCount
   *
   * @return userCount
   */
  @ApiModelProperty(value = "")
  public Long getUserCount() {
    return userCount;
  }

  public void setUserCount(Long userCount) {
    this.userCount = userCount;
  }

  public Tag createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.tagId, tag.tagId)
        && Objects.equals(this.parentTagId, tag.parentTagId)
        && Objects.equals(this.name, tag.name)
        && Objects.equals(this.description, tag.description)
        && Objects.equals(this.tagCode, tag.tagCode)
        && Objects.equals(this.userCount, tag.userCount)
        && Objects.equals(this.createdTime, tag.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagId, parentTagId, name, description, tagCode, userCount, createdTime);
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
