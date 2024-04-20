package com.example.codewars.controller;

import com.example.codewars.dto.task.NewDifficultyRequest;
import com.example.codewars.dto.task.NewTaskRequest;
import com.example.codewars.dto.task.TaskResponse;
import com.example.codewars.service.admin.AdminService;
import com.example.codewars.service.task.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;
    private final TaskService taskService;
    @PostMapping("/add/difficulty")
    public String addDifficulty(@RequestHeader("Authorization") String token, @RequestBody NewDifficultyRequest request){
        return adminService.addDifficulty(token, request);
    }
    @PostMapping("/add/task")
    public String addTask(@RequestHeader("Authorization") String token, @RequestBody NewTaskRequest request){
        return taskService.addTask(token, request);
    }
    @PostMapping("/add/{task_id}")
    public String addTaskFile(@RequestHeader("Authorization") String token,@PathVariable Long task_id , @RequestParam(value = "file") MultipartFile file){
        return taskService.addTaskFile(token, task_id, file);
    }
    @GetMapping("/show/task_offers")
    public List<TaskResponse> showAllRequest(@RequestHeader("Authorization") String token){
        return adminService.showAllRequests(token);
    }
    @PostMapping("/approve/{task_id}")
    public String approveTask(@RequestHeader("Authorization") String token, @PathVariable Long task_id){
        return adminService.approveTask(token, task_id);
    }

    @DeleteMapping("/delete/{task_id}")
    public String deleteTask(@RequestHeader("Authorization") String token, @PathVariable Long task_id){
        return adminService.delete(token, task_id);
    }
}
