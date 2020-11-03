package com.example.studentmanagement.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanagement.requests.StudentReq;
import com.example.studentmanagement.service.StudentManagementService;

//TODO: Resolve Spring Tool Suite Lombok Issue
@RestController
@RequestMapping("/studentManagement")
//@Slf4j commenting due to lombok issue
public class StudentManagementController {

	
	@Autowired
	private final StudentManagementService stuManagementService;
	
	public StudentManagementController(StudentManagementService stuManagementService) {
		this.stuManagementService = stuManagementService;
	}
	
	
	@GetMapping("/students")
    public ResponseEntity<List<StudentReq>> getAllStudentDetails() {
		List<StudentReq> stReq = new ArrayList<>();
		try {
			stReq = stuManagementService.fetchAll();
		}
		catch(NullPointerException  ex) {
			//log.error("Exception occurred while retrieving Student Data", ne.getMessage());
			ex.printStackTrace();
			throw ex;
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(stReq);
		
    }
	
	@GetMapping("/studentDetails/{studentId}")
    public ResponseEntity<StudentReq> getStudentDetails(@PathVariable String studentId) {
		StudentReq stReq = new StudentReq();
		try {
			stReq = stuManagementService.getStudentDetails(Long.parseLong(studentId));
		}
		catch(NullPointerException  ex) {
			//log.error("Exception occurred while retrieving Student Data", ne.getMessage());
			ex.printStackTrace();
			throw ex;
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(stReq);
		
    }
	
	@PostMapping(path ="/addStudent", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentReq> addStudentDetails(
			@RequestBody StudentReq studentRequest,
			@RequestHeader Map<String, String> adminDetails) {
		StudentReq stReq = new StudentReq();
		try {
			stReq = stuManagementService.addStudentDetails(studentRequest, adminDetails);
		}
		catch(NullPointerException  ex) {
			//log.error("Exception occurred while retrieving Student Data", ne.getMessage());
			ex.printStackTrace();
			throw ex;
		}
		
		return stReq!=null ? ResponseEntity.status(HttpStatus.CREATED).body(stReq):
							 ResponseEntity.status(HttpStatus.NO_CONTENT).body(stReq)	;
			
		
		
	}
	
	
	

	
}
