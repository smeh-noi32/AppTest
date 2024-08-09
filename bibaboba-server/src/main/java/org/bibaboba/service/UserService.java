package org.bibaboba.service;

import org.bibaboba.dto.UserRegisterDTO;
import org.bibaboba.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegisterDTO userRegisterDTO);
}
