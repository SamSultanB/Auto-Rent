package com.autoRent.AutoRenting.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

public class RentForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "license")
    private String license;
    @Column(name = "rentFrom")
    private DateTimeFormat rentFrom;
    @Column(name = "rentTo")
    private DateTimeFormat rentTo;
    @OneToOne(mappedBy = "rentForm")
    private User user;


    public RentForm() {
    }

    public RentForm(String name, String surname, String address, String phone, String license, DateTimeFormat rentFrom, DateTimeFormat rentTo) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.license = license;
        this.rentFrom = rentFrom;
        this.rentTo = rentTo;
    }
}
