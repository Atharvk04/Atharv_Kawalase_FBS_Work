package p1;

public abstract class Employee
{
	int id;
	String name;
	double salary;
	
	
	public Employee()
	{
		this.id = 1;
		this.name = "Sakshi";
		this.salary = 45896;
	
		//System.out.println("default constructor get call"+"\n");

	}
	
	public Employee(int i, String str, double s)
	{
		this.id = i;
		this.name = str;
		this.salary = s;
	
		//System.out.println("\n"+"parameterized constructor get call");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString()
	{
		return "Id of the HR: " + this.id +"\nName of the HR: " + this.name
				+"\nSalary of the HR: " + this.salary;
	}
	
	public abstract double calSal();
}//Employee class ends here
