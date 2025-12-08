class Employee
{
	int id;
	String name;
	double salary;
	
	Employee()
	{
		this.id = 1;
		this.name = "Sakshi";
		this.salary = 45896;
	}
	
	void setId(int d)
	{	
		this.id = d;
	}
	
	void setName(String d)
	{
		this.name = d;
	}
	
	void setSalary(double d)
	{
		this.salary = d;
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
}//Employee class ends here

class TestEmployee
{
	public static void main (String [] args)
	{
		Employee e1;
		e1 = new Employee();
		
		e1.setId (2365);
		e1.setName ("Atharv");
		e1.setSalary (76523);
		
		System.out.println("id: "+e1.getId());	
		System.out.println("name: "+e1.getName());
		System.out.println("salary: "+e1.getSalary());
	}
} //TestEmployee class ends here
	