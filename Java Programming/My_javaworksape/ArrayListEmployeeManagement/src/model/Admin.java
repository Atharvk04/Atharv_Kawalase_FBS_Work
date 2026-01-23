package model;

public class Admin extends Employee {

	double allowance;

	public Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}
	
}
