package com.example.codewars.mapper.user;

import com.example.codewars.dto.user.UserRegisterResponse;
import com.example.codewars.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserRegisterResponse toDto(User user) {
        UserRegisterResponse userRegisterResponse = new UserRegisterResponse();
        userRegisterResponse.setId(user.getId());
        return userRegisterResponse;




    }
}
