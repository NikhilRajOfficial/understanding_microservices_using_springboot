package com.microservices.Question.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.Question.entities.Question;


public interface QuestionRepo extends JpaRepository<Question, Long> {


}

