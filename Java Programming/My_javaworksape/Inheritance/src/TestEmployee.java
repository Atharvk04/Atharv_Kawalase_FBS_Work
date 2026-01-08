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
	
		//System.out.println("default constructor get call"+"\n");

	}
	
	Employee(int i, String str, double s)
	{
		this.id = i;
		this.name = str;
		this.salary = s;
	
		//System.out.println("\n"+"parameterized constructor get call");
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
	
	void display()
	{
		System.out.println("Id of the HR: " + this.id);
		System.out.println("Name of the HR: " + this.name);
		System.out.println("Salary of the HR: " + this.salary);
	}
}//Employee class ends here

class HR extends Employee
{
	double commission;
	
	HR() 
	{
		super();
		this.commission = 00;
	}

	HR(int id, String name, double salary, double commission) 
	{
		super(id,name,salary);
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display()
	{
		super.display();
		System.out.println("Commission of the HR: " + this.commission);
		
	}
	
}//Class HR ends here

class SalesManager extends Employee
{
	int incentive;
	int target;
	
	SalesManager() 
	{
		super();
		this.incentive = 00;
		this.target = 00;
	}

	SalesManager(int id, String name, double salary,int incentive, int target) 
	{
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
	}

	int getIncentive() {
		return incentive;
	}

	void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}
	
	void display()
	{
		super.display();
		System.out.println("Incentive of the Sales Manager: " + this.incentive);
		System.out.println("Target of the Sales Manager: " + this.target);
		
	}
}//class Sales Manager ends here


class Admin extends Employee
{
	int allowance;
	
	Admin() 
	{
		super();
		this.allowance = 00;
	}

	Admin(int id, String name, double salary, int allowance) 
	{
		super(id,name,salary);
		this.allowance = 00;
	}

	int getAllowance() {
		return allowance;
	}

	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	
	void display()
	{
		super.display();
		System.out.println("Allowance of the Admin: " + this.allowance);
		
	}
	
}//class Admin ends here

class TestEmployee 
{
	public static void main (String [] args)
	{
		Employee e1 = new Employee(101,"Atharv",50000);
		HR h1 = new HR (102,"Ashish",45000,0.15);
		SalesManager s1 = new SalesManager (104,"Anujay",75896,14865,18);
		Admin a1 = new Admin(103,"Rohit",56302,1200);
		
		System.out.println("Employee Details: ");
		System.out.println();
		e1.display();
		System.out.println();
		
		System.out.println("HR Details: ");
		System.out.println();
		h1.display();
		System.out.println();
		
		System.out.println("Sales Manager Details: ");
		System.out.println();
		s1.display();
		System.out.println();
		
		System.out.println("Admin Details: ");
		System.out.println();
		a1.display();
		System.out.println();
	}
} //TestEmployee class ends here
	
