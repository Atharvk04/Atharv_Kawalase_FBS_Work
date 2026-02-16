package p1;

import java.util.Scanner;

class TestQueue {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
        Queue q1 = new Queue(5);
        int choice, element;
        
        do 
        {
        	System.out.println("\n----QUEUE MENU-----\n");
        	System.out.println("1.Enqueue");
        	System.out.println("2.Dequeue");
        	System.out.println("3.Display");
        	System.out.println("4.Exit");
        	System.out.println("Enter Your Choice: ");
        	
        	choice = sc.nextInt();
        	
        	switch (choice)
        	{
        	case 1: 
        		System.out.println("Enter Element To Insert: ");
        		element = sc.nextInt();
        		q1.enqueue(element);
        		break;
        		
        		
        	case 2:
        		element = q1.dequeue();
        		if(element != -1)
        			System.out.println("Deleted Element: "+ element);
        		break;
        		
        	case 3: 
        		q1.display();
        		break;
        		
        	case 4:
        		System.out.println("Exiting!!!");
        		
        	case 5:
        		System.out.println("Invalid Choice...");
        		
        	}
        } while (choice != 4);
        
        sc.close();
    }
}
