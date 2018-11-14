package com.swapna.mytutor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import src.swapna.mytutor.pojo.Register;

@Controller
@RequestMapping(value="/home")
public class RegisterController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

	@RequestMapping(value = "/register" , method = RequestMethod.GET)
	public String userRegister(Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		//ModelAndView model=new ModelAndView("register","register",new Register());
		 
		Register register=new Register();
		
		model.addAttribute("register", register);
		//System.out.println("View name is "+model.getView());
		
		return "register";
	}
	
	@RequestMapping(value="/signup" , method=RequestMethod.POST)
	public String registration(@ModelAttribute("register") Register register,BindingResult result, ModelMap model){
		
		return "login";
	}
	
}
