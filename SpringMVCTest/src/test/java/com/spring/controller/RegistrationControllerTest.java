package com.spring.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.User;
import com.spring.services.RegistrationServicesImpl;

import junit.framework.Assert;


@RunWith(MockitoJUnitRunner.class)
public class RegistrationControllerTest {

	
	@InjectMocks
	RegistrationController registrationController;
	
	
	@Mock
	private RegistrationServicesImpl registrationServices;
	
	
	@Test
	public void test(){
		fail("nopt implemented");
	}
	
	@Test
	public void shouldReturnResgisteredUserSuccessPage(){
		
		User user = new User();
		user.setUserId(1);
		ModelAndView mv = new ModelAndView("registrationSuccessPage", "user", user);
		when(registrationServices.registerUser(user)).thenReturn(true); 
		
		//assertThat(registrationController.resisterUser(user),Matchers.any(ModelAndView.class));
		assertEquals(mv.getViewName(), registrationController.resisterUser(user).getViewName());
		verify(registrationServices, atLeast(1)).registerUser(user);
		
	}
	
	@Test
	public void shouldRegistrationPageWhenRegistrationFailed(){
		User user = new User();
		user.setUserId(1);
		ModelAndView mv = new ModelAndView("registration", "user", user);
		when(registrationServices.registerUser(user)).thenReturn(false);
		
		//assertThat(registrationController.resisterUser(user),Matchers.any(ModelAndView.class));
		assertEquals(mv.getViewName(), registrationController.resisterUser(user).getViewName());
		verify(registrationServices, atLeast(1)).registerUser(user);
	}
	

}
