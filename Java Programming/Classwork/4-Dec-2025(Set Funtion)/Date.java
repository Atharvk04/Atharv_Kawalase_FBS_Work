class Date 
{
	int day, month, year;
	String dow;//day of week

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
	
}


class TestDate 
{
    public static void main(String args[]) {

        Date d1 = new Date();
	
	d1.setDay (4);
	d1.setMonth (12);
	d1.setYear (2025);
	d1.setDow ("Tuesday");

        d1.display();
	
	Date d2 = new Date();

	d2.setDay (5);
	d2.setMonth (12);
	d2.setYear (2024);
	d2.setDow ("Friday");

       d2.display();
	
	
	if(d1.getDay() < d2.getDay())
		System.out.println("\nD1 is elder.");
	
	else
		System.out.println("D1 is younger.");
	
	if(d1.getMonth() < d2.getMonth())
		System.out.println("\nD1 is elder.");
	
	else
		System.out.println("D1 is younger.");
	
	if(d1.getYear() < d2.getYear())
		System.out.println("\nD1 is elder.");
	
	else
		System.out.println("D1 is younger.");

    }
}