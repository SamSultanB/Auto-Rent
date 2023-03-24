package com.autoRent.AutoRenting.controllers;

import com.autoRent.AutoRenting.models.Transport;
import com.autoRent.AutoRenting.services.TransportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private TransportService transportService;

    public AdminController(TransportService transportService){
        this.transportService = transportService;
    }

    @GetMapping
    public ResponseEntity<String> adminHome(){
        return ResponseEntity.ok("Admin page");
    }

    @GetMapping("/cars")
    public ResponseEntity<Collection<Transport>> cars(){
        return ResponseEntity.ok(transportService.getAllTransport());
    }

}
