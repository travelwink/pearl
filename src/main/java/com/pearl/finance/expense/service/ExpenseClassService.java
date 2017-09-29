package com.pearl.finance.expense.service;

import java.util.List;

import com.pearl.finance.expense.entity.ExpenseClass;
import com.pearl.finance.user.entity.User;

public interface ExpenseClassService {

	public List<ExpenseClass> queryExpenseClassListByUser(User user);
}
