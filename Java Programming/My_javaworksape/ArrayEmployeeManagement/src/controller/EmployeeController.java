package controller;

import model.Employee;
import model.EmployeeDao;

public class EmployeeController {
	
	
	EmployeeDao ed=new EmployeeDao();
	
	public Employee[] getAllEmployees()
	{
		return ed.getAllEmployees();
	}
	
	public boolean addEmployee(Employee emp)
	{
		return ed.addEmployee(emp);
		
	}

	public Employee searchEmployeeById(int id) {
		
		return ed.getEmployeeById(id);
		
	}

	public boolean deleteEmployeeById(int id) {
		
		return ed.deleteEmployeeById(id);

	}

}
