package com.allstates.training.oops;

@FunctionalInterface
public interface ExampleFI {
	public void someCal(int a, int b);
	//interface--- abstract method, static , default methods
	//abstract class--- abstarct methods and concretemethods,static methods
	//class-- concrete and static methods
	public static void someCal1(int a,int b) {
		System.out.println(a/b);
	}
	public static void someCal12(int a,int b) {
		System.out.println(a/b);
	}
	public static void someCal13(int a,int b) {
		System.out.println(a/b);
	}
	//public void someCal1(int a, int b);
}
