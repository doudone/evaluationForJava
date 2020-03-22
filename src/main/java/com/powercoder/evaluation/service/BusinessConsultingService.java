package com.powercoder.evaluation.service;

import com.powercoder.evaluation.dao.BusinessConsultingMapper;
import com.powercoder.evaluation.entity.BusinessConsulting;
import com.powercoder.evaluation.entity.BusinessConsultingCond;
import com.powercoder.evaluation.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：Done
 * @date ：Created in 2020/3/18 23:32
 * @description：公司预约产品演示信息处理的服务层
 */
@Service
public class BusinessConsultingService {

  @Autowired private BusinessConsultingMapper businessConsultingMapper;

  public int insertDetail(BusinessConsulting businessConsulting) {
    return businessConsultingMapper.insertDetail(businessConsulting);
  }

  public List<BusinessConsulting> selectByCond(BusinessConsultingCond cond) {
    Page page = cond.getPage();
    BusinessConsulting businessConsulting = cond.getBusinessConsulting();
    return businessConsultingMapper.selectByCond(
        businessConsulting.getCompanySizeId(),
        businessConsulting.getProdId(),
        businessConsulting.getBusinessName(),
        page.getOffset(),
        page.getLimit());
  }

  public int getRows(BusinessConsultingCond cond) {
    BusinessConsulting businessConsulting = cond.getBusinessConsulting();
    return businessConsultingMapper.findRows(
        businessConsulting.getCompanySizeId(),
        businessConsulting.getProdId(),
        businessConsulting.getBusinessName());
  }
}
