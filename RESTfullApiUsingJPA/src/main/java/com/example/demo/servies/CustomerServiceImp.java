package com.example.demo.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.CustomerController;
import com.example.demo.entity.Customer;


@Service
public class CustomerServiceImp implements CustomerService {

	CustomerController ref;
	
	
	@Autowired
	public CustomerServiceImp(CustomerController ref) {
		this.ref=ref;
	}
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findById(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByID(int studentId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer updateById(Customer s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer save(Customer s) {
		// TODO Auto-generated method stub
		return null;
	}

}
