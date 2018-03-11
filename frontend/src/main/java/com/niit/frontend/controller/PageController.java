package com.niit.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public String gotoIndex()
	{
		return "index";
	}
	
	@RequestMapping("/contactus")
	public String gotoContactus()
	{
		return "contactus";
	}
	
	

}
