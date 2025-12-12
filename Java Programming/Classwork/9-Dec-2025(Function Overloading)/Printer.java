class Printer
{
	void print()
	{
		System.out.println("Hello");
	}	
	
	void print(int a)
	{
		System.out.println(a);
	}
	
	void print(char c)
	{
		System.out.println(c);
	}
	
	void print(String str)
	{
		System.out.println(str);
	}
}// Class ends here

class TestPrinter
{
	public static void main(String [] args)
	{
		Printer p1 = new Printer();
	
		p1.print (10);
		p1.print ('A');
		p1.print ("FirstBit");
		p1.print ();
	}
}