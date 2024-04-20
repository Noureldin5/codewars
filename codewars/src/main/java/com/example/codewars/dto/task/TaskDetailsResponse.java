package com.example.codewars.dto.task;

import com.example.codewars.entities.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TaskDetailsResponse {
    private Long id;
    private String name;
    private String description;
    private List<TaskFileDtoResponse> taskFiles;
    private String difficulty;
    private Integer points;
    private Integer solved;
    private User createdBy;
    private Boolean verified;
}
