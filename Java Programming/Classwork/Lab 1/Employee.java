class Employee
{
	int id;
	String name;
	double salary;
	
	void display ()
	{
		System.out.println("\nEmployee id is:"+id+"\nEmployee name is: "+name+"\nSalary: "+salary);
	}
}//Employee class ends here

class TestEmployee
{
	public static void main (String [] args)
	{
		Employee e1;
		e1 = new Employee();
		
		e1.id = 2365;
		e1.name = "Atharv";
		e1.salary = 76523;
		
		e1.display();	
	}
} //TestEmployee class ends here
	