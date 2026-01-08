package p2;

import p1.Employee;

public class HR extends Employee
{
	double commission;
	
	public HR() 
	{
		super();
		this.commission = 00;
	}

	public HR(int id, String name, double salary, double commission) 
	{
		super(id,name,salary);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public String toString()
	{
		return super.toString() +"\nCommission: " + this.commission;
	}
	public double calSal()
	{
		return this.getSalary();
	}
	
}//Class HR ends here
