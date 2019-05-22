package com.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapDemo {
	public static void main(String[] args) {

		Student s = new Student();
		s.setName("Aung Aung");
		s.setPhone("0949583437");
		s.setAddress("Yangon");

		List<Course> courseList = new ArrayList<Course>();
		Collections.addAll(courseList, new Course("Java SE", 100, 5000.0, "1"), new Course("Java EE", 100, 5000.0, "1"),
				new Course("Java SE", 100, 5000.0, "2"), new Course("Java SE", 100, 5000.0, "1"));

	}
}
