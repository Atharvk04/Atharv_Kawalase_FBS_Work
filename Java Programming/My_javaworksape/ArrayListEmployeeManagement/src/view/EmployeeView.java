package view;
import java.util.ArrayList;
import java.util.Scanner;


import controller.EmployeeController;
import model.Admin;
import model.Employee;
import model.HR;
import model.SalesManager;

public class EmployeeView {

	
	public void showView() {
		
		EmployeeController ec=new EmployeeController();
		Scanner sc = new Scanner(System.in);
		int choice;
		char continueChoice;

		do {
			System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
			System.out.println("1. Add Employee");
			System.out.println("2. Display Employee");
			System.out.println("3. Search Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee");
			System.out.println("6. Sort Employee");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter id,name,salary type(1.Hr 2.Salesmanager 3.Admin)");
				int id=sc.nextInt();
				String name=sc.next();
				double salary=sc.nextDouble();
				int type=sc.nextInt();
				Employee emp=null;
				if(type==1)
				{
					System.out.println("Enter commission");
					double commission=sc.nextDouble();
					emp=new HR(id,name,salary,commission);
				}
				else if(type==2)
				{
					System.out.println("Enter incentive and target");
					double incentive=sc.nextDouble();
					int target=sc.nextInt();
					emp=new SalesManager(id,name,salary,incentive,target);
				
				}
				else if(type==3)
				{
					System.out.println("Enter allowance");
					double allowance=sc.nextDouble();
					emp=new Admin(id,name,salary,allowance);
			
				}
	//fronted fetch(add employee  json(employee)
				
				
				boolean res=ec.addEmployee(emp);
				if(res==true)
					System.out.println("Employee added sucessfully");
				else
					System.out.println("Array Full");
				break;

			case 2:
				
				ArrayList<Employee> list = ec.getAllEmployees();
				
				for(Employee e : list)
				{
					System.out.println(e);
				}
			case 3:
            	String sname;
                // searchEmployee();
            	
                System.out.println("1.To search by ID ");            
                System.out.println("2.To search by Name ");
                choice = sc.nextInt();
                
                if(choice==1)
                {
                	System.out.println("Enter ID : ");
                	int Id = sc.nextInt();
                	boolean found = ec.searchEmployeeById(Id);
                	if(found)
                		System.out.println("Employee Found ");
                	else 
                		System.out.println("Employee NOT Found !!");
                	break;
                }
                else if (choice == 2)
                {
                	System.out.println("Enter the Name of Employee : ");
                	sname = sc.next();
                	boolean foundname = ec.searchEmployeeByName(sname);
                	if(foundname)
                		System.out.println("Employee Found!!");
                	else
                		System.out.println("Not Found ");
                	
                	break;
                }

			case 4:

				break;
				
			case 5:

				break;
			case 6:

				break;

			case 7:
				System.out.println("Thank you! Exiting application.");
				return;

			default:
				System.out.println("Invalid choice! Please try again.");
			}

			System.out.print("\nDo you want to continue? (y/n): ");
			continueChoice = sc.next().charAt(0);

		} while (continueChoice == 'y' || continueChoice == 'Y');

		System.out.println("Application terminated.");
	}

}
