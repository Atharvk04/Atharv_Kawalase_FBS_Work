class Booking
{
	int bookingId;
	double amount;
	
	Booking() 
	{
		this.bookingId = 0;
		this.amount = 0;
	}

	Booking(int bookingId, double amount) 
	{
		//super();
		this.bookingId = bookingId;
		this.amount = amount;
	}

	int getBookingId() {
		return bookingId;
	}

	void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	double getAmount() {
		return amount;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}
	
	void display()
	{
		System.out.println("Booking ID: "+this.bookingId);
		System.out.println("Booking Amout: "+this.bookingId);
	}
}//class Booking ends here

class HotelBooking extends Booking
{
	String roomType;
	
	HotelBooking() 
	{
		super();
		this.roomType = "Not Given";
	}

	HotelBooking(int bookingId,double price,String roomType) 
	{
		super(bookingId,price);
		this.roomType = roomType;
	}

	String getRoomType() {
		return roomType;
	}

	void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	void display()
	{
		super.display();
		System.out.println("Type of Room: "+this.roomType);
	}
}//class HotelBooking ends here

class CabBooking extends Booking
{
	String cabType;
	
	CabBooking() 
	{
		super();
		this.cabType = "Not Given";
	}

	CabBooking(int bookingId,double price,String cabType) 
	{
		super(bookingId,price);
		this.cabType = cabType;
	}

	String getCabType() {
		return cabType;
	}

	void setCabType(String cabType) {
		this.cabType = cabType;
	}
	
	void display()
	{
		super.display();
		
		System.out.println("Type of Cab: "+this.cabType);
	}	
}//class CabBooking ends here

class TestBooking {

	public static void main(String[] args)
	{
		Booking b1 = new Booking(123,452);
		
		HotelBooking h1 = new HotelBooking(756,1500,"Basic");
		
		CabBooking c1 = new CabBooking(459,568,"AC");
		
		System.out.println("Booking Details: ");
		System.out.println();
		b1.display();
		System.out.println();
		
		System.out.println("Hotel Booking Details: ");
		System.out.println();
		h1.display();
		System.out.println();
		
		System.out.println("Cab Booking Details: ");
		System.out.println();
		c1.display();
		System.out.println();

	}

}
