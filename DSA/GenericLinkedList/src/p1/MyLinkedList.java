package p1;

public class MyLinkedList<T>
{
	Node<T> start,p;
	int length;
	int count;
	
	public MyLinkedList() 
	{
		
	}
	
	public void insertAtEnd(T data){
		
		Node<T> temp = new Node<T>(data);
		if(start == null) 
		{
			start = temp;
		} 
		else 
		{
			Node<T> itr = start;
			while(itr.next != null) 
			{
				itr = itr.next;
			}
			itr.next = temp;
		}
		System.out.println("Node added!");
	}
	
	public void insertAtBeginning(T element) {

		Node<T> x = new Node<T>(element);

       
        if (start == null) {
            start = x;
        }
        
        else {
            x.next = start;  
            start = x;      
        }
    }
	
	public void insertInTheMiddle(T element, int position)
	{
		Node<T> x= new Node<T>(element);
		
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
			Node<T> p= start;
			
			while(p.next != null && count < position - 1)
			{
				p = p.next;
				count++;
			}
			
			x.next = p.next;
			p.next = x;
		}
	}
	
	public void delete(int position)
	{
		if(start == null)
		{
			System.out.println("Empty List!!!");
			return;
		}
		
		if(position > length)
		{
			System.out.println("Worng Position!! Please Enter Valid Position!!!");
			return;
		}
		
		if(position == 1)
		{
			start = start.getNext();
			return;
		}
		
		else
		{
			Node<T> p = start;
			count = 1;
			
			
			while(p.getNext() != null && count < position-1)
			{
				p= p.getNext();
				count++;
				
			}
		}
		p.setNext(p.getNext().getNext());
	    length--;
	}
	
	void printReverse (Node<T> node)
	{
		
		if(node == null)
		{
			return;
		}	
			printReverse(node.next);
			System.out.println(node.data);
		
	}
	
	void displayRev() {
	    if (start == null) {
	        System.out.println("Empty!!!");
	        return;
	    }
	    printReverse(start);
	    System.out.print(start.data + " ");
	}

	
	public void display()
	{
		Node<T> temp = start;
		
		if(start == null)
		{
			System.out.println("Empty List!!");
			
		}
		while(temp!=null)
	
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}
