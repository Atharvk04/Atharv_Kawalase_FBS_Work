package p2;

//import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) 
	{
		//ArrayList l1;
		
		LinkedList <Integer> l1;
		l1 = new LinkedList  <Integer>();
		
		//l1.add("FirstBit");
		l1.add(10);
		l1.add(30);
		l1.add(20);
		
		System.out.println(l1);
		
		System.out.println();
		for(int i = 0; i < l1.size() ; i++)
		{
			System.out.println(l1.get(i));
		}
		
		System.out.println();
		for(Integer i : l1)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		if(l1.contains(20))
		{
			System.out.println("Found");
		}
		
		else
		{
			System.out.println("Not Found");
		}
	}
}
