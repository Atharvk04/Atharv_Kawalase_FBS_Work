class HR
{
	int id;
	String name;
	double salary, commission;
	
	void display ()
	{
		System.out.println("\nHR id is:"+id+"\nName is: "+name+"\nSalary: "+salary + "\nCommission: "+commission);
	}
	
}// HR class ends here

class TestHR
{
	public static void main (String [] args)
	{
		HR H1;
		
		H1 = new HR ();		

		H1.id = 8756;
		H1.name = "Sourabh";
		H1.salary = 156942;
		H1.commission = 16;
	
		H1.display();
	}
}// TestHR ends here