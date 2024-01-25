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

import com.example.demo.JPA.CustomerJPA;
import com.example.demo.entity.Customer;

@RestController
@RequestMapping("/customerapi")
public class CustomerController {

	
	CustomerJPA regf;
	
	@Autowired
	public CustomerController(CustomerJPA ref) {
		// TODO Auto-generated constructor stub
		this.regf=ref;
	}
	
	@GetMapping("/getallCustomers")
	public List<Customer> findAll(){
		
		return regf.findAll();
	}
	
	@GetMapping("/getCustomerbyid/{id}")
	public Optional<Customer> findEmployeeByID(@PathVariable int id) {
		
		return regf.findById(id);
	}
	
	@PostMapping("/saveStudent")
	public Customer saveEmp(@RequestBody Customer emp) {
		return regf.save(emp);
	}
	
	@PutMapping("/updateStudent")
	public Customer updateStudent(@RequestBody Customer emp) {
		return regf.save(emp);
	}
	
	@DeleteMapping("/deleteCustomer/{empid}")
	public String deleteCustomer(@PathVariable int empid) {
		 regf.deleteById(empid);
		 return "Delete  Success";
	}
}
