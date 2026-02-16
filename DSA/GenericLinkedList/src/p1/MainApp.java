package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		MyLinkedList<Book> myLL = new MyLinkedList<>();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\t1.Insert At Beg");
			System.out.println("\t2.Insert At End");
			System.out.println("\t3.Insert At Between");
			System.out.println("\t4.Display All");
			System.out.println("\t5.Delete Element.");
			System.out.println("\t6.Reverse");
			System.out.println("\t7.EXIT");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) 
			{
				case 1:
				{
					int ele;
					System.out.println("Enter number : ");
					ele = sc.nextInt();
//					myLL.insertAtBeginning(ele);
					break;
				}
				case 2:
				{
					int ele;
					System.out.println("Enter number : ");
					ele = sc.nextInt();
//					myLL.insertAtEnd(ele);
					break;
				}
				case 3:
				{
//					int ele;
					System.out.println("Enter bid: ");
					int bid = sc.nextInt();
					System.out.println();
					int position; 
					System.out.println("Enter position: ");
					position = sc.nextInt();
					
//					Employee ele = new Employee(eid,"ABC",5000);
					Book ele = new Book(bid,"ABC",5000);
					myLL.insertInTheMiddle(ele,position);
					break;
				}
				case 4:
				{
					myLL.display();
					break;
				}
				case 5:
				{
					break;
				}
				
				case 6:
				{
					myLL.displayRev();
					break;
				}
				
				case 7:
				{
					System.out.println("Exiting...");
				}
				default:
				{
					System.out.println("--- Invalid Choice! ---");
				}
			}
		}while(choice!=8);
	}

}
