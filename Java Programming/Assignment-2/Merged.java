import java.util.*;


class Merged
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int i , j;
	
		int [] merged = new int [10];		
		int [] arr = new int[4];
		int [] brr = new int[4];
		
		System.out.print("Enter elemets: ");
		
		for(i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	
		System.out.print("Enter elemets: ");
		
		for(i = 0; i < brr.length; i++)
		{
			brr[i] = sc.nextInt();
		}
	
		System.out.println();
	
		for (i = 0; i < arr.length; i++)
		{
			merged[i] = arr [i];
		}
	
		for (j = 0; j < brr.length; j++)
		{
			merged[i] = brr [j];
			i++;
		}
	
		System.out.print("Merged array: ");
		for (i = 0; i < 10; i++)
		{
			System.out.print(" " + merged[i]);
		}
	}
}