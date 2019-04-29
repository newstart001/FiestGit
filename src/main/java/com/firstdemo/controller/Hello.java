package com.firstdemo.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstdemo.pojo.Resource;
import com.firstdemo.pojo.User;

@RestController
public class Hello {
	
	@Autowired
	private Resource resource;
	
	@RequestMapping("/hi_user")
	public User hi() {
		User u = new User();
		u.setName("Yl");
		u.setSno(001);
		u.setGoschool(new Date());
		return u;
	}
	@RequestMapping("/resource")
	public Resource getResource() {
		Resource r = new Resource();
		BeanUtils.copyProperties(resource, r);
		return r;
	}
}
