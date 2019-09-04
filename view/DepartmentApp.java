package com.allstates.training.view;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.allstates.training.Dao.DepartmentDao;
import com.allstates.training.oops.Department;

public class DepartmentApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DepartmentDao dao=new DepartmentDao();
		do {
		System.out.println("1. Get departments");
		System.out.println("2. Add Department");
		System.out.println("3. Remove department \n 4. exit");
		int choice=sc.nextInt();
		
		if(choice==1) {
			Set<Department> deps=dao.getAll();
			if(deps.isEmpty())System.out.println("No data");
			else
			deps.forEach((d1)->System.out.println(d1));
		}
		else if(choice==2) {
			
			dao.addDepartment(new Department(sc.nextInt(), sc.next()));	
		}
		else if(choice==3) {
			
			dao.removeDepartment(sc.nextInt());
		}
		else if(choice==4){
			System.out.println("Thank you");
			System.exit(0);
		}
		}while(true);

	}

}
