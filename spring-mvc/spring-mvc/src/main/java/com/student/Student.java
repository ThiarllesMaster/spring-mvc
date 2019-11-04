package com.student;

import javax.persistence.Entity;

@Entity
public class Student {

	private Long id;
	private String nameStudent;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}	
}
