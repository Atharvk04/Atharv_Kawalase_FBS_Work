import java.util.*;


class Reverse
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i;
	
		int [] rev = new int [4];	
		int [] arr = new int[4];
		
		System.out.print("Enter elemets: ");
		
		for(i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println();

		for (i = 0; i < arr.length; i++)
		{
			rev [i] = arr [arr.length - 1 - i];
		}
	
		System.out.print("Reversed array: ");
	
		for (i = 0; i < arr.length; i++)
		{
			System.out.print(" " + rev[i]);
		}
	}
}