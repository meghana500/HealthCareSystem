package com.hcs.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcs.cg.entity.Admin;
import com.hcs.cg.repositories.IAdminRepository;

@Service("IAdminService")
public class IAdminServiceImpl implements IAdminService {
	
	@Autowired
	IAdminRepository iAdminRepository;

	@Override
	public Admin registerAdmin(Admin admin) throws Exception {
		iAdminRepository.saveAndFlush(admin);
		return admin;
		
	}

}
