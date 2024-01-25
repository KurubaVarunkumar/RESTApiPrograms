package com.example.demo.servies;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
	public List<Student> findAll();
	public Student findById(int studentId);
	public void deleteByID(int studentId);
	public Student updateById(Student s);
	public Student save(Student s);
	

}
