class Student
{
	int FRN;
	String name;
	double distance;
	
	Student()
	{
		this.FRN = 16;
		this.name = "Sakshi";
		this.distance = 22.36;
	
		System.out.println("default constructor get call"+"\n");
	}	
	
	Student(int roll, String name, double d)
	{
		this.FRN = roll;
		this.name = name;
		this.distance = d;
		
		System.out.println("\n"+"parameterized constructor get call");
	}	
	
	void setFRN(int s)
	{
		this.FRN = s;
	}
	
	void setName(String s)
	{
		this.name = s;
	}
	
	void setDistance(double s)
	{
		this.distance = s;
	}
	
	int getFRN()
	{
		return this.FRN;
	}
	
	String getName()
	{
		return this.name;
	}
	
	double getDistance()
	{
		return this.distance;
	}

} // Student class ends here

class TestStudent
{
	public static void main (String [] args)
	{
		Student S1;
		S1 = new Student();

		S1.setFRN (19);
		S1.setName ("Atharv");
		S1.setDistance (18.34);
	
		System.out.println("FRN: "+ S1.getFRN());
	
		System.out.println("Name: "+ S1.getName());
	
		System.out.println("Distance: "+ S1.getDistance());
	
		Student S2 = new Student(36,"Ashish",18.34);
	
	}
} //TestStudent class ends here