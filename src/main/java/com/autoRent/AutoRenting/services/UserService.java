package com.autoRent.AutoRenting.services;

import com.autoRent.AutoRenting.models.User;
import com.autoRent.AutoRenting.models.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserDTO userDTO);
    User getUserById(Long id);
    User getUserByEmail(String email);
}
