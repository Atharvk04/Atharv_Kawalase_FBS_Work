class Product
{
	int PId;
	String PName;
	int quantity;
	
	void display()
	{
		System.out.println("\nProduct id is:"+PId+"\nProduct name is: "+PName+"\nQuantity: "+quantity);
	}
}// Product class ends here

class TestProduct
{
	public static void main(String [] args)
	{
		Product p1;
	
		p1 = new Product ();
		
		p1.PId = 78;
		p1.PName = "Bajaj";
		p1.quantity = 785;
	
		p1.display();
	}
}// TestProduct class ends here