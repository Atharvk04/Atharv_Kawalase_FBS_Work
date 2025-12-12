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
	
		System.out.println("default constructor get call"+"\n");

	}
	
	Employee(int i, String str, double s)
	{
		this.id = i;
		this.name = str;
		this.salary = s;
	
		System.out.println("\n"+"parameterized constructor get call");
	}
	
	void display()
	{
		System.out.println("id: "+ id +"\n" + "name: " + name +"\n" + "Salary: "  +"\n" + salary);
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
	
		Employee [] earr = new Employee[3];
	
		earr[0] = new Employee ();
		earr[1] = new Employee (101,"Atharv",25000);
		earr[2] = new Employee ();
	
		//for(int i = 0; i < earr.length; i++)
		//{
		//	earr[i].display();
		//}
		
		for(Employee e : earr)
		{
			System.out.println();
			e.display();
		}
		
 	}
} //TestEmployee class ends here
	