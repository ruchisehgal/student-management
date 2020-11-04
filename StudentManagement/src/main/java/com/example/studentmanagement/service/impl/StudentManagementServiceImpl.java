package com.example.studentmanagement.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentmanagement.entity.StudentEntity;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.requests.StudentReq;
import com.example.studentmanagement.service.StudentManagementService;

@Service
public class StudentManagementServiceImpl implements StudentManagementService {

	@Autowired
	private final StudentRepository studentRep;

	//TODO: To be replaced by AllArgsConstructor
	public StudentManagementServiceImpl(StudentRepository studentRep) {
		super();
		this.studentRep = studentRep;
	}



	@Override
	public List<StudentReq> fetchAll() {
		
		Iterable<StudentEntity> studentDbResp = studentRep.findAll();
		List<StudentEntity> studentEntity = (List<StudentEntity>) studentDbResp;
		List<StudentReq> studentResp = new ArrayList<>();
		studentEntity.forEach(stEnt -> {
			StudentReq stReq = new StudentReq();
			if(stEnt != null && stEnt.getStudentId() != null) {
				BeanUtils.copyProperties(stEnt, stReq);
			}
			studentResp.add(stReq);
		});
		
		return studentResp;
		
	}



	@Override
	public StudentReq getStudentDetails(Long studentId) {
		Optional<StudentEntity> studentDbResp = studentRep.findById(studentId);
		StudentEntity stEnt = new StudentEntity();
		StudentReq stReq = new StudentReq();
		if(studentDbResp.isPresent()) {
			stEnt = studentDbResp.get();
		}
		if(stEnt != null && stEnt.getStudentId() != null) {
			BeanUtils.copyProperties(stEnt, stReq);
		}
		return stReq;
	}



	@Override
	public StudentReq addStudentDetails(StudentReq studentRequest, Map<String, String> adminDetails) {
		StudentEntity studentEntityDbSave = new StudentEntity();
		StudentReq sReq = new StudentReq();
		studentRequest.setStudentId(new Random().nextLong());
		if(studentRequest != null && studentRequest.getStudentId() != null) {
			BeanUtils.copyProperties(studentRequest, studentEntityDbSave);
		}
		studentEntityDbSave.setCreatedByUser(adminDetails.get("admin"));
		studentEntityDbSave.setCreatedDate(LocalDateTime.now());
		StudentEntity stEnt  = studentRep.save(studentEntityDbSave);
		if(stEnt != null && stEnt.getStudentId() != null) {
			BeanUtils.copyProperties(stEnt, sReq);
		}
		return sReq;
	}
	

	
}
