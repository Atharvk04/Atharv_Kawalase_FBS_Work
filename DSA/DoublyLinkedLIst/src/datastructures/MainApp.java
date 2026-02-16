package datastructures;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

        int choice;

        do
        {
            System.out.println("\n---- DOUBLY LINKED LIST MENU ----");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete By element");
            System.out.println("5. Delete By Position");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice)
            {
                case 1:
                    System.out.print("Enter element: ");
                    String ele1 = sc.nextLine();
                    dll.insertAtBeginning(ele1);
                    break;

                case 2:
                    System.out.print("Enter element: ");
                    String ele2 = sc.nextLine();
                    dll.insertAtEnd(ele2);
                    break;

                case 3:
                    System.out.print("Enter element: ");
                    String ele3 = sc.nextLine();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    dll.insertAtPos(ele3, pos);
                    break;

                case 4:
                    System.out.println("Enter element: ");
                    String ele4 = sc.nextLine();
                    dll.deleteByEle(ele4);
                    break;
                    
                case 5:
                	System.out.println("Enter Position: ");
                	int pos1 = sc.nextInt();
                	dll.deleteByPos( pos1);
                	break;
                    
                case 6:
                	dll.display();
                	break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        while (choice != 7);

        sc.close();
    }
}
