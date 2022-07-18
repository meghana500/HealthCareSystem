package com.hcs.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcs.cg.entity.Appointment;
import com.hcs.cg.entity.DiagnosticCenter;
import com.hcs.cg.entity.DiagnosticTest;
import com.hcs.cg.service.IDiagnosticCenterService;

import java.util.List;

import com.hcs.cg.entity.Appointment;
import com.hcs.cg.service.IAdminService;
import com.hcs.cg.service.IAppointmentService;

import java.util.List;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hcs-diagnosticCenter")
public class DiagnosticCenterController {
	
	@Autowired
	IDiagnosticCenterService iDiagnosticCenterService;
	
	@GetMapping("/getAllDiagnosticCenters")
	public List<DiagnosticCenter> getAllDiagnosticCenters()  throws Exception {
		return iDiagnosticCenterService.getAllDiagnosticCenters();
	}
	
	@PostMapping("/addDiagnosticCenter")
	public DiagnosticCenter addDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) throws Exception{
		return iDiagnosticCenterService.addDiagnosticCenter(diagnosticCenter);
	}
	
	@GetMapping("/getDiagnosticCenterById/{diagnosticCenterId}")
	public DiagnosticCenter getDiagnosticCenterById(@PathVariable int diagnosticCenterId)  throws Exception {
		return iDiagnosticCenterService.getDiagnosticCenterById(diagnosticCenterId);
	}
	
	@PutMapping("/updateDiagnosticCenter")
	public DiagnosticCenter updateDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter)  throws Exception {
		return iDiagnosticCenterService.updateDiagnosticCenter(diagnosticCenter);
	}
	
	@GetMapping("/viewTestDetails/{diagnosticCenterId}/{testName}")
	DiagnosticTest viewTestDetails(@PathVariable int diagnosticCenterId, @PathVariable String testName)  throws Exception {
		return iDiagnosticCenterService.viewTestDetails(diagnosticCenterId, testName);
	}
	
	@PostMapping("/addTest/{diagnosticcenterId}/{testid}")
	DiagnosticTest addTest(@PathVariable int diagnosticcenterId,@PathVariable int testid)  throws Exception {
		return iDiagnosticCenterService.addTest(diagnosticcenterId, testid);
	}
	
	@GetMapping("/getDiagnosticCenter/{centername}")
	DiagnosticCenter getDiagnosticCenter(@PathVariable String centername)  throws Exception {
		return iDiagnosticCenterService.getDiagnosticCenter(centername);
	}
	
	@DeleteMapping("/removeDiagnosticCenter/{id}")
	DiagnosticCenter removeDiagnosticCenter(@PathVariable int id) throws Exception {
		return iDiagnosticCenterService.removeDiagnosticCenter(id);
	}
	
	@GetMapping("/getListOfAppointments/{centerName}")
	List<Appointment> getListOfAppointments(@PathVariable String centerName)  throws Exception {
		return iDiagnosticCenterService.getListOfAppointments(centerName);			
	}

}
