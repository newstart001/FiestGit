package com.firstdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstdemo.pojo.Account;
import com.firstdemo.service.AccountService;

@RestController
@RequestMapping("start")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/selectall")
	public List<Account> selectAll(){
		return accountService.selectAll();
	}
}
