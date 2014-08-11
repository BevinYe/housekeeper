package com.luckhouse.housekeeper.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luckhouse.housekeeper.service.ParticipantService;

@Controller
public class NewrecordController {

	@Autowired
	ParticipantService participantService;
	
	@RequestMapping(value="/newrecord")
	public ModelAndView newrecord(HttpServletResponse response){
		return new ModelAndView("newrecord");
	}
}
