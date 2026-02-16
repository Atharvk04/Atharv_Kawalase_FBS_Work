package datastructures;

public class Stack 
{
	Node top;
	
	Stack()
	{
		top = null;
	}
	
	void isEmpty()
	{
		if(top == null)
		{
			System.out.println("Empty Stack!!!");
			return;
		}
	}
	
	void push(int ele)
	{	
		Node x = new Node(ele);
		
		if(top == null)
		{
			top = x;
			return;
		}
		
		x.next = top;
		top = x;
		
	}
	
	void pop()
	{
		if(top == null)
		{
			System.out.println("Empty Stack!!!");
			return;
		}
		System.out.println(top.data);
		top = top.next;
	}
	
	void peek()
	{
		if(top == null)
		{
			System.out.println("Empty Stack!!");
			return;
		}
		
		System.out.println("Top Element: "+ top.data);
	}
	
	void display() {
	    if (top == null) {
	        System.out.println("Empty Stack!!!");
	        return;
	    }

	    System.out.print("Stack elements (Top → Bottom): ");
	    Node temp = top;
	    while (temp != null) {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    }
	    System.out.println();
	}

}
