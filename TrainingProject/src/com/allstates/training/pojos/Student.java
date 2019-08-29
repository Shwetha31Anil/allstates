package com.allstates.training.pojos;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
private String stid;
private String stname;
private long phnum;
private Date dob;
public Student(String stid, String stname, long phnum, Date dob) {
	super();
	this.stid = stid;
	this.stname = stname;
	this.phnum = phnum;
	this.dob = dob;
}
@Override
public String toString() {
	return "Student [stid=" + stid + ", stname=" + stname + ", phnum=" + phnum + ", dob=" + dob + "]";
}

}
