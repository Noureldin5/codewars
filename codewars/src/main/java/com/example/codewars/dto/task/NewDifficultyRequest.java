package com.example.codewars.dto.task;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewDifficultyRequest {
    private String name;
    private Integer points;
}
