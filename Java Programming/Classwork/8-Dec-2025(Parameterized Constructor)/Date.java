class Date 
{
	int day, month, year;
	String dow;//day of week
	
	Date() // Default Constructor
	{
		this.day = 16;
		this.month = 11;
		this.year = 2016;
		this.dow = "Tuesday";
	
		System.out.println("\n default constructor get call");
	}
	
	Date(int d, int m, int y, String str) // Parameterized Constructor
	{
		this.day= d;
		this.month = m;
		this.year = y;
		this.dow = str;
	
		System.out.println("parameterized constructor get call");
	}

	void display()
	{
		System.out.println("\n" + day + "/" + month + "/" + year+ "\nDay is: "+dow);
   	}
	
	void setDay(int d)
	{
		this.day = d;
	}
	
	void setMonth(int d)
	{
		this.month = d;
	}
	
	void setYear(int d)
	{
		this.year = d;
	}
	
	void setDow(String d)
	{
		this.dow = d;
	}
	
	int getDay()
	{
		return this.day;
	}
	
	int getMonth()
	{
		return this.month;
	}
	
	int getYear()
	{
		return this.year;
	}
	
	String getDow()
	{
		return this.dow;
	}
	
}


class TestDate 
{
    public static void main(String args[]) 
	{

        Date d1 = new Date();
	
	d1.setDay (4);
	d1.setMonth (11);
	d1.setYear (2023);
	d1.setDow ("Tuesday");

        d1.display();
	
	Date d2 = new Date(1,1,2025,"Wednesday");

       
	
   	}
}