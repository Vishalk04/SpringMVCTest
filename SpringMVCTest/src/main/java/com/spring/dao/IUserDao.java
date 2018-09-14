package com.spring.dao;

import com.spring.model.User;

public interface IUserDao {
	
	public boolean registerUser(User user);
	
	public User loginUser(User user);

}
