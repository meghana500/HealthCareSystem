package com.hcs.cg.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/*
 
 {
	"name" : "center 1",
	"contactNo" : "9989989989",
	"address" : "Mumbai",
	"contactEmail" : "center1@gmail.com"
 }
  
 */

@Entity
public class DiagnosticCenter  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int diagnosticCenterId;
	private String name;
	private String contactNo;
	private String address;
	private String contactEmail;
	
	@OneToMany(mappedBy = "diagnosticCenter" , fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<DiagnosticTest> diagnosticTests;


	public DiagnosticCenter() {
		super();
	}

	public DiagnosticCenter(int diagnosticCenterId, String name, String contactNo, String address, String contactEmail,
			List<String> servicesOffered, List<DiagnosticTest> diagnosticTests) {
		super();
		this.diagnosticCenterId = diagnosticCenterId;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.contactEmail = contactEmail;
		this.diagnosticTests = diagnosticTests;
	}

	public int getDiagnosticCenterId() {
		return diagnosticCenterId;
	}

	public void setDiagnosticCenterId(int diagnosticCenterId) {
		this.diagnosticCenterId = diagnosticCenterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public List<DiagnosticTest> getTests() {
		return diagnosticTests;
	}

	public void setTests(List<DiagnosticTest> tests) {
		this.diagnosticTests = tests;
	}
	
	
	
}
