package com.hcs.cg.controller;

import java.util.List;

import com.hcs.cg.entity.DiagnosticTest;
import com.hcs.cg.service.IDiagnosticTestService;

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
@RequestMapping("/hcs-diagnosticTest")
public class DiagnosticTestController {
	
	@Autowired
	IDiagnosticTestService iDiagnosticTestService;
	
	@PostMapping("/addDiagnosticTest")
	public DiagnosticTest addDiagnosticTest(@RequestBody DiagnosticTest diagnosticTest) throws Exception{
		return iDiagnosticTestService.addDiagnosticTest(diagnosticTest);
	}
	
	@GetMapping("/getDiagnosticTests")
	public List<DiagnosticTest> getDiagnosticTests() throws Exception{
		return iDiagnosticTestService.getDiagnosticTests();
	}
	
	@GetMapping("/getdiagnosticTest/diagnosticTestId")
	public DiagnosticTest getdiagnosticTest(@PathVariable int diagnosticTestId) throws Exception{
		return iDiagnosticTestService.getdiagnosticTest(diagnosticTestId);
	}
	
	@PutMapping("/updateDiagnosticTest")
	public DiagnosticTest updateDiagnosticTest(@RequestBody DiagnosticTest diagnosticTest) throws Exception{
		return iDiagnosticTestService.updateDiagnosticTest(diagnosticTest);
	}
	
	@DeleteMapping("/removeDiagnosticTest")
	public DiagnosticTest removeDiagnosticTest(@RequestBody DiagnosticTest diagnosticTest) throws Exception{
		return iDiagnosticTestService.removeDiagnosticTest(diagnosticTest);
	}


}
