package com.hcs.cg.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TestResult {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int testResultId;
	private double testReading;
	private String condition;
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "appointment_id", referencedColumnName = "appointmentId")
	private Appointment appointment;
	
	public TestResult() {
		super();
	}

	public TestResult(int testResultId, double testReading, String condition, Appointment appointment) {
		super();
		this.testResultId = testResultId;
		this.testReading = testReading;
		this.condition = condition;
		this.appointment = appointment;
	}
	

	public int getTestResultId() {
		return testResultId;
	}

	public void setTestResultId(int testResultId) {
		this.testResultId = testResultId;
	}

	public double getTestReading() {
		return testReading;
	}

	public void setTestReading(double testReading) {
		this.testReading = testReading;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	
	

}
