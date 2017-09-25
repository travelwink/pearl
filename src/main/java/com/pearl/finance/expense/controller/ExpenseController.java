package com.pearl.finance.expense.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pearl.finance.common.BaseController;
import com.pearl.finance.common.Constants;
import com.pearl.finance.expense.entity.ExpenseClassEntity;
import com.pearl.finance.expense.service.ExpenseClassService;
import com.pearl.finance.user.entity.UserEntity;

@Controller
@RequestMapping("/expense")
public class ExpenseController extends BaseController {

	@Autowired
	ExpenseClassService expenseClassService;

	@RequestMapping("/queryUserExpenseClass.do")
	@ResponseBody
	public List<ExpenseClassEntity> queryUserExpenseClass() {
		UserEntity user = this.getUserBySession();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put(Constants.JSON_SUCCESS, true);
		if (user != null) {
			List<ExpenseClassEntity> expenseClassList = expenseClassService.queryExpenseClassListByUser(user);
			resultMap.put(Constants.JSON_RESULTS, expenseClassList);
			return expenseClassList;
		} else {
			return null;
		}
	}
}
