package com.hcs.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcs.cg.entity.Patient;
import com.hcs.cg.service.IPatientServiceImpl;



@RestController
@RequestMapping("/hcs-patient")
public class PatientController {
	
	@Autowired
	IPatientServiceImpl iPatientServiceImpl;
	
	@PostMapping("/registerPatient")
	public Patient registerPatient(@RequestBody Patient patient) throws Exception{
		return iPatientServiceImpl.registerPatient(patient);
	}
	
	@GetMapping("/viewAllPatients")
	public List<Patient> viewAllPatients() throws Exception{
		return iPatientServiceImpl.viewAllPatients();
	}
	
	@GetMapping("/viewPatient/patientId")
	public Patient viewPatient(@PathVariable int patientId) throws Exception{
		return iPatientServiceImpl.viewPatient(patientId);
	}
	
	@PutMapping("/updatePatient")
	public Patient updatePatient(@RequestBody Patient patient) throws Exception{
		return iPatientServiceImpl.updatePatient(patient);
	}
	
	@DeleteMapping("/removePatient")
	public Patient removePatient(@RequestBody Patient patient) throws Exception{
		return iPatientServiceImpl.registerPatient(patient);
	}
	
	@GetMapping("/getAllPatients/patientUserName")
	public Patient getAllPatients(@PathVariable  String patientUserName) throws Exception{
		return iPatientServiceImpl.getAllPatients(patientUserName);
	}

}
