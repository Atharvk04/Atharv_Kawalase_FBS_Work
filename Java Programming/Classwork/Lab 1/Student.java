class Student
{
	int FRN;
	String name;
	double distance;
	
	void display ()
	{
		System.out.println("\nStudent FRN no is:"+FRN+"\nStudent name is: "+name+"\nDistance in Km: "+distance);
	}

} // Student class ends here

class TestStudent
{
	public static void main (String [] args)
	{
		Student S1;
		S1 = new Student();

		S1.FRN = 19;
		S1.name = "Atharv";
		S1.distance = 18.34;

		S1.display();
	
	}
} //TestStudent class ends here