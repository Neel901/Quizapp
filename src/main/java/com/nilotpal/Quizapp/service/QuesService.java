package com.nilotpal.Quizapp.service;

import com.nilotpal.Quizapp.Dao.QuestionDao;
import com.nilotpal.Quizapp.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuesService {
    @Autowired
    QuestionDao quesDao;
    public List<Questions> getAllQuestions() {
        return quesDao.findAll();
    }

    public List<Questions> getQuestionByCategory(String category) {
        return quesDao.findByCategory(category);
    }

    public String addQuestion(Questions ques) {
        quesDao.save(ques);
        return "success";
    }
}
