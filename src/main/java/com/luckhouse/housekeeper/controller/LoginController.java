package com.luckhouse.housekeeper.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luckhouse.housekeeper.service.TallyService;

@Controller
public class LoginController {
	
	@Autowired
	TallyService tallyService;

	@RequestMapping(value="/login")
	public ModelAndView home(HttpServletResponse response){
		return new ModelAndView("login");
	}

}
