package com.pearl.finance.expense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pearl.finance.common.BaseController;
import com.pearl.finance.expense.entity.Account;
import com.pearl.finance.expense.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController extends BaseController {

	@Autowired
	AccountService accoutService;

	@RequestMapping("/queryUserAccount")
	@ResponseBody
	private List<Account> queryUserAccount() {
		List<Account> userAccountList = accoutService.queryUserAccount(this.getUserBySession());
		return userAccountList;
	}
}
