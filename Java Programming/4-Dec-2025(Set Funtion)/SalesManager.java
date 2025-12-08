class SalesManager
{
	int id, target;
	String name;
	double salary, incentive;
	
	void setId(int s)
	{
		this.id = s;
	}	
	
	void setTarget(int s)
	{
		this.target = s;
	}
	
	void setName(String s)
	{
		this.name = s;
	}
	
	void setSalary(double s)
	{
		this.salary = s;
	}
	
	void setIncentive(double s)
	{
		this.incentive = s;
	}
		
	int getId()
	{
		return this.id;
	}
	
	String getName()
	{
		return this.name;
	}
	
	int getTarget()
	{
		return this.target;
	}
	
	double getSalary()
	{
		return this.salary;
	}
	
	double getIncentive()
	{
		return this.incentive;
	}
	
}// SalesManager class ends here

class TestSalesManager
{
	public static void main (String [] args)
	{
		SalesManager S1;
	
		S1 = new SalesManager();
		
		S1.setId (8956);
		S1.setName ("Rohit");
		S1.setSalary (75698);
		S1.setIncentive (0.17);
		S1.setTarget (17);
	
		System.out.println("id: "+S1.getId());
		System.out.println("Name: "+S1.getName());
		System.out.println("Salary: "+S1.getSalary());
		System.out.println("Incentive: "+S1.getIncentive());
		System.out.println("Target: "+S1.getTarget());
		
	}
}// TestSalesManager class ends here 