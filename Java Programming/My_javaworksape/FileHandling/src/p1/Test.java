package p1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test 
{

	public static void main(String[] args) 
	{
		File f1 = new File("demo.txt");
		
		try 
		{
			f1.createNewFile();
			FileWriter fw1 = new FileWriter(f1,true); //true means we are appending the string.
			fw1.write("Hello World!!!");
			fw1.close();
			System.out.println("Written Successfully!!!");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
