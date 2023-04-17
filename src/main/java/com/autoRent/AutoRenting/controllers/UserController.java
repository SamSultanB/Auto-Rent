package com.autoRent.AutoRenting.controllers;

import com.autoRent.AutoRenting.models.RentForm;
import com.autoRent.AutoRenting.models.Transport;
import com.autoRent.AutoRenting.services.TransportService;
import com.autoRent.AutoRenting.services.UserService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Collection;

@RestController
@Api(description = "User controllers")
@RequestMapping("/home")
public class UserController {

    private TransportService transportService;
    private UserService userService;

    public UserController(TransportService transportService, UserService userService){
        this.transportService = transportService;
        this.userService = userService;
    }
    @GetMapping
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("User home page");
    }

    @GetMapping("/cars")
    public ResponseEntity<Collection<Transport>> getAllCars(){
        return ResponseEntity.ok(transportService.getAllTransport());
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity<Transport> getCar(@PathVariable("id") Long id){
        return ResponseEntity.ok(transportService.getTransportById(id));
    }

    @PostMapping("/cars/{id}")
    public ResponseEntity<String> rentCar(@PathVariable("id") Long id, @RequestBody RentForm rentForm, Principal principal){
        transportService.getTransportById(id).setRentForm(rentForm);
        transportService.getTransportById(id).setAvailable("Not available");
        userService.getUserByEmail(principal.getName()).setTransport(transportService.getTransportById(id));
        return ResponseEntity.ok("Transport is rent successfully!");
    }

}