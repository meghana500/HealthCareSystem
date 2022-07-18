package com.hcs.cg.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointmentId;
	
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate appointmentDate;
	
	private String approvalStatus;
	
	@OneToMany(mappedBy = "appointment" , fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<DiagnosticTest> diagnosticTest;
	
	@OneToMany(mappedBy = "appointment" , fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<TestResult> testResult;
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "patient_id", referencedColumnName = "patientId")
	private Patient patient;
	
	@OneToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "diagnostic_center_id", referencedColumnName = "diagnosticCenterId")
	private DiagnosticCenter diagnosticCenter;

	public Appointment() {
		super();
	}

	public Appointment(int appointmentId, LocalDate appointmentDate, String approvalStatus,
			List<DiagnosticTest> diagnosticTest, List<TestResult> testResult, Patient patient,
			DiagnosticCenter diagnosticCenter) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.approvalStatus = approvalStatus;
		this.diagnosticTest = diagnosticTest;
		this.testResult = testResult;
		this.patient = patient;
		this.diagnosticCenter = diagnosticCenter;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public List<DiagnosticTest> getDiagnosticTest() {
		return diagnosticTest;
	}

	public void setDiagnosticTest(List<DiagnosticTest> diagnosticTest) {
		this.diagnosticTest = diagnosticTest;
	}

	public List<TestResult> getTestResult() {
		return testResult;
	}

	public void setTestResult(List<TestResult> testResult) {
		this.testResult = testResult;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}

	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}

	

}
