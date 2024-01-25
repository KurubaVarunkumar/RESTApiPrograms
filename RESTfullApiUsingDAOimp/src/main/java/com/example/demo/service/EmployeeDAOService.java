package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDAOService {
	
	public List<Employee> findAll();
	public Employee findById(int id);
	public Employee save(Employee theEmployee);
	public Employee update(Employee theEmployee);
	public void delete(int id);
}
