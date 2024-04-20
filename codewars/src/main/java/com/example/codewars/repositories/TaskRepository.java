package com.example.codewars.repositories;

import com.example.codewars.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task, Long>{
}
