package com.hcs.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcs.cg.entity.Appointment;
import com.hcs.cg.entity.DiagnosticCenter;
import com.hcs.cg.entity.DiagnosticTest;
import com.hcs.cg.repositories.IAppointmentRepository;
import com.hcs.cg.repositories.IDiagnosticCenterRepository;
import com.hcs.cg.repositories.IDiagnosticTestRepository;

@Service("IDiagnosticCenterService")
public class IDiagnosticCenterServiceImpl implements IDiagnosticCenterService{
	
	@Autowired
	IDiagnosticCenterRepository iDiagnosticCenterRepository;
	
	@Autowired
	IDiagnosticTestRepository iDiagnosticTestRepository;
	
	@Autowired
	IAppointmentRepository iAppointmentRepository;
	

	@Override
	public List<DiagnosticCenter> getAllDiagnosticCenters()  throws Exception{
		return iDiagnosticCenterRepository.findAll();
	}

	@Override
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) throws Exception {
		iDiagnosticCenterRepository.saveAndFlush(diagnosticCenter);
		return diagnosticCenter;
	}

	@Override
	public DiagnosticCenter getDiagnosticCenterById(int diagnosticCenterId)  throws Exception {
		DiagnosticCenter  bean = null;
		try {
			bean = iDiagnosticCenterRepository.findById(diagnosticCenterId).get();
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Center details not found!");
		}
		return bean;
	}

	@Override
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter)  throws Exception {
		DiagnosticCenter  bean = null;
		try {
			bean = iDiagnosticCenterRepository.findById(diagnosticCenter.getDiagnosticCenterId()).get();
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Center details not found!");
		}
		iDiagnosticCenterRepository.saveAndFlush(diagnosticCenter);
		return diagnosticCenter;
	}

	@Override
	public DiagnosticTest viewTestDetails(int diagnosticCenterId, String testName)  throws Exception{
		List<DiagnosticTest> diagnosticTests = new ArrayList<DiagnosticTest>();
		try {
			for(DiagnosticTest i : iDiagnosticTestRepository.findAll()) {
				if(i.getDiagnosticCenter().getDiagnosticCenterId()==diagnosticCenterId && i.getTestName().equals(testName)) {
					return i;
				}
			}
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Tests details not found!");
		}
		return null;
	}

	@Override
	public DiagnosticTest addTest(int diagnosticcenterId, int testid)  throws Exception{
		DiagnosticCenter  bean = null;
		try {
			bean = iDiagnosticCenterRepository.findById(diagnosticcenterId).get();
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Center details not found!");
		}
		bean.getTests().add(iDiagnosticTestRepository.findById(testid).get());
		return iDiagnosticTestRepository.findById(testid).get();
	}

	@Override
	public DiagnosticCenter getDiagnosticCenter(String centername)  throws Exception{
		List<DiagnosticCenter> diagnosticCenters = new ArrayList<DiagnosticCenter>();
		try {
			for(DiagnosticCenter i : iDiagnosticCenterRepository.findAll()) {
				if(i.getName().equals(centername)) {
					return i;
				}
			}
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Center details not found!");
		}
		return null;
	}

	@Override
	public DiagnosticCenter removeDiagnosticCenter(int id) throws Exception {
		DiagnosticCenter  bean = null;
		try {
			bean = iDiagnosticCenterRepository.findById(id).get();
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Center details not found!");
		}
		iDiagnosticCenterRepository.deleteById(id);
		return bean;
	}

	@Override
	public List<Appointment> getListOfAppointments(String centerName)  throws Exception{
		List<Appointment> appointments = new ArrayList<Appointment>();
		try {
			for(Appointment i : iAppointmentRepository.findAll()) {
				if(i.getDiagnosticCenter().getName().equals(centerName)) {
					appointments.add(i);
				}
			}
		}
		catch(Exception e) {
			throw new Exception("Diagnostic Center details not found!");
		}
		return appointments;
	}

}
