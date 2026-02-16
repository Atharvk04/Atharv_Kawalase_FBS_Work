package p1;

class Stack 
{
	//push//pop//peek
//	int top = -1;
//	int arr[] = new int[5];
	
	int[] arr;
	int top;
	
	Stack(int size)
	{
		arr = new int[size];
		top = -1;
 	}
	
	boolean isStackFull()
	{
		if(top == arr.length-1)
			return true;
		else
			return false;
		
	}
	
	boolean isStackEmpty()
	{
		if(top == -1)
			return true;
		else 
			return false;
	}
	
	void push(int element)
	{
		if(isStackFull())
			System.out.println("Stack overflow");
		else
		{
			arr[++top] = element;
			System.out.println(element + "is pushed in the given stack.");
		}
	}
	
	void pop()
	{
		if(isStackEmpty())
			System.out.println("Stack is empty");
		else
		{
			System.out.println(arr[top--] + "popped");
		}
	}
	
	void peek()
	{
		if(isStackEmpty())
			System.out.println("Stack is empty");
		else
		{
			System.out.println("Top most element : "+ arr[top]);
		}
	}

}
