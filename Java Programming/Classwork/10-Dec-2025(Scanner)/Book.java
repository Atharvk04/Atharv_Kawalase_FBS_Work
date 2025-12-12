import java.util.Scanner;

class Book
{
	int ISBN;
	String bName;
	String author;
	String category;
	double price;
	
	Book()
	{
		this.ISBN = 1569842;
		this.bName = "The Alchemist";
		this.author = "Paulo Coelho";
		this.category = "novel";
		this.price = 253.336;
	
		System.out.println("default constructor get call"+"\n");
	}
	
	Book(int I, String n, String auth, String cate, double p)
	{
		this.ISBN = I;
		this.bName = n;
		this.author = auth;
		this.category = cate;
		this.price = p;
	
		System.out.println("\n"+"parameterized constructor get call");
	}
	
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
	
		Book B2 = new Book(7854,"Ikigai","Hector Garcia","novel",369);
		
		System.out.println("ISBN: "+B2.getISBN());
		System.out.println("Book Name: "+B2.getBName());
		System.out.println("Author: "+B2.getAuthor());
		System.out.println("Category: "+B2.getCategory());
		System.out.println("Price: "+B2.getPrice());
		
		// Third book using Scanner input and setters
		Scanner sc = new Scanner(System.in);
		Book B3 = new Book();
		
		System.out.println("\nEnter details for 3rd book:");
		
		System.out.print("Enter ISBN: ");
		B3.setISBN(sc.nextInt());
		sc.nextLine(); // consume leftover newline
		
		System.out.print("Enter Book Name: ");
		B3.setBName(sc.nextLine());
		
		System.out.print("Enter Author: ");
		B3.setAuthor(sc.nextLine());
		
		System.out.print("Enter Category: ");
		B3.setCategory(sc.nextLine());
		
		System.out.print("Enter Price: ");
		B3.setPrice(sc.nextDouble());
		
		System.out.println("\n"+"ISBN: "+B3.getISBN());
		System.out.println("Book Name: "+B3.getBName());
		System.out.println("Author: "+B3.getAuthor());
		System.out.println("Category: "+B3.getCategory());
		System.out.println("Price: "+B3.getPrice());
		
		sc.close();
	}
}//TestBook class ends here
