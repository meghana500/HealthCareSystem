package com.hcs.cg.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcs.cg.entity.Admin;
import com.hcs.cg.entity.Appointment;

@Repository
public interface IAdminRepository extends JpaRepository<Admin,Integer>{
	
	
}