package com.bean;

import java.util.Objects;

public class Course 
{
	int courseID;
	String courseName;
	
	
	public Course(int courseID, String courseName) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
	}


	public int getCourseID() {
		return courseID;
	}


	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + "]";
	}

	public int hashCode() {
		return Objects.hash(courseID, courseName);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseID == other.courseID && Objects.equals(courseName, other.courseName);
	}
	
	
	
}
