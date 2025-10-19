package com.example.StudentManagementSystem.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
public class StudentModel{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	private int age;
	
	public StudentModel(long id,String name,String email,int age) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.age=age;
		
		
	}

}
