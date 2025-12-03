class Admin
{
	int id;
	String name;
	double salary,allowance;
	
	void display()
	{
		System.out.println("\nAdmin id is:"+id+"\nName is: "+name+"\nSalary: "+salary + "\nAllowance: "+allowance);

	}
	
}// Admin class ends here
	
class TestAdmin
{
	public static void main (String [] args)
	{
		Admin A1;
		
		A1 = new Admin ();
	
		A1.id = 908;
		A1.name = "Yuvraj";
		A1.salary = 145623;
		A1.allowance = 17589;

		A1.display();
	}
}// TestAdmin class ends here