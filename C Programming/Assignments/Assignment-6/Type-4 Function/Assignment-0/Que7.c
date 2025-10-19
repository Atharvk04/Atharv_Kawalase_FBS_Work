#include<stdio.h>

int convert(int totalminutes);

void main ()
{
	int hours, remaining, total;
	
	
	printf("Enter total minutes: ");
	scanf("%d",&total);
	
	hours = convert(total);
	
	remaining = total - (hours * 60); 
	
	printf("\n%d minutes = %d hours and %d minutes",total, hours, remaining);
}

int convert(int totalminutes)
{
	return totalminutes / 60;
}