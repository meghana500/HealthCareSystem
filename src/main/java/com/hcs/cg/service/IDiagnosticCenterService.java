package com.hcs.cg.service;

import java.util.List;

import com.hcs.cg.entity.Appointment;
import com.hcs.cg.entity.DiagnosticCenter;
import com.hcs.cg.entity.DiagnosticTest;


public interface IDiagnosticCenterService {

	public List<DiagnosticCenter> getAllDiagnosticCenters()  throws Exception ;
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) throws Exception;
	public DiagnosticCenter getDiagnosticCenterById(int diagnosticCenterId)  throws Exception ;
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter)  throws Exception ;
	DiagnosticTest viewTestDetails(int diagnosticCenterId,String testName)  throws Exception ;
	DiagnosticTest addTest(int diagnosticcenterId, int testid)  throws Exception ;
	DiagnosticCenter getDiagnosticCenter(String centername)  throws Exception ;
	DiagnosticCenter removeDiagnosticCenter(int id) throws Exception;
	List<Appointment> getListOfAppointments(String centerName)  throws Exception ;

}