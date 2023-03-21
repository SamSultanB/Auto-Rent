package com.autoRent.AutoRenting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/home")
public class UserController {
    @GetMapping
    public ModelAndView home(){
        return new ModelAndView("home");
    }

}
