package com.allstates.training.pojos;

public class Course {

	private int courseId;
	private String cname;
	private Trainer trainer;
	public Course() {
		
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", cname=" + cname + ", trainer=" + trainer + "]";
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public Course(int courseId, String cname) {
		super();
		this.courseId = courseId;
		this.cname = cname;

	}
	public Course(int courseId, String cname, Trainer trainer) {
		super();
		this.courseId = courseId;
		this.cname = cname;
		this.trainer = trainer;
	}
}
