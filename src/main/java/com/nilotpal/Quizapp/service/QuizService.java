package com.nilotpal.Quizapp.service;

import com.nilotpal.Quizapp.Dao.QuestionDao;
import com.nilotpal.Quizapp.Dao.QuizDao;
import com.nilotpal.Quizapp.model.Questions;
import com.nilotpal.Quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao questionDao;


    public ResponseEntity<String> createQuiz(String category, int nQ, String name) {

        List<Questions> questions = questionDao.findRandomQuestionsByCategory(category,nQ);

        Quiz quiz = new Quiz();
        quiz.setName(name);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("success", HttpStatus.CREATED);

    }
}
