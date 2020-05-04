package com.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javabykiran.service.RegisterService;
import com.jbk.hibernate.Users;


@Controller
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@RequestMapping(value = "/registerUser" )
	public String signupController(@ModelAttribute Users user) {
		registerService.registerUserService(user);
		
		return "login";
	}
}
