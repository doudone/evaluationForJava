package com.powercoder.evaluation.entity;

/**
 * @author ：Done
 * @date ：Created in 2020/3/18 23:12
 * @description：公司预约产品演示登记信息的实体类
 */
public class BusinessConsulting {

  private int id;

  private int prodId;
  private String prodName;
  private String name;
  private String phone;
  private String email;
  private String businessName;
  private int companySizeId;
  private String companySize;
  private int companyPositionId;
  private String positionName;
  private String note;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getProdId() {
    return prodId;
  }

  public void setProdId(int prodId) {
    this.prodId = prodId;
  }

  public String getProdName() {
    return prodName;
  }

  public void setProdName(String prodName) {
    this.prodName = prodName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public int getCompanySizeId() {
    return companySizeId;
  }

  public void setCompanySizeId(int companySizeId) {
    this.companySizeId = companySizeId;
  }

  public String getCompanySize() {
    return companySize;
  }

  public void setCompanySize(String companySize) {
    this.companySize = companySize;
  }

  public int getCompanyPositionId() {
    return companyPositionId;
  }

  public void setCompanyPositionId(int companyPositionId) {
    this.companyPositionId = companyPositionId;
  }

  public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  @Override
  public String toString() {
    return "BusinessConsulting{"
        + "id="
        + id
        + ", prodId="
        + prodId
        + ", prodName='"
        + prodName
        + '\''
        + ", name='"
        + name
        + '\''
        + ", phone='"
        + phone
        + '\''
        + ", email='"
        + email
        + '\''
        + ", businessName='"
        + businessName
        + '\''
        + ", companySizeId="
        + companySizeId
        + ", companySize='"
        + companySize
        + '\''
        + ", companyPositionId="
        + companyPositionId
        + ", positionName='"
        + positionName
        + '\''
        + ", note='"
        + note
        + '\''
        + '}';
  }
}
