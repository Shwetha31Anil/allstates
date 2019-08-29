package com.allstates.training.pojos;

import java.util.Date;

public class RegularStudent extends Student {
	private Course course;
	private double scores;
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public double getScores() {
		return scores;
	}
	public void setScores(double scores) {
		this.scores = scores;
	}
	public RegularStudent(String stid, String stname, long phnum, Date dob) {
		super(stid, stname, phnum, dob);
		// TODO Auto-generated constructor stub
	}
	public RegularStudent(String stid, String stname, long phnum, Date dob, Course course, double scores) {
		super(stid, stname, phnum, dob);
		this.course = course;
		this.scores = scores;
	}
	@Override
	public String toString() {
		return "RegularStudent [course=" + course + ", scores=" + scores + "]";
	}
	
	
}
