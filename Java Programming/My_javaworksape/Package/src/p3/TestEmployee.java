package p3;

import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManager;

class TestEmployee 
{
	public static void main (String [] args)
	{
		Employee e1;//reference
		//e1 = new Employee(101,"Atharv",50000);
		HR h1 = new HR (102,"Ashish",45000,0.15);
		SalesManager s1 = new SalesManager (104,"Anujay",75896,14865,18);
		Admin a1 = new Admin(103,"Rohit",56302,1200);
		
		System.out.println("           Employee Details           ");
		//System.out.println(e1.toString());
		System.out.println();
		
		System.out.println("           HR Details           ");
		System.out.println(h1.toString());
		System.out.println();
		
		System.out.println("           Sales Manager Details           ");
		System.out.println(s1.toString());
		System.out.println();
		
		System.out.println("           Admin Details           ");
		System.out.println(a1.toString());
		System.out.println();	
	}
}//TestEmployee class ends here
