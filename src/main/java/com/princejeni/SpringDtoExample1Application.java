package com.princejeni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.princejeni.model.Student;
import com.princejeni.repository.StudentRepository;

@SpringBootApplication
public class SpringDtoExample1Application implements CommandLineRunner{
	
	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDtoExample1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student();
		student1.setName("Julius Ikebiagbo");
		student1.setAge(23);
		student1.setEmail("freghd@gmail.com");
		student1.setPassword("password");
		student1.setPhoneNumber("904748784");
		studentRepository.save(student1);
		
		Student student2 = new Student();
		student2.setName("John Cena");
		student2.setAge(53);
		student2.setEmail("john@gmail.com");
		student2.setPassword("password");
		student2.setPhoneNumber("904748784");
		studentRepository.save(student2);
		
		Student student3 = new Student();
		student3.setName("Daniel Bush");
		student3.setAge(35);
		student3.setEmail("daniel@gmail.com");
		student3.setPassword("password");
		student3.setPhoneNumber("904748784");
		studentRepository.save(student3);
		
		Student student4 = new Student();
		student4.setName("Geryr Henry");
		student4.setAge(46);
		student4.setEmail("freghd@gmail.com");
		student4.setPassword("password");
		student4.setPhoneNumber("904748784");
		studentRepository.save(student4);
		
	}

}
