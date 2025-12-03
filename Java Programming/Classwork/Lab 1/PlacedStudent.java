class PlacedStudent
{
	int FRN;
	String name;
	double distance;
	String companyName;
	String designation;
	
	void display ()
	{
		System.out.println("\nStudent FRN no is:"+FRN+"\nName is: "+name+"\nDistance in Km: "+distance + "\ncompanyName: "+companyName+"\ndesignation is: "+designation);
	}

} // Student class ends here

class TestPlacedStudent
{
	public static void main (String [] args)
	{
		PlacedStudent P1;
		P1 = new PlacedStudent();

		P1.FRN = 19;
		P1.name = "Atharv";
		P1.distance = 18.34;
		P1.companyName = "Capgemini";
		P1.designation = "Application Developer";

		P1.display();
	
	}
} //TestPlacedStudent class ends here