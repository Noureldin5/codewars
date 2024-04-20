package com.example.codewars.service.task;

import com.example.codewars.dto.task.NewTaskRequest;
import com.example.codewars.dto.task.TaskDetailsResponse;
import com.example.codewars.dto.task.TaskResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface TaskService {
    String addTask(String token, NewTaskRequest request);

    String addTaskFile(String token, Long task_id, MultipartFile file);
    byte[] downloadFile(String fileName);

    TaskDetailsResponse showById(String token, Long task_id);

    List<TaskResponse> showAllTasks(String token);

    String getFileName(Long taskId, Long fileId);

    String deleteTaskFiles(Long task_id);

    String attempt(String token, Long taskId, String answer);
}
