package com.powercoder.evaluation.dao;

import com.powercoder.evaluation.entity.CompanyPosition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：Done
 * @date ：Created in 2020/3/18 21:41
 * @description：公司职务的数据访问层
 */
@Mapper
public interface CompanyPositionMapper {
  /**
   * 查找所有的公司职务信息
   *
   * @return 公司职务实体类的集合
   */
  List<CompanyPosition> selectAll();
}
