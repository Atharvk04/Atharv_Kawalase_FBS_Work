import java.util.*;


class Alternate
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
	
		for (int i = 0; i < arr.length; i+=2)
			System.out.print(" " + arr[i]);
	
		
	}
}