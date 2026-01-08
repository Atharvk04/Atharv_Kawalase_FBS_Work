package p2;

import p1.Employee;

public class Admin extends Employee
{
	int allowance;
	
	public Admin() 
	{
		super();
		this.allowance = 00;
	}

	public Admin(int id, String name, double salary, int allowance) 
	{
		super(id,name,salary);
		this.allowance = 00;
	}
	
	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	public String toString()
	{
		return super.toString() +"\nAllowance: " + this.allowance;
 	}
	public double calSal()
	{
		return this.getSalary();
	}
	
}//class Admin ends here
