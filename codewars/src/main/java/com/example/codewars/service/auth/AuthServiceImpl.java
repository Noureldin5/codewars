package com.example.codewars.service.auth;

import com.example.codewars.dto.AuthLogin.AuthLoginRequest;
import com.example.codewars.dto.AuthLogin.AuthLoginResponse;
import com.example.codewars.dto.user.UserRegisterRequest;
import com.example.codewars.entities.User;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{
    @Override
    public void register(UserRegisterRequest userRegisterRequest) {

    }

    @Override
    public AuthLoginResponse login(AuthLoginRequest authLoginRequest) {
        return null;
    }

    @Override
    public User getUserFromToken(String token) {
        return null;
    }

    @Override
    public String confirm(String code) {
        return "";
    }
}
