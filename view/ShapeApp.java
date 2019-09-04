package com.allstates.training.view;

import com.allstates.training.assignment.Account;
import com.allstates.training.assignment.Account1;
import com.allstates.training.assignment.SavingsAccount;
import com.allstates.training.oops.Circle;

public class ShapeApp {

	public static void main(String[] args) {
		Circle c1=new Circle(5);
		Circle c2=new Circle(5);
		if(c1.equals(c2)) {
			System.out.println("circle radius is equal");
		}else {
			System.out.println("Circles not equal");
		}
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
		
		
		
		
		StringBuffer st2=new StringBuffer("Shwteha");
String st1=new String("Shwteha");
String st4="Shwteha";
String st5="shwteha";
String st3=new String("Shwteha");
System.out.println(st1.hashCode());
System.out.println(st3.hashCode());
if(st1.equalsIgnoreCase(st3)) {
	System.out.println("true");
}else {
	System.out.println("false");
}
		System.out.println(st2);
		System.out.println(st2.append(" Guptha"));
		System.out.println(st2);
		/*Circle c1=new Circle(5);
		System.out.println(c1.area());
		Account sv=new SavingsAccount(3234, 24243);
		sv.getDisplay();
		Account.getValue();
*/	

	}

}
