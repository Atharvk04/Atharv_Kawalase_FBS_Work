package p1;

public class Node<T> 
{
	T data;
	
	Node<T> next;
	
	public Node (T ele)
	{

		
		data = ele;
		next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	

}//class Node Ends Here
