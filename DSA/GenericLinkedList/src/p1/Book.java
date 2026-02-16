package p1;

public class Book {
	int bid, price;
	String name;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String name,int price) {
		super();
		this.bid = bid;
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + "]";
	}
	
	

}
