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

import com.hcs.cg.entity.DiagnosticCenter;
import com.hcs.cg.entity.DiagnosticTest;
import com.hcs.cg.entity.TestResult;
import com.hcs.cg.service.ITestResultService;
import com.hcs.cg.service.ITestService;


@RestController
@RequestMapping("/hcs-test")
public class TestController {
	
	@Autowired
	ITestService iTestService;
	
	@PostMapping("/addTest")
	public DiagnosticTest addTest(@RequestBody DiagnosticTest test) throws Exception{
		return iTestService.addTest(test);
	}
	
	@PutMapping("/updateTest")
	public DiagnosticTest updateTest(@RequestBody DiagnosticTest test) throws Exception{
		return iTestService.updateTest(test);
	}
	
	@DeleteMapping("/removeTest")
	public DiagnosticTest removeTest(@RequestBody DiagnosticTest test) throws Exception{
		return iTestService.removeTest(test);
	}
	
	@GetMapping("/viewAllTest")
	public List<DiagnosticTest> viewAllTest(@RequestBody DiagnosticTest test) throws Exception{
		return iTestService.viewAllTest(test);
	}
	
	@PostMapping("/addTestInCenter")
	public DiagnosticTest addTestInCenter(@RequestBody DiagnosticCenter center) throws Exception{
		return iTestService.addTestInCenter(center);
	}

}
