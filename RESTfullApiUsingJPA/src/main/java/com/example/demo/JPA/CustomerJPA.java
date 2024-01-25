package com.example.demo.JPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Customer;

public interface CustomerJPA extends JpaRepository<Customer, Integer> {

}
