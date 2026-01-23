package p1;

import java.time.Duration;
import java.time.Instant;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) 
	{
		File f1 = new File ("FirstName.txt");
		
		File f2 = new File ("LastName.txt");
		
		ArrayList A1 = new ArrayList();
		ArrayList A2 = new ArrayList();
		
		try 
		{
			f1.createNewFile();
			f2.createNewFile();
			
			FileWriter fw1 = new FileWriter(f1,true);
		
			FileWriter fw2 = new FileWriter(f2,true);
			
			//Instant start = Instant.now();
			
			long start = System.nanoTime();
			
			
			//FirstName file read krne ke liye
			
			FileReader fr1 = new FileReader(f1);
			
			BufferedReader br1 = new BufferedReader(fr1);//firstName.txt read krne ke liye
			
			//LastName file read krne ke liye
			FileReader fr2 = new FileReader(f2);
			
			BufferedReader br2 = new BufferedReader(fr2);//lastName.txt read krne ke liye
			
			
			String s;
			
			while((s = br1.readLine()) != null)
			{
				A1.add(s);
				
			}
			
			while((s = br2.readLine()) != null)
			{
				A2.add(s);
			}
				
			br1.close();
			br2.close();
			
			System.out.println("First Names: " +A1);
			System.out.println("Last Names: " +A2);
			
			System.out.println("\n=====Full Names=====\n");

			for(int i = 0; i < A1.size(); i++)
			{
				System.out.println(A1.get(i)+ " " + A2.get(i));
			}
			

			//Instant end = Instant.now();
			
			long end = System.nanoTime();
			
//			Duration duration = Duration.between(start, end);
//			System.out.println("Time taken: " + duration.toMillis() + " ms");
			
			long durationNs = end - start;
			double durationMs = durationNs / 1_000_000.0;

			System.out.println("Time taken: " + durationMs + " ms");
			
			fw1.close();
			
			fw2.close();
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}