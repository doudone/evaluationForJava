package com.powercoder.evaluation.dao;

import com.powercoder.evaluation.entity.BusinessConsulting;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：Done
 * @date ：Created in 2020/3/18 23:10
 * @description：公司预约产品演示的数据层
 */
@Mapper
public interface BusinessConsultingMapper {

  int insertDetail(BusinessConsulting businessConsulting);

  List<BusinessConsulting> selectByCond(
      int companySizeId, int prodId, String businessName, int offset, int limit);

  int findRows(int companySizeId, int prodId, String businessName);
}
