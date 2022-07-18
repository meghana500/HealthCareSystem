package com.hcs.cg.service;

import java.util.List;

import com.hcs.cg.entity.DiagnosticTest;
import com.hcs.cg.entity.Patient;

public interface IPatientService {
	
	
	public Patient registerPatient(Patient patient) throws Exception;
	public List<Patient> viewAllPatients() throws Exception;
	public Patient viewPatient(int patientId) throws Exception;
	public Patient updatePatient(Patient patient) throws Exception;
	public Patient removePatient(Patient patient) throws Exception;
	public Patient getAllPatients(String patientUserName) throws Exception;

}
