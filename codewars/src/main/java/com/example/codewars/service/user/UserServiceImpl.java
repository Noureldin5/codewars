package com.example.codewars.service.user;

import com.example.codewars.dto.user.UserRegisterRequest;
import com.example.codewars.dto.user.UserRegisterResponse;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public void register(UserRegisterRequest userRequest) {

    }

    @Override
    public UserRegisterResponse getById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public User findOne(String name) {
        return null;
    }
}
