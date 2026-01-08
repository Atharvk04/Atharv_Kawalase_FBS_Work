abstract class Item
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
	

	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + "]";
	}

	abstract double calPrice();
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
	
	public String toString() {
		return super.toString() + "Clothing [size=" + size + "]";
	}

	double calPrice()
	{
		return price * 1.1;
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

	public String toString() {
		return super.toString() + "Grocery [expiryDate=" + expiryDate + "]";
	}

	double calPrice()
	{
		return price * 1.05;
	}
}//class Grocery ends here

class TestItem {

	public static void main(String[] args) 
	{
		Item i1; 
		
		//i1 = new Item("Toothpaste",20);
		
		Clothing c1 = new Clothing("Shirt",399,"L");
		
		Grocery g1 = new Grocery("Ketchup",45,"Dec-29");
		
		System.out.println("Item Details: ");
		System.out.println();
		//System.out.println(i1.toString());
		System.out.println();
		
		System.out.println("Clothing Item Details: ");
		System.out.println();
		System.out.println(c1.toString());
		System.out.println();
		
		System.out.println("Grocery Item Details: ");
		System.out.println();
		System.out.println(g1.toString());
		System.out.println();

	}

}

class MyTestItem
{
	public static void main(String[] args)
	{
		Item i;

//		i = new Item("Soap", 30);
//		i.calPrice();
//		System.out.println("Calculated Price: " + i.calPrice());

		i = new Clothing("Jeans", 1200, "M");
		i.calPrice();
		System.out.println("Calculated Price: " + i.calPrice());

		i = new Grocery("Milk", 60, "Dec-25");
		i.calPrice();
		System.out.println("Calculated Price: " + i.calPrice());
	}
}

