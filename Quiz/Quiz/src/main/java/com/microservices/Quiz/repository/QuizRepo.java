package com.microservices.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.Quiz.entities.Quiz;


public interface QuizRepo extends JpaRepository<Quiz, Long> {


}

