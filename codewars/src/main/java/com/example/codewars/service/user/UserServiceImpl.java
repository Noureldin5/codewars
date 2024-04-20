package com.example.codewars.service.user;

import com.example.codewars.dto.task.NewTaskRequest;
import com.example.codewars.dto.user.UserRegisterRequest;
import com.example.codewars.dto.user.UserResponse;
import com.example.codewars.exception.NotFoundException;
import com.example.codewars.mapper.user.UserMapper;
import com.example.codewars.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import com.example.codewars.entities.User;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public void register(UserRegisterRequest userRequest) {
        if (userRequest.getUsername().isEmpty()) {
            throw new NotFoundException("Username can't be empty", HttpStatus.BAD_REQUEST);
        }

        User user = new User();
        user.setId(userRequest.getId());
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setEmail(userRequest.getEmail());
        user.setRole(userRequest.getRole());
        user.setCreatedTasks(userRequest.getCreatedTasks());


        userRepository.save(user);
    }


    @Override
    public UserResponse getById(Long id) {
        return null;

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public org.springframework.security.core.userdetails.User findOne(String name) {
        return null;
    }

    @Override
    public String addTask(String token, NewTaskRequest request) {
        return "";
    }
}
