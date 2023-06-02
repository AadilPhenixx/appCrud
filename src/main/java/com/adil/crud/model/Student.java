package com.adil.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
@Id	
@GeneratedValue()
 private Long id;
 private String FirstName;
 private String LastName;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public Student(String firstName, String lastName) {
	super();
	FirstName = firstName;
	LastName = lastName;
}
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
}
 
 
}
