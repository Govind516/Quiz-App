package com.example.quiz_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quiz_app.Model.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer>{
    
}
