package controller;

import java.util.ArrayList;

import model.Employee;
import model.EmployeeDao;

public class EmployeeController {
	
	
	EmployeeDao ed=new EmployeeDao();
	
	public ArrayList<Employee> getAllEmployees()
	{
		return ed.getAllEmployees();
	}
	
	public boolean addEmployee(Employee emp)
	{
		return ed.addEmployee(emp);
		
	}

	public boolean searchEmployeeById(int id) {
		
		if(ed.searchEmployeeById(id))
			return true;
		
		else
			return false;
		
	}

	public boolean searchEmployeeByName(String sname) 
	{
		if(ed.searchEmployeeByName(sname))
			return true;
		
		else
			return false;
	}

//	public boolean deleteEmployeeById(int id) {
//		
//		return ed.deleteEmployeeById(id);
//
//	}
}
