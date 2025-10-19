package com.example.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementSystem.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel,Long>{

	
	
	

}
