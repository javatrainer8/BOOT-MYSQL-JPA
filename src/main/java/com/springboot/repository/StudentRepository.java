package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Long> {
  //first parameter is type of jpa entity  and second parameter is data type of primary key
  	
}
