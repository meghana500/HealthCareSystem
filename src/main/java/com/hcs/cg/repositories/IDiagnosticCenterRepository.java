package com.hcs.cg.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcs.cg.entity.Appointment;
import com.hcs.cg.entity.DiagnosticCenter;
import com.hcs.cg.entity.DiagnosticTest;

@Repository
public interface IDiagnosticCenterRepository  extends JpaRepository<DiagnosticCenter,Integer>{
	
}
