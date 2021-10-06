package com.havrulyk.springsecurityc10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  @RequestMapping(value = "/main", method = RequestMethod.GET)
  public String main(){
    return "main.html";
  }

  @RequestMapping(value = "/test", method = RequestMethod.POST)
  @ResponseBody
  public String test(){
    return "test";
  }
}
