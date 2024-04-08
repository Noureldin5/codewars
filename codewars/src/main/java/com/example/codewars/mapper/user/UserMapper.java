package com.example.codewars.mapper.user;

import com.example.codewars.dto.user.UserRegisterResponse;
import com.example.codewars.entities.User;

public interface UserMapper {
    UserRegisterResponse toDto(User user);
}
