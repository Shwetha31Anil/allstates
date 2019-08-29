package com.allstates.training.oops;

public class CurrentAccount extends Account {

	public CurrentAccount(int accnum, String name, double balance) {
		super(accnum, name, balance);
	}

	@Override
	public double withdraw(int amount) {
		if(super.balance> amount && balance >=(amount+10000)) {
			balance=balance-amount;
		}
		else {
			System.out.println("less balance");
		}
		return balance;
	}
	
	@Override
	public double deposit(int amount) {
		if((amount%1000) == 0)
			balance=balance+amount;
		else
			System.out.println("amount cannot deposit");
		return balance;
	}
}
