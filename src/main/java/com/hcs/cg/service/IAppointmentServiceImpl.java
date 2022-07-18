package com.hcs.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcs.cg.entity.Appointment;
import com.hcs.cg.repositories.IAppointmentRepository;

@Service("IAppointmentService")
public class IAppointmentServiceImpl implements IAppointmentService {
	
	@Autowired
	IAppointmentRepository iAppointmentRepository;

	@Override
	public Appointment addAppointment(Appointment appointment)  throws Exception  {
		iAppointmentRepository.saveAndFlush(appointment);
		return appointment;
	}

	@Override
	public List<Appointment> viewAppointments(String patientName)  throws Exception  {
		List<Appointment> appointments = new ArrayList<Appointment>();
		try {
			for(Appointment i : iAppointmentRepository.findAll()) {
				if(i.getPatient().getName().equals(patientName)) {
					appointments.add(i);
				}
			}
		}
		catch(Exception e) {
			throw new Exception("Appointment details not found!");
		}
		return appointments;
	}

	@Override
	public Appointment viewAppointment(int appointmentId) throws Exception {
		Appointment  bean = null;
		try {
			bean = iAppointmentRepository.findById(appointmentId).get();
		}
		catch(Exception e) {
			throw new Exception("Appointment details not found!");
		}
		return bean;
	}

	@Override
	public Appointment updateAppointment(Appointment appointment)  throws Exception {
		Appointment  bean = null;
		try {
			bean = iAppointmentRepository.findById(appointment.getAppointmentId()).get();
		}
		catch(Exception e) {
			throw new Exception("Appointment details not found!");
		}
		iAppointmentRepository.saveAndFlush(appointment);
		return appointment;
	}

	@Override
	public Appointment removeAppointment(Appointment appointment)  throws Exception  {
		Appointment  bean = null;
		try {
			bean = iAppointmentRepository.findById(appointment.getAppointmentId()).get();
		}
		catch(Exception e) {
			throw new Exception("Appointment details not found!");
		}
		iAppointmentRepository.deleteById(appointment.getAppointmentId());
		return appointment;
	}

}
