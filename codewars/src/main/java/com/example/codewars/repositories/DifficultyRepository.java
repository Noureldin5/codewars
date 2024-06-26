package com.example.codewars.repositories;

import com.example.codewars.entities.Difficulty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


    public interface DifficultyRepository extends JpaRepository<Difficulty, Long> {
        Optional<Difficulty> findByName(String difficulty);
    }

