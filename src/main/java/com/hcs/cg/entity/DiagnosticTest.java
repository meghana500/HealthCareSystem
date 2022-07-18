package com.hcs.cg.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/*
 
  {
  	"testName" : "Heart Test",
    "testPrice" : 2000,
    "normalValue" : "120",
    "units" : 5
    
  }
  
  
 */


@Entity
public class DiagnosticTest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int diagnosticTestId;
	
	private String testName;
	private double testPrice;
	private String normalValue;
	private String units;
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "appointment_id", referencedColumnName = "appointmentId")
	private Appointment appointment;
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "diagnostic_center_id", referencedColumnName = "diagnosticCenterId")
	private DiagnosticCenter diagnosticCenter;

	public DiagnosticTest() {
		super();
	}

	public DiagnosticTest(int diagnosticTestId, String testName, double testPrice, String normalValue, String units,
			Appointment appointment, DiagnosticCenter diagnosticCenter) {
		super();
		this.diagnosticTestId = diagnosticTestId;
		this.testName = testName;
		this.testPrice = testPrice;
		this.normalValue = normalValue;
		this.units = units;
		this.appointment = appointment;
		this.diagnosticCenter = diagnosticCenter;
	}

	public int getDiagnosticTestId() {
		return diagnosticTestId;
	}

	public void setDiagnosticTestId(int diagnosticTestId) {
		this.diagnosticTestId = diagnosticTestId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public double getTestPrice() {
		return testPrice;
	}

	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}

	public String getNormalValue() {
		return normalValue;
	}

	public void setNormalValue(String normalValue) {
		this.normalValue = normalValue;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}

	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}

	
	

}
