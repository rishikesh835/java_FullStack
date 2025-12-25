package com.learning.quizApp.dao;

import com.learning.quizApp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;



public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
