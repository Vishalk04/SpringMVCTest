package com.spring.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.spring.dao.UserDaoImpl;
import com.spring.model.User;

@RunWith(MockitoJUnitRunner.class)
public class RegistrationServicesImplTest {

	@InjectMocks
	private RegistrationServicesImpl registrationServicesImpl;
	
	 
	@Mock
	private UserDaoImpl userDao;
	
	
	
	
	@Test
	public void shouldReturnTrueWhenUserReistered(){
		
		User user = new User();
		user.setUserId(1);
		
		when(userDao.registerUser(user)).thenReturn(true);
		
		assertTrue(registrationServicesImpl.registerUser(user));
		
		verify(userDao, atMost(1)).registerUser(user);
		
	}

	@Test
	public void shouldReturnFallseWhenUserNotReistered(){

		User user = new User();
		user.setUserId(1);
		
		when(userDao.registerUser(user)).thenReturn(false);
		
		assertFalse(registrationServicesImpl.registerUser(user));
		
		verify(userDao, atMost(1)).registerUser(user);
	}
}
