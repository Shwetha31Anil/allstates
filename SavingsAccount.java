package com.allstates.training.assignment;

public class SavingsAccount implements Account {
	private long accnum;
	private double balance;
	
	public SavingsAccount(long accnum,double balance) {
		this.accnum=accnum;
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	@Override
	public double withdraw(int amount) {
		if(amount > 0 && balance >=(amount+1000))
			balance=balance-amount;
		else if(amount==balance)
			System.out.println("minimum balance should maintain");
		else if(amount <= 0)
			System.out.println("wrong input");
		else
			System.out.println("low balance");
		return balance;
	}

	

	@Override
	public double deposit(int amount) {
		if(amount > 0)
		balance= balance+amount;
		else
			System.out.println("Wrong input");
		return balance;
	}

	

}
