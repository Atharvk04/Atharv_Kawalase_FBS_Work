import java.util.*;


class Prime
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
		
		System.out.print("Prime Numbers are: ");
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] <= 1)
				continue;
		
			int count = 0;
		
			for(int j = 1; j <= arr[i]; j++)
			{
				if (arr [i] % j == 0)
				count ++;
			}
		
			if (count == 2)
				System.out.print(" " + arr[i]);
		}
	}
}