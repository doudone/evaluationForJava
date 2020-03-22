package com.powercoder.evaluation.service;

import com.powercoder.evaluation.dao.ProdMapper;
import com.powercoder.evaluation.entity.ProdLevel1;
import com.powercoder.evaluation.entity.ProdLevel2;
import com.powercoder.evaluation.entity.ProdMessage;
import com.powercoder.evaluation.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdService {

  @Autowired private ProdMapper prodMapper;

  public List<ProdLevel1> showProdName1(int level1_id) {
    return prodMapper.getProdLevel1(level1_id);
  }

  public List<ProdLevel2> showProdName2(int level2_id) {
    return prodMapper.getProdLevel2(level2_id);
  }

  public List<ProdMessage> showProdMessage(int prod_id) {
    return prodMapper.getProdMessage(prod_id);
  }

  public List<Product> selectAllProd() {
    return prodMapper.selectAllProd();
  }
}
