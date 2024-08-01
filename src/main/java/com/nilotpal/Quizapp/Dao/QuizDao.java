package com.nilotpal.Quizapp.Dao;

import com.nilotpal.Quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
