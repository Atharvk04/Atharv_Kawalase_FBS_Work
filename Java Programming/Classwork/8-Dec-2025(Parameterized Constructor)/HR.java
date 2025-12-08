class HR
{
	int id;
	String name;
	double salary, commission;
	
	HR()
	{
		this.id = 78;
		this.name = "Aditi";
		this.salary = 47856;
		this.commission = 0.14;
	
		System.out.println("default constructor get call"+"\n");
	}
		
	HR(int i, String eName, double s, double c)
	{
		this.id = i;
		this.name = eName;
		this.salary = s;
		this.commission = c;
	
		System.out.println("\n"+"parameterized constructor get call");
	}
	
	void setId(int h)
	{
		this.id = h;
	}
	
	void setName(String h)
	{
		this.name = h;
	}
	
	void setSalary(double h)
	{
		this.salary = h;
	}
	
	void setCommission (double h)
	{
		this.commission = h;
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
	
	double getCommission()
	{
		return this.commission;
	}
}// HR class ends here

class TestHR
{
	public static void main (String [] args)
	{
		HR H1;
		H1 = new HR ();		

		H1.setId (8756);
		H1.setName ("Sourabh");
		H1.setSalary (156942);
		H1.setCommission (16);
	
		System.out.println("id: "+H1.getId());
		System.out.println("Name: "+H1.getName());
		System.out.println("salary: "+H1.getSalary());
		System.out.println("Commission: "+H1.getCommission());	
		
		HR H2 = new HR(145,"Sanika",123654,0.19);
	}
}// TestHR ends here