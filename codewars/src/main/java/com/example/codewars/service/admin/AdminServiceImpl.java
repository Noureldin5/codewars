package com.example.codewars.service.admin;

import com.example.codewars.dto.task.NewDifficultyRequest;
import com.example.codewars.dto.task.TaskResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    @Override
    public void grantAdminPrivilege(Long userId) {


    }

    @Override
    public String addDifficulty(String token, NewDifficultyRequest request) {
        return "";
    }

    @Override
    public List<TaskResponse> showAllRequests(String token) {
        return List.of();
    }

    @Override
    public String approveTask(String token, Long taskId) {
        return "";
    }

    @Override
    public String delete(String token, Long taskId) {
        return "";
    }
}
