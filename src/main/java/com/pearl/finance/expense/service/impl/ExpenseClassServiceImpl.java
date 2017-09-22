package com.pearl.finance.expense.service.impl;

import org.springframework.stereotype.Service;

import com.pearl.finance.expense.entity.ExpenseClassEntity;
import com.pearl.finance.expense.service.ExpenseClassService;
import com.pearl.finance.user.entity.UserEntity;

@Service
public class ExpenseClassServiceImpl implements ExpenseClassService {

	@Override
	public ExpenseClassEntity queryExpenseClassByUser(UserEntity user) {
		return null;
	}

}
