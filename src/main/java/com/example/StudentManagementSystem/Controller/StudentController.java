package com.example.StudentManagementSystem.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentManagementSystem.Service.StudentService;
import com.example.StudentManagementSystem.model.StudentModel;
@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentservice;
	@PostMapping
	public StudentModel createStudent(@RequestBody StudentModel student) {
		return studentservice.addStudent(student);
		
		
		

		
	}@GetMapping
	public List<StudentModel>getAllStudents(){
		return studentservice.getAllStudent();
	}@GetMapping("/{id}")
	public Optional<StudentModel>getStudentByid(@PathVariable Long id){
		return studentservice.getStudentById(id);
	}
	@PutMapping("/{id}")
	public StudentModel updateStudent( @PathVariable   Long id,@RequestBody  StudentModel student) {
		return studentservice.updateStudent(id,student);
	}
	

	
}
