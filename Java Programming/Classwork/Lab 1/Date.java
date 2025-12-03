class Date 
{


	int day, month, year;
	String dow;//day of week

	void display()
	{
		System.out.println("\n" + day + "/" + month + "/" + year+ "\nDay is: "+dow);
   	}
}

class TestDate 
{
    public static void main(String args[]) {

        Date d1 = new Date();
	
	d1.day = 2;
	d1.month = 12;
	d1.year = 2025;
	d1.dow = "Tuesday";

        d1.display();

       
    }
}