package com.javabykiran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.DownloadService;
import com.javabykiran.service.OperatorsService;
import com.jbk.hibernate.Download;
import com.jbk.hibernate.Operators;
import com.jbk.hibernate.Statetable;
@Controller
public class OperatorsController {
	@Autowired
	OperatorsService operatorsService;

	@RequestMapping(value = "/operatorspage")
	public ModelAndView openOperatorsController() {
		ModelAndView mv = new ModelAndView();

		List<Operators> operatorslist = operatorsService.loadOperatorsService();
		System.out.println(1);
		System.out.println(operatorslist);
		mv.setViewName("operators");
		mv.addObject("oplist", operatorslist);
		return mv;
	}
}
