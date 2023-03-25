package com.autoRent.AutoRenting.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "rentForm")
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
    private LocalDate rentFrom;
    @Column(name = "rentTo")
    private LocalDate rentTo;
    @OneToOne(mappedBy = "rentForm")
    private Transport transport;


    public RentForm() {
    }

    public RentForm(String name, String surname, String address, String phone, String license, LocalDate rentFrom, LocalDate rentTo) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.license = license;
        this.rentFrom = rentFrom;
        this.rentTo = rentTo;
    }
}
