package com.pearl.finance.expense.service;

import com.pearl.finance.expense.entity.ExpenseClassEntity;
import com.pearl.finance.user.entity.UserEntity;

public interface ExpenseClassService {

	public ExpenseClassEntity queryExpenseClassByUser(UserEntity user);
}
