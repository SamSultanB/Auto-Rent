package com.autoRent.AutoRenting.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "license")
    private String license;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transports_id", referencedColumnName = "id")
    private Transport transport;

    public User(){

    }

    public User(
            String name,
            String surname,
            String email,
            String password,
            String phone,
            String address,
            String license
    ) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.license = license;
    }

}
