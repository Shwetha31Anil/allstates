package com.allstate.training.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.DynamicUpdate;


@Entity
@DynamicUpdate
public class Student {
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", dob=" + dob
				+ ", adarNum=" + adarNum + ", address=" + address + "]";
	}
	@Id
	private int studentId;
	@Column(name="sname",length=45)
	private String studentName;
	@Column(nullable=false)
	private int marks;
	private String dob;
	@Column(unique=true)
	private long adarNum;
	@OneToMany(mappedBy="student",fetch=FetchType.LAZY)
	private List<Address> address=new ArrayList<>();
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getAdarNum() {
		return adarNum;
	}
	public void setAdarNum(long adarNum) {
		this.adarNum = adarNum;
	}
	
	
	

}
