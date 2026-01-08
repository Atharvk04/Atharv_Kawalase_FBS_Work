class Ticket
{
	int seatNo;
	double time;
	double price;
	
	 Ticket() 
	 {
		this.seatNo= 0;
		this.time = 0;
		this.price = 0;
	 }

	 Ticket(int seatNo, double time, double price) {
		//super();
		this.seatNo = seatNo;
		this.time = time;
		this.price = price;
	 }

	 int getSeatNo() {
		 return seatNo;
	 }

	 void setSeatNo(int seatNo) {
		 this.seatNo = seatNo;
	 }

	 double getTime() {
		 return time;
	 }

	 void setTime(double time) {
		 this.time = time;
	 }

	 double getPrice() {
		 return price;
	 }

	 void setPrice(double price) {
		 this.price = price;
	 }
	 
	 void display()
	 {
		 System.out.println("Seat No.: "+ this.seatNo);
		 System.out.println("Time: " +this.time);
		 System.out.println("Price: " +this.price);
	 }
	 
}//class Ticket ends here

class MovieTicket extends Ticket
{
	int screenNo;
	String showType;
	
	MovieTicket() 
	{
		super();
		this.screenNo=0;
		this.showType="Not Given";
	}

	MovieTicket(int seatNo, double time, double price,int screenNo, String showType) 
	{
		super(seatNo, time, price);
		this.screenNo = screenNo;
		this.showType = showType;
	}

	int getScreenNo() {
		return screenNo;
	}

	void setScreenNo(int screenNo) {
		this.screenNo = screenNo;
	}

	String getShowType() {
		return showType;
	}

	void setShowType(String showType) {
		this.showType = showType;
	}
	
	void display()
	{
		super.display();
		System.out.println("screen No.: "+this.screenNo);
		System.out.println("Show Type: "+this.showType);
	}
	
}//class MovieTicket ends here

class TrainTicket extends Ticket
{
	String coachType;
	
	 TrainTicket() 
	 {
		super();
		this.coachType = "Not Given";
	 }

	 TrainTicket(int seatNo, double time, double price,String coachType) 
	 {
		 super(seatNo, time, price);
		 this.coachType = coachType;
	 }

	 String getCoachType() {
		 return coachType;
	 }

	 void setCoachType(String coachType) {
		 this.coachType = coachType;
	 }
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Coach Type: "+this.coachType);
	 }
	
}//Class TrainTicket ends here

class EventPass extends Ticket
{
	String performer;
	
	EventPass() 
	{
		this.performer = "Not Given";
	}

	EventPass(int seatNo, double time, double price,String performer) 
	{
		super(seatNo, time, price);
		this.performer = performer;
	}

	String getPerformer() {
		return performer;
	}

	void setPerformer(String performer) {
		this.performer = performer;
	}
	
	void display()
	{
		super.display();
		System.out.println("Performer Name: "+this.performer);
	}
}//class EventTicket ends here

class TestTicket 
{

	public static void main(String[] args) 
	{
		MovieTicket m1 = new MovieTicket(14,2.3,459.63,5,"3D");
		TrainTicket t1 = new TrainTicket(28,8.45,1600,"Third-AC");
		EventPass e1 = new EventPass(65,7.0,4500,"Divine");
		
		System.out.println("Movie Tickets Details: ");
		System.out.println();
		m1.display();
		System.out.println();
		
		System.out.println("Train Ticket Details: ");
		System.out.println();
		t1.display();
		System.out.println();
		
		System.out.println("Event Pass Details: ");
		System.out.println();
		e1.display();

	}

}
