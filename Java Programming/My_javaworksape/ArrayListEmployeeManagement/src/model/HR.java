package model;

public class HR extends Employee {

	double commission;

	public HR(int id, String name, double salary, double commission) {
		super(id, name, salary);
		this.commission = commission;
	}
	

}
