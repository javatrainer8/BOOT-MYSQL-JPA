package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;

@SpringBootApplication
public class BootMvcMySqlJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BootMvcMySqlJpaApplication.class, args);
		System.out.println(" OK up and Running ");
		}
	@SuppressWarnings("unused")
	@Autowired
	private StudentRepository studentRepository;
@Override
public void run(String... args ) throws Exception{
	
	 Student student1= new Student ("radhika", "Ahmed","ahmed@gmail.com");
	 studentRepository.save(student1); 
	 Student student2= new Student ("ramesh ","M","rishi@gmail.com"); 
	 studentRepository.save(student2); 
	 Student student3 =  new Student("eohith", "U", "mohith@gmail.com");
	 studentRepository.save(student3);
	 
}
}
