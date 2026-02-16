package p1;

import java.util.*;

public class TextEditorMenu {

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        String[] text = new String[10];
        int top = -1;
        int choice = 0;

        while (choice != 4) 
        {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Write a line");
            System.out.println("2. Undo last line");
            System.out.println("3. Display all current text");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {

                case 1:
                    if (top < text.length - 1) 
                    {
                        System.out.print("Enter a line: ");
                        top++;
                        text[top] = sc.nextLine();
                    } 
                    else 
                    {
                        System.out.println("Text limit reached.");
                    }
                    break;

                case 2:
                    if (top >= 0) 
                    {
                        System.out.println("Undone line: " + text[top]);
                        top--;
                    } 
                    else 
                    {
                        System.out.println("No line to undo.");
                    }
                    break;

                case 3:
                    if (top >= 0) 
                    {
                        System.out.println("\nCurrent Text:");
                        for (int i = 0; i <= top; i++) 
                        {
                            System.out.println(text[i]);
                        }
                    } 
                    else 
                    {
                        System.out.println("No text to display.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
