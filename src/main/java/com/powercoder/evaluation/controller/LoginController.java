package com.powercoder.evaluation.controller;

import com.powercoder.evaluation.entity.User;
import com.powercoder.evaluation.result.Result;
import com.powercoder.evaluation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

  @Autowired UserService userService;

  @CrossOrigin
  @PostMapping(value = "/api/login")
  @ResponseBody
  public Result login(@RequestBody User requestUser) {
    return userService.login(requestUser);
  }
}
