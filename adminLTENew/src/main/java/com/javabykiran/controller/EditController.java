package com.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.EditService;
import com.jbk.hibernate.Users;

@Controller
public class EditController {

	@Autowired
	EditService editService;

	@RequestMapping(value = "/edit",method = RequestMethod.GET)
	public ModelAndView editUserController(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		Users user = editService.editUserService(id);
		mv.addObject("userdet", user);
		mv.setViewName("edit");
		return mv;

	}
}
