package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.User;
import com.spring.services.IRegistrationServices;

@Controller
public class RegistrationController {

	/*@PersistenceContext
	EntityManager entityManager;*/


	@Autowired
	private IRegistrationServices registrationServices;
	
	
	@RequestMapping(value = "/registration" , method = RequestMethod.POST)
	public ModelAndView resisterUser(@ModelAttribute("user") User user){
		System.out.println("registration:");
		System.out.println(user);
		//entityManager.persist(user);
		ModelAndView mv;
		if( registrationServices.registerUser(user)){
			System.out.println("registration success");
			mv = new ModelAndView("registrationSuccessPage", "user", user);
			 mv.addObject("firstname", user.getUserFirstName());
		}else{
		mv = new ModelAndView("registration");
		}
		return mv;
	
	}
}
