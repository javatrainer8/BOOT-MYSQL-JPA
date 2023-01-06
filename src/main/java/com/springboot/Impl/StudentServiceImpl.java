package com.springboot.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;
import com.springboot.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;  // constructor based DI, create a constructor 
	// constructor created with fields  
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}  // only one field so,  avoid using @void annotation 

	@Override   // we have override this method, its from StudentService interface 
	public List<Student> getAllStudents() { // call method 
		return studentRepository.findAll();  // this gives list of students 
		
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}





