package com.allstates.training.pojos;

import java.util.Arrays;
import java.util.Date;

public class DistanceStudent extends Student {
	private Course[] course=new Course[3];
	
public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}

public DistanceStudent(String stid, String stname, long phnum, Date dob) {
		super(stid, stname, phnum, dob);
		// TODO Auto-generated constructor stub
	}

public DistanceStudent(String stid, String stname, long phnum,
		Date dob, Course[] course) {
	super(stid, stname, phnum, dob);
	this.course = course;
}

@Override
public String toString() {
	return "DistanceStudent [course=" + Arrays.toString(course) + ", toString()=" + super.toString() + "]";
}

}