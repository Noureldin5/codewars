package com.example.codewars.controller;

import com.example.codewars.dto.task.NewTaskRequest;
import com.example.codewars.dto.task.TaskResponse;
import com.example.codewars.service.task.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/tasks")
    public List<TaskResponse> showAllTasks(@RequestHeader("Authorization") String token) {
        return taskService.showAllTasks(token);
    }

    @PostMapping("/task/add")
    public String addTask(@RequestHeader("Authorization") String token, @RequestBody NewTaskRequest request) {
        return taskService.addTask(token, request);
    }
    @PostMapping("/{task_id}/answer")
    public String attemptAnswer(@RequestHeader("Authorization") String token, @RequestParam String answer, @PathVariable Long task_id){
        return taskService.attempt(token, task_id, answer);
    }


}

