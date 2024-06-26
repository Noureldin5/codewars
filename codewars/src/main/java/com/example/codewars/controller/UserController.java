package com.example.codewars.controller;

import com.example.codewars.dto.task.NewTaskRequest;
import com.example.codewars.dto.user.UserRegisterRequest;
import com.example.codewars.dto.user.UserResponse;
import com.example.codewars.service.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    @PostMapping("/register")
    public void register(@RequestBody UserRegisterRequest userRequest){
        userService.register(userRequest);
    }
    @GetMapping("/{id}")
    public UserResponse getById(@PathVariable Long id){
        return userService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id ){
        userService.deleteById(id);

    }
    @PostMapping("/task/add")
    public String addTask(@RequestHeader("Authorization") String token, @RequestBody NewTaskRequest request){
        return userService.addTask(token, request);
    }
}
