package com.coll;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {
	public static void main(String[] args) {

		Student s = new Student();
		s.setName("Aung Aung");
		s.setPhone("0949583437");
		s.setAddress("Yangon");

		List<Course> courseList = new ArrayList<Course>();
		courseList.add(new Course());
		courseList.add(new Course());
		courseList.add(new Course());
		courseList.add(new Course());
		s.setCourses(courseList);
	}
}
