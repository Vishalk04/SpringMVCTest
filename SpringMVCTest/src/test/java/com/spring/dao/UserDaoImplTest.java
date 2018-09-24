package com.spring.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.spring.model.User;

@RunWith(MockitoJUnitRunner.class)
public class UserDaoImplTest {

	
	@InjectMocks
	UserDaoImpl userDaoImpl;
	
	@Mock
	EntityManager entityManager;
	
	@Mock
	Query mockedQuery;
	


	
	@Test
	public void shouldReturnTrueWhenUserReistered(){
		User user = new User();
		
		doNothing().when(entityManager).persist(user);
		assertTrue(userDaoImpl.registerUser(user));
	}
	
	@Ignore
	@Test
	public void shouldReturnUserIfAvailableInDB (){
 		User user = new User();
		user.setPassword("a");
		user.setUserId(1);
		List<User> result = new ArrayList<User>();
		result.add(user);
		
				String query = "from User where userId=+user.getUserId()";
		
		when(entityManager.createQuery(query).getResultList()).thenReturn(result);
		
		when(result.get(0)).thenReturn(user);
		
		Assert.assertEquals(user.getPassword(), userDaoImpl.loginUser(user).getPassword());
		
	}
		
}
