package p1;

public class Employee {
	int eid;
	String name;
	int sal;
	public Employee(int eid, String name, int sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	
	public Employee()
	{
		
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + "]";
	}

	
	
}
