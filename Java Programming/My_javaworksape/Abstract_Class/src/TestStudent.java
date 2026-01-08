abstract class Student{
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
	
	
	public String toString() {
		return "Student [frn=" + frn + ", sName=" + sName + ", distance=" + distance + "]";
	}

	abstract void totalDistance();
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
	

	public String toString() 
	{
		return super.toString() + "PlacedStudent [companyName=" + companyName + ", designation=" + designation + "]";
	}

	void totalDistance()
	{
		if(distance > 500)
			System.out.println("Give Allowance");
		
		else
			System.out.println("No Allowance");
	}
	
}
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1; 
		//s1=new Student(10,"Sachin",500);
		Student s2; 
		//s2=new Student(7,"Dhoni",450);
		
		PlacedStudent ps1=new PlacedStudent(12,"Yuvi",700,"BCCI","Batsman");
		PlacedStudent ps2=new PlacedStudent(25,"Rahul",950,"BCCI","WK");
		System.out.println("Student Count: "+Student.getCount());
		
//		s1.toString();
//		s2.toString();
		ps1.toString();
		ps2.toString();
		System.out.println("Placed Student name is: "+ ps1.getsName());
	}

}

class MyStudentTest
{
	public static void main(String[] args) 
	{
		Student s1;
		
//		s1 = new Student(15,"Aaditi",294);
//		s1.totalDistance();
		
		s1 = new PlacedStudent(16,"Sakshi",586,"Accenture","SET");
		s1.totalDistance();
	}
}







