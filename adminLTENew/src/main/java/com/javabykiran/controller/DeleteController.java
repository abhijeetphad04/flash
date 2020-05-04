package com.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javabykiran.service.DeleteService;
@Controller
public class DeleteController {
	
	@Autowired
	DeleteService deleteService;
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteUserController(@RequestParam int id) {
		System.out.println(444);
		deleteService.deleteUserService(id);
		System.out.println(999);
		return "redirect:/usersjsp";
		
	}
}
