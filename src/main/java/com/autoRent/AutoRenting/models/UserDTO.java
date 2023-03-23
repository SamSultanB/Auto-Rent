package com.autoRent.AutoRenting.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String email;
    private String password;

    public UserDTO() {

    }

    public UserDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
