package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Book;

public interface BooksJPA extends JpaRepository<Book,Integer> {

}
