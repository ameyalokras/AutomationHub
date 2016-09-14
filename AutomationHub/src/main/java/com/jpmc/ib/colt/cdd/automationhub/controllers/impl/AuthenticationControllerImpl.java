package com.jpmc.ib.colt.cdd.automationhub.controllers.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticationControllerImpl {

	@RequestMapping(path="/logout")
	public String logout()
	{
		return "auth/logout.html";
	}
	
	@RequestMapping(path="/login")
	public String login()
	{
		return "auth/login.html";
	}
}