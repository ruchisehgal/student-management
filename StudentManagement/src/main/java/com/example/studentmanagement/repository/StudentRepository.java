package com.example.studentmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.studentmanagement.entity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long>  {
	
}
