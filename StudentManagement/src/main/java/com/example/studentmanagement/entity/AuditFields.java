package com.example.studentmanagement.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/*
 * To keep a track of changes made per entity this 
 * class has been created for the common functionality
 * and every entity can extend this class for auditing.
 */
public class AuditFields {

	@CreatedDate
	public LocalDateTime createdDate;
	
	@CreatedBy
	public String createdByUser;
	
	@LastModifiedDate
	public LocalDateTime updatedDate;
	
	@LastModifiedBy
	public String updatedByUser;

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	
	
	//TODO: add Lombok @Data @NoArgsCons @AllArgsConst after Lombok issue is resolved
	
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedByUser() {
		return updatedByUser;
	}

	public void setUpdatedByUser(String updatedByUser) {
		this.updatedByUser = updatedByUser;
	}



	public AuditFields(LocalDateTime createdDate, String createdByUser, LocalDateTime updatedDate,
			String updatedByUser) {
		super();
		this.createdDate = createdDate;
		this.createdByUser = createdByUser;
		this.updatedDate = updatedDate;
		this.updatedByUser = updatedByUser;
	}



	public AuditFields() {
	
	}
	
	

	
}
