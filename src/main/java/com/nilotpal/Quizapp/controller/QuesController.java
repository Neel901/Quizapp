package com.nilotpal.Quizapp.controller;

import com.nilotpal.Quizapp.model.Questions;
import com.nilotpal.Quizapp.service.QuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuesController {

    @Autowired
    QuesService questionService;

    @GetMapping("allQuestions")
    public List<Questions> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{cat}")
    public List<Questions> getQuestionByCategory(@PathVariable("cat") String category){
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Questions ques){
       return questionService.addQuestion(ques);
    }
}
