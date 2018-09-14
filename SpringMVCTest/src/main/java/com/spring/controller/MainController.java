package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	String mesg = "Welcome to Spring World........";

	@RequestMapping("/login")
	public ModelAndView loginEmployee() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("mesg", mesg);
		return mv; 
	}
	
	@RequestMapping("/register")
	public ModelAndView registerEmployee() {
		ModelAndView mv = new ModelAndView("registration");
		mv.addObject("mesg", mesg);
		return mv;
	}
	


}
