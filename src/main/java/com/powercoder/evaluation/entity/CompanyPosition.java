package com.powercoder.evaluation.entity;

/**
 * @author ：Done
 * @date ：Created in 2020/3/18 21:39
 * @description：公司职务的实体类
 */
public class CompanyPosition {

  private int companyPositionId;

  private String positionName;

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

  @Override
  public String toString() {
    return "CompanyPositon{"
        + "companyPositionId="
        + companyPositionId
        + ", positionName='"
        + positionName
        + '\''
        + '}';
  }
}
