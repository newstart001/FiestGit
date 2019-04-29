package com.firstdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstdemo.dao.AccountDao;
import com.firstdemo.pojo.Account;
import com.firstdemo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDao accountDao;

	@Override
	public List<Account> selectAll() {
		
		return accountDao.selectAll();
	}

}
