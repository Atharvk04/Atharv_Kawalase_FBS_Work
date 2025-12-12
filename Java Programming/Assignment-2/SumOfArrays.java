import java.util.*;


class SumOfArrays
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;	
	
		int [] arr = new int[4];
		int [] brr = new int[4];
		int [] crr = new int[4];
		
		System.out.print("Enter elemets: ");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter elemets: ");
		
		for(int i = 0; i < brr.length; i++)
		{
			brr[i] = sc.nextInt();
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++)
		{
			crr [i] = arr [i] + brr [i];
		}
	
		System.out.print("sum of two arrays: ");
	
		for (int i = 0; i < crr.length; i++)
		{
			System.out.print(" " + crr[i]);
		}
	}
}