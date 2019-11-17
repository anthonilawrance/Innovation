package com.org.portal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="AUTO_GEN_ID")
	private String autoGenId;
	
	@Column(name="ID")
	private String id;
	
	@Column(name="FULL_NAME")
	private String fullName;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="DOB")
	private String DOB;

	public String getAutoGenId() {
		return autoGenId;
	}

	public void setAutoGenId(String autoGenId) {
		this.autoGenId = autoGenId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}	
}
