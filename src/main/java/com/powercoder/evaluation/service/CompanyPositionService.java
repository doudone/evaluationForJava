package com.powercoder.evaluation.service;

import com.powercoder.evaluation.dao.CompanyPositionMapper;
import com.powercoder.evaluation.entity.CompanyPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：Done
 * @date ：Created in 2020/3/18 23:04
 * @description：公司职务的服务层
 */
@Service
public class CompanyPositionService {

  /* 公司职务的数据访问层 */
  @Autowired private CompanyPositionMapper positionMapper;

  /**
   * 查找公司职务的方法
   *
   * @return 公司职务的集合
   */
  public List<CompanyPosition> selectAllPosition() {
    return positionMapper.selectAll();
  }
}
