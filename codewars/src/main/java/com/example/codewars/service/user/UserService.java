package com.example.codewars.service.user;

import com.example.codewars.dto.user.UserRegisterRequest;
import com.example.codewars.dto.user.UserRegisterResponse;
import org.springframework.security.core.userdetails.User;

public interface UserService {
    void register(UserRegisterRequest userRequest);
    UserRegisterResponse getById(Long id);
    void deleteById(Long id);

    User findOne(String name);
}
