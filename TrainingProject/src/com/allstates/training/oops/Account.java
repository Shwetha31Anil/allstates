package com.allstates.training.oops;

public abstract class Account {
	private int accnum;
	private String name;
	protected double balance;
	
	public Account(int accnum,String name,double balance){
		this.accnum=accnum;
		this.name=name;
		this.balance=balance;
	}
	
	public double withdraw(int amount) {
		if(balance> amount && balance >=(amount+1000)) {
			balance=balance-amount;
		}
		else {
			System.out.println("less balance");
		}
		return balance;
	}
	
	public abstract double deposit(int amount);
}