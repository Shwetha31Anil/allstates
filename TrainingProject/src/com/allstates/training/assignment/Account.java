package com.allstates.training.assignment;

public interface Account {
	public double withdraw(int amount);
	public double deposit(int amount);
	//public void getDd();
	public default void getDisplay() {
		System.out.println("Default method called");
	}
	public static void getValue() {
		System.out.println("Static method called");
	}
//	public  double  balance=1000;
//	public default double deposit(int amount) {
//		if(amount > 0)
//			//balance;
//			System.out.println("balance");
//			else
//				System.out.println("Wrong input");
//			return balance;
//	}
}
