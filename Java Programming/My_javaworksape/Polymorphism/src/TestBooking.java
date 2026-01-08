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

	public String toString() {
		return "Booking [bookingId=" + bookingId + ", amount=" + amount + "]";
	}

	double calAmount()
	{
		return amount;
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
	
	public String toString() {
		return super.toString()  + "HotelBooking [roomType=" + roomType + "]";
	}

	double calAmount()
	{
		return amount * 1.1;
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
	
	public String toString() {
		return super.toString() + "CabBooking [cabType=" + cabType + "]";
	}

	double calAmount()
	{
		return amount * 1.05;
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
		System.out.println(b1.toString());
		System.out.println();
		
		System.out.println("Hotel Booking Details: ");
		System.out.println();
		System.out.println(h1.toString());
		System.out.println();
		
		System.out.println("Cab Booking Details: ");
		System.out.println();
		System.out.println(c1.toString());
		System.out.println();

	}

}

class MyTestBooking
{
	public static void main(String[] args)
	{
		Booking b;

		b = new Booking(101, 500);
		b.calAmount();
		System.out.println("Calculated Amount: " + b.calAmount());

		b = new HotelBooking(102, 1500, "Deluxe");
		b.calAmount();
		System.out.println("Calculated Amount: " + b.calAmount());

		b = new CabBooking(103, 800, "AC");
		b.calAmount();
		System.out.println("Calculated Amount: " + b.calAmount());
	}
}

