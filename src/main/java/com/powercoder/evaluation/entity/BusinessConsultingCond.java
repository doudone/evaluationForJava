package com.powercoder.evaluation.entity;

/**
 * @author ：Done
 * @date ：Created in 2020/3/19 8:49
 * @description：企业预约演示的查询条件
 */
public class BusinessConsultingCond {
  private Page page;
  private BusinessConsulting businessConsulting;

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public BusinessConsulting getBusinessConsulting() {
    return businessConsulting;
  }

  public void setBusinessConsulting(BusinessConsulting businessConsulting) {
    this.businessConsulting = businessConsulting;
  }

  @Override
  public String toString() {
    return "BusinessConsultingCond{"
        + "page="
        + page
        + ", businessConsulting="
        + businessConsulting
        + '}';
  }
}
