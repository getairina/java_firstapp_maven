package com.UG.controller;


import com.UG.repository.ProfessorRepository;
import com.UG.repository.StudentRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Controller {
    private StudentRepository studentRepository;//we make connection only once time
    private ProfessorRepository professorRepository;

    public void initialize() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FirstApp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        studentRepository = new StudentRepository(entityManager);
          }
}
