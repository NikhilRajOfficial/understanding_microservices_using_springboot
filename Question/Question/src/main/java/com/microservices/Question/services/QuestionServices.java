package com.microservices.Question.services;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;


public interface QuestionServices {

    List<Question>get();

    Question get(Long id);

  
} 

