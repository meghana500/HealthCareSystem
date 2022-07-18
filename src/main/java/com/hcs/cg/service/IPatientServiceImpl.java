package com.hcs.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcs.cg.entity.Appointment;
import com.hcs.cg.entity.DiagnosticTest;
import com.hcs.cg.entity.Patient;
import com.hcs.cg.repositories.IPatientRepository;

@Service("IPatientService")
public class IPatientServiceImpl implements  IPatientService{
	
	@Autowired
	IPatientRepository iPatientRepository;

	@Override
	public Patient registerPatient(Patient patient) {
		iPatientRepository.saveAndFlush(patient);
		return patient;
	}

	@Override
	public List<Patient> viewAllPatients() {
		return iPatientRepository.findAll();
	}

	@Override
	public Patient viewPatient(int patientId) throws Exception{
		Patient  bean = null;
		try {
			bean = iPatientRepository.findById(patientId).get();
		}
		catch(Exception e) {
			throw new Exception("Patient details not found!");
		}
		return bean;
	}

	@Override
	public Patient updatePatient(Patient patient) throws Exception{
		Patient  bean = null;
		try {
			bean = iPatientRepository.findById(patient.getPatientId()).get();
		}
		catch(Exception e) {
			throw new Exception("Patient details not found!");
		}
		iPatientRepository.saveAndFlush(patient);
		return bean;
	}

	@Override
	public Patient removePatient(Patient patient) throws Exception{
		Patient  bean = null;
		try {
			bean = iPatientRepository.findById(patient.getPatientId()).get();
		}
		catch(Exception e) {
			throw new Exception("Patient details not found!");
		}
		iPatientRepository.deleteById(patient.getPatientId());
		return bean;
	}

	@Override
	public Patient getAllPatients(String patientUserName)throws Exception {
		List<Patient> patients = new ArrayList<Patient>();
		try {
			for(Patient i : iPatientRepository.findAll()) {
				if(i.getName().equals(patientUserName)) {
					patients.add(i);
					break;
				}
			}
		}
		catch(Exception e) {
			throw new Exception("Patient details not found!");
		}
		return patients.get(0);
	}

}
