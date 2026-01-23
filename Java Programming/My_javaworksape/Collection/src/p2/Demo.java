package p2;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) 
	{
		TreeSet <Integer> t1 = new TreeSet <Integer>();
		//t1.add("FirstBit");
		t1.add(10);
		t1.add(30);
		t1.add(20);
		
		//System.out.println(t1);
		
//		for(int i=0; i< t1.size();i++)
//		{
//			System.out.println(t1);
//		}
		
		
		for(Integer i:t1)
		{
			System.out.println(t1);
		}
		
		if(t1.contains(30))
		{
			System.out.println("Found");
		}
		
		else
		{
			System.out.println("Not Found");
		}
	}

}
