import java.util.*;


class Search
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		boolean found = false;
	
		int [] arr = new int[4];

		System.out.print("Enter elemets: ");

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("Enter the element you want to search: ");

		int search = sc.nextInt();
	
		for (int i = 0; i < arr.length; i++)
    		{
        		if (arr[i] == search)
        		{
            			System.out.print("Number" + search + "found at index: "+ i);
            			found = true;
				break;
        		}
		}
			if(!found)
			{
				System.out.print("Not Found");
			}
    		
	}
}