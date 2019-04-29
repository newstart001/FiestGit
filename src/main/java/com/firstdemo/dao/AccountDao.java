package com.firstdemo.dao;

import java.util.List;


import com.firstdemo.pojo.Account;

public interface AccountDao {
	//查询所有
	public List<Account> selectAll();
}
