package com.pearl.finance.expense.service;

import java.util.List;

import com.pearl.finance.expense.entity.Account;
import com.pearl.finance.user.entity.User;

public interface AccountService {
	public List<Account> queryUserAccount(User user);
}
