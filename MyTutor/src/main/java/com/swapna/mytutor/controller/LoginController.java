package com.swapna.mytutor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.swapna.mytutor.dto.RegisterDto;
import com.swapna.mytutor.dto.ResetPasswordDto;
import com.swapna.mytutor.pojo.Login;
import com.swapna.mytutor.pojo.ResetPassword;
import com.swapna.mytutor.service.LoginService;
import com.swapna.mytutor.utils.AppUtils;
import com.swapna.mytutor.utils.MailClass;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;

	@Autowired
	MailClass mailClass;

	@RequestMapping(value = { "/", "/signout", "/login" }, method = RequestMethod.GET)
	public String showLogin(Model model) {

		// logger.info("Welcome home! The client locale is {}.", locale);
		// ModelAndView model=new ModelAndView("register","register",new
		// Register());

		Login login = new Login();

		model.addAttribute("login", login);

		// System.out.println("View name is "+model.getView());

		return "login";
	}

	@RequestMapping(value = { "/", "/attempt" }, method = RequestMethod.GET)
	public String showLogin(@RequestParam("status") String status,Model model) {

		// logger.info("Welcome home! The client locale is {}.", locale);
		// ModelAndView model=new ModelAndView("register","register",new
		// Register());

		Login login = new Login();

		model.addAttribute("login", login);

		if(status != null && status.equals("fail")){
			model.addAttribute("failureMsg", "Attempted password is wrong.");
		}

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
			return "redirect:/attempt?status=fail";
		} else {
			return "redirect:/login";
		}
	}

	@RequestMapping(value = { "/forgotpassword" }, method = RequestMethod.GET)
	public String showForgotPassword(Model model) {

		Login login = new Login();

		model.addAttribute("forgotpsw", login);
		return "forgotpassword";
	}

	@RequestMapping(value = { "/forgotpassword" }, method = RequestMethod.POST)
	public String resetPassword(@ModelAttribute("forgotpsw") Login login,Model model) {

		//login.addAttribute("resetpsw", login);
		logger.info("Submitting email id ");
		final int otp = AppUtils.getRandomNumber();
		final String mailId=login.getEmail();
		boolean status = loginService.authenticateEmail(mailId);
		
		if (status == true) {
			logger.info("User exists.....");
			new Thread(new Runnable() {

				@Override
				public void run() {

					StringBuffer sb = new StringBuffer();
					sb.append("Hi,").append(" Your password reset OTP is " + otp);
					mailClass.sendMail(mailId,
							"OTP send sucessfull", sb.toString());

				}

			}).start();
			
			Boolean retOtp=loginService.setOtp(mailId, otp);
			if(retOtp==true){
				 logger.info("OTP sucessfully updated..");
				
			}
			else{
				logger.error("OTP updation failed");
			}
			ResetPassword reset=new ResetPassword();
			model.addAttribute("resetpassword",reset);
			reset.setMailId(mailId);
			//model.addAttribute("otp", otp);
			

			return "resetpassword";
		}
		model.addAttribute("msg", "You have given wrong email id");
		return "redirect:/login/forgotpassword";

	}
	
	
	@RequestMapping(value = { "/resetpassword" }, method = RequestMethod.POST)
	public String resetPasswordsubmit(@ModelAttribute("resetpassword") ResetPassword resetPassword,Model model) {
		
		System.out.println(resetPassword);
		//int retOtp=loginService.getOtp( resetPassword.getSetMailId());
		ResetPasswordDto resetPasswordDto=new ResetPasswordDto();
		resetPasswordDto.setNewPassword(resetPassword.getNewPassword());
		resetPasswordDto.setConfirmPassword(resetPassword.getConfirmPassword());
		resetPasswordDto.setOtp(resetPassword.getOtp());
		int flag=loginService.getOtp( resetPassword.getMailId(), resetPasswordDto);
		
		if(flag > 0){
			logger.info("Password reset Sucessfully..");
			return "redirect:/login";
		}
		else{
			logger.error("Reset Password again");
			model.addAttribute("msg", "Reenter Password");
			return "redirect:/login/forgotpassword";
		}
		
	
	}

	

}
