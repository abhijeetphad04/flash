package com.javabykiran.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.hibernate.Statetable;
import com.jbk.hibernate.Users;

@Controller
public class NavigationController {
	@RequestMapping(value = "/loginpage")
	public String openLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/registerpage")
	public String openRegisterPage() {
		return "register";
	}

	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/adduserpage")
	public ModelAndView openAddUserPage() {
		ModelAndView mv = new ModelAndView();

		List<Statetable> listusers = sessionFactory.openSession().createCriteria(Statetable.class).list();
		Map<Integer, String> map = new HashMap<>();
		for (Statetable str : listusers) {
			map.put(str.getLid(), str.getState());
		}

		System.out.println(map);
		mv.addObject("stat", listusers);
		mv.setViewName("add_user");

		return mv;
	}

	/*
	 * @RequestMapping(value = "/operatorspage") public String openOperatorsPage() {
	 * return "operators"; }
	 */

	/*
	 * @RequestMapping(value = "/downloadpage") public String openDownloadPage() {
	 * return "downloads"; }
	 */

	@RequestMapping(value = "/profilepage")
	public String openProfilePage() {
		return "profile";
	}

	@RequestMapping(value = "/linkspage")
	public String openLinksPage() {
		return "links";
	}

	@RequestMapping(value = "/dashboardpage")
	public String openDashBoardPage() {
		return "dashboard";
	}
}
