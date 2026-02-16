package transport;

import java.util.Scanner;

public class BusFareCalculator 
{
	public static void main(String[] args) 
	{
		String[] stops = {"Shivaji Nagar","Deccan","Swargate","Karve Nagar","Warje","Kothrud Depot"};
		
		int[] fares= {20,10,15,12,25,50};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Source Stop: ");
		String source = sc.next();
		
		System.out.println("Enter Destination Stop: ");
		String destination = sc.next();
		
		int sourceIndex = -1;
		int destinationIndex = -1;
		
		for(int i = 0; i < stops.length; i++)
		{
			if(stops[i].equalsIgnoreCase(source))
				sourceIndex = i;
			
			if(stops[i].equalsIgnoreCase(destination))
				destinationIndex = i;
		}
		
		if(sourceIndex == -1 || destinationIndex == -1)
		{
			System.out.println("Invalid Stop Name!!!");
			return;
		}
		
		int totalFare = 0;
		
		if(sourceIndex < destinationIndex)
		{
			for(int i = sourceIndex; i < destinationIndex;i++)
			{
				totalFare =+ fares[i];
			}
		}
		
		else if(sourceIndex > destinationIndex)
		{
			
		}
 	}
}
