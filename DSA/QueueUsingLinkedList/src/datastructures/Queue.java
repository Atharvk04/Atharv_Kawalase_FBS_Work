package datastructures;

public class Queue 
{
	Node rear;
	Node front;
	
	Queue()
	{
		rear = null;
		front = null;
	}
	
	boolean isEmpty()
	{
	    if (rear == null)
	    {
	        return true;
	    }
	    return false;
	}

	
	void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Empty Queue...");
		
			return;
		}
		System.out.println(front.data);
		front = front.next;
		
		if(front == null)
		{
			rear = null;
		}
	}
	
	void enqueue(int ele)
	{
		Node x = new Node (ele);
		
		if(isEmpty())
		{
			rear = x;
			front = x;
			return;
		}
		rear.next = x;
		rear = x;
	}
	
	void display()
	{
		if (front == null)
		{
			System.out.println("Empty Queue...");
			return;
		}
		
		Node temp = front;
		
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
