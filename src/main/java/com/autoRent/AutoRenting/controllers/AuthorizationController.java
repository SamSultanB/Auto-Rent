package com.autoRent.AutoRenting.controllers;

import com.autoRent.AutoRenting.models.UserDTO;
import com.autoRent.AutoRenting.services.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/")
public class AuthorizationController {

    private UserService userService;

    public AuthorizationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserDTO userDTO(){
        return new UserDTO();
    }

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }


    @GetMapping("/registration")
    public ModelAndView registration(){
        return new ModelAndView("registration");
    }

    @PostMapping("/registration")
    public ModelAndView saveUser(@ModelAttribute("user") UserDTO userDTO){
        userDTO.setRole("USER");
        userService.save(userDTO);
        return new ModelAndView("redirect:/registration");
    }

}
