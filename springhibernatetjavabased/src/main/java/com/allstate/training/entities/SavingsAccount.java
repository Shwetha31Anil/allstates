package com.allstate.training.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("sa")
public class SavingsAccount extends Account {
	private int  sacc_num;

	public int getSacc_num() {
		return sacc_num;
	}

	public void setSacc_num(int sacc_num) {
		this.sacc_num = sacc_num;
	}
	
 
}
