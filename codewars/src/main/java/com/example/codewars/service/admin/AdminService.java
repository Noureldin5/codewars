package com.example.codewars.service.admin;

import com.example.codewars.dto.task.NewDifficultyRequest;
import com.example.codewars.dto.task.TaskResponse;

import java.util.List;

public interface AdminService {
    void grantAdminPrivilege(Long userId);

    String addDifficulty(String token, NewDifficultyRequest request);

    List<TaskResponse> showAllRequests(String token);

    String approveTask(String token, Long taskId);

    String delete(String token, Long taskId);
}
