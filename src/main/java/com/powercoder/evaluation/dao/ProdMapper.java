package com.powercoder.evaluation.dao;

import com.powercoder.evaluation.entity.ProdLevel1;
import com.powercoder.evaluation.entity.ProdLevel2;
import com.powercoder.evaluation.entity.ProdMessage;
import com.powercoder.evaluation.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：huxinyue
 * @date ：Created in 2020/3/10 20:34
 * @description：${description}
 */
@Mapper
public interface ProdMapper {
  // 返回一级标题
  List<ProdLevel1> getProdLevel1(int level1_id);

  // 返回二级标题
  List<ProdLevel2> getProdLevel2(int level2_id);

  // 产品详情
  List<ProdMessage> getProdMessage(int prod_id);

  // 查找所有产品
  List<Product> selectAllProd();
}
