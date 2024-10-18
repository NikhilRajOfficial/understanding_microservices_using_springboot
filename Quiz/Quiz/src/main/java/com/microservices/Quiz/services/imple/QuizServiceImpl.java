package com.microservices.Quiz.services.imple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.Quiz.entities.Quiz;
import com.microservices.Quiz.repository.QuizRepo;
import com.microservices.Quiz.services.QuizServices;


@Service
public class QuizServiceImpl implements QuizServices {


     private QuizRepo quizRepo;

      public QuizServiceImpl(QuizRepo quizRepo)
      {
           this.quizRepo=quizRepo;
      }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepo.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
    }

}
