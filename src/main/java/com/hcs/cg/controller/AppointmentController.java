package com.hcs.cg.controller;

import java.util.List;

import com.hcs.cg.entity.Appointment;
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
@RequestMapping("/hcs-appointment")
public class AppointmentController {
	
	@Autowired
	IAppointmentService iAppointmentService;

	@PostMapping("/addappointment")
	public Appointment addAppointment(@RequestBody Appointment appointment)  throws Exception {
		return iAppointmentService.addAppointment(appointment);
	}
	
	@GetMapping("/viewappointments/patientName")
	public List<Appointment> viewAppointments(@PathVariable String patientName)  throws Exception {
		return iAppointmentService.viewAppointments(patientName);
	}
	
	@GetMapping("/viewappointment/appointmentId")
	public Appointment viewAppointment(@PathVariable int appointmentId)  throws Exception {
		return iAppointmentService.viewAppointment(appointmentId);
	}
	
	@PutMapping("/updateappointment")
	public Appointment updateAppointment(@RequestBody Appointment appointment)  throws Exception {
		return iAppointmentService.updateAppointment(appointment);
	}
	
	@DeleteMapping("/removeappointment")
	public Appointment removeAppointment(@RequestBody Appointment appointment)  throws Exception {
		return iAppointmentService.removeAppointment(appointment);
	}
}



