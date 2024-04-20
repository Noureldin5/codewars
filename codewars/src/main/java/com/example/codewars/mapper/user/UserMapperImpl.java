package com.example.codewars.mapper.user;

import com.example.codewars.dto.user.UserResponse;
import com.example.codewars.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserResponse toDto(User user) {
        UserResponse userRegisterResponse = new UserResponse();
        userRegisterResponse.setId(user.getId());
        userRegisterResponse.setUsername(user.getUsername());
        userRegisterResponse.setEmail(user.getEmail());
        userRegisterResponse.setPassword(user.getPassword());
        userRegisterResponse.setCreatedTasks(user.getCreatedTasks());
        userRegisterResponse.setAnsweredTasks(user.getAnsweredTasks());
        userRegisterResponse.setRole(user.getRole());


        return userRegisterResponse;
    }
}
