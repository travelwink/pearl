package com.pearl.finance.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SpringInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		HandlerMethod hm = (HandlerMethod) handler;
		BaseController bc = (BaseController) hm.getBean();
		bc.setRequest(request);
		bc.setResponse(response);

		return true;

	}

}
