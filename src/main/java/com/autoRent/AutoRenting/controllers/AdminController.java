package com.autoRent.AutoRenting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AdminController {

    @GetMapping("/admin")
    public String adminHome(){
        return "Admin home page";
    }

    public String addCar(){
        return "Car is added";
    }

    public String bookedCar(){
        return "Booked car";
    }

    public String bookedCars(){
        return "List of booked cars";
    }

}
