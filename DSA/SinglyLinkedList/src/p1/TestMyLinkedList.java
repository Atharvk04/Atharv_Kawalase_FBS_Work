package p1;

import java.util.Scanner;

public class TestMyLinkedList 
{
	public static void main(String[] args) 
	{
		MyLinkedList l1 = new MyLinkedList();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do
		{
			System.out.println("--------LinkedList Menu Driven Code--------");
			System.out.println();
			System.out.println("1. To insert at the Beginning");
			System.out.println("2. To insert at the End");
			System.out.println("3. To insert at the Position");
			System.out.println("4. Display");
			System.out.println("5. Delete at the Position");
			System.out.println("6. Reverse the LinkedList");
			System.out.println("7. Search Element ");
			System.out.println("8. Insert After Particular Element ");
			System.out.println("9. Exit");
			System.out.println();
			System.out.print("ENTER YOUR CHOICE : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					
					int element;
					System.out.println("Enter the element : ");
					element = sc.nextInt();
					l1.insertAtBeginning(element);
					break;
				}
				case 2:
				{
					int element;
					System.out.print("Enter the element : ");
					element = sc.nextInt();
					l1.insertAtEnd(element);
					break;
				}
				
				case 3:
				{
					int element;
					System.out.print("Enter the element : ");
					element = sc.nextInt();
					System.out.println();
					int position;
					System.out.print("Enter the position : ");
					position = sc.nextInt();
					
					l1.insertInTheMiddle(element, position);
					break;
					
				}
				case 4:
				{
					l1.display();
					System.out.println();
					break;
					
				}
				case 5:
				{
					 int position;
					    System.out.print("Enter the position : ");
					    position = sc.nextInt();
					    l1.deleteAtPosition(position);
					    l1.display();
					    break;
				}
				case 6:
				{

				    l1.reverse();
				    System.out.println("LinkedList Reversed Successfully!");
				    l1.display();
				   
				    break;
				}
				case 7:
				{
					int element;
					System.out.print("Enter the element you want to search : ");
					element = sc.nextInt();
					if(l1.searchElement(element))
						System.out.println("Element Found");
					else
						System.out.println("Element NOT Found !!");
					break;
				} 
				
				case 8:
				{
					int target,element;
					
					System.out.print("Enter target element: ");
                    target = sc.nextInt();
                    System.out.print("Enter new element: ");
                    element = sc.nextInt();
                    l1.insertAfterEle(target, element);
                    break;
                   
				}
				case 9:
				{
					System.out.println("Exiting .........");
					break;
					
				}
				
				default :
				{
					System.out.println("Invalid choice !!");
				}
			}
			
			
		}while(choice != 9);
	}
}
