package com.allstates.training.view;

import java.util.Scanner;

import com.allstates.training.oops.AEmployee;
import com.allstates.training.oops.Department;

public class EmployeeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("enter employee details"
				+ "1. Create Employee and assign to department"
				+ "2. Creat only Employee"
				+ "3. Exit");
		int choice=sc.nextInt();
		if(choice==1) {
		Department dep=new Department(sc.nextInt(), sc.next());
		AEmployee em1=new AEmployee(sc.nextInt(), 
				sc.next(), sc.nextDouble(), sc.next(),dep);
		System.out.println(em1);
		}else if(choice==2) {
			AEmployee em1=new AEmployee(sc.nextInt(), 
					sc.next(), sc.nextDouble(), sc.next());
			System.out.println(em1);
		}else {
			System.exit(0);
		}
		}while(true);

	}

}
