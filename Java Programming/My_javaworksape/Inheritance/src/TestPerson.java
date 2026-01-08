class Person
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
	
	void display()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Address: "+this.address);
	}
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
	
	void display()
	{
		super.display();
		System.out.println("FRN: "+this.frn);
		System.out.println("Batch: "+this.batch);
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
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Designation: "+this.designation);
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
	
	void display()
	{
		super.display();
		System.out.println("Fees: "+this.consultationFees);
	}
}
class TestPerson {

	public static void main(String[] args) 
	{
		Person p1 = new Person("Atharv",22,"Pune");
		
		Student1 s1 = new Student1("Rohit",22,"Pune",5,"Java Offline");
		
		Teacher t1 = new Teacher("Sakshi",22,"Latur","Professor");
		
		Doctor d1 = new Doctor("Shambhavi",31,"Mumbai",300);
		
		System.out.println("Person details: ");
		System.out.println();
		p1.display();
		System.out.println();
		
		System.out.println("Student details: ");
		System.out.println();
		s1.display();
		System.out.println();
		
		System.out.println("Teacher details: ");
		System.out.println();
		t1.display();
		System.out.println();
		
		System.out.println("Doctor details: ");
		System.out.println();
		d1.display();
		System.out.println();

	}

}
