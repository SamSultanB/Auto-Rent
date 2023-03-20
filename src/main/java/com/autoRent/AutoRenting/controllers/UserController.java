package com.autoRent.AutoRenting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping
    public ModelAndView userPage(){
        return new ModelAndView("login");
    }

    @GetMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("home");
    }
}
