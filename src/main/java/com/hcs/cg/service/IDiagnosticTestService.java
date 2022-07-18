package com.hcs.cg.service;

import java.util.List;

import com.hcs.cg.entity.Appointment;
import com.hcs.cg.entity.DiagnosticTest;

public interface IDiagnosticTestService {
	
	public DiagnosticTest addDiagnosticTest(DiagnosticTest diagnosticTest) throws Exception;
	public List<DiagnosticTest> getDiagnosticTests() throws Exception; 
	public DiagnosticTest getdiagnosticTest(int diagnosticTestId) throws Exception;
	public DiagnosticTest updateDiagnosticTest(DiagnosticTest diagnosticTest) throws Exception;
	public DiagnosticTest removeDiagnosticTest(DiagnosticTest diagnosticTest) throws Exception;

}
