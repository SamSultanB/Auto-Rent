package com.autoRent.AutoRenting.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public UserRole() {

    }

    public UserRole(String name) {
        super();
        this.name = name;
    }

}
