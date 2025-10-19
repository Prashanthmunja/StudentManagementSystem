package com.example.StudentManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentManagementSystem.Repository.StudentRepository;
import com.example.StudentManagementSystem.model.StudentModel;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	private Long id;
	public StudentModel addStudent(StudentModel student) {
		return studentRepository.save(student);
	}
	public List<StudentModel>getAllStudent(){
		return studentRepository.findAll();
		
	}public Optional <StudentModel>getStudentById(Long id){
		
		return studentRepository.findById(id);
				}
	public StudentModel updateStudent (long id,StudentModel studentDetails) {
		StudentModel student =studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
		student.setName(studentDetails.getName());
		student.setEmail(studentDetails.getEmail());
		student.setAge(studentDetails.getAge());
		return studentRepository.save(student);
	}
	
	
	

}

