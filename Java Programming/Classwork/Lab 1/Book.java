class Book
{
	int ISBN;
	String bName;
	String author;
	String category;
	double price;
	
	void display ()
	{
		System.out.println("\n ISBN no is: "+ISBN+"\nName of book is: "+bName+"\nAuthor of book is: "+author+"\nCategory: "+category+"\nPrice: "+price);
	}
}//Book class ends here

class TestBook
{
	public static void main(String [] args)
	{
		Book B1;
		
		B1 = new Book();
	
		B1.ISBN = 7856;
		B1.bName = "Wings of fire";
		B1.author = "APJ Abdul Kalam";
		B1.category = "Motivational";
		B1.price = 397.68;
	
		B1.display();
	}
}//TestBook class ends here