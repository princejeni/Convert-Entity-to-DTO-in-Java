package com.princejeni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.princejeni.dto.StudentDto;
import com.princejeni.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public List<StudentDto> fetchAllStudents(){
		return studentService.getAllStudents();
	}
	
	
}
