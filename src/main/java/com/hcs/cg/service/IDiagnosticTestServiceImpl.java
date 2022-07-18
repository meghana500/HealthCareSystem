package com.hcs.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcs.cg.entity.Appointment;
import com.hcs.cg.entity.DiagnosticTest;
import com.hcs.cg.repositories.IDiagnosticTestRepository;

@Service("IDiagnosticTestService")
public class IDiagnosticTestServiceImpl implements IDiagnosticTestService{
	
	
	@Autowired
	IDiagnosticTestRepository iDiagnosticTestRepository;

	@Override
	public DiagnosticTest addDiagnosticTest(DiagnosticTest diagnosticTest) throws Exception {
		iDiagnosticTestRepository.saveAndFlush(diagnosticTest);
		return diagnosticTest;
	}

	@Override
	public List<DiagnosticTest> getDiagnosticTests() throws Exception{
		return iDiagnosticTestRepository.findAll();
	}

	@Override
	public DiagnosticTest getdiagnosticTest(int diagnosticTestId) throws Exception{
		DiagnosticTest  bean = null;
		try {
			bean = iDiagnosticTestRepository.findById(diagnosticTestId).get();
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Test details not found!");
		}
		return bean;
	}

	@Override
	public DiagnosticTest updateDiagnosticTest(DiagnosticTest diagnosticTest) throws Exception{
		DiagnosticTest  bean = null;
		try {
			bean = iDiagnosticTestRepository.findById(diagnosticTest.getDiagnosticTestId()).get();
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Test details not found!");
		}
		iDiagnosticTestRepository.saveAndFlush(diagnosticTest);
		return diagnosticTest;
	}

	@Override
	public DiagnosticTest removeDiagnosticTest(DiagnosticTest diagnosticTest) throws Exception{ 
		DiagnosticTest  bean = null;
		try {
			bean = iDiagnosticTestRepository.findById(diagnosticTest.getDiagnosticTestId()).get();
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Test details not found!");
		}
		iDiagnosticTestRepository.deleteById(diagnosticTest.getDiagnosticTestId());
		return diagnosticTest;
	}

}
