package p2;

import p1.Employee;

public class SalesManager extends Employee
{
	int incentive;
	int target;
	
	public SalesManager() 
	{
		super();
		this.incentive = 00;
		this.target = 00;
	}

	public SalesManager(int id, String name, double salary,int incentive, int target) 
	{
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
	}

	
	
	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public String toString()
	{
		return super.toString() +"\nincentive: "+this.incentive +
				"\ntarget: "+ this.target;
	}
	
	public double calSal()
	{
		return this.getSalary();
	}
}//class Sales Manager ends here
