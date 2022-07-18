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

import com.hcs.cg.entity.TestResult;
import com.hcs.cg.service.ITestResultService;


@RestController
@RequestMapping("/hcs-testResult")
public class TestResultController {
	
	@Autowired
	ITestResultService iTestResultService;
	
	@PostMapping("/addTestResult")
	public TestResult addTestResult(@RequestBody TestResult testResult) throws Exception{
		return iTestResultService.addTestResult(testResult);
	}
	
	@GetMapping("/getTestResults")
	public List<TestResult> getTestResults() throws Exception{
		return iTestResultService.getTestResults();
	}
	
	@GetMapping("/getTestResult/testResultId")
	public TestResult getTestResult(@PathVariable int testResultId) throws Exception{
		return iTestResultService.getTestResult(testResultId);
	}
	
	@PutMapping("/updateTestResult")
	public TestResult updateTestResult(@RequestBody TestResult testResult) throws Exception{
		return iTestResultService.updateTestResult(testResult);
	}
	
	@DeleteMapping("/removeTestResult")
	public TestResult removeTestResult(@RequestBody TestResult testResult) throws Exception{
		return iTestResultService.removeTestResult(testResult);
	}

}
