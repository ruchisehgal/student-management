package com.example.studentmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentmanagement.entity.StudentEntity;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.StudentManagementService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class StudentManagementServiceImpl implements StudentManagementService {

	@Override
	public List<StudentEntity> fetchAll() {
		// TODO Auto-generated method stub
		StudentEntity s1 = new StudentEntity();
		StudentEntity s2 = new StudentEntity();
		List<StudentEntity> l = new ArrayList<>();
		l.add(s1);
		l.add(s2);
		return l;
	}

	
}
