package com.powercoder.evaluation.controller;

import com.powercoder.evaluation.entity.ProdLevel1;
import com.powercoder.evaluation.entity.ProdLevel2;
import com.powercoder.evaluation.entity.ProdMessage;
import com.powercoder.evaluation.entity.Product;
import com.powercoder.evaluation.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：huxinyue
 * @date ：Created in 2020/3/10 21:20
 * @description：${description}
 */
@ResponseBody
@Controller
public class ProdController {

  @Autowired private ProdService prodService;

  @RequestMapping(path = "/api/production1", method = RequestMethod.GET)
  @ResponseBody
  public String getProdName1(Model model, ProdLevel1 prodLevel1) {

    List<ProdLevel1> prodLevel_names1 = prodService.showProdName1(prodLevel1.getLevel1_id());
    List<ProdLevel1> prodLevel_1 = new ArrayList<>();
    if (prodLevel_names1 != null) {
      for (ProdLevel1 name1 : prodLevel_names1) {
        prodLevel_1.add(name1);
      }
    }
    model.addAttribute("prodLevel_1", prodLevel_1);
    return "/api/production";
  }

  @RequestMapping(path = "/api/production2", method = RequestMethod.GET)
  @ResponseBody
  public String getProdName2(Model model, ProdLevel2 prodLevel2) {

    List<ProdLevel2> prodLevel_names2 = prodService.showProdName2(prodLevel2.getLevel2_id());
    List<ProdLevel2> prodLevel_2 = new ArrayList<>();
    if (prodLevel_names2 != null) {
      for (ProdLevel2 name2 : prodLevel_names2) {
        prodLevel_2.add(name2);
      }
    }
    model.addAttribute("prodLevel_2", prodLevel_2);
    return "/api/production";
  }

  @RequestMapping(path = "/api/production3", method = RequestMethod.GET)
  @ResponseBody
  public String getProdMessage(Model model, ProdMessage prodMessage) {

    List<ProdMessage> prod_Messages = prodService.showProdMessage(prodMessage.getProd_id());
    List<Map<String, Object>> prodMessages = new ArrayList<>();

    if (prod_Messages != null) {
      for (ProdMessage prod_Message : prod_Messages) {
        Map<String, Object> map = new HashMap<>();
        map.put("Prod_name", prod_Message.getProd_name());
        map.put("Prod_price", prod_Message.getProd_price());
        map.put("Prod_url", prod_Message.getProd_url());
        prodMessages.add(map);
      }
    }
    model.addAttribute("prodMessages", prodMessages);
    return "/api/production";
  }

  @CrossOrigin
  @GetMapping(value = "/api/banner/businessConsulting/findAllProd")
  @ResponseBody
  public List<Product> findAllProd() {
    List<Product> productList = prodService.selectAllProd();
    System.out.println(productList);
    return productList;
  }
}
