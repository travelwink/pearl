package com.pearl.finance.expense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pearl.finance.common.BaseController;
import com.pearl.finance.expense.entity.ExpenseClassEntity;
import com.pearl.finance.expense.service.ExpenseClassService;
import com.pearl.finance.user.entity.UserEntity;

@Controller
@RequestMapping("/expense")
public class ExpenseController extends BaseController {

	@Autowired
	ExpenseClassService expenseClassService;

	@RequestMapping("/queryUserExpenseClass.do")
	public List<ExpenseClassEntity> queryUserExpenseClass() {
		UserEntity user = this.getUserBySession();
		
		System.out.println(user);
		return null;
	}
}
