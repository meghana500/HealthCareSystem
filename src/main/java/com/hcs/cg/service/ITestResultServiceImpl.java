package com.hcs.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcs.cg.entity.Patient;
import com.hcs.cg.entity.TestResult;
import com.hcs.cg.repositories.ITestResultRepository;

@Service("ITestResultService")
public class ITestResultServiceImpl implements ITestResultService {
	
	
	@Autowired
	ITestResultRepository iTestResultRepository;

	@Override
	public TestResult addTestResult(TestResult testResult) throws Exception{
		iTestResultRepository.saveAndFlush(testResult);
		return testResult;
	}

	@Override
	public List<TestResult> getTestResults() throws Exception{
		return iTestResultRepository.findAll();
	}

	@Override
	public TestResult getTestResult(int testResultId) throws Exception{
		TestResult  bean = null;
		try {
			bean = iTestResultRepository.findById(testResultId).get();
		}
		catch(Exception e) {
			throw new Exception("Test Result details not found!");
		}
		return bean;
	}

	@Override
	public TestResult updateTestResult(TestResult testResult) throws Exception{
		TestResult  bean = null;
		try {
			bean = iTestResultRepository.findById(testResult.getTestResultId()).get();
		}
		catch(Exception e) {
			throw new Exception("Test Result details not found!");
		}
		iTestResultRepository.saveAndFlush(testResult);
		return bean;
	}

	@Override
	public TestResult removeTestResult(TestResult testResult) throws Exception{
		TestResult  bean = null;
		try {
			bean = iTestResultRepository.findById(testResult.getTestResultId()).get();
		}
		catch(Exception e) {
			throw new Exception("Test Result details not found!");
		}
		iTestResultRepository.deleteById(testResult.getTestResultId());
		return bean;
	}

}
