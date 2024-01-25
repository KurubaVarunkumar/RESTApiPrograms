package com.example.demo.servies;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {
	public List<Customer> findAll();
	public Customer findById(int id);
	public void deleteByID(int id);
	public Customer updateById(Customer s);
	public Customer save(Customer s);
}
