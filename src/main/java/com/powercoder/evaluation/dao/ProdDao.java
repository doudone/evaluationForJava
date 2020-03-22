package com.powercoder.evaluation.dao;

import com.powercoder.evaluation.entity.ProdLevel1;
import com.powercoder.evaluation.entity.ProdLevel2;
import com.powercoder.evaluation.entity.ProdMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdDao {

    @Autowired
    private ProdMapper prodMapper;

    public List<ProdLevel1> getProdLevel1(int level1_id){
        return prodMapper.getProdLevel1(level1_id);
    }

    public List<ProdLevel2> getProdLevel2(int level2_id){
        return prodMapper.getProdLevel2(level2_id);
    }

    public List<ProdMessage> getProdMessage(int prod_id){
        return prodMapper.getProdMessage(prod_id);
    }

}
