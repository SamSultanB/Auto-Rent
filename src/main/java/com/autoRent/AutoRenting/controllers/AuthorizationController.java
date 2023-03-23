package com.autoRent.AutoRenting.controllers;

import com.autoRent.AutoRenting.models.User;
import com.autoRent.AutoRenting.models.UserDTO;
import com.autoRent.AutoRenting.models.UserRole;
import com.autoRent.AutoRenting.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@RestController
@RequestMapping(path = "/")
public class AuthorizationController {

    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    public AuthorizationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String login(){
        return "Login! If you are first time, please go to registration page!";
    }

    @PostMapping
    public ResponseEntity<String> loginPost(@RequestBody UserDTO userDTO){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                userDTO.getEmail(), userDTO.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>("You signed-in successfully!.", HttpStatus.OK);
    }

    @GetMapping("/registration")
    public String registration(){
        return "Registration page";
    }

    @PostMapping("/registration")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        user.setUserRole( Arrays.asList(new UserRole("USER")));
        userService.save(user);
        return ResponseEntity.ok("User registered successfully!");
    }

}
