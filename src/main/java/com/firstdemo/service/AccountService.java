package com.firstdemo.service;

import java.util.List;

import com.firstdemo.pojo.Account;

public interface AccountService {
	//查询所有
	List<Account> selectAll();
}
