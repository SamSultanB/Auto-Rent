package com.autoRent.AutoRenting.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String role;

    public UserDTO() {

    }

    public UserDTO(String name, String surname, String email, String password, String role) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
