package p1;

import java.util.Scanner;

class linearSearch 
{

	public static void main(String[] args) 
	{
		int [] arr = new int [5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter element do you want to search: ");
		int x = sc.nextInt();
		
		int result = LinearSearch(arr,x);
		if(result != -1)
			System.out.println("Found element at index: " + result);
		else
			System.out.println("Not Found!!");
	}


	static int LinearSearch (int [] arr, int x)
	{
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == x)
			
				return i;
		
		}
	
		return -1;
	}
}
