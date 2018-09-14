package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Login;
import com.spring.model.User;
import com.spring.services.ILoginServices;

@Controller
public class LoginController {

	@Autowired
	ILoginServices loginservices;

	@RequestMapping(value = "/loginuser", method = RequestMethod.POST)
	public ModelAndView loginUser(@ModelAttribute("login") Login login) {		//HttpServletRequest request, HttpServletResponse response,

		String userId = login.getUserId();
		String userPassword = login.getPassword();
		User user = new User();
		user.setUserId(new Integer(Integer.parseInt(userId)));
		user.setPassword(userPassword);
		
		User user1 = loginservices.loginUser(user);
		
		
		ModelAndView mv;
		
		if (user1.getPassword().equals(userPassword)) {
			mv = new ModelAndView("welcome", "user1", user1);

			mv.addObject("firstname", user1.getUserFirstName());

		} else {
			mv = new ModelAndView("login");
		}
		return mv;

	}

}
