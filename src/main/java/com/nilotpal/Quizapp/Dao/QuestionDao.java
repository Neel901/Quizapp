package com.nilotpal.Quizapp.Dao;

import com.nilotpal.Quizapp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Questions,Integer> {
        List<Questions> findByCategory(String category);

        @Query(value = "SELECT * from ques q where q.category = :category ORDER BY RAND() LIMIT :nQ", nativeQuery = true)
        List<Questions> findRandomQuestionsByCategory(String category, int nQ);
}
