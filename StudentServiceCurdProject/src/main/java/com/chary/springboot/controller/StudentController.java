package com.chary.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chary.springboot.entities.Student;
import com.chary.springboot.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public Student createStudent(@RequestBody Student student) {
	    return studentService.createStudent(student);
	}
  
	@GetMapping("/getAll")
	public List<Student> getAllStudents()
	{
		return studentService.getAllstudents();
		
	}
	@GetMapping("/getById/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return studentService.getStudentById(id);
		
	}
	@PutMapping("/update/{id}")
	public Student updateStudentById(@RequestBody Student student,@PathVariable int id)
	{
		return studentService.updateStudentById(student,id);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		studentService.deleteById(id);
	}
	
	
	
	
}
