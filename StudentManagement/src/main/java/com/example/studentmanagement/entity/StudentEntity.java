package com.example.studentmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {

	@Id
	@GeneratedValue
	private Long studentId;
	
	@NonNull
	private String studentNumber;
	
	@NonNull
	private String studentName;
	
	@NonNull
	private String studentCourse;
	
	@NonNull
	private String studentAddress;
	
	//TODO: INCLUDE POSSIBILITY OF STUDENT TO SUBJECT MAPPING ONE to Many Mapping
	
}
