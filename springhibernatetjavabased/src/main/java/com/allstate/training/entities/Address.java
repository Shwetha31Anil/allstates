package com.allstate.training.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Address {
	@Id
	private int aid;
	private String street;
	private String city;
	private String state;
	private int pincode;
	@ManyToOne
	private Student student;
	
	
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "Student="+student+"]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
