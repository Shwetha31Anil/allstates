package com.allstates.training.view;
import java.util.Scanner;

import com.allstates.training.oops.Account;
import com.allstates.training.oops.SavingsAccount;
public class BankApp {

	public static void main(String[] args) {
		
	//	Account a1=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Account you want to create"
				+ "1. savings 2. Current");
		int choice=sc.nextInt();
		if(choice ==1) {
			SavingsAccount sv=new SavingsAccount(sc.nextInt(),
					sc.next(), sc.nextDouble());
			do {
			System.out.println("1. Withdraw \n 2. Depsoit 3.Balance 4. logout");
		int opt=sc.nextInt();
		switch(opt) {
		case 1: System.out.println("enter amount to withdraw");
		     sv.withdraw(sc.nextInt());
		     break;
		case 2: System.out.println("enter amount to deposit");
		System.out.println(sv.deposit(sc.nextInt()));
		break;
		case 3: System.out.println("balance is "+sv.getBalance());
		break;
		case 4: System.out.println("Thank you for using app");
				System.exit(0);
		default: System.out.println("invalid option");
		}
			
			}while(true);
		}else if(choice ==2){
			
		}else {
			System.exit(0);
		}
				

	}

}
