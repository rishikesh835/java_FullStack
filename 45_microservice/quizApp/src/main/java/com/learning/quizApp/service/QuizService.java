package com.learning.quizApp.service;


import com.learning.quizApp.dao.QuestionDao;
import com.learning.quizApp.dao.QuizDao;
import com.learning.quizApp.model.Question;
import com.learning.quizApp.model.QuestionWrapper;
import com.learning.quizApp.model.Quiz;
import com.learning.quizApp.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao questionDao;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> list = questionDao.findRandomQuestionsByCategory(category,numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(list);
        quizDao.save(quiz);
        return new ResponseEntity<>("Sucesss", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
        Optional<Quiz> quiz = quizDao.findById(id);
        // Check if the quiz is present
        if (quiz.isPresent()) {
            // Get the questions from the quiz object
            List<Question> questionsFromDB = quiz.get().getQuestions();
            List<QuestionWrapper> questionsForUser = new ArrayList<>();
            // Loop through each question and convert it to QuestionWrapper
            for (Question q : questionsFromDB) {
                QuestionWrapper qw = new QuestionWrapper(
                        q.getId(),
                        q.getQuestionTitle(),
                        q.getOption1(),
                        q.getOption2(),
                        q.getOption3(),
                        q.getOption4()
                );
                questionsForUser.add(qw); // Add each mapped question to the list
            }
            return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
        } else {
            // Handle case when the quiz is not found
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            throw new ResourceNotFoundException("Quiz not found with id: " + id);
        }
    }
    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizDao.findById(id).get();
        List<Question> questions = quiz.getQuestions();
        int right = 0;
        int i = 0;
        for (Response response : responses) {
            if (response.getResponse().equals(questions.get(i).getRightAnswer())) {
                right++;
            }
            i++;
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }

}
