package model;

public class EmployeeDao {

	static int size=10;
	static Employee employees[]=new Employee[size];
	static int currindex=0;
	
	static{
		employees[currindex++]=new Employee(101, "Atharva", 50000);
		employees[currindex++]=new Employee(102, "Akshay", 45000);
		employees[currindex++]=new Employee(103, "Nikita", 23000);
		employees[currindex++]=new Employee(104, "Rohit", 43000);
		employees[currindex++]=new Employee(105, "Priya", 60000);
	}
	
	

	
	public static int getCurrindex() {
		return currindex;
	}




	public static void setCurrindex(int currindex) {
		EmployeeDao.currindex = currindex;
	}




	public Employee[] getAllEmployees()
	{
		return employees;
	}


	

	public boolean addEmployee(Employee emp) {
		
		if(currindex<size)
		{
			employees[currindex++]=emp;
			return true;
		}
		else
			return false;
			
		
	}




	public Employee getEmployeeById(int id) {
		
		for(int i=0;i<currindex;i++)
		{
			if(employees[i].getId()==id)
				return employees[i];
		}
		return null;
		
	}
	
	public boolean deleteEmployeeById(int id)
	{
		for(int i=0;i<currindex;i++)
		{
			if(employees[i].getId()==id)
			{
				
				for(int j=i;j<currindex-1;j++)
					employees[j]=employees[j+1];
				
				currindex--;
				return true;
			}
		}
		return false;
	}
	
}
