package dev.simplesolution.ip.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dev.simplesolution.ip.service.RequestService;

@Controller
public class HomeController {
	
	@Autowired
	private RequestService requestService;
	
	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("index");
		String clientIp = requestService.getClientIp(request);
		model.addObject("clientIp", clientIp);
		return model;
	}

}
