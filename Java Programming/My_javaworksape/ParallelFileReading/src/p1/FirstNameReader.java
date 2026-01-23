package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FirstNameReader extends Thread {

	File fName;
	
	public FirstNameReader(File fName) 
	{
		this.fName=fName;
	}
	@Override
	public void run() 
	{
		FileReader fr;
		try
		{
			fr = new FileReader(fName);
			BufferedReader b1 = new BufferedReader(fr);
			
			String s1;
			
			while((s1 = b1.readLine())!=null)
			{
				System.out.print(s1+" ");
				Thread.sleep(100);
			}
			b1.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
