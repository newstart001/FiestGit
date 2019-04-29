package com.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("th")
public class FreemarkerController {
	
	@RequestMapping("/center")
	public String center() {
		return "thymeleaf/center/hhh";
	}
}
