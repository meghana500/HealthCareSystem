package com.hcs.cg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcs.cg.entity.Appointment;


@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment,Integer>{
	
}
