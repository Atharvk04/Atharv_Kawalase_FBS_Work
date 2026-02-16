package p1;


class Queue 
{
	int [] arr;
	int rear;
	int front;
	
	Queue(int size)
	{
		arr = new int [size];
		rear = -1;
		front = -1;
	}
	
	boolean isEmpty()
	{
		if(rear == -1)
			return true;
		
		else
			return false;
		
	}
	
	boolean isFull()
	{
		if( (rear == arr.length-1 && front == 0) || (rear+1 == front ) )
					return true;
		
		else
			return false;

	}
	
	//insertion code
	
	void enqueue (int element)
	{
		if(!isFull())
		{
			if(rear == -1)
			{
				rear = 0;
				front = 0;
			}
			
			else if(rear == arr.length-1)
				rear = 0;
			
			else
				rear ++;
			
		}
	
	}
	
	// deletion code
	int dequeue(int element)
	{
		if(!isEmpty()) 
		{
			element = arr[front];
			
			if(rear == front)
			{
				rear = -1;
				front = -1;
			}
			
			else if(front == arr.length-1)
			{
				front = 0;
			}
			
			else
			{
				front++;
			}
		}
		return element;
	}
}
