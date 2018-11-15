package com.swapna.mytutor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.swapna.mytutor.dto.RegisterDto;
import com.swapna.mytutor.service.RegisterService;

import src.swapna.mytutor.pojo.Register;
import src.swapna.mytutor.utils.AppUtils;


@Controller
@RequestMapping(value="/home")
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
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
	
	@RequestMapping(value = "/profile" , method = RequestMethod.GET)
	public String userProfile(Model model) {
		logger.info("Welcome home! The client locale is {}.");
		
		return "profile";
	}
	
	@RequestMapping(value="/signup" , method=RequestMethod.POST)
	public String registration(@ModelAttribute("register") Register register,BindingResult result, ModelMap model){
		
		
		String userId="";
		int flag=0;
		if(register.getPassword().equals(register.getConfirmPassword())){
			String[] name=register.getFullName().split(" ");
			 userId=name[0]+AppUtils.getRandomNumber();
			
			 logger.info("Registering from controller to service");
			RegisterDto registerDto = new RegisterDto();
			registerDto.setFullName(register.getFullName());
			registerDto.setEmailId(register.getEmailId());
			registerDto.setPassword(register.getPassword());
			registerDto.setUserId(userId);
			registerDto.setUserType(register.getUserType());
			

			flag = registerService.register(registerDto);
		}
		if(flag > 0) {
			logger.info("Sucessfully registered..");
		}else {
			logger.error("Something wrong in registration..");
		}
	
		System.out.println("Registration ");
		
		return "redirect:/login";
		


	}
	
}
