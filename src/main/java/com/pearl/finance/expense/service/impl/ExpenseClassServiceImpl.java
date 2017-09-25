package com.pearl.finance.expense.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pearl.finance.expense.dao.ExpenseClassDao;
import com.pearl.finance.expense.entity.ExpenseClassEntity;
import com.pearl.finance.expense.service.ExpenseClassService;
import com.pearl.finance.user.entity.UserEntity;

@Service
public class ExpenseClassServiceImpl implements ExpenseClassService {

	@Autowired
	ExpenseClassDao expenseClassDao;

	@Override
	public List<ExpenseClassEntity> queryExpenseClassListByUser(UserEntity user) {
		try {
			if (user != null) {
				List<ExpenseClassEntity> expenseClassList = expenseClassDao.selectRootClassByUserId(user.getId());
				return expenseClassList;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
