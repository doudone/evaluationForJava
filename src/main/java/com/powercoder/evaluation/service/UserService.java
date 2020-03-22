package com.powercoder.evaluation.service;

import com.powercoder.evaluation.entity.User;
import com.powercoder.evaluation.result.Result;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  public Result login(User requestUser) {

    return new Result(200);
  };
}
