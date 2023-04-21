package com.gmgroup.spring_web_simple_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/home")
  public String index() {
    return "home";
  }
}
