package p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestEmployee 
{
	public static void main1(String[] args) 
	{
		Employee e1 = new Employee(104,"Rohit",56000);
		Employee e2 = new Employee(101, "Atharv" , 54000);
		Employee e3 = new Employee(102,"Ashish" , 35000);
		Employee e4 = new Employee(103,"Yuvraj",13000);
		
		ArrayList <Employee> Alist = new ArrayList <Employee> ();
		
		Alist.add(e1);
		Alist.add(e2);
		Alist.add(e3);
		Alist.add(e4);
		
		System.out.println("==========Before Swapping==========");
		System.out.println(Alist);
		
		
		Collections.sort(Alist);
		
		System.out.println("\n==========After Swapping==========");
		System.out.println(Alist);
		
	}
	
	public static void main2(String[] args) 
	{
		Employee e1 = new Employee(104,"Rohit",56000);
		Employee e2 = new Employee(101, "Atharv" , 54000);
		Employee e3 = new Employee(102,"Ashish" , 35000);
		Employee e4 = new Employee(103,"Yuvraj",13000);
		
		LinkedList <Employee> Llist = new LinkedList <Employee> ();
		
		Llist.add(e1);
		Llist.add(e2);
		Llist.add(e3);
		Llist.add(e4);
		
		System.out.println("==========Before Swapping==========");
		System.out.println(Llist);
		
		
		Collections.sort(Llist);
		
		System.out.println("\n==========After Swapping==========");
		System.out.println(Llist);
	}
	
	public static void main3(String[] args) 
	{
		Employee e1 = new Employee(104,"Rohit",56000);
		Employee e2 = new Employee(101, "Atharv" , 54000);
		Employee e3 = new Employee(102,"Ashish" , 35000);
		Employee e4 = new Employee(103,"Yuvraj",13000);
		
		TreeSet <Employee> Tset = new TreeSet <Employee> ();
		
		Tset.add(e1);
		Tset.add(e2);
		Tset.add(e3);
		Tset.add(e4);
		
		System.out.println("==========Before Swapping==========");
		System.out.println(Tset);
		
		
		//Collections.sort(Tset);  TreeSet is laready sorted thats why we comment this line!!!
		
		System.out.println("\n==========After Swapping==========");
		System.out.println(Tset);
	}
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(104,"Rohit",56000);
		Employee e2 = new Employee(101, "Atharv" , 54000);
		Employee e3 = new Employee(102,"Ashish" , 35000);
		Employee e4 = new Employee(103,"Yuvraj",13000);
		Employee e5 = new Employee(116,"Sakshi", 52000);
		Employee e6 = new Employee(117,"Aditi",29000);
		
		HashSet <Employee> Hset = new HashSet <Employee> ();
		
		Hset.add(e1);
		Hset.add(e2);
		Hset.add(e3);
		Hset.add(e4);
		Hset.add(e5);
		Hset.add(e6);
		
		System.out.println("==========Before Swapping==========");
		System.out.println(Hset);
		
		
		//Collections.sort(Hset);  
		
		System.out.println("\n==========After Swapping==========");
		System.out.println(Hset);
	}
}
