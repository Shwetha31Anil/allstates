package com.allstate.training.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ca")
public class CurrentAccount  extends Account{
	private int cacc;

	public int getCacc() {
		return cacc;
	}

	public void setCacc(int cacc) {
		this.cacc = cacc;
	}
	

}
