package com.pearl.finance.expense.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.pearl.finance.expense.entity.ExpenseClassEntity;

public interface ExpenseClassDao {
	@Select("SELECT tec.* FROM t_user tu LEFT JOIN tr_user_expenseclass tuec ON tu.id = tuec.userId LEFT JOIN t_expense_class tec ON tec.id = tuec.expenseclassId WHERE tu.id = #{userId} AND tec.expenseClassParentId is null;")
	public List<ExpenseClassEntity> selectRootClassByUserId(String userId) throws Exception;
}
