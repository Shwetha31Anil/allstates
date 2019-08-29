package com.allstates.training.view;

import com.allstates.training.oops.ExampleFI;

public class FunctionalDemo {

	public static void main(String[] args) {
		ExampleFI.someCal1(12, 78);
		
		ExampleFI e1=(a,b)->System.out.println(a+b);
		e1.someCal(13, 67);
		e1.someCal(656, 677);
		e1.someCal(34, 56);
		
		ExampleFI e2=(a,b)->System.out.println(a*b);
		e2.someCal(12, 67);
		e2.someCal(13,78);
		
		e1.someCal(12, 56);

	}

}
