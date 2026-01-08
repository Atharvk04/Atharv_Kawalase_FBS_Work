abstract class Employee
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

	
	public String toString()
	{
		return "Id of the HR: " + this.id +"\nName of the HR: " + this.name
				+"\nSalary of the HR: " + this.salary;
	}
	
	abstract double calSal();
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
	
	public String toString()
	{
		return super.toString() +"\nCommission: " + this.commission;
	}
	double calSal()
	{
		return salary + commission;
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
	
	public String toString()
	{
		return super.toString() +"\nincentive: "+this.incentive +
				"\ntarget: "+ this.target;
	}
	
	double calSal()
	{
		return salary+incentive;
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
	
	public String toString()
	{
		return super.toString() +"\nAllowance: " + this.allowance;
 	}
	double calSal()
	{
		return salary+allowance;
	}
	
}//class Admin ends here

class TestEmployee 
{
	public static void main (String [] args)
	{
		Employee e1;//reference
//		e1 = new Employee(101,"Atharv",50000);
		HR h1 = new HR (102,"Ashish",45000,0.15);
		SalesManager s1 = new SalesManager (104,"Anujay",75896,14865,18);
		Admin a1 = new Admin(103,"Rohit",56302,1200);
		
		System.out.println("           Employee Details           ");
//		System.out.println(e1.toString());
		System.out.println();
		
		System.out.println("           HR Details           ");
		System.out.println(h1.toString());
		System.out.println();
		
		System.out.println("           Sales Manager Details           ");
		System.out.println(s1.toString());
		System.out.println();
		
		System.out.println("           Admin Details           ");
		System.out.println(a1.toString());
		System.out.println();	
	}
}//TestEmployee class ends here

class TestDownCast
{
	public static void main(String[] args) {
		TestDownCast.getSalaryHike(new SalesManager(201,"Kartik",54785,4500,20));
		TestDownCast.getSalaryHike(new Admin(202,"Shambhavi",56000,4563));
		TestDownCast.getSalaryHike(new HR(203,"Mansi",45630,0.25));
	}

	static void getSalaryHike(Employee e1) 
	{
		System.out.println(e1.calSal());
		System.out.println(e1.getName());

		if(e1 instanceof SalesManager)
		{
			SalesManager s1 = (SalesManager) e1;
			s1.setIncentive(5000);
			System.out.println(s1.getIncentive());
		}
		
		if(e1 instanceof Admin)
		{
			Admin a1 = (Admin) e1;
			a1.setAllowance(6523);
			System.out.println(a1.getAllowance());
		}
		
		if(e1 instanceof HR)
		{
			HR h1 = (HR) e1;
			h1.setCommission(0.24);
			System.out.println(h1.getCommission());
		}
	}
}

	
class MyTest 
{
	public static void main(String[] args) 
	{
		Employee e2;
		
//		e2 = new Employee(1001,"Anujay",56984);
//		e2.calSal();
//		System.out.println("Calculated Salary of Employee: "+e2.calSal());
		
		e2 = new SalesManager(1002,"Mihir",54896,15694,45);
		e2.calSal();
		System.out.println("Calculated Salary of Sales Manager: "+e2.calSal());
		
		e2 = new HR(1003,"Sanika",45698,0.36);
		e2.calSal();
		System.out.println("Calculated Salary of HR: "+e2.calSal());
		
		e2 = new Admin(1004,"Abhijeet",45789,4587);
		e2.calSal();
		System.out.println("Calculated Salary of Admin: "+e2.calSal());
		
	}
}
