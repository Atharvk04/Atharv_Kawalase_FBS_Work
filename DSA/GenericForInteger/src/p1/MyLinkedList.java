package p1;

public class MyLinkedList 
{
	Node start;
	int length=0;
	
	public MyLinkedList() 
	{
		this.start = null;	
	}
	
	public void insertAtEnd(int data)
	{
		Node temp = new Node(data);
		
		if(start == null)
		{
			start = temp;
		}
		
		else
		{
			Node itr = start;
			while(itr.next != null)
			{
				itr = itr.next;
			}
			itr.next = temp;
		}
		
		System.out.println("Added successfully !!");
	}
	
	
	public void insertAtBeginning(int element) {

        Node x = new Node(element);

       
        if (start == null) {
            start = x;
        }
        
        else {
            x.next = start;  
            start = x;      
        }
    }
		
		
	public void insertInTheMiddle(int element,int position)
	{
		Node x = new Node(element);
		if(start == null)
		{
			start = x;
			return;
		}
		
		else if(position == 1)
		{
			x.next = start;
			start = x;
			return;
		}
		
		else
		{
			int count = 1;
			Node p = start;
			while(p.next != null && count < position-1)
			{
				p = p.next;
				count++;
			}
			
			x.next = p.next;
			p.next = x;
		}
	}
	
	
	public void deleteAtPosition(int position)
	{
		int count;
		if(start == null)
		{
			System.out.println("LinkedList is Empty");
			return;
		}
		
		else
		{
			Node p = start;
			count = 1;
			
			while(p.getNext() != null && count < position-1)
			{
				p = p.getNext();
				count++;
			}
			if(count < position-1)
			{
				System.out.println("Wrong position");
				return;
			}
			p.setNext(p.getNext().getNext());
		}
		
		
	}
	
	
	// inside MyLinkedList class
	public void reverse() 
	{
	    start = reverseRecursive(start);
	}

	// private helper method
	private Node reverseRecursive(Node current) 
	{
	    // base case: empty list ya last node
	    if (current == null || current.next == null) {
	        return current;
	    }

	    Node newHead = reverseRecursive(current.next);

	    current.next.next = current;
	    current.next = null;

	    return newHead;
	}

	
	boolean searchElement(int element)
	{
		Node temp = start;
		while(temp != null)
		{
			if(element == temp.data)
			{
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public void insertAfterEle(int targetElement, int newElement)
	{
		if(start == null)
		{
			System.out.println("Empty!!!");
			return;
		}
		
		Node temp = start;
		
		
		while(temp != null)
		{
			if(temp.data == targetElement)
			{
				Node newNode = new Node(newElement);
				newNode.next = temp.next;
				temp.next = newNode;
				
				System.out.println("Inserted Successfully after " + + targetElement);;
				return;
			}
			
			temp = temp.next;
		}
		
		System.out.println("Element " + targetElement + " not found in the list ");
	}
	
	//Bubble Sort
	public void bubbleSort()
	{
		if(start == null)
		{
			System.out.println("Empty Array...");
		}
		
		else
		{
			
			boolean swap = false;
			
			Node curr = start;
			Node last = null; //Mark already sorted last node
			
			do
			{
					swap=false;
					curr = start; //Fresh start for every start
					
					while(curr.next != null){
						if(curr.data > curr.next.data){
							int temp=curr.data;
							curr.data=curr.next.data;
							curr.next.data=temp;
							swap=true;
						}
						
						curr=curr.next;
					}
					
					last = curr; //last ko current node ke address pe set kar diya
				
			}while(swap==true);
		}
	}
	
	public void display()
	{
		Node temp = start;
	
		while(temp!= null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		//System.out.println(temp.data);
	
	}
}
