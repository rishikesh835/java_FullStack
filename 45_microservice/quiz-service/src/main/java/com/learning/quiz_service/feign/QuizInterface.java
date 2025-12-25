package com.learning.quiz_service.feign;

import com.learning.quiz_service.model.QuestionWrapper;
import com.learning.quiz_service.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface QuizInterface{

    @GetMapping("question/generate")
    public ResponseEntity<List<Integer>> generateQuestion(@RequestParam String categoryName, @RequestParam Integer numQuestions);

    @PostMapping("question/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestions(@RequestBody List<Integer> questionIds);


    //generate
    //getQuestions(questionid)
    //getScore

    @PostMapping("question/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);

}
