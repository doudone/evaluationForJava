package com.powercoder.evaluation.entity;

/**
 * @author ：Done
 * @date ：Created in 2020/3/18 21:23
 * @description：公司规模的实体类
 */
public class CompanySize {

  /* 主键 */
  private int companySizeId;

  /* 公司规模 */
  private String companySize;

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

  @Override
  public String toString() {
    return "CompanySize{"
        + "companySizeId="
        + companySizeId
        + ", companySize='"
        + companySize
        + '\''
        + '}';
  }
}
