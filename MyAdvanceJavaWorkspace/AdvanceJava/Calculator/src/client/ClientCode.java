package client;

import java.util.Scanner;

import serviceImpl.Calculator;

public class ClientCode 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator c1 = new Calculator();
		
		int choice;
		
		
		System.out.println("Enter the First Number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Number: ");
		int b = sc.nextInt();
		
		do
		{
			System.out.println("========== Calculator Menu ==========");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();

				
				switch(choice)
				{
				case 1:
					System.out.println("Addition: " + c1.add(a, b));
					break;
					
				case 2: 
					System.out.println("Subtraction: " + c1.sub(a, b));
					break;
					
				case 3:
					System.out.println("Multiplication: " + c1.mul(a, b));
					break;
					
				case 4:
					System.out.println("Division: " + c1.div(a, b));
					break;
					
				case 5: 
					System.out.println("Exiting...");
				}
			
			
			
		} while(choice != 5);
		
		sc.close();
		
		
	}
}
