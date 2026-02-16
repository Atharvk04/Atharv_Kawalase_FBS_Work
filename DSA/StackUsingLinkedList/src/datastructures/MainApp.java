package datastructures;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
        	System.out.println("============ Menu ===========");
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int ele = sc.nextInt();
                    s.push(ele);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;
                    
                case 4:
                	s.display();
                	break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
    }
}
