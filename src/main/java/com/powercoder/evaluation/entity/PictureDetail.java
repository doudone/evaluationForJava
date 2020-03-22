package com.powercoder.evaluation.entity;

import java.util.Date;

/**
 * @author ：Done
 * @date ：Created in 2020/3/8 23:19
 * @description：图片详情实体类
 */
public class PictureDetail {

  /* 主键 */
  private int id;

  /* 图片标题 */
  private String title;

  /* 图片地址 */
  private String picture;

  /* 模板 */
  private int module;

  /* 图片上带的链接 */
  private String url;

  /* 展示顺序 */
  private int showOrder;

  /* 是否启用 */
  private int used;

  /* 移动端图片地址 */
  private String movingPicture;

  /* 同步至移动端 */
  private int synchronizeToMoving;

  /* 创建者 */
  private String createUser;

  /* 创建时间 */
  private Date createDateTime;

  /* 版本信息 */
  private int version;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public int getModule() {
    return module;
  }

  public void setModule(int module) {
    this.module = module;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getShowOrder() {
    return showOrder;
  }

  public void setShowOrder(int showOrder) {
    this.showOrder = showOrder;
  }

  public int getUsed() {
    return used;
  }

  public void setUsed(int used) {
    this.used = used;
  }

  public String getMovingPicture() {
    return movingPicture;
  }

  public void setMovingPicture(String movingPicture) {
    this.movingPicture = movingPicture;
  }

  public int getSynchronizeToMoving() {
    return synchronizeToMoving;
  }

  public void setSynchronizeToMoving(int synchronizeToMoving) {
    this.synchronizeToMoving = synchronizeToMoving;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public Date getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(Date createDateTime) {
    this.createDateTime = createDateTime;
  }

  public int getVersion() {
    return version;
  }

  public void setVersion(int version) {
    this.version = version;
  }

  @Override
  public String toString() {
    return "PictureDetail{"
        + "id="
        + id
        + ", title='"
        + title
        + '\''
        + ", picture='"
        + picture
        + '\''
        + ", module="
        + module
        + ", url='"
        + url
        + '\''
        + ", showOrder="
        + showOrder
        + ", used="
        + used
        + ", movingPicture='"
        + movingPicture
        + '\''
        + ", synchronizeToMoving="
        + synchronizeToMoving
        + ", createUser='"
        + createUser
        + '\''
        + ", createDateTime="
        + createDateTime
        + ", version="
        + version
        + '}';
  }
}
