package com.enquiry;

public class Student {
	
	private int Student_id;
	private int Student_age;
	private String Student_name;
	private Course[] courses;
	
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public int getStudent_age() {
		return Student_age;
	}
	public void setStudent_age(int student_age) {
		Student_age = student_age;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
	public void Display() {
		System.out.println("-------------------------Student Details-------------------------");
		System.out.println("Student id:" +  Student_id);
		System.out.println("Student name:" + Student_name);
		System.out.println("Student age" + Student_age);
		
		//for(Course course:courses) {
	
		}
	
	}


