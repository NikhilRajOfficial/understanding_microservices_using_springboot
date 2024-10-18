package com.microservices.Quiz.services;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import com.microservices.Quiz.entities.Quiz;

public interface QuizServices {

    Quiz create(Question question);
    List<Quiz>get();

    Quiz get(Long id);

  
} 

