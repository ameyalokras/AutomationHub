package com.jpmc.ib.colt.cdd.automationhub.controllers.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootControllerImpl {

	@RequestMapping(path="/")
	public String root()
	{
		System.out.println("hello");
		return "index.html";
	}
}