package p1;


class Queue 
{
	int [] arr;
	int rear;
	int front;
	int size;
	
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
		if( (rear == arr.length-1 && front == 0) || (rear +1 == front) )
					return true;
		
		else
			return false;

	}
	
	//insertion code
	
	void enqueue (int element)
	{
		if(isFull())
			System.out.println("Queue Full!!!");
		
		
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
			
			arr[rear] = element;
		}
	
	}
	
	// deletion code
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty!!!");
			return -1;
		}
		
		 int element = arr[front];
		
		if(!isEmpty()) 
		{	
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
	
	void display()
	{
		int i = front;
		while (i != rear)
		{
			System.out.println(arr[i]);
			
			if(i == arr.length - 1)
				i = 0;
			
			else
				i++;
		}
		
		System.out.println(arr[i]);
	}
}
