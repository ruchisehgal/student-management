package com.example.studentmanagement.service;

import java.util.List;
import java.util.Map;

import com.example.studentmanagement.requests.StudentReq;


public interface StudentManagementService {
	public List<StudentReq> fetchAll();

	public StudentReq getStudentDetails(Long studentId);

	public StudentReq addStudentDetails(StudentReq studentRequest, Map<String, String> adminDetails);
	 

}
