class conversion
{
	public static void main (String[] args) {
	
	int minutes = 155 ;
	int hours, remainingMinutes;
	
	hours = minutes / 60;
	
	remainingMinutes = minutes % 60;
	
	System.out.printf ("Minutes : %d", minutes);
	
	System.out.printf("\nHours : %d", hours);
	
	System.out.printf("\nRemaining Minutes : %d",remainingMinutes); 
}
}