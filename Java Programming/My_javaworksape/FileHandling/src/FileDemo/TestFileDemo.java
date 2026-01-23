package FileDemo;

import java.io.*;

public class TestFileDemo {

	public static void main(String[] args) 
	{
	
		try 
		{
			FileOutputStream fos = new FileOutputStream("MyData.txt");
			//DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new Employee(101,"Atharv",42000));
			
			System.out.println("Written Successfully");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}

class ReadDemo
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fis = new FileInputStream("MyData.txt");
			//DataInputStream dis = new DataInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee e1 = (Employee)ois.readObject();
			
			System.out.println(e1);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
}
