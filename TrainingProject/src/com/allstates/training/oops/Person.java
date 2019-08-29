package com.allstates.training.oops;

public class Person {
	private String adarNum;
	private String pname;
	private long[] ph_num;
	private String address;
	private final double PI=3.145;
	
	public Person() {
		
	}
	public Person(String adarNum,String pname) {
	
	}
	public Person(String adarNum, String pname,long[] ph_num,
			String addr){
		this.adarNum=adarNum;
		this.pname=pname;
		this.ph_num=ph_num;
		address=addr;
	}

	public String getAdarNum() {
		return adarNum;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void display() {
	System.out.println("parent called");
	}
	
	public  void getPerson() {
		System.out.println("Person Details");
		System.out.println(adarNum+" "+pname+" "+address);
		for(int i=0;i<ph_num.length;i++) {
			System.out.println(ph_num[i]);
		}
		
	}
	
	
	
	
}
