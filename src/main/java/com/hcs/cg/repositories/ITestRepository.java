package com.hcs.cg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcs.cg.entity.DiagnosticTest;

@Repository
public interface ITestRepository extends JpaRepository<DiagnosticTest,Integer>{

}