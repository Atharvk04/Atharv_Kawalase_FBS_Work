import java.util.*;


class EvenOdd
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;	
	
		int [] arr = new int[4];
		
		System.out.print("Enter elemets: ");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println();
	
		System.out.print("Even Numbers:");
	
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
				System.out.println(" " + arr[i]);
		}
	
		System.out.print("Odd Numbers:");
	
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 != 0)
				System.out.println(" " + arr[i]);
		}
	
		
	}
}