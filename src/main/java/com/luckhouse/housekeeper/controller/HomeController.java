package com.luckhouse.housekeeper.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.luckhouse.housekeeper.common.util.JSendWrapper;
import com.luckhouse.housekeeper.db.entity.Tally;
import com.luckhouse.housekeeper.model.TallyBean;
import com.luckhouse.housekeeper.model.factory.BeanFactory;
import com.luckhouse.housekeeper.service.TallyService;

@Controller
public class HomeController {
	
	@Autowired
	TallyService tallyService;

	@RequestMapping(value="/home")
	public ModelAndView home(HttpServletResponse response){
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/tally")
	public ModelAndView record(HttpServletResponse response){
		return new ModelAndView("tally");
	}
	
	@RequestMapping(value="/getAllTallys")
	@ResponseBody
	public  Map<String, Object> getAllTallys(){
		List<Tally> tallys = tallyService.getAllTallys();
		List<TallyBean> tallyBeans = BeanFactory.createTallyBeanList(tallys);
		return JSendWrapper.wrapSuccessResponse(tallyBeans);
	}
}
