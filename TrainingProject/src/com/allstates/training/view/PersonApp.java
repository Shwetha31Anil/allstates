package com.allstates.training.view;

import com.allstates.training.oops.Person;
import com.allstates.training.oops.Employee;

public class PersonApp {
//	public static void getMethod() {
//		System.out.println("Static method");
//	}
//	static{
//		System.out.println("static block");
//	}
	public static void main(String args[]) {
//		//PersonApp p12=new PersonApp();
//		PersonApp.getMethod();
//		
		
		long[] phnum={1234455,233244};
	Person p1=new Person("1234","Samhitha",phnum,"Bangalore");
		System.out.println(p1.getAdarNum()
				+" "+p1.getPname());
		p1.display();

		Employee e1=new Employee("1234","Samhitha",phnum,
				"Bangalore",2345,34553434);
	
		System.out.println(e1.getEmpid()+" "+e1.getSalary()+e1.getAdarNum()+
				e1.getPname());
		
		e1.display();
	}
}
