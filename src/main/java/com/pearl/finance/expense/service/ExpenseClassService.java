package com.pearl.finance.expense.service;

import java.util.List;

import com.pearl.finance.expense.entity.ExpenseClassEntity;
import com.pearl.finance.user.entity.UserEntity;

public interface ExpenseClassService {

	public List<ExpenseClassEntity> queryExpenseClassListByUser(UserEntity user);
}
