package com.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstdemo.pojo.User;

@Controller
@RequestMapping("th")
public class ThymeleafController {
	
	@RequestMapping("/test")
	public String center(ModelMap map) {
		User u = new User();
		u.setName("YY");
		map.addAttribute("user", u);
		return "thymeleaf/center/test";
	}
}
