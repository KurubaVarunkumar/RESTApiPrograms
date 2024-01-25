package com.example.demo.servies;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.JPA.StudentJPA;
import com.example.demo.entity.Student;

@Service
public class StudentServiceImp implements StudentService{

	
	StudentJPA ref;
	
	@Autowired
	public StudentServiceImp(StudentJPA ref) {
		// TODO Auto-generated constructor stub
		this.ref=ref;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return ref.findAll();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> op=ref.findById(id);
		Student a=op.get();
		return a;
		
	}

	@Override
	public void deleteByID(int id) {
		// TODO Auto-generated method stub
		ref.deleteById(id);
	}

	@Override
	public Student updateById(Student s) {
		// TODO Auto-generated method stub
		return ref.save(s);
	}

	@Override
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return ref.save(s);
	}
	
	
	
//	public List<Student> findAll(){
//		return ref.findAll();
//	}
//
//	@Override
//	public Student findById(int id) {
//		// TODO Auto-generated method stub
//		Optional<Student> op=ref.findById(id);
//		Student a=op.get();
//		return a;
//	}
//
//	@Override
//	public void deleteByID(int studentId) {
//		// TODO Auto-generated method stub
//		ref.deleteById(studentId);
//		
//	}
//
//	@Override
//	public Student updateById(Student s) {
//		// TODO Auto-generated method stub
//		return ref.save(s);
//	}
//
//	@Override
//	public Student save(Student s) {
//		// TODO Auto-generated method stub
//		return ref.save(s);
//	}
}
