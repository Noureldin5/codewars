package com.example.codewars.repositories;

import com.example.codewars.entities.TaskFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskFileRepository extends JpaRepository<TaskFile, Long>{

}
