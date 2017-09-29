package com.pearl.finance.expense.entity;

import java.util.Date;

public class Account {
	private String id;
	private String name;
	private String classId;
	private String intitalAmount;
	private Date OpenDate;
	private double balance;
	private String currencyId;
	private boolean deleteFlag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getIntitalAmount() {
		return intitalAmount;
	}

	public void setIntitalAmount(String intitalAmount) {
		this.intitalAmount = intitalAmount;
	}

	public Date getOpenDate() {
		return OpenDate;
	}

	public void setOpenDate(Date openDate) {
		OpenDate = openDate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
