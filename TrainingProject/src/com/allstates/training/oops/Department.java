package com.allstates.training.oops;

import java.io.Serializable;

public class Department implements Serializable {
	private int deptid;
	private String dname;
	transient private String location;
	public Department(int deptid, String dname) {
		this.deptid = deptid;
		this.dname = dname;
		
	}
	public Department(int deptid, String dname,String location) {
		this.deptid = deptid;
		this.dname = dname;
		this.location=location;
	}
	@Override
	public String toString() {
		return deptid+" "+dname+" "+location;
	}
}
