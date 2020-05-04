package com.javabykiran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.UserService;
import com.jbk.hibernate.Users;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/usersjsp")
	public ModelAndView openUserlistController() {
		ModelAndView mv=new ModelAndView();
		
		List<Users>listOfUsers=userService.loadUsersService();
		System.out.println(listOfUsers);
		mv.setViewName("users");
		mv.addObject("userlist", listOfUsers);
		return mv;
	}

}
