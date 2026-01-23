package p1;

import java.util.TreeMap;

public class Player 
{
	int jerseyNo;
	String name;
	int runs;
	
	public Player(int jerseyNo, String name, int runs) 
	{
		super();
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.runs = runs;
	}

	@Override
	public String toString() {
		return "\n Player [jerseyNo=" + jerseyNo + ", name=" + name + ", runs=" + runs + "] \n";
	}
	
}

class Demo
{
	public static void main(String[] args) 
	{
		TreeMap <MyKey, Player>tm = new TreeMap<MyKey, Player>();
		
		tm.put(new MyKey(111), new Player(10,"Sachin",100));
		tm.put(new MyKey(101), new Player(7,"Dhoni",99));
		tm.put(new MyKey(16), new Player(18, "Virat", 101));
		
		System.out.println(tm);
	}
}
