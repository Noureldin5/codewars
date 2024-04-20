package com.example.codewars.dto.task;

import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskFileDtoResponse {
    private Long id;
    private String name;
    private String path;
}
