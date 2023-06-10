package com.princejeni.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.princejeni.dto.StudentDto;
import com.princejeni.model.Student;
import com.princejeni.repository.StudentRepository;

@Service
public class StudentService {
	
	   @Autowired
	 private StudentRepository studentRepository;
	
	public List<StudentDto> getAllStudents(){
		return studentRepository.findAll()
				.stream()
				.map(this::convertEntitytoDto)
				.collect(Collectors.toList());
	}
	
	private StudentDto convertEntitytoDto(Student student) {
		StudentDto studentDto = new StudentDto();
		studentDto.setId(student.getId());
		studentDto.setName(student.getName());
		studentDto.setAge(student.getAge());
		studentDto.setEmail(student.getEmail());
		return studentDto;
	}

}
