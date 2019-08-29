package com.allstates.training.oops;

public class AEmployee {
	private int empno;
	private String name;
	private double salary;
	private String address;
	private Department department/*=
			new Department(12,"Production")*/;
	public AEmployee(int empno, String name,
			double salary, String address) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public AEmployee(int empno, String name,
			double salary, String address,Department department) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.department=department;
	}
	@Override
	public String toString() {
		return "AEmployee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", department=" + department + "]";
	}
}
