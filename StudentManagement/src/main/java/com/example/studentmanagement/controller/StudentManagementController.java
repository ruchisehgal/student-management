package com.example.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanagement.entity.StudentEntity;
import com.example.studentmanagement.service.StudentManagementService;

//TODO: Resolve Spring Tool Suite Lombok Issue
@RestController
public class StudentManagementController {

	@Autowired
	private final StudentManagementService stuManagementService;
	
	public StudentManagementController(StudentManagementService stuManagementService) {
		this.stuManagementService = stuManagementService;
	}
	
	@GetMapping("/students")
    public List<StudentEntity> getUsers() {
        return stuManagementService.fetchAll();
    }

	
}
