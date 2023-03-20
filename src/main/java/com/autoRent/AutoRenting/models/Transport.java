package com.autoRent.AutoRenting.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Transports")
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "registrationMark")
    private String registrationMark;
    @Column(name = "model")
    private String model;
    @Column(name = "color")
    private String color;
    @Column(name = "year")
    private String year;
    @Column(name = "volume")
    private String volume;
    @Column(name = "passengerSeats")
    private String passengerSeats;
    @Column(name = "pricePerDay")
    private String pricePerDay;
    @Column(name = "available")
    private String available;
    @OneToOne(mappedBy = "transport")
    private User user;

    public Transport(){

    }

    public Transport(
            String registrationMark,
            String model,
            String color,
            String year,
            String volume,
            String passengerSeats,
            String pricePerDay,
            String available
    ) {
        this.registrationMark = registrationMark;
        this.model = model;
        this.color = color;
        this.year = year;
        this.volume = volume;
        this.passengerSeats = passengerSeats;
        this.pricePerDay = pricePerDay;
        this.available = available;
    }
}
