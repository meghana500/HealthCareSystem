package com.hcs.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hcs.cg.entity.Appointment;
import com.hcs.cg.entity.DiagnosticCenter;
import com.hcs.cg.entity.DiagnosticTest;
import com.hcs.cg.repositories.ITestRepository;

@Service("ITestService")
public class ITestServiceImpl implements ITestService {
	
	@Autowired
	ITestRepository iTestRepository;

	@Override
	public DiagnosticTest addTest(DiagnosticTest test) throws Exception{
		iTestRepository.saveAndFlush(test);
		return test;
	}

	@Override
	public DiagnosticTest updateTest(DiagnosticTest test) throws Exception{
		DiagnosticTest  bean = null;
		try {
			bean = iTestRepository.findById(test.getDiagnosticTestId()).get();
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Test details not found!");
		}
		iTestRepository.saveAndFlush(test);
		return test;
	}

	@Override
	public DiagnosticTest removeTest(DiagnosticTest test) throws Exception{
		DiagnosticTest  bean = null;
		try {
			bean = iTestRepository.findById(test.getDiagnosticTestId()).get();
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Test details not found!");
		}
		iTestRepository.deleteById(test.getDiagnosticTestId());
		return test;
	}

	@Override
	public List<DiagnosticTest> viewAllTest(DiagnosticTest test) throws Exception{
		return iTestRepository.findAll();
	}

	@Override
	public DiagnosticTest addTestInCenter(DiagnosticCenter center) throws Exception {
		DiagnosticTest bean = new DiagnosticTest();
		try {
			for(DiagnosticTest i : iTestRepository.findAll()) {
				if(i.getDiagnosticCenter().getName().equals(center)) {
					bean = i;
				}
			}
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Test details not found!");
		}
		bean.setDiagnosticCenter(center);
		return bean;
	}

}
