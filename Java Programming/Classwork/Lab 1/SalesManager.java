class SalesManager
{
	int id, target;
	String name;
	double salary, incentive;
	
	void display ()
	{
		System.out.println("\nEmployee id is:"+id+"\nName is: "+name+"\nSalary: "+salary + "\nIncentive: "+incentive+"\nTarget is: "+target);

	}	
	
}// SalesManager class ends here

class TestSalesManager
{
	public static void main (String [] args)
	{
		SalesManager S1;
	
		S1 = new SalesManager();
		
		S1.id = 8956;
		S1.name = "Rohit";
		S1.salary = 75698;
		S1.incentive = 0.17;
		S1.target = 17;
	
		S1.display();
		
	}
}// TestSalesManager class ends here 