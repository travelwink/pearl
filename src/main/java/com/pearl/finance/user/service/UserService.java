package com.pearl.finance.user.service;

import com.pearl.finance.user.entity.User;

public interface UserService {

	public User login(String mobile, String password) throws Exception;
}
