package p1;

import java.util.Scanner;

class SelectionSort 
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
		
		selectionSort(arr);
		
		System.out.println("Sorted Array: ");
		for(int i = 0;i<arr.length;i++)
			System.out.println(" "+arr[i]);
		
	}
	
	static void selectionSort(int [] arr)
	{
		for(int i = 0; i < arr.length -1; i++)
		{
			int min = arr[i];
			int m_index = i;
			
			for(int j = i+1;j<arr.length;j++)
			{
				if(min > arr[j])
				{
					min = arr[j];
					m_index = j;
				}
			}
			arr[m_index] = arr[i];
			arr[i] = min;
		}
	}
}