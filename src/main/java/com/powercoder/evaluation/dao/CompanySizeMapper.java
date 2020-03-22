package com.powercoder.evaluation.dao;

import com.powercoder.evaluation.entity.CompanySize;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：Done
 * @date ：Created in 2020/3/18 21:30
 * @description：公司规模的数据访问层
 */
@Mapper
public interface CompanySizeMapper {

  /**
   * 查找所有的公司规模
   *
   * @return 公司规模集合
   */
  List<CompanySize> selectAll();
}
