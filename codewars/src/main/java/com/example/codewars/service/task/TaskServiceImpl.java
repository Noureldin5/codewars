package com.example.codewars.service.task;

import com.example.codewars.dto.task.NewTaskRequest;
import com.example.codewars.dto.task.TaskDetailsResponse;
import com.example.codewars.dto.task.TaskResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{
    @Override
    public List<TaskResponse> showAllTasks(String token) {
        return List.of();
    }

    @Override
    public String getFileName(Long taskId, Long fileId) {
        return "";
    }

    @Override
    public String deleteTaskFiles(Long task_id) {
        return "";
    }


    @Override
    public String addTask(String token, NewTaskRequest request) {
        return "";
    }

    @Override
    public String attempt(String token, Long taskId, String answer) {
        return "";
    }

    @Override
    public String addTaskFile(String token, Long taskId, MultipartFile file) {
        return "";
    }

    @Override
    public byte[] downloadFile(String fileName) {
        return new byte[0];
    }

    @Override
    public TaskDetailsResponse showById(String token, Long task_id) {
        return null;
    }
}
