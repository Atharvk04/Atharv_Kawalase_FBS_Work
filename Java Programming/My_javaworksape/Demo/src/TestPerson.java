class Person
{
	String name;
	int age;
	String gender;
	
	public Person() 
	{
		this.name="Not Given";
		this.age=0;
		this.gender = "Not Given";
	}

	Person(String name, int age, String gender) 
	{
		//super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}
	
	void display()
	{
		System.out.println("Name: " +this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Gender: "+this.gender);
	}
	
}//class Person ends here

class Employee extends Person
{
	double salary;
	String cName;
	
	public Employee() 
	{
		super();
		this.salary=0;
		this.cName="Not Given";
	}

	Employee(String name, int age, String gender, double salary, String cName) 
	{
		super(name,age,gender);
		this.salary = salary;
		this.cName = cName;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	String getcName() {
		return cName;
	}

	void setcName(String cName) {
		this.cName = cName;
	}
	
	void display()
	{
		super.display();
		System.out.println("Salary: "+this.salary);
		System.out.println("Comapny Name: "+this.cName);
	}
	
}//Class Employee ends here

class SalesManager extends Employee
{
	int target;
	double incentive;
	
	public SalesManager()
	{
		super();
		this.target = 0;
		this.incentive = 0;
	}

	SalesManager(String name,int age, String gender, double salary,String cName,int target, double incentive) 
	{
		super(name,age,gender,salary,cName);
		this.target = target;
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	void display()
	{
		super.display();
		System.out.println("Target: "+this.target);
		System.out.println("Incentive: "+this.incentive);
	}
	
}
class TestPerson {

	public static void main(String[] args) 
	{
		Person p1 = new Person("Rohit",22,"Male");
		
		Employee e1 = new Employee("Atharv",22,"Male",45000,"Accenture");
		
		SalesManager s1 = new SalesManager("Sakshi",22,"Female",56000,"Capgemini",15,0.16);
		System.out.println();
		p1.display();
		
		System.out.println();
		e1.display();
		
		System.out.println();
		s1.display();

	}

}
