class Product
{
	int PId;
	String PName;
	int quantity;
	
	Product()
	{
		this.PId = 123;	
		this.PName = "Honda";
		this.quantity = 45;
	}
	void setPId(int p)
	{
		this.PId = p;
	}
	
	void setPName(String p)
	{
		this.PName = p;
	}
	
	void setQuantity(int p)
	{
		this.quantity = p;
	}
	
	int getPId()
	{
		return this.PId;
	}
	
	String getPName()
	{
		return this.PName;
	}
	
	int getQuantity()
	{
		return this.quantity;
	}
}// Product class ends here

class TestProduct
{
	public static void main(String [] args)
	{
		Product p1;
	
		p1 = new Product ();
		
		p1.setPId (78);
		p1.setPName ("Bajaj");
		p1.setQuantity (785);
	
		System.out.println("Product Id: "+p1.getPId());
		System.out.println("Product Name: "+p1.getPName());
		System.out.println("Product Quantity: "+p1.getQuantity());
	}
}// TestProduct class ends here