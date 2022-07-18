package com.hcs.cg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcs.cg.entity.TestResult;

@Repository
public interface ITestResultRepository extends JpaRepository<TestResult,Integer>{

}
