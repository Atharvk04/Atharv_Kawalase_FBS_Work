class PlacedStudent
{
	int FRN;
	String name;
	double distance;
	String companyName;
	String designation;
	
	PlacedStudent()
	{
		this.FRN = 5;
		this.name = "Rohit";
		this.distance = 18.34;
		this.companyName ="Accenture";
		this.designation ="Application Developer";
	
		System.out.println("default constructor get call"+"\n");
	}
	
	PlacedStudent(int roll, String str, double d, String cName, String desi)
	{
		this.FRN = roll;
		this.name = str;
		this.distance = d;
		this.companyName = cName;
		this.designation = desi;
	
		System.out.println("\n"+"parameterized constructor get call");
	}
	
	void setFRN(int p)
	{
		this.FRN = p;
	}
	
	void setName(String p)
	{
		this.name = p;
	}
	
	void setDistance(double p)
	{
		this.distance = p;
	}
	
	void setCompanyName(String p)
	{
		this.companyName = p;
	}
	
	void setDesignation(String p)
	{
		this.designation = p;
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
	
	String getCompanyName()
	{
		return this.companyName;
	}
	
	String getDesignation()
	{
		return this.designation;
	}

} // Student class ends here

class TestPlacedStudent
{
	public static void main (String [] args)
	{
		PlacedStudent P1;
		P1 = new PlacedStudent();

		P1.setFRN (19);
		P1.setName ("Atharv");
		P1.setDistance (18.34);
		P1.setCompanyName ("Capgemini");
		P1.setDesignation ("Application Developer");

		System.out.println("FRN: "+P1.getFRN());
		System.out.println("Name: "+P1.getName());
		System.out.println("Distance: "+P1.getDistance());
		System.out.println("Company: "+P1.getCompanyName());
		System.out.println("Designation: "+P1.getDesignation());
	
		PlacedStudent P2 = new PlacedStudent(5,"Rohit",18.36,"TCS","Web Developer");
	}
} //TestPlacedStudent class ends here