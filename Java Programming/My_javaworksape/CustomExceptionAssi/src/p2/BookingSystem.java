package p2;

public class BookingSystem 
{
	String movieName;
	double price;
	int ticketsAvailable;
	

	public BookingSystem(String movieName, double price, int ticketsAvailable ) 
	{
		// TODO Auto-generated constructor stub
		this.movieName = movieName;
		this.price = price;
		this.ticketsAvailable = ticketsAvailable;
	}


	public void validate(int tickets) throws InvalidTicketNumberException, TicketSoldOutException
	{
		if(tickets <= 0 )
		{
			throw new InvalidTicketNumberException();
		}
		
		if(ticketsAvailable == 0 || tickets > ticketsAvailable)
		{
			throw new TicketSoldOutException();
			
		}
		
		ticketsAvailable = ticketsAvailable - tickets;
		
		
		System.out.println("Booking Successful for \"" + movieName + "\"!");
        System.out.println("Tickets booked: " + tickets);
        System.out.println("Total amount: ₹" + (tickets * price));
	}


	
}
