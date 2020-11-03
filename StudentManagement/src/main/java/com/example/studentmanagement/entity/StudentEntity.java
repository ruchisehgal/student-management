package com.example.studentmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//TODO: add Lombok @Data @NoArgsCons @AllArgsConst after Lombok issue is resolved

/*
 * This class represents the Student Entity that we would be querying to perform 
 * various student management activities
 * It extends the AuditFields class for auditing purpose ie to
 * keep a track of changes made.
 */

@Entity
public class StudentEntity extends AuditFields{

	@Id
	@GeneratedValue
	private Long studentId;
	
	
	private String studentNumber;
	
	
	private String studentName;
	
	
	private String studentCourse;
	
	private String studentEmail;
	
	
	private String studentAddress;
	
	//TODO: INCLUDE POSSIBILITY OF STUDENT TO SUBJECT MAPPING ONE to Many Mapping
	
	/*
	 * Adding Getters,Setters,NO args and All args due to lombok issue
	 * TO BE REMOVED
	 */
	public StudentEntity() {
	}


	public StudentEntity(Long studentId, String studentNumber, String studentName, String studentCourse,
			String studentEmail, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.studentEmail = studentEmail;
		this.studentAddress = studentAddress;
	}


	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}


	public String getStudentNumber() {
		return studentNumber;
	}


	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentCourse() {
		return studentCourse;
	}


	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}


	public String getStudentEmail() {
		return studentEmail;
	}


	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentNumber=" + studentNumber + ", studentName="
				+ studentName + ", studentCourse=" + studentCourse + ", studentEmail=" + studentEmail
				+ ", studentAddress=" + studentAddress + "]";
	}


	
	
}
