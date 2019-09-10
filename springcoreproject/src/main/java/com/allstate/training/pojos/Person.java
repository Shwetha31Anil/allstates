package com.allstate.training.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Person {
	private long adarNum;
	private String email;
	private long ph_num;
	@Autowired
	private Address address;
	public long getAdarNum() {
		return adarNum;
	}
	public void setAdarNum(long adarNum) {
		this.adarNum = adarNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPh_num() {
		return ph_num;
	}
	public void setPh_num(long ph_num) {
		this.ph_num = ph_num;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
