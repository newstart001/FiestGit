package com.firstdemo.controller.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstdemo.pojo.User;

@Controller
@RequestMapping("two")
public class TwoController {
	
	@RequestMapping("/task2")
	public String index(ModelMap map) {
		User u = new User();
		u.setName("YY");
		map.addAttribute("user", u);
		return "thymeleaf/center/test";
	}
}
