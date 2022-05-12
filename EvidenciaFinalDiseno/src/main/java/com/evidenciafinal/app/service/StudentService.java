package com.evidenciafinal.app.service;

import java.util.List;

import com.evidenciafinal.app.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student updateStudent(Student student);

	Student getStudentById(Long Id);

	void deleteStudentById(Long id);
}
