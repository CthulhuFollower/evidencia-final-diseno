package com.evidenciafinal.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evidenciafinal.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}