abstract class Person
{
	String name;
	int age;
	String address;
	
	Person()
	{
		this.name = "Not give";
		this.age = 0;
		this.address = "Not Given";
	}

	Person(String name, int age, String address) 
	{
		//super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	abstract double calIncome();
}//class Person ends here

class Student1 extends Person
{
	int frn;
	String batch;
	
	Student1() 
	{
		super();
		this.frn = 0;
		this.batch = "Not Given";
	}

	Student1(String name, int age, String address,int frn, String batch) 
	{
		super(name,age,address);
		this.frn = frn;
		this.batch = batch;
	}

	int getFrn() {
		return frn;
	}

	void setFrn(int frn) {
		this.frn = frn;
	}

	String getBatch() {
		return batch;
	}

	void setBatch(String batch) {
		this.batch = batch;
	}
	
	public String toString() {
		return super.toString() + "Student1 [frn=" + frn + ", batch=" + batch + "]";
	}

	double calIncome()
	{
		return 0;
	}
}//class Student ends here

class Teacher extends Person
{
	 String designation;
	 
	 Teacher() 
	 {
		super();
		this.designation = "Not Given";
	 }

	 Teacher(String name, int age, String address,String designation) 
	 {
		super(name,age,address);
		this.designation = designation;
	 }

	 String getDesignation() {
		 return designation;
	 }

	 void setDesignation(String designation) {
		 this.designation = designation;
	 }
	

	public String toString() {
		return super.toString() + "Teacher [designation=" + designation + "]";
	}

	 double calIncome()
	{
		return 45000;
	}
}//class Teacher ends here

class Doctor extends Person
{
	double consultationFees;
	
	Doctor()
	{
		super();
		this.consultationFees = 0;
	}

	Doctor(String name, int age, String address,double consultationFees) 
	{
		super(name,age,address);
		this.consultationFees = consultationFees;
	}

	double getConsultationFees() {
		return consultationFees;
	}

	void setConsultationFees(double consultationFees) {
		this.consultationFees = consultationFees;
	}
	

	public String toString() {
		return super.toString() + "Doctor [consultationFees=" + consultationFees + "]";
	}

	double calIncome()
	{
		return consultationFees * 20;
	}
}
class TestPerson {

	public static void main(String[] args) 
	{
		Person p1; 
		
		//p1 = new Person("Atharv",22,"Pune");
		
		Student1 s1 = new Student1("Rohit",22,"Pune",5,"Java Offline");
		
		Teacher t1 = new Teacher("Sakshi",22,"Latur","Professor");
		
		Doctor d1 = new Doctor("Shambhavi",31,"Mumbai",300);
		
		System.out.println("Person details: ");
		System.out.println();
		//System.out.println(p1.toString());
		System.out.println();
		
		System.out.println("Student details: ");
		System.out.println();
		System.out.println(s1.toString());
		System.out.println();
		
		System.out.println("Teacher details: ");
		System.out.println();
		System.out.println(t1.toString());
		System.out.println();
		
		System.out.println("Doctor details: ");
		System.out.println();
		System.out.println(d1.toString());
		System.out.println();

	}

}

class MyPersonTest
{
	public static void main(String[] args) 
	{
		
		Person p1;
//		p1 = new Person("Anujay",23,"Barshi");
//		p1.calIncome();
//		System.out.println("Calculated Income: "+p1.calIncome());
		
		p1 = new Student1("Aditya",22,"Satara",6,"Python");
		p1.calIncome();
		System.out.println("Calculated Income: "+p1.calIncome());
		
		p1 = new Teacher("Aryan",29,"Mumbai","Assistant");
		p1.calIncome();
		System.out.println("Calculated Income: "+p1.calIncome());
		
		p1 = new Doctor("Jigisha",36,"Nanded",250);
		p1.calIncome();
		System.out.println("Calculated Income: "+p1.calIncome());
		
		
	}
	
	
}
