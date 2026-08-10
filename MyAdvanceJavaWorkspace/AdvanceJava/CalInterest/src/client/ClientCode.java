package client;

import java.util.Scanner;

import serviceImpl.Interest;

public class ClientCode {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		Interest i1 = new Interest();
		
		System.out.println("Enter Principal Amount: ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter Rate of Interest: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time (years): ");
		int time = sc.nextInt();
		
		double result = i1.calculateInterest(principal, rate, time);
		
		System.out.println("Calculated Interest Rate: " + result);
		
		sc.close();
	}
}
