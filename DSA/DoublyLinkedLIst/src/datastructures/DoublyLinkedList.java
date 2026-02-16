package datastructures;

public class DoublyLinkedList 
{
	Node start, last;
	int len;
	
	DoublyLinkedList()
	{
		start = null;
		last = null;
	}
	
	
	void insertAtBeginning(String ele)
	{
		Node x = new Node(ele);
		
		len++;
		
		if(start == null)
		{
			start = x;
			last = x;
			return;
		}
		
		x.next = start;
		start.prev = x;
		start = x;
	}
	
	void insertAtEnd(String ele)
	{
		Node x = new Node(ele);
		
		len++;
		
		if(start == null)
		{
			start = x;
			last = x;
			return;
		}
		
		x.prev = last;
		last.next = x;
		last = x;
	}
	
	void insertAtPos(String ele, int pos)
	{
	    if (pos < 1 || pos > len + 1)
	    {
	        System.out.println("Not Allowed");
	        return;
	    }

	    Node x = new Node(ele);

	    // Case 1: Empty list
	    if (start == null)
	    {
	        start = last = x;
	        len++;
	        return;
	    }

	    // Case 2: Insert at beginning
	    if (pos == 1)
	    {
	        x.next = start;
	        start.prev = x;
	        start = x;
	        len++;
	        return;
	    }

	    // Case 3: Insert at end
	    if (pos == len + 1)
	    {
	        x.prev = last;
	        last.next = x;
	        last = x;
	        len++;
	        return;
	    }

	    // Case 4: Insert in middle
	    Node p = start;
	    int count = 1;

	    while (count < pos - 1)
	    {
	        p = p.next;
	        count++;
	    }

	    x.next = p.next;
	    x.prev = p;
	    p.next.prev = x;
	    p.next = x;

	    len++;
	}
	
	// Case 5: Delete the element
	
	void deleteByEle(String ele)
	{
		if(start == null)
		{
			System.out.println("Empty...");
			return;
		}
		
		
		Node p = start;
		
		while(p!= null && !p.data.equals(ele))
		{
			p= p.next;
		}
		
		if(p == null)
		{
			System.out.println("Not Allowed!!!");
		}
		
		if(p == start)
		{
			start = start.next;
			start.prev = null;
			return;
		}
		
		if(p.next == null)
		{
			p.prev.next = null;
			last = p.prev;
			return;
		}
		
		p.prev.next = p.next;
		p.next.prev = p.prev;
	}
	
	void deleteByPos(int pos)
	{
		if(start == null)
		{
			System.out.println("Empty");
			return;
		}
		
		if(pos < 1 || pos > len)
		{
			System.out.println("Invalid Position!!");
			return;
		}
		
		if(pos == 1)
		{
			start = start.next;
			if(start != null)
			{
				start.prev = null;
			}
			
			else
			{
				last = null;
			}
			
			len--;
			return;
		}
		
		Node p = start;
		
		for(int i=1; i < pos; i++)
		{
			p = p.next;
		}
		
		if(p.next == null)
		{
			p.prev.next = null;
			last = p.prev;
			len--;
			return;
		}
		
		p.prev.next = p.next;
		p.next.prev = p.prev;
		
		len--;
		
	}
	
	void display()
	{
		if(start == null)
		{
			System.out.println("Empty!!!");
			return;
		}
		
		Node temp = start;
		
		while(temp != null)
		{
			System.out.println("\n" +temp.data + " ");
			temp = temp.next;
		}
		
		System.out.println("Total Nodes: " + len);
	}

}
