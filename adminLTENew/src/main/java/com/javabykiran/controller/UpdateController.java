package com.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javabykiran.service.UpdateService;
import com.jbk.hibernate.Users;

@Controller
public class UpdateController {

	@Autowired
	UpdateService updateService;
	
	@RequestMapping(value = "/update")
	public String updateUserController(Users user) {
		updateService.updateUserService(user);
		return "redirect:/usersjsp";
	}
}
