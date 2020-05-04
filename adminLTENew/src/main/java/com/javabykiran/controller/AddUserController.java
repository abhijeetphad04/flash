package com.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javabykiran.service.AddUserService;
import com.jbk.hibernate.Users;
@Controller
public class AddUserController {


	@Autowired
	AddUserService addUserService;
	
	@RequestMapping(value = "/addUsers", method = RequestMethod.POST)
	public String addUserController(@ModelAttribute Users user) {
		addUserService.addUserService(user);
		
		return "redirect:/usersjsp";
	}
}
