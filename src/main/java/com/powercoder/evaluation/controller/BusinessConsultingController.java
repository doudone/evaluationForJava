package com.powercoder.evaluation.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.powercoder.evaluation.entity.BusinessConsulting;
import com.powercoder.evaluation.entity.BusinessConsultingCond;
import com.powercoder.evaluation.service.BusinessConsultingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：Done
 * @date ：Created in 2020/3/18 23:35
 * @description：公司预约产品演示信息的控制层
 */
@Controller
@ResponseBody
public class BusinessConsultingController {

  @Autowired private BusinessConsultingService businessConsultingService;

  @Autowired private Gson gson;

  @CrossOrigin
  @PostMapping(value = "/api/orderDemo/insertDetail")
  @ResponseBody
  public int insertDetail(@RequestBody String request) {
    System.out.println(request);
    BusinessConsulting businessConsulting =
        gson.fromJson(request, new TypeToken<BusinessConsulting>() {}.getType());
    return businessConsultingService.insertDetail(businessConsulting);
  }

  @CrossOrigin
  @PostMapping(value = "/api/banner/businessConsulting/findDetail")
  @ResponseBody
  public List<BusinessConsulting> findDetail(@RequestBody String request) {
    System.out.println(request);
    BusinessConsultingCond businessConsultingCond =
        gson.fromJson(request, BusinessConsultingCond.class);
    System.out.println(businessConsultingCond);

    List<BusinessConsulting> businessConsultingList =
        businessConsultingService.selectByCond(businessConsultingCond);
    return businessConsultingList;
  }

  @CrossOrigin
  @PostMapping(value = "/api/banner/businessConsulting/getRows")
  @ResponseBody
  public int getRows(@RequestBody String request) {
    System.out.println(request);
    BusinessConsultingCond businessConsultingCond =
        gson.fromJson(request, BusinessConsultingCond.class);
    System.out.println(businessConsultingCond);
    int total = businessConsultingService.getRows(businessConsultingCond);
    System.out.println(total);
    return total;
  }

  @CrossOrigin
  @GetMapping(value = "/api/orderDemo/getSecurityCode")
  public String getSecurityCode(String phone) {
    System.out.println(phone);
    return "1234";
  }
}
