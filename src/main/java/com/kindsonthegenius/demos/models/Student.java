package com.kindsonthegenius.demos.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private Integer studentId;
	private String name;
	private String department;
	
	public Student() {
		
	}
	
	public Student(Integer studentId, String name, String department) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.department = department;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
