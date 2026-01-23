package p2;

import java.time.Duration;
import java.time.Instant;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


class FirstNameThread extends Thread
{
	ArrayList A1;
	
	FirstNameThread (ArrayList  A1)
	{
		this.A1 = A1;
	}
	@Override
	public void run() 
	{
		try 
		{
			File f1 = new File ("FirstName.txt");
			
			f1.createNewFile();
			
//			FileWriter fw1 = new FileWriter(f1,true);
			
			FileReader fr1 = new FileReader(f1);
			
			BufferedReader br1 = new BufferedReader(fr1);//firstName.txt read krne ke liye
			
			String s1;
			
			while((s1 = br1.readLine()) != null)
			{
				A1.add(s1);
				
			}
			
			br1.close();
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
	}
}

public class Test {

	public static void main(String[] args) 
	{
		long start = System.nanoTime();
		
		//Instant start = Instant.now();
		
		//long end = System.nanoTime();
		
		File f2 = new File ("LastName.txt");
		
		ArrayList A1 = new ArrayList();
		ArrayList A2 = new ArrayList();
		
		try 
		{
			
			f2.createNewFile();
			
			FirstNameThread fn1 = new FirstNameThread(A1);
			fn1.start();
		
			
//			FileWriter fw2 = new FileWriter(f2,true);
			
			//Instant start = Instant.now();
			
//			long start = System.nanoTime();
			
			
			//FirstName file read krne ke liye
			
			
			
			//LastName file read krne ke liye
			FileReader fr2 = new FileReader(f2);
			
			BufferedReader br2 = new BufferedReader(fr2);//lastName.txt read krne ke liye
			
			
			String s;
			
			
			
			while((s = br2.readLine()) != null)
			{
				A2.add(s);
			}
				
			
			br2.close();
			
			try 
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			System.out.println("First Names: "+A1);
			System.out.println("Last Names: " +A2);
	
			System.out.println("\n=====Full Names=====\n");

			for(int i = 0; i < A1.size(); i++)
			{
				System.out.println(A1.get(i)+ " " + A2.get(i));
			}
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
//		Instant end = Instant.now();
//		
//		Duration duration = Duration.between(start, end);
//		System.out.println("Time taken: " + duration.toMillis() + " ms");
		
		long end = System.nanoTime();
		
		long durationNs = end - start;
		double durationMs = durationNs / 1_000_000.0;

		System.out.println("Time taken: " + durationMs + " ms");

	}

}