package com.spring.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.spring.dao.UserDaoImpl;
import com.spring.model.User;

@RunWith(MockitoJUnitRunner.class)
public class LoginServicesImplTest {
	
	@InjectMocks
	LoginServicesImpl loginServicesImpl;
	@Mock
	UserDaoImpl userDaoImpl;
	
	@Test
	public void shouldReturnUserWhenAvailable(){
		User user = new User();
		user.setUserId(1);
		Mockito.when(userDaoImpl.loginUser(user)).thenReturn(user);
		
		loginServicesImpl.loginUser(user);
		
	}
	


}
