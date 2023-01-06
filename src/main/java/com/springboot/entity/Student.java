package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newstudent")
public class Student {
  @Id  // this field/ variable is a  primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
    private String firstName;
    private String lastName;
    private String email;

  public Student() {
	  
  }
  
  public Student(String firstName, String lastName, String email) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstname() {
	return firstName;
}
public void setFirstname(String firstname) {
	this.firstName = firstname;
}
public String getLastname() {
	return lastName;
}
public void setLastname(String lastname) {
	this.lastName = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

  
}
