package com.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.model.User;
import com.javabykiran.service.LoginService;


@Controller
public class LoginController {
	

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login")
	public ModelAndView checkLoginController(@ModelAttribute User user) {
		ModelAndView mv = new ModelAndView();
		if (loginService.checkLoginService(user)) {
			mv.setViewName("dashboard");
		} else {
			mv.addObject("msg", "your passwd is wrong..");
			mv.setViewName("login");
		}
		return mv;
	}

	
}
