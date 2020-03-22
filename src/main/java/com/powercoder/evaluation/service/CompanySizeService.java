package com.powercoder.evaluation.service;

import com.powercoder.evaluation.dao.CompanySizeMapper;
import com.powercoder.evaluation.entity.CompanySize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：Done
 * @date ：Created in 2020/3/18 21:33
 * @description：公司规模与公司职务的服务层
 */
@Service
public class CompanySizeService {

  /* 公司规模的数据访问层 */
  @Autowired private CompanySizeMapper companySizeMapper;

  /**
   * 查找公司规模的方法
   *
   * @return 公司规模的集合
   */
  public List<CompanySize> selectAllSize() {
    return companySizeMapper.selectAll();
  }
}
