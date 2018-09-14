package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.spring.model.User;

@Repository
public class UserDaoImpl implements IUserDao{

	@PersistenceContext
	EntityManager entityManager;

	public boolean registerUser(User user) {
		
		System.out.println("RegistrationDaoImpl ");
		entityManager.persist(user);
		System.out.println("RegistrationDaoImpl  done "); 
		
		return true;
		
	}

	@Override
	public User loginUser(User user) {
	/*	Query query = entityManager.createQuery("Select sm from SecureMessage sm where sm.someField=:arg1");
		query.setParameter("arg1", arg1);*/
		@SuppressWarnings("unchecked")
		List<User> result = entityManager.createQuery("from User where userId="+user.getUserId()).getResultList()
				;//" and password='"+user.getPassword()+"'"

		
		return result.get(0);
		
	}
}
