package com.hcs.cg.controller;

import java.util.List;

import com.hcs.cg.entity.Admin;
import com.hcs.cg.entity.Appointment;
import com.hcs.cg.service.IAdminService;
import com.hcs.cg.service.IAppointmentService;

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
@RequestMapping("/hcs-admin")
public class AdminController {
	
	@Autowired
	IAdminService iAdminService;
	
	@PostMapping("/addAdmin")
	public Admin registerAdmin(@RequestBody Admin admin) throws Exception{
		return iAdminService.registerAdmin(admin);
	}

}
