package com.kindsonthegenius.demos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kindsonthegenius.demos.models.Student;
import com.kindsonthegenius.demos.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/students")
	public List<Student> getAll() {		
		return studentService.getAll();		
	}
	
	
	
}
