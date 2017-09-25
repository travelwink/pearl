package com.pearl.finance.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pearl.finance.user.entity.UserEntity;

public class BaseController {

	protected HttpServletRequest request;

	protected HttpServletResponse response;

	/**
	 * 获取当前用户Session
	 * 
	 * @return 用户实体类
	 */
	public UserEntity getUserBySession() {
		HttpSession session = this.getRequest().getSession();
		Object obj = session.getAttribute(Constants.CURRENT_USER);
		if (obj instanceof UserEntity) {
			return (UserEntity) obj;
		} else {
			return null;
		}
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

}
