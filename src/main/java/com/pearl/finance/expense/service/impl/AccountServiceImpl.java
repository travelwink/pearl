package com.pearl.finance.expense.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pearl.finance.expense.dao.AccountDao;
import com.pearl.finance.expense.entity.Account;
import com.pearl.finance.expense.service.AccountService;
import com.pearl.finance.user.entity.User;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao accountDao;

	public List<Account> queryUserAccount(User user) {
		List<Account> userAccountList = accountDao.selectAccountByUserId(user.getId());
		return userAccountList;
	}
}
