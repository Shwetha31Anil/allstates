package com.allstate.training.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy=InheritanceType.JOINED)
public class Account {
	@Id
	private int accid;
	private String name;
	private int balance;
	

	
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
