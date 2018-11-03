package com.practice.gfaexampractice.controllers;

import com.practice.gfaexampractice.models.User;
import com.practice.gfaexampractice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

  private UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/")
  public String getLoginPage() {
    return "login";
  }

  @GetMapping("/registration")
  public String getRegistrationPage(Model model) {
    model.addAttribute("user", new User());
    return "registration";
  }

  @PostMapping("/registration")
  public String reggisterUser(@ModelAttribute User user) {
    return "";
  }
}
