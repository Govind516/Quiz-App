package com.example.quiz_app.controller;

import com.example.quiz_app.Model.Question;
import com.example.quiz_app.service.QuestionServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Question")
public class QuestionController {

  @Autowired QuestionServices questionServices;

  @GetMapping("AllQuestions")
  public ResponseEntity<List<Question>> getAllQuestion() {
    return questionServices.getAllQuestion();
  }

  @GetMapping("category/{category}")
  public ResponseEntity<List<Question>> getQuestionByCategory(
      @PathVariable String
          category) { // PathVariable is used for URL parts with "\"
    return questionServices.getQuestionByCategory(category);
  }

  @PostMapping("add")
  public ResponseEntity<String> addQuestion(
      @RequestBody Question question) { // 'RequestBody' will convert the input
                                        // question in JSON format to values
    return questionServices.addQuestion(question);
  }
}
