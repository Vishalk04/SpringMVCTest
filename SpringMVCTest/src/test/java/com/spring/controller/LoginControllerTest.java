package com.spring.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Login;
import com.spring.model.User;
import com.spring.services.LoginServicesImpl;

@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {

	@InjectMocks
	LoginController loginController;
	
	
	@Mock
	LoginServicesImpl loginServicesImp;
	
	
	
	@Ignore
	@Test
	public void shouldLoginUserWhenUserIdAndPasswordIsCorrect(){

		
		Login login = new Login(); 
		login.setUserId("1");;
		login.setPassword("a");
		
		
		User user1 = new User(); 
		user1.setUserId(1);
		user1.setPassword("a");
		user1.setUserFirstName("a");
		User user = new User(); 
		user.setUserId(1);
		user.setPassword("a");
		user.setUserFirstName("a");
		
		ModelAndView mv = new ModelAndView("welcome", "user", user1.getUserFirstName());
		
	//	when(login.getUserId()).thenReturn("1");
		//when(login.getUserId()).thenReturn("a");
		when(loginServicesImp.loginUser(user)).thenReturn(user1);
	

		assertEquals(mv.getViewName(),  loginController.loginUser(login).getViewName());
		
	}

	@Ignore
	@Test
	public void shouldNotLoginUserWhenUserIdAndPasswordIsNotCorrect(){

		User user1 = new User(); 
		user1.setUserId(1);
		user1.setPassword("admin");
		User user = new User(); 
		
		when(loginServicesImp.loginUser(user)).thenReturn(user1);
		//Assert.assertNotEquals("login",  loginController.loginUser(login).getViewName());
		
	}

}
