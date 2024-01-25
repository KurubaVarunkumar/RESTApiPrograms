package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImplement implements EmployeeDAOService {
	
	EmployeeDao ref;
	
	
	@Autowired
	public EmployeeServiceImplement(EmployeeDao ref) {
		// TODO Auto-generated constructor stub
		this.ref=ref;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		
		return ref.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return ref.findById(id);
	}

	@Override
	@Transactional
	public Employee save(Employee theEmployee) {
		// TODO Auto-generated method stub
		return ref.save(theEmployee);
	}

	@Override
	@Transactional
	public Employee update(Employee theEmployee) {
		// TODO Auto-generated method stub
		return ref.update(theEmployee);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		ref.delete(id);
	}

}
