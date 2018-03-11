package com.niit.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.UserDAO;
import com.niit.backend.model.UserModel;

@Controller
public class UserController {
	@Autowired
	UserDAO userDAO;

	@RequestMapping("/reg")
	public ModelAndView signup() {
		ModelAndView modelAndView = new ModelAndView("register");
		modelAndView.addObject("userModelAgent", new UserModel());
		modelAndView.addObject("allUsers", userDAO.listOfUsers());
		return modelAndView;
	}

	@RequestMapping("/signup")
	public String register(@ModelAttribute("userModelAgent") UserModel userModel) {
		if (userDAO.inserttUser(userModel)) {
			return "redirect:/reg";
		} else {
			return "redirect:/reg";
		}

	}
	
	@RequestMapping("deleteuser/{emailid}")
	public String deleteUser(@PathVariable("emailid") String userName)
	{
		UserModel user=userDAO.singleUser(userName);
		
		System.out.println("going delete the user "+user.getUserName());
		if(userDAO.deleteUser(user))
		{
			return "redirect:/reg";
		}
		else{
			return "redirect:/reg";
		}
	}
}
