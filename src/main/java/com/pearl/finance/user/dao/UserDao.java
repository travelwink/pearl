package com.pearl.finance.user.dao;

import org.apache.ibatis.annotations.Select;

import com.pearl.finance.user.entity.User;

public interface UserDao {
	@Select("SELECT * FROM t_user WHERE id = #{userId}")
	public User selectByUserId(String userId) throws Exception;

	@Select("SELECT * FROM t_user WHERE mobile = #{mobile}")
	public User selectByMobile(String mobile) throws Exception;
}
