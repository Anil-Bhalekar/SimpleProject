package com.enquiry;

public class DemoTest {
	
	public static void main(String args[]) {
	Course c1= new Course();
	Course c2= new Course();
	Course c3= new Course();
	
	c1.setCourse_id(101);
	c1.setCourse_name("java");
	c1.setCost(9500);
	
	c2.setCourse_id(102);
	c2.setCourse_name("Mysql");
	c2.setCost(2000);
	
	c3.setCourse_id(103);
	c3.setCourse_name("C , C++");
	c3.setCost(4500);
	
	Course course [] = new Course[3];
	course[0]=c1;
	course[1]=c2;
	course[2]=c3;
	
	Course course1 [] = new Course[2];
	course1[0]=c1;
	//course1[1]=c2;
	course1[1]=c3;
	
	Course course2 [] = new Course[1];
	course2[0]=c2;
	//course[1]=c2;
	//course[2]=c3;
	
	Student s1 =new Student();
	Student s2 =new Student();
	Student s3 =new Student();
	s1.setStudent_id(201);
	s1.setStudent_name("Anil");
	s1.setStudent_age(24);
	//s1.setCourses(course2);
	
	s2.setStudent_id(202);
	s2.setStudent_name("Bhalekar");
	s2.setStudent_age(27);
//	s2.setCourses(course);
	
	s3.setStudent_id(203);
	s3.setStudent_name("Vishal");
	s3.setStudent_age(26);
//	s3.setCourses(course1);
	
	s1.Display();
	System.out.println();
	s2.Display();
	System.out.println();
	s3.Display();
    System.out.println();	
    
    c1.display();
    c2.display();
    c3.display();
    
	}

}
