package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.JPA.StudentJPA;
import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;

@RestController
@RequestMapping("/studentapi")
public class StudentController {

	
	StudentJPA regf;
	
	@Autowired
	public StudentController(StudentJPA ref) {
		// TODO Auto-generated constructor stub
		this.regf=ref;
	}
	
	@GetMapping("/getallStudents")
	public List<Student> findAll(){
		
		return regf.findAll();
	}
	
	@GetMapping("/getStudentbyid/{id}")
	public Optional<Student> findEmployeeByID(@PathVariable int id) {
		
		return regf.findById(id);
	}
	
	@PostMapping("/saveStudent")
	public Student saveEmp(@RequestBody Student emp) {
		return regf.save(emp);
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student emp) {
		return regf.save(emp);
	}
	
	@DeleteMapping("/deleteemp/{empid}")
	public String deleteEmp(@PathVariable int empid) {
		 regf.deleteById(empid);
		 return "Delete  Success";
	}
}
