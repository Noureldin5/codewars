package com.example.codewars.dto.user;

import com.example.codewars.enums.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserResponse {
    private Long id;
    private String username;
    private String password;
    private String email;
    private Boolean emailVerified;
    private Role role;
    private Integer createdTasks;
    private Integer answeredTasks;
    private String verificationCode;


}

