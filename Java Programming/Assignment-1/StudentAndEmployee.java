class Student
{
	int rollno;
	String name;
	double percentage;
	
	Student(int roll, String name, double perc)
	{
		this.rollno = roll;
		this.name = name;
		this.percentage = perc;
	}
}
	
class Employee
{
	int id;
	String name;
	double annualSalary;
	
	Employee(int eId, String name, double salary)
	{
		this.id = eId;
		this.name = name;
		this.annualSalary = salary;
	}
}
	
class TestBank
{
	String loanApproval(Student s)
	{
		if(s.percentage > 80)
		{
			return "Loan approved: 2 lakh";
		}

		else if(s.percentage >= 60)
		{		
			return "Loan approved: 1 lakh";
		}

		else if(s.percentage >= 40)
		{
			return "Loan approved: 50k";
		}

		else
		{
			return "Loan not approved.";
		}
	}
	
	String loanApproval(Employee e)
	{
		if(e.annualSalary > 12)
		{
			return "Loan approved: 7 lakh";
		}

		if(e.annualSalary >= 10)
		{
			return "Loan approved: 6 lakh";
		}
		
		if(e.annualSalary >= 6)
		{
			return "Loan approved: 5 lakh";
		}
		
		if(e.annualSalary >= 4)
		{
			return "Loan approved: 4 lakh";
		}
		
		else
		{
			return "Loan not approved.";
		}
	}
	
	public static void main(String [] args)
	{
		Student S1 = new Student(5,"Rohit",87);
		Student S2 = new Student(19,"Atharv",79);
	
		Employee E1 = new Employee(125,"Ashish",11);
		Employee E2 = new Employee(128,"Yuvraj",6);
	
		Bank bank = new Bank();
		
		System.out.println(bank.loanApproval(S1));
		System.out.println(bank.loanApproval(S2));
	
		System.out.println(bank.loanApproval(E1));
		System.out.println(bank.loanApproval(E2));
	}	

}