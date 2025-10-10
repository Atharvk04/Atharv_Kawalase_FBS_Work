//WAP to convert minutes into hours using Function


#include<stdio.h>

void minutes();
void main ()
{
	minutes();	
}
void minutes ()
{
	int minutes = 155 ;
	int hours, remainingMinutes;
	

	
	printf ("Enter total Minutes: ");
	scanf("%d",&minutes);
	
	hours = minutes / 60;
	
	remainingMinutes = minutes % 60;
	
	printf("\nHours: %d",hours);
	printf("\nRemaining Minutes : %d",remainingMinutes); 
}