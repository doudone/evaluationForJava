package com.powercoder.evaluation.entity;

/**
 * @author ：Done
 * @date ：Created in 2020/3/20 1:04
 * @description：产品信息
 */
public class Product {

  private int prodId;
  private int level2Id;
  private String name;
  private int prodPrice;
  private String prodUrl;

  public int getProdId() {
    return prodId;
  }

  public void setProdId(int prodId) {
    this.prodId = prodId;
  }

  public int getLevel2Id() {
    return level2Id;
  }

  public void setLevel2Id(int level2Id) {
    this.level2Id = level2Id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getProdPrice() {
    return prodPrice;
  }

  public void setProdPrice(int prodPrice) {
    this.prodPrice = prodPrice;
  }

  public String getProdUrl() {
    return prodUrl;
  }

  public void setProdUrl(String prodUrl) {
    this.prodUrl = prodUrl;
  }

  @Override
  public String toString() {
    return "Product{"
        + "prodId="
        + prodId
        + ", level2Id="
        + level2Id
        + ", name='"
        + name
        + '\''
        + ", prodPrice="
        + prodPrice
        + ", prodUrl='"
        + prodUrl
        + '\''
        + '}';
  }
}
