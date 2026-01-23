package model;

public class SalesManager extends Employee{
	
	double incentive;
	int target;
	
	public SalesManager(int id, String name, double salary, double incentive, int target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}
	
	

}
