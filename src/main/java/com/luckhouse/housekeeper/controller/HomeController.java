package com.luckhouse.housekeeper.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/home")
	public ModelAndView home(HttpServletResponse response){
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/tally")
	public ModelAndView record(HttpServletResponse response){
		return new ModelAndView("tally");
	}
}
