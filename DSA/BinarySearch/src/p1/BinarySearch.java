package p1;

import java.util.Scanner;

class BinarySearch 
{

	public static void main(String[] args) 
	{
		int [] arr = new int [10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter element do you want to search: ");
		int x = sc.nextInt();
		
		int result = binarySearch(arr,x);
		if(result != -1)
			System.out.println("Found element at index: " + result);
		else
			System.out.println("Not Found!!");
	}


	static int binarySearch (int [] arr, int x)
	{
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end)
		{
			int mid = (start + end) / 2;
			
			if(arr[mid] == x)
				return mid;
			
			else if(arr[mid] > x)
				end = mid - 1;
			
			else 
				start = mid + 1;
		}
		
		return -1;
	}
}
