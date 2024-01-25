package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;  


@Repository
public class EmployeeDAOimp implements EmployeeDao {
	
	EntityManager ref;
	
	@Autowired
	public EmployeeDAOimp(EntityManager ref) {
		// TODO Auto-generated constructor stub
		this.ref=ref;
	}
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		TypedQuery query=ref.createQuery("from Employee",Employee.class);
		List<Employee> emplist=query.getResultList();
		return emplist;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub	
		return ref.find(Employee.class, id);
	}

	@Override
	public Employee save(Employee theEmployee) {
		// TODO Auto-generated method stub	
		return ref.merge(theEmployee);
	}

	@Override
	public Employee update(Employee theEmployee) {
		// TODO Auto-generated method stub
		return ref.merge(theEmployee);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Employee e=ref.find(Employee.class, id);

		
		 ref.remove(e);
	}

}
