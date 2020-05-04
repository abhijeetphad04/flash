package com.javabykiran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.DownloadService;
import com.jbk.hibernate.Download;

@Controller
public class DownloadController {
	@Autowired
	DownloadService downloadService;

	@RequestMapping(value = "/downloadpage")
	public ModelAndView openDownloadList() {
		ModelAndView mv = new ModelAndView();

		List<Download> dwnldlist = downloadService.loadDownload();
		System.out.println(1);
		System.out.println(dwnldlist);
		mv.setViewName("downloads");
		mv.addObject("dwnlist", dwnldlist);
		return mv;
	}
}
