package com.coll;

public class Course {

	private String name;
	private int duration;
	private double fees;
	private String level;

	public Course() {

	}

	public Course(String name, int duration, double fees, String level) {
		super();
		this.name = name;
		this.duration = duration;
		this.fees = fees;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
