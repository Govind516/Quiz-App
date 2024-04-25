package com.example.quiz_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.quiz_app.Model.Question;

import java.util.List;


@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>           
// class name 'Question' maps to table
// Primary key type 'Ineteger' 
{
    List<Question> findByCategory(String category);

    @Query(value = "SELECT * from question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);

}
