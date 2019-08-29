package com.allstates.training.oops;

public class SavingsAccount extends Account {

	public SavingsAccount(int accnum, String name, double balance) {
		super(accnum, name, balance);
	}

	public double getBalance() {
		// TODO Auto-generated method stub
		return super.balance;
	}
	
	@Override
	public double deposit(int amount) {
		if((amount%100) == 0)
			balance=balance+amount;
		else
			System.out.println("amount cannot deposit");
		return balance;
	}

}
