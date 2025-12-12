import java.util.Scanner;

class SalesManager
{
    int id, target;
    String name;
    double salary, incentive;

    SalesManager()
    {
        this.id = 2;
        this.name = "Ashish";
        this.salary = 45698;
        this.incentive = 0.15;
        this.target = 16;

        System.out.println("default constructor get call" + "\n");
    }

    SalesManager(int i, int t, String n, double s, double inc)
    {
        this.id = i;
        this.target = t;
        this.name = n;
        this.salary = s;
        this.incentive = inc;

        System.out.println("\n" + "parameterized constructor get call");
    }

    void setId(int i) { this.id = i; }
    void setTarget(int t) { this.target = t; }
    void setName(String n) { this.name = n; }
    void setSalary(double s) { this.salary = s; }
    void setIncentive(double inc) { this.incentive = inc; }

    int getId() { return this.id; }
    int getTarget() { return this.target; }
    String getName() { return this.name; }
    double getSalary() { return this.salary; }
    double getIncentive() { return this.incentive; }
}

class TestSalesManager
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // First object using default constructor + setters
        SalesManager S1 = new SalesManager();
        S1.setId(8956);
        S1.setName("Rohit");
        S1.setSalary(75698);
        S1.setIncentive(0.17);
        S1.setTarget(17);

        System.out.println("ID: " + S1.getId());
        System.out.println("Name: " + S1.getName());
        System.out.println("Salary: " + S1.getSalary());
        System.out.println("Incentive: " + S1.getIncentive());
        System.out.println("Target: " + S1.getTarget());

        // Second object using parameterized constructor

        SalesManager S2 = new SalesManager(8569, 12, "Anujay", 45698, 0.18);
        System.out.println("ID: " + S2.getId());
        System.out.println("Name: " + S2.getName());
        System.out.println("Salary: " + S2.getSalary());
        System.out.println("Incentive: " + S2.getIncentive());
        System.out.println("Target: " + S2.getTarget());

        // Third object using Scanner input

        SalesManager S3 = new SalesManager();
        System.out.println("\nEnter details for 3rd SalesManager:");

        System.out.print("Enter ID: ");
        S3.setId(sc.nextInt());
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        S3.setName(sc.nextLine());

        System.out.print("Enter Salary: ");
        S3.setSalary(sc.nextDouble());

        System.out.print("Enter Incentive: ");
        S3.setIncentive(sc.nextDouble());

        System.out.print("Enter Target: ");
        S3.setTarget(sc.nextInt());

        System.out.println("\nID: " + S3.getId());
        System.out.println("Name: " + S3.getName());
        System.out.println("Salary: " + S3.getSalary());
        System.out.println("Incentive: " + S3.getIncentive());
        System.out.println("Target: " + S3.getTarget());

        sc.close();
    }
}
