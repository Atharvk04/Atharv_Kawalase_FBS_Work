package p1;

import java.util.Scanner;

class InsertionSort 
{

	public static void main(String[] args) 
	{
		int [] arr = new int [7];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		insertionSort(arr);
		
		System.out.println("Sorted Array: ");
		for(int i = 0;i<arr.length;i++)
			System.out.println(" "+arr[i]);
		
	}
	
	static void insertionSort(int [] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int x = arr[i];
			int j = i - 1;
			
			while (j >= 0)
			{
				if(arr[j] > x)
				{
					arr[j+1] = arr [j];
					j--;
				}
				else
					break;
			}
			
			arr[j+1] = x;
		}
	}
}
