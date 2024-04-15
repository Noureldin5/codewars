package com.example.codewars.service.auth;

import com.example.codewars.dto.AuthLogin.AuthLoginRequest;
import com.example.codewars.dto.AuthLogin.AuthLoginResponse;
import com.example.codewars.dto.user.UserRegisterRequest;
import com.example.codewars.entities.User;

public interface AuthService {
    void register(UserRegisterRequest userRegisterRequest);

    AuthLoginResponse login(AuthLoginRequest authLoginRequest);
    User getUserFromToken(String token);
    String confirm(String code);
}
