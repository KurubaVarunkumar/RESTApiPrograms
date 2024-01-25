package com.example.demo.entity.controller;

import java.util.List;

import org.hibernate.Remove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeDAOService;

@RestController
@RequestMapping("/empapi")
public class EmployeeController {
	
	
	EmployeeDAOService regf;
	
	@Autowired
	public EmployeeController(EmployeeDAOService regf) {
		// TODO Auto-generated constructor stub
		this.regf=regf;
	}
	
	@GetMapping("/getallEmployees")
	public List<Employee> findAll(){
		
		return regf.findAll();
	}
	
	@GetMapping("/getempbyid/{empid}")
	public Employee findEmployeeByID(@PathVariable int empid) {
		
		return regf.findById(empid);
	}
	
	@PostMapping("/saveemp")
	public Employee saveEmp(@RequestBody Employee emp) {
		return regf.save(emp);
	}
	
	@PutMapping("/updateemp")
	public Employee updateEmp(@RequestBody Employee emp) {
		return regf.update(emp);
	}
	
	@DeleteMapping("/deleteemp/{empid}")
	public String deleteEmp(@PathVariable int empid) {
		 regf.delete(empid);
		 return "Delete  Success";
	}
	
}
