package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestEmployee 
{
	public static void main(String[] args) 
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
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		
		do
		{
			System.out.println("\n============ Employee Sorting System =====4=======\n\n");
			System.out.println("1.SORT BY ID");
			System.out.println("2.SORT BY SALARY");
			System.out.println("3.SORT BY NAME");
			System.out.println("4.DISPLAY");
			System.out.println("5.TO STOP OR EXIT");
			System.out.println("\nEnter choice to  sort");
			
			choice =sc.nextInt();
			
			switch(choice)
			{
			case 1:
				MyIdComparator midc = new MyIdComparator ();
				Collections.sort(Alist, midc);
				
				System.out.println("\n\n ==========After Sorting By ID==========");
				System.out.println(Alist);
				break;
				
			case 2:
				MySalaryComparator msc = new MySalaryComparator ();
				Collections.sort(Alist, msc);
				
				System.out.println("\n\n ==========After Sorting By Salary==========");
				System.out.println(Alist);
				break;
				
			case 3:
				MyNameComparator mnc = new MyNameComparator();
				Collections.sort(Alist, mnc);
				
				System.out.println("\n\n ==========After Sorting By Name==========");
				System.out.println(Alist);
				break;
				
			case 4:
				System.out.println(Alist);
				break;
				
			case 5:
				System.out.println("Exiting...");
				break;
				
				default:
					System.out.println("Invalid Choice");
					break;
				
			}
		} while(choice !=5);
		
	}//main ends here

}//class TestEmployee ends here
