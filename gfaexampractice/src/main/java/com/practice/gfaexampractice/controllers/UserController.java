package com.practice.gfaexampractice.controllers;

import com.practice.gfaexampractice.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/")
  public String getLoginPage() {
    return "login";
  }

  @GetMapping("/registration")
  public String getRegistrationPage(Model model) {
    model.addAttribute("user", new User());
    return "registration";
  }
}
