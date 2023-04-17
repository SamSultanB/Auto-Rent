package com.autoRent.AutoRenting.controllers;

import com.autoRent.AutoRenting.models.Transport;
import com.autoRent.AutoRenting.services.TransportService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@Api(description = "Admin controllers")
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
    public ResponseEntity<Collection<Transport>> getAllCars(){
        return ResponseEntity.ok(transportService.getAllTransport());
    }

    @PostMapping("/cars")
    public ResponseEntity<String> addNewCar(@RequestBody Transport transport){
        transportService.save(transport);
        return ResponseEntity.ok("New transport was added!");
    }

    @DeleteMapping()

    @GetMapping("/cars/{id}")
    public ResponseEntity<Transport> getCar(@PathVariable("id") Long id){
        return ResponseEntity.ok(transportService.getTransportById(id));
    }

    @DeleteMapping("/cars/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable("id") Long id){
        transportService.delete(id);
        return ResponseEntity.ok("Transport was deleted");
    }

}
