package com.nt.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishService;
@Controller
public class WelcomeController {
	@Autowired
	private	WishService service;
	
	/*@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		//use service class
		String wMsg=service.generateWishMsg("Shankar Reddy");
		return new ModelAndView("result","wResult",wMsg);
	}*/
	@RequestMapping("/wish.htm")
public String process(Map<String,Object> map){
	//use service
	String wMsg=service.generateWishMsg("Shankar Reddy");
	map.put("wResult", wMsg);
	return "result";
}
}
