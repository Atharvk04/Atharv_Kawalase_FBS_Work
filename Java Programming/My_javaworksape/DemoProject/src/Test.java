class Employee
{
	int id;
	String name;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		this.id=0;
		this.name="Not Given";
		this.salary=0;
	}

		
	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("Employee id: " + id + "Employee name: " + name + "Employee salary: "+ salary);
		
	}
	
	
}
class Test {
	public static void main(String[] args) {
		Employee e1; //reference
		
		e1 = new Employee(101,"Atharv",25630);
		e1.display();
	}
}
