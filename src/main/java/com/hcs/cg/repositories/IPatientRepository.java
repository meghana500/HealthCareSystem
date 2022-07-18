package com.hcs.cg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcs.cg.entity.DiagnosticTest;
import com.hcs.cg.entity.Patient;

@Repository
public interface IPatientRepository extends JpaRepository<Patient,Integer>{

}
