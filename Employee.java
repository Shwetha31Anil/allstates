package com.allstates.training.oops;

public class Employee extends Person {
	private int empid;
	private double salary;
	private static String company="xyz";
	
	public Employee(String adarNum, String pname, 
			long[] ph_num, String addr,int empid,double salary) {
		super(adarNum, pname, ph_num, addr);
		this.empid=empid;
		this.salary= salary;
	}
	@Override
	public void display() {
		System.out.println("child called");
		}
	
	public void setEmpid(int empid) {
		this.empid=empid;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	public double getSalary() {
		return salary;
	}

}
