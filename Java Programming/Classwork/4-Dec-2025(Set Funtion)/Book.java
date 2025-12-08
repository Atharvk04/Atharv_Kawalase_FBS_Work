class Book
{
	int ISBN;
	String bName;
	String author;
	String category;
	double price;
	
	void setISBN(int B)
	{
		this.ISBN = B;
	}
	
	void setBName(String B)
	{
		this.bName = B;
	}
	
	void setAuthor(String B)
	{
		this.author = B;
	}
	
	void setCategory(String B)
	{
		this.category = B;
	}
	
	void setPrice(double B)
	{
		this.price = B;
	}
	
	int getISBN()
	{
		return this.ISBN;
	}	
	
	String getBName()
	{
		return this.bName;
	}
	
	String getAuthor()
	{
		return this.author;
	}
	
	String getCategory()
	{
		return this.category;
	}
	
	double getPrice()
	{
		return this.price;
	}
}//Book class ends here

class TestBook
{
	public static void main(String [] args)
	{
		Book B1;
		
		B1 = new Book();
	
		B1.setISBN (7856);
		B1.setBName ("Wings of fire");
		B1.setAuthor ("APJ Abdul Kalam");
		B1.setCategory ("Motivational");
		B1.setPrice (397.68);
	
		System.out.println("ISBN: "+B1.getISBN());
		System.out.println("Book Name: "+B1.getBName());
		System.out.println("Author: "+B1.getAuthor());
		System.out.println("Category: "+B1.getCategory());
		System.out.println("Price: "+B1.getPrice());
	}
}//TestBook class ends here