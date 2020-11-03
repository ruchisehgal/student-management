package com.example.studentmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
//TODO: Resolve Spring Tool Suite Lombok Issue
/*
 * @Data
 * 
 * @NoArgsConstructor
 * 
 * @AllArgsConstructor
 * 
 * @Getter
 * 
 * @Setter
 */
public class StudentEntity {

	@Id
	@GeneratedValue
	private Long studentId;
	
	
	private String studentNumber;
	
	
	private String studentName;
	
	
	private String studentCourse;
	
	
	private String studentAddress;
	
	//TODO: INCLUDE POSSIBILITY OF STUDENT TO SUBJECT MAPPING ONE to Many Mapping
	
}
