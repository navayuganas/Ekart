package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.entity.User;

import org.springframework.ui.Model;

@Controller
public class AuthController {
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user",new User());
        return "register";
    }
}
