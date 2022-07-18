package com.hcs.cg.service;

import java.util.List;

import com.hcs.cg.entity.DiagnosticTest;
import com.hcs.cg.entity.TestResult;

public interface ITestResultService {

	public TestResult addTestResult(TestResult testResult) throws Exception;
	public List<TestResult> getTestResults() throws Exception;
	public TestResult getTestResult(int testResultId) throws Exception;
	public TestResult updateTestResult(TestResult testResult) throws Exception;
	public TestResult removeTestResult(TestResult testResult) throws Exception;

}
