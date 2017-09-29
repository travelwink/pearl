package com.pearl.finance.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pearl.finance.common.BaseController;
import com.pearl.finance.common.Constants;
import com.pearl.finance.user.entity.User;
import com.pearl.finance.user.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController extends BaseController {

	@Autowired
	UserService userService;

	@RequestMapping("/login")
	public String login(String mobile, String password) {
		System.out.println(mobile + ", " + password);
		try {
			User user = userService.login(mobile, password);
			this.request.getSession().setAttribute(Constants.CURRENT_USER, user);
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:http://localhost:8080/finance/";
		}
		return "/index";
	}

	public String queryUser(HttpServletRequest request) {

		return null;
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute(Constants.CURRENT_USER, null);
		return "/index";
	}

}
