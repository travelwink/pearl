package com.pearl.finance.user.service;

import com.pearl.finance.user.entity.UserEntity;

public interface UserService {

	public UserEntity login(String mobile, String password) throws Exception;
}
