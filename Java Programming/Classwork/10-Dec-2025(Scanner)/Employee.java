import java.util.Scanner;

class Employee
{
    int id;
    String name;
    double salary;

    Employee()
    {
        this.id = 1;
        this.name = "Sakshi";
        this.salary = 45896;

        System.out.println("default constructor get call" + "\n");
    }

    Employee(int i, String str, double s)
    {
        this.id = i;
        this.name = str;
        this.salary = s;

        System.out.println("\nparameterized constructor get call");
    }

    void setId(int d) { this.id = d; }
    void setName(String d) { this.name = d; }
    void setSalary(double d) { this.salary = d; }

    int getId() { return this.id; }
    String getName() { return this.name; }
    double getSalary() { return this.salary; }
}

class TestEmployee
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Employee E1 = new Employee();
        E1.setId(2365);
        E1.setName("Atharv");
        E1.setSalary(76523);

        System.out.println("id: " + E1.getId());
        System.out.println("name: " + E1.getName());
        System.out.println("salary: " + E1.getSalary());

        Employee E2 = new Employee(2364, "Aditya", 75412);

        System.out.println("id: " + E2.getId());
        System.out.println("name: " + E2.getName());
        System.out.println("salary: " + E2.getSalary());

        Employee E3 = new Employee();
        System.out.println("\nEnter details for 3rd Employee:");

        System.out.print("Enter ID: ");
        E3.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Name: ");
        E3.setName(sc.nextLine());

        System.out.print("Enter Salary: ");
        E3.setSalary(sc.nextDouble());

        System.out.println("\nid: " + E3.getId());
        System.out.println("name: " + E3.getName());
        System.out.println("salary: " + E3.getSalary());

        sc.close();
    }
}
