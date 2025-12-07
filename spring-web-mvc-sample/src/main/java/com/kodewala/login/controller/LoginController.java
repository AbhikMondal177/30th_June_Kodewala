package com.kodewala.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		System.out.println("LoginController.login()::::::::::::::::::::::::::::::::::::::::::::::::::::::;");
		if(true) {
		return "displayLogin";
		}
		else {
			return "loginFailed";
		}
	}
	
	@RequestMapping("/logout")
	public String logout() {
		System.out.println("LoginController.logout()::::::::::::::::::::::::::::::::::::::::::::::::::::::;");
		
		return "logout";
	}
	

}
