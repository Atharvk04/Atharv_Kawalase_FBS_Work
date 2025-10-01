void main () {
	
	int minutes = 155 ;
	int hours, remainingMinutes;
	
	hours = minutes / 60;
	
	remainingMinutes = minutes % 60;
	
	printf ("Minutes : %d", minutes);
	
	printf("\nHours : %d", hours);
	
	printf("\nRemaining Minutes : %d",remainingMinutes); 
}