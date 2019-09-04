package com.allstates.training.view;


import java.util.Scanner;
class Calculator{
	public double div(int a,int b)throws ArithmeticException {
		return a/b;
	}
}

public class ExceptionDemo {

	public static void main(String[] args){
		Calculator c1=new Calculator();
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
	try {	
		double result= c1.div(num1, num2);
		System.out.println();
		if( result < 0) {
			System.out.println("result is greater than zero");
		}else {
			throw new RuntimeException("Throwing");
		}
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}finally {
		
			System.out.println("finally block");
		}
		System.out.println("Program ");

	}

}
