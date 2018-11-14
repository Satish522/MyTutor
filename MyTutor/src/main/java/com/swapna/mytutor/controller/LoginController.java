package com.swapna.mytutor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import src.swapna.mytutor.pojo.Login;
import src.swapna.mytutor.pojo.Register;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@RequestMapping(value = {"/" , "/signout" , "/login"} , method = RequestMethod.GET)
	public String showLogin(Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		//ModelAndView model=new ModelAndView("register","register",new Register());
		 
		Login login=new Login();
		
		model.addAttribute("login", login);
		//System.out.println("View name is "+model.getView());
		
		return "login";
	}
	
	@RequestMapping(value = "/dashboard" , method = RequestMethod.POST)
	public String showLogin(@ModelAttribute("login") Login login , ModelMap model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		//ModelAndView model=new ModelAndView("register","register",new Register());
		 
		//System.out.println("View name is "+model.getView());
		
		return "dashboard";
	}

}
