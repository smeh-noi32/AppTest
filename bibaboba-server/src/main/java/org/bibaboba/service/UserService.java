package org.bibaboba.service;

import org.bibaboba.dto.UserRegisterDTO;
import org.bibaboba.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component
public interface UserService extends UserDetailsService {
    User save(UserRegisterDTO userRegisterDTO);
}
