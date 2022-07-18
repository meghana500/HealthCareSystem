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
import com.hcs.cg.entity.User;
import com.hcs.cg.service.ITestResultService;
import com.hcs.cg.service.IUserService;


@RestController
@RequestMapping("/hcs-testResult")
public class UserController {
	
	@Autowired
	IUserService iUserService;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) throws Exception{
		return iUserService.addUser(user);
	}
	
	@GetMapping("/validateUser/username/password")
	public User validateUser(@PathVariable String username,@PathVariable  String password) throws Exception{
		return iUserService.validateUser(username, password);
	}
	
	@DeleteMapping("/removeUser")
	public User removeUser(@RequestBody User user) throws Exception{
		return iUserService.removeUser(user);
	}

}
