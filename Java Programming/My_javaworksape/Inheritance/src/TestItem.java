class Item
{
	String itemName;
	double price;
	
	Item() 
	{
		this.itemName = "Not Given";
		this.price = 0;
	}

	Item(String itemName, double price) 
	{
		super();
		this.itemName = itemName;
		this.price = price;
	}

	String getItemName() {
		return itemName;
	}

	void setItemName(String itemName) {
		this.itemName = itemName;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Item Name: "+this.itemName);
		System.out.println("Price: "+this.price);
	}
}//class Item ends here

class Clothing extends Item
{
	String size;
	
	Clothing() 
	{
		super();
		this.size = "Not Given";
	}

	Clothing(String itemName,double price,String size) 
	{
		super(itemName,price);
		this.size = size;
	}

	String getSize() {
		return size;
	}

	void setSize(String size) {
		this.size = size;
	}
	
	void display()
	{
		super.display();
		System.out.println("Size: "+this.size);
	}
}//Class Clothing ends here

class Grocery extends Item
{
	String expiryDate;
	
	Grocery() 
	{
		super();
		this.expiryDate = "Not Given";
	}

	Grocery(String itemName,double price,String expiryDate) 
	{
		super(itemName,price);
		this.expiryDate = expiryDate;
	}

	String getExpiryDate() {
		return expiryDate;
	}

	void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	void display()
	{
		super.display();
		System.out.println("Expiry Date: "+this.expiryDate);
	}
}//class Grocery ends here

class TestItem {

	public static void main(String[] args) 
	{
		Item i1 = new Item("Toothpaste",20);
		
		Clothing c1 = new Clothing("Shirt",399,"L");
		
		Grocery g1 = new Grocery("Ketchup",45,"Dec-29");
		
		System.out.println("Item Details: ");
		System.out.println();
		i1.display();
		System.out.println();
		
		System.out.println("Clothing Item Details: ");
		System.out.println();
		c1.display();
		System.out.println();
		
		System.out.println("Grocery Item Details: ");
		System.out.println();
		g1.display();
		System.out.println();

	}

}
