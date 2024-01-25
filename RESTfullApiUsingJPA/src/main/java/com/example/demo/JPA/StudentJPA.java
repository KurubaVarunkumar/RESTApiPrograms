package com.example.demo.JPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentJPA extends JpaRepository<Student, Integer> {

}
