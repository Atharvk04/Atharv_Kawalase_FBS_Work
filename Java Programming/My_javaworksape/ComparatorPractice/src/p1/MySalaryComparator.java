package p1;

import java.util.Comparator;

public class MySalaryComparator implements Comparator <Employee>
{

	@Override
	public int compare(Employee  o1, Employee o2) 
	{
		return (int) (o1.salary - o2.salary);
	}
	
}
