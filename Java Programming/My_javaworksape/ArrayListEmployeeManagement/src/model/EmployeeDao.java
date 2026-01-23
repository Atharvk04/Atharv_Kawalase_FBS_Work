package model;
import java.util.ArrayList;

public class EmployeeDao 
{
    // Generic ArrayList
    static ArrayList<Employee> employees = new ArrayList<>();

    // Static block for initial data
    static
    {
        employees.add(new Employee(101, "Rohit", 85000));
        employees.add(new Employee(102, "Atharv", 75000));
        employees.add(new Employee(103, "Ashish", 65000));
        employees.add(new Employee(104, "Sahil", 55000));
    }
	
	

	public ArrayList<Employee> getAllEmployees()
    {
        return employees;
    }

	public boolean addEmployee(Employee emp)
    {
        employees.add(emp);
        return true;
    }


	 public boolean searchEmployeeById(int id)
	 {
	        for (Employee emp : employees)
	        {
	            if (emp.getId() == id)
	                return true;
	        }
	        return false;
	 }
	 
	

	public boolean searchEmployeeByName(String sname) 
	{
		for(Employee emp : employees)
		{
			if(emp.getName().toLowerCase().contains(sname.toLowerCase()))
				return true;
		}
		return false;
	}
	 
//	 
//	 public boolean deleteEmployeeById(int id)
//	 {
//	     for (Employee emp : employees)
//	     {
//	         if (emp.getId() == id)
//	         {
//	             employees.remove(emp);
//	             return true;
//	         }
//	     }
//	     return false;
//	 }

}