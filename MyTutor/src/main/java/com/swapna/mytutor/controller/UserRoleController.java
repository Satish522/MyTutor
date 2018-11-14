package com.swapna.mytutor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import src.swapna.mytutor.pojo.Register;

@Controller
@RequestMapping(value="/master")
public class UserRoleController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserRoleController.class);
	
	@RequestMapping(value = "/userrole" , method = RequestMethod.GET)
	public ModelAndView showUserRole(@PathVariable() String page) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		logger.info("User Role page "+page);
		 
		
		ModelAndView model=new ModelAndView("userrole");
	
		return model;
	}

}
