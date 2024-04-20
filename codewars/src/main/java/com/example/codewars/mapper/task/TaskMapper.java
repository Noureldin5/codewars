package com.example.codewars.mapper.task;

import com.example.codewars.dto.task.TaskDetailsResponse;
import com.example.codewars.dto.task.TaskResponse;
import com.example.codewars.entities.Task;

import java.util.List;

public interface TaskMapper {
    List<TaskResponse> newTasksToDtoS();

    TaskDetailsResponse taskDetails(Task task);

    List<TaskResponse> toDtoS();
}
