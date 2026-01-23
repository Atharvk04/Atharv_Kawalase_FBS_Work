package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

class Student implements Comparable <Student>
{
	int rollno;
	String name;
	
	public Student()
	{
		
	}


	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}



	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "\n [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	public boolean equals(Object o)
	{
		Student s2 = (Student) o;
		
		if(this.rollno == s2.rollno)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}


	@Override
	public int compareTo(Student s2) 
	{
		//Student s2 = (Student) o; //downcasting
		
		return this.rollno - s2.rollno;
	}
	
	@Override
	public int hashCode() 
	{	
		return this.rollno;
	}
	
	
}//Class Student Ends Here

public class DemoStudent {

	public static void main1(String[] args) 
	{
		Student s1 = new Student (10, "Sachin");
		Student s2 = new Student (7,"Dhoni");
		Student s3 = new Student (18,"Virat");
		
		ArrayList <Student> SList = new ArrayList <Student> ();
		
		SList.add(s1);
		SList.add(s2);
		SList.add(s3);
		
		System.out.println(SList);
	
	
		if(SList.contains(new Student(7,"Dhoni")))
			System.out.println("Found");
	
		else
			System.out.println("Not Found");
	}
	
	
	
	
	
	public static void main23(String[] args) 
	{
		Student s1 = new Student (10, "Sachin");
		Student s2 = new Student (7,"Dhoni");
		Student s3 = new Student (18,"Virat");
		
		TreeSet <Student> t1= new TreeSet <Student> ();
		
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		
		System.out.println(t1);
		
		if(t1.contains(new Student(7,"Dhoni")))
			System.out.println("Found");
	
		else
			System.out.println("Not Found");
		
	}
	
	public static void main(String[] args) 
	{
		Student s1 = new Student (10, "Sachin");
		Student s2 = new Student (7,"Dhoni");
		Student s3 = new Student (18,"Virat");
		Student s4 = new Student (33, "Hardik");
		Student s5 = new Student (17, "AB");
		
		HashSet <Student> h1= new HashSet <Student> ();
		
		h1.add(s1);
		h1.add(s2);
		h1.add(s3);
		h1.add(s4);
		h1.add(s5);
		
		System.out.println(h1);
		
		if(h1.contains(new Student(7,"Dhoni")))
			System.out.println("Found");
	
		else
			System.out.println("Not Found");
		
	}

}//Class DemoStudent Ends Here
