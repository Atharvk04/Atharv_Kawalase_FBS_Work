package p3;

public class Employee implements Comparable <Employee>
{
	int id;
	String name;
	double salary;
	
	public Employee() 
	{
		
	}
	
	

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	@Override
	public String toString() {
		return "\n [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public int compareTo(Employee e) 
	{
		System.out.println("Inside CompareTo!!");
		return this.id - e.id; //compare by id
		
//		return this.name.compareTo(e.name); //compare by name
		
//		return (int) (this.salary - e.salary); //compare by salary
	}
	
	@Override
	public int hashCode() 
	{
		System.out.println("Inside HashCode!!");
		return this.id;
	}
	
}
