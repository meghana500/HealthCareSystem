package com.hcs.cg.service;

import java.util.List;

import com.hcs.cg.entity.TestResult;
import com.hcs.cg.entity.User;

public interface IUserService {
	
	public User addUser(User user) throws Exception;
	public User validateUser(String username, String password) throws Exception;
	public User removeUser(User user) throws Exception;

}
