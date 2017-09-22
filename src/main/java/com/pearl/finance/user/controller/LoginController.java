package com.pearl.finance.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pearl.finance.common.BaseController;
import com.pearl.finance.common.Contants;
import com.pearl.finance.user.entity.UserEntity;
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
			UserEntity user = userService.login(mobile, password);
			super.getRequest().getSession().setAttribute(Contants.CURRENT_USER, user);
		} catch (Exception e) {
			e.printStackTrace();
			return "/login";
		}
		return "/index";
	}

	public String queryUser(HttpServletRequest request) {

		return null;
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute(Contants.CURRENT_USER, null);
		return "/index";
	}

}
