package com.pearl.finance.expense.entity;

import java.util.Date;

public class Account {
	private String id;
	private String name;
	private String classId;
	private String intitalAmount;
	private Date OpenDate;
	private double balance;
	private Currency currency;
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

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
