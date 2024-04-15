package com.example.codewars.mapper.user;

import com.example.codewars.dto.user.UserResponse;
import com.example.codewars.entities.User;

public interface UserMapper {
    UserResponse toDto(User user);
}
