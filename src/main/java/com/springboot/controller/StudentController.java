package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.entity.Student;
import com.springboot.service.StudentService;

@Controller    // we want it as spring mvc class 
public class StudentController {
	private StudentService studentService;  // inject dependency for studentservice--constructor based 
  // create a constructor 
	public StudentController(StudentService studentService) {  
		super();
		this.studentService = studentService;
	}
	// create a handler method to handle list of students and return model and view 
	// add Model as a method argument  from ' ui package'
	@GetMapping("/students")   // localhost:8080/students
	public String  listStudents(Model model) {
		model.addAttribute("students",studentService.getAllStudents());  
		return "students";  // create a view -  students.html file in src/main/resouces templates folder 
		                   // this will return students.html  
		
	}
	
	// Handler method students new record entry 
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student=new Student();   // student object to hold student form data 
	   model.addAttribute("student",student);
	   return "create_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student){
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	

}
