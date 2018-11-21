package com.swapna.mytutor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.swapna.mytutor.dto.LoginDto;
import com.swapna.mytutor.pojo.Login;
import com.swapna.mytutor.service.LoginService;


@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = { "/", "/signout", "/login" }, method = RequestMethod.GET)
	public String showLogin(@RequestParam("attempt") String attempt ,Model model) {
		// logger.info("Welcome home! The client locale is {}.", locale);
		// ModelAndView model=new ModelAndView("register","register",new
		// Register());

		Login login = new Login();

		model.addAttribute("login", login);
		if(attempt != null && attempt.equals("fail")){
			model.addAttribute("failureMsg", "Attempted password is wrong.");
		}
		// System.out.println("View name is "+model.getView());

		return "login";
	}
	@RequestMapping(value = { "/", "/signin" }, method = RequestMethod.GET)
	public String showLogin(Model model) {
		// logger.info("Welcome home! The client locale is {}.", locale);
		// ModelAndView model=new ModelAndView("register","register",new
		// Register());

		Login login = new Login();

		model.addAttribute("login", login);
		 
		// System.out.println("View name is "+model.getView());

		return "login";
	}

	@RequestMapping(value = "/dashboard", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String showLogin(@ModelAttribute("login") Login login, ModelMap model) {
		// logger.info("Welcome home! The client locale is {}.", locale);
		// ModelAndView model=new ModelAndView("register","register",new
		// Register());
		
		LoginDto loginDto = new LoginDto();
		loginDto.setUserId(login.getUserId());
		loginDto.setPassword(login.getPassword());
		String status = loginService.autenticateUser(loginDto);

		System.out.println("View name is " + model);
		if (status != null && status.equals("success")) {
			return "dashboard";
		} else if (status != null && status.equals("fail")) {
			return "redirect:/login?attempt=fail";
		} else {
			return "redirect:/login";
		}
	}

}
