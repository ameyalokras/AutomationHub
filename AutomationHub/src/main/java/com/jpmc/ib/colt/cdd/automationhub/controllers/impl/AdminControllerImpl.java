package com.jpmc.ib.colt.cdd.automationhub.controllers.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminControllerImpl {

	@RequestMapping(path="/admin")
	public String adminHome()
	{
		return "admin/home";
	}
}
