package com.allstate.training.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SavingsAccount implements Account {
	
	private String accNum;
	private double balance;
	private String branch;
	@Autowired
	private Person person;
	
	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public double withdraw(int amount) {
		balance=balance-amount;
		return balance;
	}

	public double deposit(int amount) {
		balance=balance+amount;
		return balance;
	}

}
