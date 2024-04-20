package com.example.codewars.service.user;

import com.example.codewars.dto.task.NewTaskRequest;
import com.example.codewars.dto.user.UserRegisterRequest;
import com.example.codewars.dto.user.UserResponse;
import org.springframework.security.core.userdetails.User;

public interface UserService {
    void register(UserRegisterRequest userRequest);

    UserResponse getById(Long id);
    void deleteById(Long id);

    User findOne(String name);

    String addTask(String token, NewTaskRequest request);
}
