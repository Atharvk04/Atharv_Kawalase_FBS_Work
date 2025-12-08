class Admin
{
	int id;
	String name;
	double salary,allowance;
	
	Admin()
	{
		this.id = 1;
		this.name = "Atharv";
		this.salary = 74569;
		this.allowance = 15000; 
	
		System.out.println("default constructor get call"+"\n");
	}
	
	Admin(int i, String str, double s, double a)
	{
		this.id = i;
		this.name = str;
		this.salary = s;
		this.allowance = a;
	
		System.out.println("\n"+"parameterized constructor get call");
	}
	
	void setId(int a)
	{
		this.id = a;
	}
	
	void setName(String a)
	{
		this.name = a;
	}
	
	void setSalary(double a)
	{
		this.salary = a;
	}
	
	void setAllowance (double a)
	{
		this.allowance = a;
	}
	
	int getId()
	{
		return this.id;
	}
	
	String getName()
	{
		return this.name;
	}
	
	double getSalary()
	{
		return this.salary;
	}	
	
	double getAllowance()
	{
		return this.allowance;
	}
}// Admin class ends here
	
class TestAdmin
{
	public static void main (String [] args)
	{
		Admin A1;
		
		A1 = new Admin ();
	
		A1.setId (908);
		A1.setName ("Yuvraj");
		A1.setSalary (145623);
		A1.setAllowance (17589);

		System.out.println("id: "+A1.getId());
		System.out.println("name: "+A1.getName());
		System.out.println("salary: "+A1.getSalary());
		System.out.println("allowance: "+A1.getAllowance());

		Admin A2 = new Admin(909, "Akash", 145874, 14563);
		

	}
}// TestAdmin class ends here