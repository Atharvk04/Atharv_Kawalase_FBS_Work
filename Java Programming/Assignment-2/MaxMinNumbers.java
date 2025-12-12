import java.util.Scanner;
	
	
class MaxMinNumbers
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
	
		int [] arr = new int[4];
	
		System.out.print("Enter elemets: ");

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] =sc.nextInt();
		}
	
		int min = arr[0];
		int max = arr[0];
	
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
				min = arr[i];
			
			if(arr[i] > max)
				max = arr [i];
			
		}
		System.out.print("Maximum  number: " + max + "\n" + "Minimum number: " + min);
		System.out.println();
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}