package com.hcs.cg.service;

import java.util.List;
import java.util.Set;

import com.hcs.cg.entity.DiagnosticCenter;
import com.hcs.cg.entity.DiagnosticTest;

public interface ITestService {

	public DiagnosticTest addTest(DiagnosticTest test) throws Exception;
	public DiagnosticTest updateTest(DiagnosticTest test) throws Exception;
	public DiagnosticTest removeTest(DiagnosticTest test) throws Exception;
	public List<DiagnosticTest> viewAllTest(DiagnosticTest test) throws Exception;
	public DiagnosticTest addTestInCenter(DiagnosticCenter center) throws Exception;
	
}
