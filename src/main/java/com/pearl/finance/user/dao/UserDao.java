package com.pearl.finance.user.dao;

import org.apache.ibatis.annotations.Select;

import com.pearl.finance.user.entity.UserEntity;

public interface UserDao {
	@Select("SELECT * FROM t_user WHERE id = #{userId}")
	public UserEntity selectByUserId(String userId) throws Exception;

	@Select("SELECT * FROM t_user WHERE mobile = #{mobile}")
	public UserEntity selectByMobile(String mobile) throws Exception;
}
