package com.spring.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.IUserDao;
import com.spring.model.User;

@Service
public class RegistrationServicesImpl implements IRegistrationServices {

	@Autowired
	private IUserDao userDao;
	
	
	@Transactional
	public boolean registerUser(User user) {
	
		return userDao.registerUser(user);
		
	}

}
