package com.pearl.finance.expense.entity;

public class ExpenseClassEntity {
	private String id;
	private String expenseClassName;
	private String expenseClassIcon;
	private String expenseClassParentId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExpenseClassName() {
		return expenseClassName;
	}

	public void setExpenseClassName(String expenseClassName) {
		this.expenseClassName = expenseClassName;
	}

	public String getExpenseClassIcon() {
		return expenseClassIcon;
	}

	public void setExpenseClassIcon(String expenseClassIcon) {
		this.expenseClassIcon = expenseClassIcon;
	}

	public String getExpenseClassParentId() {
		return expenseClassParentId;
	}

	public void setExpenseClassParentId(String expenseClassParentId) {
		this.expenseClassParentId = expenseClassParentId;
	}

}
