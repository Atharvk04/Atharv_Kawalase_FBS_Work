package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args)
	{
		File fName = new File ("firstName.txt");

		
		try 
		{
			fName.createNewFile();
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		File lName = new File("lastName.txt");
		
		try 
		{
			lName.createNewFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		FirstNameReader fr = new FirstNameReader (fName);
		
		LastNameReader lr = new LastNameReader (lName);
		
		fr.start();
		
		try 
		{
			Thread.sleep(100);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		lr.start();
	}

}
