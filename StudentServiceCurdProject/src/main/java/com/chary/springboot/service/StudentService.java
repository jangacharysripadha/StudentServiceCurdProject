package com.chary.springboot.service;

import java.util.List;

import com.chary.springboot.entities.Student;

public interface StudentService {
	public Student createStudent(Student student);

	public Student getStudentById(int id);

	public List<Student> getAllstudents();

	public Student updateStudentById(Student student, int id);

	public void deleteById(int id);

}
