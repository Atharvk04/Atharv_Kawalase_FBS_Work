class Student{
	int frn;
	String sName;
	double distance;
	static int count;
	static {
		count=0;
	}
	
	Student() {
		this.frn = 0;
		this.sName = "Not Given";
		this.distance = 0;
		count++;
	}

	Student(int frn, String sName, double distance) {
		this.frn = frn;
		this.sName = sName;
		this.distance = distance;
		count++;
	}

	int getFrn() {
		return frn;
	}

	void setFrn(int frn) {
		this.frn = frn;
	}

	String getsName() {
		return sName;
	}

	void setsName(String sName) {
		this.sName = sName;
	}

	double getDistance() {
		return distance;
	}

	void setDistance(double distance) {
		this.distance = distance;
	}

	static int getCount() {
		return count;
	}

	void display() {
		System.out.println("FRN: "+this.frn);
		System.out.println("Name: "+this.sName);
		System.out.println("Distance: "+this.distance);
	}
}//class Student ends here


class PlacedStudent extends Student
	{
		String companyName;
		String designation;
	
		public PlacedStudent() {
		// TODO Auto-generated constructor stub
			super();
			this.companyName = "Xyz";
			this.designation = "abc";
	}

	PlacedStudent(int frn, String sName, double distance, String companyName, String designation) 
	{
		super(frn,sName,distance);//parameter initialization list.
		this.companyName = companyName;
		this.designation = designation;
	}

	
	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}
	
	void display() 
	{
		super.display();
		System.out.println("Company Name: "+this.companyName);
		System.out.println("Designation: "+this.designation);
	}
	
}
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(10,"Sachin",500);
		Student s2=new Student(7,"Dhoni",450);
		
		PlacedStudent ps1=new PlacedStudent(12,"Yuvi",700,"BCCI","Batsman");
		PlacedStudent ps2=new PlacedStudent(25,"Rahul",950,"BCCI","WK");
		System.out.println("Student Count: "+Student.getCount());
		
		//s1.display();
		
		System.out.println("Placed Student name is: "+ ps1.getsName());
	}

}





