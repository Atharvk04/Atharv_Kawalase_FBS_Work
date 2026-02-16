package p1;


class TestQueue 
{
	public static void main(String[] args) 
	{
		Queue q1 = new Queue(5);
		
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		
		System.out.println("Deleted Element" +q1.dequeue(0));
//		q1.enqueue(40);
//		q1.enqueue(50);
	}
}

