package com.autoRent.AutoRenting.controllers;

import com.autoRent.AutoRenting.models.UserDTO;
import com.autoRent.AutoRenting.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(description = "Login controllers")
@RequestMapping("/")
public class AuthorizationController {

    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;


    public AuthorizationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    @ApiOperation("Shows login")
    public String login(){
        return "Login! If you are first time, please go to registration page!";
    }

    @PostMapping("/login")
    @ApiOperation("Takes data to login")
    public ResponseEntity<String> login(@RequestBody UserDTO userDTO) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                userDTO.getEmail(), userDTO.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return ResponseEntity.ok("User signed-in successfully!.");
    }

    @GetMapping("/registration")
    @ApiOperation("Registration field")
    public String registration(){
        return "Registration page";
    }

    @PostMapping("/registration")
    @ApiOperation("Takes data to register")
    public ResponseEntity<String> saveUser(@RequestBody UserDTO userDTO){
        userDTO.setRole("USER");
        userService.save(userDTO);
        return ResponseEntity.ok("User registered successfully!");
    }

}