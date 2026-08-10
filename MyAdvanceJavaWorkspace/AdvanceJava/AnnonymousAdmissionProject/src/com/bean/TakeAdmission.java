package com.bean;

import java.util.ArrayList;

import java.util.Scanner;

public class TakeAdmission {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id: ");
		int id = sc.nextInt();

		sc.nextLine();
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();

		ArrayList<Course> allCourses = new ArrayList<Course>();

		allCourses.add(new Course(101, "Java"));
		allCourses.add(new Course(102, "Python"));
		allCourses.add(new Course(103, "Testing"));

		Student s1 = new Student(id, name);
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(s1);

		a1.add(new Student(2, "Atharv"));     
		
		Batch b = new Batch() {
			public void takeAdmission() {
				

				for (Student s1 : a1) {
					System.out.println(s1);
				}
			}

			public String getCourseDetails(String courseName) 
			{
			    for (Course c : allCourses) 
			    {
			        if (c.courseName.equals(courseName)) 
			            	return "Course Found";
			    }
			    
			    return "Sorry, we don't have that course!";
			}

		};

		b.takeAdmission();

		System.out.println();

		String Result = b.getCourseDetails("C");
		System.out.println(Result);

		Certificate certi = new Certificate() {

			public void getCertificate(int StudentId, String courseName) 
			{
				boolean rollFound = false;
				boolean cname = false;
				
				for(Student s : a1)
				{
					if(s.getId() == StudentId)
					{
						rollFound = true;
						break;
					}
				}
				
				for (Course c: allCourses)
				{
					if(c.getCourseName().equals(courseName))
					{
						cname = true;
						break;
					}
				}
				
				if(rollFound && cname)
				{
					System.out.println("Certificate Generated Successfully");
				}
				else
				{
					System.out.println("Invalid Credentials!!! Try Again!!");
				}
					
			}	

		};
		System.out.println();
		certi.getCertificate(4, "C");
	}

}
