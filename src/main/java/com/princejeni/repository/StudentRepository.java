package com.princejeni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.princejeni.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
