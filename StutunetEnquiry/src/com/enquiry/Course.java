package com.enquiry;

public class Course {
	
	private int Course_id;
	private String Course_name;
	private int cost;
	
	public int getCourse_id() {
		return Course_id;
	}
	public void setCourse_id(int course_id) {
		Course_id = course_id;
	}
	public String getCourse_name() {
		return Course_name;
	}
	public void setCourse_name(String course_name) {
		Course_name = course_name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void display() {
		System.out.println("--------------------------Course Details--------------------------");
		System.out.println("Course name:" + Course_name);
		System.out.println("Couser id :" + Course_id);
		System.out.println("Course cast:" + cost);
		//System.out.println("--------------------------------------------------------------");
	}
	

}
