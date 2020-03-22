package com.powercoder.evaluation.controller;

import com.powercoder.evaluation.entity.CompanyPosition;
import com.powercoder.evaluation.entity.CompanySize;
import com.powercoder.evaluation.service.CompanyPositionService;
import com.powercoder.evaluation.service.CompanySizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ：Done
 * @date ：Created in 2020/3/18 21:46
 * @description：公司的控制层
 */
@Controller
@ResponseBody
public class CompanyController {

  @Autowired private CompanySizeService companyService;

  @Autowired private CompanyPositionService positionService;

  /**
   * 查找所有的公司职务
   *
   * @return 公司职务的集合
   */
  @CrossOrigin
  @GetMapping(value = "/api/orderDemo/findAllPosition")
  public List<CompanyPosition> findAllPosition() {
    return positionService.selectAllPosition();
  }

  /**
   * 查找所有的公司规模
   *
   * @return 公司规模的集合
   */
  @CrossOrigin
  @GetMapping(value = "/api/orderDemo/findAllSize")
  public List<CompanySize> findAllSize() {
    return companyService.selectAllSize();
  }
}
