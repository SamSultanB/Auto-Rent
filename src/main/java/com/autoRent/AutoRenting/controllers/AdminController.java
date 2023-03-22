package com.autoRent.AutoRenting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AdminController {

    @GetMapping("/admin")
    public String adminHome(){
        return "This is admin page!";
    }

}
