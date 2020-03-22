package com.powercoder.evaluation.dao;

import com.powercoder.evaluation.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

  User getUser(String username, String password);
}
