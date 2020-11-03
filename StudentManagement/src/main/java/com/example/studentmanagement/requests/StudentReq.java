package com.example.studentmanagement.requests;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * This class represents the Student Request/Response object to /from the UI
 */
public class StudentReq implements Serializable {

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
	public StudentReq() {
	}


	public StudentReq(Long studentId, String studentNumber, String studentName, String studentCourse,
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

}
