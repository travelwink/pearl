package com.pearl.finance.expense.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.pearl.finance.expense.entity.Account;

public interface AccountDao {
	@Select("SELECT	* FROM t_account ta WHERE ta.userId = #{userId};")
	public List<Account> selectAccountByUserId(String userId);
}
