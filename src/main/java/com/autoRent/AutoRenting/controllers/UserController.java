package com.autoRent.AutoRenting.controllers;

import com.autoRent.AutoRenting.models.Transport;
import com.autoRent.AutoRenting.services.TransportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/home")
public class UserController {

    private TransportService transportService;

    public UserController(TransportService transportService){
        this.transportService = transportService;
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

}