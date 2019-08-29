package com.allstates.training.assignment;

@FunctionalInterface
public interface Account1 {
	public void getBm();
	//public void getCV();
	public default void getDisplay() {
		System.out.println("Default method called");
	}
	public static void getValue() {
		System.out.println("Static method called");
	}

}
