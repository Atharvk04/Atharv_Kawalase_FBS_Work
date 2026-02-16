package datastructures;


public class Node 
{
	int data;
	
	Node next;
	
	public Node (int ele)
	{
		data = ele;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	

}//class Node Ends Here

