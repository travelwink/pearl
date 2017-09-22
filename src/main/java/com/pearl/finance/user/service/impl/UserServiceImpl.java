package com.pearl.finance.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pearl.finance.common.exceptions.BusinessException;
import com.pearl.finance.user.dao.UserDao;
import com.pearl.finance.user.entity.UserEntity;
import com.pearl.finance.user.service.UserService;
import com.pearl.finance.utils.StringUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	String message;

	@Override
	public UserEntity login(String mobile, String password) throws Exception {

		if (StringUtil.isBlank(mobile)) {
			message = "请填写手机号";
		} else if (StringUtil.isBlank(password)) {
			message = "请填写密码";
		}

		try {
			UserEntity user = userDao.selectByMobile(mobile);
			if (user.getPassword().equals(password)) {
				return user;
			} else {
				message = "用户不存在或密码错误！";
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		// if (user.getPassword().equals(password)) {
		// } else {
		// throw new BusinessException("账号不存在或密码错误");
		// }

	}

}
