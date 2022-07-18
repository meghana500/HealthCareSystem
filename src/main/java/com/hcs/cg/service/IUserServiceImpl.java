package com.hcs.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcs.cg.entity.TestResult;
import com.hcs.cg.entity.User;
import com.hcs.cg.repositories.IUserRepository;

@Service("IUserService")
public class IUserServiceImpl implements IUserService{
	
	@Autowired
	IUserRepository iUserRepository;
	
	@Override
	public User addUser(User user) {
		iUserRepository.saveAndFlush(user);
		return user;
	}

	@Override
	public User validateUser(String username, String password) throws Exception {
		User bean = null;
		try {
			for(User i : iUserRepository.findAll()) {
				if(i.getUsername().equals(username)) {
					if(i.getPassword().equals(password)) {
						bean = i;
						return bean;
					}
					return bean;
				}
			}
		}
		catch(Exception e) {
			throw new Exception("User details not found! Invalid details");
		}
		return bean;
	}

	@Override
	public User removeUser(User user) throws Exception {
		User  bean = null;
		try {
			bean = iUserRepository.findById(user.getUserId()).get();
		}
		catch(Exception e) {
			throw new Exception("Test Result details not found!");
		}
		iUserRepository.deleteById(user.getUserId());
		return bean;
	}
	
	

}
