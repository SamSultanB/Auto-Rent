package com.autoRent.AutoRenting.services;

import com.autoRent.AutoRenting.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(User user);
}
