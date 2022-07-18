package com.hcs.cg.service;

import java.util.List;

import com.hcs.cg.entity.Appointment;

public interface IAppointmentService {
	
	public Appointment addAppointment(Appointment appointment)  throws Exception ;
	public List<Appointment> viewAppointments(String patientName)  throws Exception ;
	public Appointment viewAppointment(int appointmentId)  throws Exception ;
	public Appointment updateAppointment(Appointment appointment)  throws Exception ;
	public Appointment removeAppointment(Appointment appointment)  throws Exception ;

}
